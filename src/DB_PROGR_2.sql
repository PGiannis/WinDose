CREATE TABLE District (
	District_id int NOT NULL,
    Distrit_name varchar(50) NOT NULL,
    District_population int NOT NULL,
    District_covid_cases int,
    PRIMARY KEY (District_id)
);
CREATE TABLE Test_Results (
	Asc_Number_pos INT NOT NULL,
    Asc_Number_neg INT NOT NULL
);

CREATE TABLE Positive_Case_Person (
    AMKA int NOT NULL ,
    First_Name varchar(30) NOT NULL,
    Last_Name varchar(30) NOT NULL,
    Phone varchar(13),
    District_id int NOT NULL,
    Date_of_checkin DATE NOT NULL, 
    Asc_Number_pos INT NOT NULL,
    Date_of_birth Date NOT NULL,
    # age should be defined by dob
    Age Int NOT NULL ,
    # gender is m or f
    Gender CHAR(1) NOT NULL,
    # Current should be an int from 1-4 with 1 being an extremely mild case and 4 being in ICU (MEΘ)
    Current_situation INT ,
    primary key (AMKA),
    FOREIGN KEY (District_id) REFERENCES District (District_id),
    # Collects the number of positive patient in the system + sends it to the Test Result table
    FOREIGN KEY (Asc_Number_pos) REFERENCES Test_Results (Asc_Number_pos)
);

CREATE TABLE Negative_Case_Person(
	AMKA int NOT NULL, 
    First_Name Varchar(30) NOT NULL,
    Last_Name VARCHAR(30) NOT NULL,
    Phone Varchar(13),
    District_Id int NOT NULL,
    Asc_Number_neg INT NOT NULL,
    Date_of_birth Date NOT NULL,
    Age Int NOT NULL ,
    PRIMARY KEY (AMKA),
    FOREIGN KEY (District_id) REFERENCES District (District_id),
    # Collects the number of negative persons in the system + sends it to the Test Result table
    FOREIGN KEY (Asc_Number_neg) REFERENCES Test_Results (Asc_Number_neg)
);

CREATE TABLE Contacts(
	Contact_id int NOT NULL,
    First_Name Varchar(30) NOT NULL,
    Last_Name VARCHAR(30) NOT NULL,
    # ex +13 210.... OR +13210...
    Phone VARCHAR(14) NOT NULL,
    Positive_case int NOT NULL,
    PRIMARY KEY (Contact_id),
    FOREIGN KEY (Positive_case) REFERENCES Positive_Case_Person (AMKA)
)


