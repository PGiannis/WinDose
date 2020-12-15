package src;



public class Information extends Covid_19 {
	private int id;
	private int age;
	private int option;
	private String name;
	private String surename;
	private String positive;
	private String negative;
	private String gender;
	private String Location;
	private String State;
	public int getId() {
		 return id;
		}
	public void setId(int id ) {
         this.id=id;
         
	}
	public String getName() {
		 return name;
		}
	
	public void setId(String name) {
        this.name=name;
	}
	public String getSurename() {
		 return surename;
		}
	public void setSurename(String surenname) {
        this.surename=surename;
	}
	public String getPositive() {
		return positive;
	}
	public void setPositive(String positive) {
        this.positive=positive;
	}
	public String getNegative() {
		return negative;
	}
	public void setNegative(String negative) {
        this.negative=negative;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
        this.gender=gender;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String Location) {
        this.Location=Location;
	}
	public String getState() {
		return State;
	}
	public void setState(String State) {
        this.State=State;
	}
	
	
	
	
	
	
    public   void Print() {
    	System.out.print(this.id);
    	System.out.print(this.age);
    }
	
	public String changeState(String x) {
		this.State = x;
		return State;

	}
	


}