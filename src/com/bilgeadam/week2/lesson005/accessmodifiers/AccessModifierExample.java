package com.bilgeadam.week2.lesson005.accessmodifiers;

public class AccessModifierExample {

	public String publicVariable = "public";
	String defaultVariable = "default";
	public String protectedVariable = "protected";
	private String  privateVariable = "private";
	
	public static void main(String[] args) {
		
		AccessModifierExample access = new AccessModifierExample();
		
		System.out.println(access.publicVariable);
		System.out.println(access.defaultVariable);
		System.out.println(access.protectedVariable);
		System.out.println(access.privateVariable);
	}
}
