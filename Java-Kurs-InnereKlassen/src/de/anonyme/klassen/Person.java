package de.anonyme.klassen;

public class Person { //Top Level Klasse(wie gehabt)
	
	//Eigenschaften
	private String name;
	
	//Konstruktor
	public Person(String _name) {
		this.name = _name;
		printName();
	}
	//Methoden
	public void printName() {
		System.out.println(name);
	}
	public String getName() {
		return name;
	}
	
	
	
	

}
