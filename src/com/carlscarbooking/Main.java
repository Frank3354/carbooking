package com.carlscarbooking;

import com.carlscarbooking.menu.MenuService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isRunning = true;
        var input = new Scanner(System.in);

        while (isRunning) {
            MenuService.displayOptions();

            int option = input.nextInt();

            if (option == 0) isRunning = false;
        }

        input.close();
    }
}
