package com.bilgeadam.week2.lesson005.accessmodifiers;

public class SomeOtherClass extends AccessModifierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifierExample access = new AccessModifierExample();
		
		System.out.println(access.publicVariable);
		System.out.println(access.defaultVariable);
		System.out.println(access.protectedVariable);
		
	}

}
