package carssession6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice = -1;

        try {
            do {
                    System.out.println("0) Close the Application");
                    System.out.println("1) Submit a carssession6.Sport carssession6.Car Specification: ");
                    System.out.println("2) Submit an SUV carssession6.Car Specification: ");
                    System.out.println("3) Submit an Off-road carssession6.Car Specification: ");
                    System.out.println("4) Submit your carssession6.Mini carssession6.Car Specification: ");
                    System.out.println("Choose your desired course of operation:    \n ");
                    choice = Integer.parseInt(input.nextLine());

                    switch (choice) {
                        case 0:
                            System.out.println("Program terminated successfully");
                            break;
                        case 1:
                            System.out.println("Submit a carssession6.Sport carssession6.Car Specification: ");
                            Sport newSportcar = new Sport();
                            System.out.println("What is the name of the carssession6.Car?");

                            break;
                        case 2:
                            System.out.println("Submit an SUV carssession6.Car Specification: ");
                            break;
                        case 3:
                            System.out.println("Submit an Off-road carssession6.Car Specification: ");
                            break;
                        case 4:
                            System.out.println("Submit your carssession6.Mini carssession6.Car Specification: ");
                            break;
                        default:
                            System.out.println("Invalid choice. please Submit a valid option.");
                            break;
                    }
                }while (choice != 0);

        }catch(Exception e){
            System.out.println("Invalid Input!!!");
        }
    }
}