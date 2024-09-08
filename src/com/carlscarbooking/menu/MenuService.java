package com.carlscarbooking.menu;

public class MenuService {

    public static void displayOptions() {
        var output = new StringBuilder();
        int count = 1;

        for(MenuOption option : MenuOption.values()) {
            output.append(count++).append(". ").append(option.getDescription()).append("\n");
        }

        System.out.println(output);
    }

    public static void handleOption(int optionNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static boolean exit() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
