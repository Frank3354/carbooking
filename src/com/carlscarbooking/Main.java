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

            try {
                userEntry = input.nextInt();
            } catch (InputMismatchException e) {
                input.nextLine();
                continue;
            }

            if (userEntry == 0) break;

            MenuService.handleOption(userEntry);
        }

        System.out.println("Exiting application");
        input.close();
    }
}
