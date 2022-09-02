package com.parth;
import java.util.Scanner;
public class intrest {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your principle amount:- ");
        float pri = input.nextFloat();
        System.out.println("Enter your rate of intrest:- ");
        float rate = input.nextFloat();
        System.out.println("Enter your time :- ");
        float time = input.nextFloat();
        float Intrest = (pri +rate+time)/100;
        System.out.println(Intrest);


    }
}
