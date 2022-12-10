package com.bilgeadam.lesson;
import javax.swing.JOptionPane;

public class PrintFunctions {

	public static void main(String[] args) {
		
		String hello ="Hello";
		String world = "World";
		
		System.out.print(hello); //ln koymadığında alt satıra geçmez ln o satır biittiğinde sonraki satırın alttan başlamasını sağlıyor
		System.out.println(world);
		
		JOptionPane.showMessageDialog(null, hello, "First JoptionPane", JOptionPane.CANCEL_OPTION);
		
		//JOptionPane.showMessa
			
	}

}
