package com.apcs;

import java.util.Scanner;

public class LifeSituation {

    private String lifeChoice = null;
    private int money = 0;
    private int multiplier = 0;

    public String getLifeChoice() {
        return lifeChoice;
    }

    public void setLifeChoice(String lifeChoice) {
        this.lifeChoice = lifeChoice;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    // getters and setters above for money, multiplier, and life choice

    public void chooseLife() {

        int userChoice = 0;

        while (true) {
            System.out.println("");
            System.out.println("Your life situation impacts the resources you can start with!\nAn easier life will give you more resources to begin with, but your final score will have a lower multiplier added on.");
            System.out.println("1) Olympian - With near infinite resources, your life is off to an easy start (100000 drachmas, x1 multiplier). ");
            System.out.println("2) High Royalty - As part of the ancient royal courts, you've got quite the budget (1000 drachmas, x10 multiplier). ");
            System.out.println("3) Weaver - Average income, average life (500 drachmas, x100 multiplier). ");
            System.out.println("4) Public servant - You don't have much to start with, but hopefully this journey can change that (250 drachmas, x1000 multiplier). ");
            System.out.print("Choice: ");

            Scanner scanner = new Scanner(System.in);

            try {

                userChoice = scanner.nextInt();
                scanner.nextLine();

            } catch (Exception e) {

                System.out.println("Bad input. Please enter a number between 1 and 4.");
                System.out.println("");
                continue;

            }

            if (userChoice == 1) {

                lifeChoice = "Olympian";
                money = 100000;
                multiplier = 1;
                break;

            } else if (userChoice == 2) {

                lifeChoice = "Royal";
                money = 1000;
                multiplier = 10;
                break;

            } else if (userChoice == 3) {

                lifeChoice = "Weaver";
                money = 500;
                multiplier = 100;
                break;

            } else if (userChoice == 4) {

                lifeChoice = "Servant";
                money = 250;
                multiplier = 1000;
                break;

            } else {

                System.out.println("Bad input. Please enter a number between 1 and 4.");
                continue;

            }


        }

        printLifeChoice();

    }

    public void printLifeChoice() {

        System.out.println("");
        System.out.println("Your choice was " + lifeChoice + ".");
        System.out.println("You will start with a total of " + money + " drachmas.");
        System.out.println("Your final score will have a multiplier of " + multiplier + ".");
        Utilities.pressEnterToContinue();

    }

}
