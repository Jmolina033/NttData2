package com.nttdata.bootcamp.patterns.singleton;

import com.nttdata.bootcamp.patterns.pattern.Person;

public class Singleton {
	private static Person INSTANCE;
	
	public static Person getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Person();
		}
		return INSTANCE;
	}

}
