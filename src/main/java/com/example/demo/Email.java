package com.example.demo;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String companyName;
    private String department;
    private String password;
     private String email;
    private int numerOfSigns;
   
    public Email(String firstName, String lastName, String companyName){
        Scanner input = new Scanner(System.in);
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.department = setDepartment();
        
        System.out.println("How long should your password be? Type a numer of signs: ");
        numerOfSigns = input.nextInt();
        this.password = generatePassword(numerOfSigns);
      

        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + companyName + ".com";
        System.out.println("---------------------");
        System.out.println("Your email: " + email);
        System.out.println("Your password: " + password);
        input.close();
    }

    public String setDepartment(){
        System.out.println("Choose the department: \n1. IT \n2. Sales \n3. Accounting ");
        Scanner input = new Scanner(System.in);
        int departmentChoice = input.nextInt();
        
        switch(departmentChoice){
            case 1:
                return "it";
            case 2:
                return "sales";
            case 3: 
                return "acc";
            default:
                return " ";
        }
   
    }

    private String generatePassword(int length){
        String availableSet = "ABCDEFGHIJKLMNOPRSTUWYXZ1234567890@#$%&*";
        char[] password = new char[length];

        for(int i=0; i<length; i++){
        int randomValue = (int) (Math.random() * availableSet.length());
        password[i] = availableSet.charAt(randomValue);
        }
        return new String(password);
    }

   
}
