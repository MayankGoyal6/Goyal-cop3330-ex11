/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 11
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;

class Main {
  public static void main(String[] args) {
    
  DecimalFormat f = new DecimalFormat("##.##");
  Scanner scanner = new Scanner(System.in);

  System.out.println("How many euros are you exchanging? ");
  double c_from = scanner.nextFloat();

  System.out.println("What is the exchange rate?  ");
  double rate = scanner.nextFloat();

  double c_to = (rate * c_from);
 
  System.out.println(f.format(c_from) + " euros at an exchange rate of " + String.format("%.4f", rate) + " is " + String.format("%.2f", c_to) + " U.S. dollars.");

  }
}