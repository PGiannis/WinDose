
import java.util.Scanner;

public class Informations extends Covid_19 {
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
		 return name;
		}
	public void setSurename(String surenname) {
        this.surename=surename;
	}
}