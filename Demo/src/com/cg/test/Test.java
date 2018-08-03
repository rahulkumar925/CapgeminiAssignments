package com.cg.test;

import com.cg.factory.MessageFactory;

public class Test {

	public static void main(String[] args) {
		
		try {
			MessageFactory.getMessageRenderer().render();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
