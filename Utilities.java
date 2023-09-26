package com.apcs;

import java.util.Scanner;

public class Utilities {

    public static void pressEnterToContinue()
    {
        System.out.print("\nPress [ENTER] to continue...");
        try
        {
            System.in.read();
        }

        catch (Exception e) {

        }
    }

    public static int randomCalc() {

        int encounter = (int)(Math.floor(Math.random() * (14 - 1 + 1) + 1));
        return encounter;

    }

    public static int randomCalcStraits() {

        int encounter = (int)(Math.floor(Math.random() * (5 - 1 + 1) + 1));
        return encounter;

    }

    public static void readyMessage() {

        int faqChoice = 0;

        while (true) {
            System.out.println("");
            System.out.println("You are all set to begin your QUEST! Do you have questions you wish to have answered first? ");
            System.out.println("1) What is the goal of this game? ");
            System.out.println("2) Will I be able to buy more resources throughout my quest? ");
            System.out.println("3) How will my final score be calculated? ");
            System.out.println("4) Nope! Let's set sail! ");
            System.out.print("Choice: ");

            Scanner scanner = new Scanner(System.in);

            try {

                faqChoice = scanner.nextInt();
                scanner.nextLine();

            } catch (Exception e) {

                System.out.println("Bad input. Please enter a number between 1 and 4.");
                System.out.println("");
                continue;

            }

            if (faqChoice == 1) {

                System.out.println("The goal of this game is to find the GOLDEN FLEECE. To do so, you will have to fight" +
                        " multiple monsters. However if you are lucky you may receive some aid from various Gods.");
                pressEnterToContinue();

            } else if (faqChoice == 2) {

                System.out.println("Yes! You will have certain times during the game where you arrive at SHOP locations, " +
                        "allowing you to purchase more items as needed with any remaining money left. In addition to this, " +
                        "there are certain situations that will give you more items.");
                pressEnterToContinue();

            } else if (faqChoice == 3) {

                System.out.println("Your final score will a combination of your remaining money, crew mates, and items, " +
                        "multiplied by the corresponding multiplier based on your original life choice.");
                pressEnterToContinue();

            } else if (faqChoice == 4) {

                System.out.println("Excellent! Let your quest begin! ");
                pressEnterToContinue();
                break;

            } else {

                System.out.println("Bad input. Please enter a number between 1 and 4.");
                continue;

            }


        }


    }

    public static void scoreCalc(Quest quest) {

        int finalScore = 0;

        finalScore = (quest.getLifeSituation().getMoney() + (quest.getCrew().getCount() * 10)) * quest.getLifeSituation().getMultiplier();
        System.out.println("CONGRATULATIONS! You completed your quest!");
        System.out.println("You had " + quest.getLifeSituation().getMoney() + " drachmas remaining and " + quest.getCrew().getCount() +
                " crew members alive. You also chose to live the life of a " + quest.getLifeSituation().getLifeChoice() + ", thus " +
                "receiving a multiplier of " + quest.getLifeSituation().getMultiplier() + ", giving you a final score of...");
        System.out.println(finalScore);

    }

    public static int randomAnimalCalc() {

        int animal = (int)(Math.floor(Math.random() * (4 - 1 + 1) + 1));
        return animal;

    }

}
