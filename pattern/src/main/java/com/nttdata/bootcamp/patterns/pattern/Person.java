package com.nttdata.bootcamp.patterns.pattern;

public class Person implements IPrototype,IPersonInterface,IPersonProxyInterface{
	
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//METODO PARA CLONAR EL OBJETO PROTOTYPE
	@Override
	public Person clone() {
		Person p = new Person(this.name, this.age);
		return p;
	}
	
	//CREAR OBJETO CON EL PATRON BUILDER
	private Person(PersonBuilder personBuilder) {
        super();
        this.name = personBuilder.name;
        this.age = personBuilder.age;
    }
	
	public static class PersonBuilder {
        private String name;
        private int age;
        public PersonBuilder name (String name) {
            this.name = name;
            return this;
        }
        public PersonBuilder age (int age) {
            this.age = age;
            return this;
        }
        public Person build () {
            return new Person(this);
        }
    }
	
	public static PersonBuilder builder() {
        return new PersonBuilder();
    }
	
	//METODO OPERATION PARA EL PATRON PROXY
	@Override
	public void operation() {
		System.out.println("Realizando operacion");
	}

}
