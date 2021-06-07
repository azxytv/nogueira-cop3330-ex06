package com.company;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int year = Calendar.getInstance().get(Calendar.YEAR);


    Scanner ret = new Scanner(System.in);
    Scanner curr = new Scanner(System.in);
      System.out.println("What is your current age?");
      int current = curr.nextInt();
      System.out.println("At what age would you like to retire?");
      int retire = ret.nextInt();
      int difference = retire - current;
      System.out.println("You have " + difference + " years left until you can retire.");
      int retyr = year + difference;
      System.out.println("It's " + year + ", so you can retire in " + retyr );


    }
}
