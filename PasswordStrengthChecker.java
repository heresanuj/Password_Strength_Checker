package com.javabasics;
import java.util.Scanner;
public class cwh_Task_02_Password_Strength_Checker{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to  Secure Password World!");
        System.out.println("Enter your Password :-");
        String pass= sc.nextLine();
         boolean hasspecial=false;
         for(int  i=0;i<pass.length();i++){
            char ch=pass.charAt(i);

         if(!Character.isLetterOrDigit(ch)) {
             hasspecial = true;
         }}

        if((pass.length()>=6)&&(hasspecial)){
            System.out.println("Entered Password is Secure:");
        }
        else{
            System.out.println("Not Secure !");
            System.out.println("Password must contain atleast 6 characters and special symbols");
        }
        
    }
}
