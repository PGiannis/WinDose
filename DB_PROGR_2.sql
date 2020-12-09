CREATE TABLE District (
	District_id int NOT NULL,
    Distrit_name varchar(50) NOT NULL,
    District_population int NOT NULL,
    District_covid_cases int,
    PRIMARY KEY (District_id)
);

CREATE TABLE Positive_Case_Person (
    AMKA int NOT NULL ,
    First_Name varchar(30) NOT NULL,
    Last_Name varchar(30) NOT NULL,
    Phone varchar(13),
    District_id int NOT NULL,
    primary key (AMKA),
    FOREIGN KEY (District_id) REFERENCES District (District_id)
);

CREATE TABLE Negative_Case_Person(
	AMKA int NOT NULL, 
    First_Name Varchar(30) NOT NULL,
    Last_Name VARCHAR(30) NOT NULL,
    Phone Varchar(13),
    District_Id int NOT NULL,
    PRIMARY KEY (AMKA),
    FOREIGN KEY (District_id) REFERENCES District (District_id)
);

CREATE TABLE Contacts(
	Contact_id int NOT NULL,
    First_Name Varchar(30) NOT NULL,
    Last_Name VARCHAR(30) NOT NULL,
    Phone int(13) NOT NULL,
    Positive_case int NOT NULL,
    PRIMARY KEY (Contact_id),
    FOREIGN KEY (Positive_case) REFERENCES Positive_Case_Person (AMKA)
)


