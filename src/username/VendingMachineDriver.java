/*
 * Course: CSC1110 - FIXME
 * Fall 2024
 * Homework 6 - Vending Machine
 * Name: FIXME
 * Last Updated: FIXME
 */
package username;

import java.util.Scanner;

/**
 * This is the drive for the Vending Machine
 */
public class VendingMachineDriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char choice;
        boolean done = false;

        VendingMachine vm = new VendingMachine();

        System.out.println("Welcome to John's vending machine!\n");

        do {
            System.out.println("Options: (i)nsert money, (s)elect an item, (q)uit");
            System.out.print("Enter i, s, or q ==> ");
            choice = in.nextLine().charAt(0);

            switch (choice) {
                case 'i', 'I' -> vm.insertMoney(in);
                case 's', 'S' -> vm.selectItem(in);
                case 'q', 'Q' -> done = true;
                default -> System.out.println("Invalid selection.");
            }
        } while(!done);
    }
}
