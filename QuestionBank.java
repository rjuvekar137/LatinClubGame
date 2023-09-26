package com.apcs;

import java.util.Scanner;

public class QuestionBank {

    public void circeQuestions() {

        int question = 1;
        int userChoice2 = 0;

        if (question == 1) {

            System.out.println("");
            System.out.println("What animals did Circe turn men into when they arrived upon her island? ");
            System.out.println("1) Guinea Pigs");
            System.out.println("2) Cows ");
            System.out.println("3) Pigs ");
            System.out.println("4) Birds ");

            Scanner scanner = new Scanner(System.in);

            try {

                userChoice2 = scanner.nextInt();
                scanner.nextLine();

            } catch (Exception e) {

                System.out.println("Bad input. Please enter a number between 1 and 4.");
                System.out.println("");

            }

            if (userChoice2 == 3) {

                System.out.println("Correct! You are free to pass, but first, feel free to purchase anything else you might need from the shop.");
                // add shop call here

            } else {

                System.out.println("Incorrect. Your crew has upset Circe, as she turns your crew into pigs and ends your journey early. GAME OVER.");
                System.exit(0);

            }

        } else {

            System.out.println("Bad input. Please enter a number between 1 and 4.");

        }

    }

    public void straitsQuestion(Quest quest) {

        while (true) {

            int userChoice3 = 0;

            System.out.println("");
            System.out.println("What will your decision be? ");
            System.out.println("1) Scylla");
            System.out.println("2) Charybdis ");
            System.out.println("3) How many CREW MEMBERS do I have alive? ");
            System.out.print("Choice: ");

            Scanner scanner = new Scanner(System.in);

            try {

                userChoice3 = scanner.nextInt();
                scanner.nextLine();

            } catch (Exception e) {

                System.out.println("Bad input. Please enter a number between 1 and 3.");
                System.out.println("");

            }

            if (userChoice3 == 1) {

                System.out.println("");
                System.out.println("You chose to travel by Scylla. ");
                quest.getCrew().killCrewMember();
                quest.getCrew().killCrewMember();

                if (quest.getCrew().getCount() == 0) {

                    System.out.println("");
                    System.out.println("Your entire crew has died! GAME OVER. ");
                    System.exit(0);

                } else {

                    System.out.println("");
                    System.out.println("Your crew managed to survive Scylla! ");
                    break;

                }

            } else if (userChoice3 == 2) {

                int decisionStraits = 0;

                System.out.println("You chose to travel by Charybdis. ");
                decisionStraits = Utilities.randomCalcStraits();

                if (decisionStraits == 1 || decisionStraits == 2) {

                    System.out.println("Your entire crew has died! GAME OVER. ");
                    System.exit(0);

                } else {

                    System.out.println("Your crew managed to survive Charybdis! ");
                    break;

                }


            } else if (userChoice3 == 3) {

                System.out.println("You currently have " + quest.getCrew().getCount() + " surviving crew mates.");
                Utilities.pressEnterToContinue();

            } else {

                System.out.println("Bad input. Please enter a number between 1 and 3.");
                System.out.println("");

            }


        }
    }

    public void finalQuestion() {

        int question = 1;
        int userChoice2 = 0;

        if (question == 1) {

            System.out.println("");
            System.out.println("What gold-haired, winged animal provided the fleece of the Golden Fleece? ");
            System.out.println("1) A ram");
            System.out.println("2) A tiger ");
            System.out.println("3) A wolf");
            System.out.println("4) A pegasus ");

            Scanner scanner = new Scanner(System.in);

            try {

                userChoice2 = scanner.nextInt();
                scanner.nextLine();

            } catch (Exception e) {

                System.out.println("Bad input. Please enter a number between 1 and 4.");
                System.out.println("");

            }

            if (userChoice2 == 1) {

                System.out.println("Correct! You have defeated the Cyclops and can now take the Golden Fleece safely!");

            } else {

                System.out.println("Incorrect. Your crew has failed to fight the Cyclops, as it kills your remaining crew and ends your journey early. GAME OVER.");
                System.exit(0);

            }

        } else {

            System.out.println("Bad input. Please enter a number between 1 and 4.");

        }


    }
}
