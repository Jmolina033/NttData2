package com.nttdata.bootcamp.patterns.changeofresponsability;

public class Unit {
	
	private String name;
	private Unit subordinate;
	
	public Unit(String name) {
		this.name = name;
	}
	
	public Unit(String name, Unit subordinate) {
		this.name = name;
		this.subordinate = subordinate;
	}
	
	public void executeCommand (String command) {
        System.out.println("Orden recibida por " + name);
        if(subordinate == null) {
            System.out.println("Orden " + command + "ejecutada por " + this.name);
        }
        else {
            subordinate.executeCommand(command);
        }

    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Unit getSubordinate() {
		return subordinate;
	}

	public void setSubordinate(Unit subordinate) {
		this.subordinate = subordinate;
	}
	

}
