package com.parth;
import java.util.Scanner;

public class greeting {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = input.nextLine();
        System.out.println("your name is " + name + " hope your day spent well");
    }

}
