package com.nttdata.bootcamp.patterns.pattern;

public class PersonProxy implements IPersonProxyInterface{

	private IPersonProxyInterface person;
	
	public PersonProxy (IPersonProxyInterface person) {
		this.person = person;
	}
	
	@Override
	public void operation() {
		before();
		this.person.operation();
		after();
	}
	
	public void before() {
		System.out.println("Realizado antes de la operacion");
	}
	
	public void after() {
		System.out.println("Realizado despues de la operacion");
	}
}
