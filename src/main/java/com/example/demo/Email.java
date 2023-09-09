package com.example.demo;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int mailBoxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        System.out.println("email created");
        System.out.println("Chosen department: " + this.department);
    }

    public String setDepartment(){
        System.out.println("Choose the department: \n1. IT \n2. Sales \n3. Accounting ");
        Scanner input = new Scanner(System.in);
        int departmentChoice = input.nextInt();

        switch(departmentChoice){
            case 1:
                return "it";
            case 2:
                return "sal";
            case 3: 
                return "acc";
            default:
                return " ";
        }
    }
}
