                                                                                                                                                                                    package org.capg.training;

import java.util.Scanner;

public class Cui_Application {
	public static void main(String[] args) {

		 String user="sai", password="12345";
		 int maxAttempts = 0;

		 while (maxAttempts <= 3) {
		  System.out.println("Enter username: ");
		  String username = new Scanner(System.in).nextLine();

		  System.out.print("Enter password: ");
		  String pwd = new Scanner(System.in).nextLine();

		  if (username.equals(user) && pwd.equals(password)) {
		   System.out.println("Welcome " + user);
		   break;
		  } else
		   System.out.println("Incorrect. Try Again.");
		  maxAttempts++;

		 }
		 if (maxAttempts > 3) {
		  System.out.println("Contact Admin");
		 }
		}
		}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
