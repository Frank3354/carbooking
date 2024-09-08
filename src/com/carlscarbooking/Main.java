package com.carlscarbooking;

import com.carlscarbooking.menu.MenuService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int userEntry;
        var input = new Scanner(System.in);

        while (true) {
            MenuService.displayOptions();
            System.out.print("Enter your choice: ");

            try {
                userEntry = input.nextInt();
            } catch (InputMismatchException e) {
                input.nextLine();
                continue;
            }

            if (userEntry == 7) break;

            MenuService.handleOption(userEntry);
        }

        System.out.println("Exiting application");
        input.close();
    }
}
