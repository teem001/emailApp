package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private  String firstName;
    private String lastName;
    private  String department;
    private String password;
    private String alternateEmail;
    private Integer mailBoxCapacity =500;
    private String email;
    private String companySuffix= "onibonje.com";

    // Constructor will take the name and last name


    public Email() {}

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Your name is "+ this.firstName + " "+ this.lastName);

        this.department= setDepartment();
//        System.out.println(("You chose your department as "+ this.department));
         this.password= randomPassword(10);
       // System.out.println("Your new password is "+ this.password);

        this.email= this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+"."+companySuffix;

//        System.out.println("Your email and passWord are "+this.email +" and "+this.password);
        System.out.println(showInfo());



    }


    //Ask for department
    private  String setDepartment(){
        System.out.println("Enter the department\n1. Sales\n2. Development\n3. Accounting\n0. None");
        Scanner in= new Scanner(System.in);
        int depChoice= in.nextInt();

        if(depChoice==1)
            return "Sales".trim();
        else if (depChoice==2)
            return "Development".trim();
        else if(depChoice==3)
            return "Accounting".trim();
        else if(depChoice==0)
            return"";
        else {
            setDepartment();
            return "";
        }
    }

    // generate random password;
    private String randomPassword(int length){
        String passwordSet= "ABCDEFGHIJKLMNOPQRSTUWVXYZabcdefghijklmnopqrstuvwxyz.,/<>1234567890_)(*&^%$@!";
        char[] password= new char[length];
        for(int i=0; i<length; i++){
           int passGen= (int) (Math.random()* password.length);
           password[i]=passwordSet.charAt(passGen);
        }

        return new String(password);
    }

    //set Mailbox Capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity= capacity;
    }

    //Change Password
    public void setPassword(String password){
        this.password= password;
    }
    //alternate email
public void setAlternateEmail(String altmail){
        this.alternateEmail =altmail;
}
public String getAlternateEmail(){return alternateEmail;}
public String getPassword(){return password;}

public String showInfo(){
        return"Name: "+ firstName +" "+lastName +"\nDepartment: "+ department +"\nEmail Address: "+email+"\nPassword: "
                +password;
}
}
