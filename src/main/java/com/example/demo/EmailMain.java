package com.example.demo;

import java.util.Scanner;

public class EmailMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("-----Welcome----");
		System.out.println("Type your first name: ");
	
		String firstName = input.nextLine();
		System.out.println("Type your last name: ");
		String lastName = input.nextLine();	

		System.out.println("Type your company name: ");
		String companyName = input.nextLine();	

		Email newEmail = new Email(firstName, lastName, companyName);
	 	input.close();
	}

}
