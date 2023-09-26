package com.apcs;

import java.util.Scanner;

public class Shop {

    private int sails = 0;
    private int earbuds = 0;
    private int ambrosia = 0;
    private int bandages = 0;
    private boolean pegasus = false;
    private boolean threeHeadedDog = false;
    private boolean phoenix = false;

    public int getSails() {
        return sails;
    }

    public void setSails(int sails) {
        this.sails = sails;
    }

    public int getEarbuds() {
        return earbuds;
    }

    public void setEarbuds(int earbuds) {
        this.earbuds = earbuds;
    }

    public int getAmbrosia() {
        return ambrosia;
    }

    public void setAmbrosia(int ambrosia) {
        this.ambrosia = ambrosia;
    }

    public int getBandages() {
        return bandages;
    }

    public void setBandages(int bandages) {
        this.bandages = bandages;
    }

    public boolean isPegasus() {
        return pegasus;
    }

    public void setPegasus(boolean pegasus) {
        this.pegasus = pegasus;
    }

    public boolean isThreeHeadedDog() {
        return threeHeadedDog;
    }

    public void setThreeHeadedDog(boolean threeHeadedDog) {
        this.threeHeadedDog = threeHeadedDog;
    }

    public boolean isPhoenix() {
        return phoenix;
    }

    public void setPhoenix(boolean phoenix) {
        this.phoenix = phoenix;
    }

    public void shopDisplay(Quest quest) {

        int shopChoice = 0;
        int numberBought = 0;

        while (true) {
            System.out.println("");
            System.out.println("Before you board your ship to begin your journey, you can stop by the local shop to purchase what you might need! ");
            System.out.println("Your total balance right now is " + quest.getLifeSituation().getMoney() + " drachmas.");
            System.out.println("1) Ambrosia - 10 drachmas ");
            System.out.println("2) Sails - 50 drachmas ");
            System.out.println("3) Earbuds - 15 drachmas ");
            System.out.println("4) Bandages - 25 drachmas ");
            System.out.println("5) Mystery Egg - 100 drachmas");
            System.out.println("6) What do these items do? ");
            System.out.println("7) Exit the shop. ");

            System.out.print("Choice: ");

            Scanner scanner = new Scanner(System.in);

            try {

                shopChoice = scanner.nextInt();
                scanner.nextLine();

            } catch (Exception e) {

                System.out.println("Bad input. Please enter a number between 1 and 4.");
                System.out.println("");
                continue;

            }

            if (shopChoice == 1) {

                System.out.println("How many pounds of AMBROSIA would you like to purchase? ");

                try {

                    numberBought = scanner.nextInt();
                    scanner.nextLine();

                } catch (Exception e) {

                    System.out.println("Bad input. Please enter a number between 1 and 6.");
                    System.out.println("");
                    continue;

                }

                int moneySpent = numberBought * 10;
                quest.getLifeSituation().setMoney(quest.getLifeSituation().getMoney() - moneySpent);
                setAmbrosia(getAmbrosia() + numberBought);

                if (quest.getLifeSituation().getMoney() < 0) {

                    System.out.println("You don't have enough drachmas to purchase this.");
                    quest.getLifeSituation().setMoney(quest.getLifeSituation().getMoney() + moneySpent);

                }

                Utilities.pressEnterToContinue();

            } else if (shopChoice == 2) {

                System.out.println("How many SAILS would you like to purchase? ");

                try {

                    numberBought = scanner.nextInt();
                    scanner.nextLine();

                } catch (Exception e) {

                    System.out.println("Bad input. Please enter a number between 1 and 6.");
                    System.out.println("");
                    continue;

                }

                int moneySpent = numberBought * 50;
                quest.getLifeSituation().setMoney(quest.getLifeSituation().getMoney() - moneySpent);
                setSails(getSails() + numberBought);

                if (quest.getLifeSituation().getMoney() < 0) {

                    System.out.println("You don't have enough drachmas to purchase this.");
                    quest.getLifeSituation().setMoney(quest.getLifeSituation().getMoney() + moneySpent);

                }

                Utilities.pressEnterToContinue();

            } else if (shopChoice == 3) {

                System.out.println("How many EARBUDS would you like to purchase? ");

                try {

                    numberBought = scanner.nextInt();
                    scanner.nextLine();

                } catch (Exception e) {

                    System.out.println("Bad input. Please enter a number between 1 and 6.");
                    System.out.println("");
                    continue;

                }

                int moneySpent = numberBought * 15;
                quest.getLifeSituation().setMoney(quest.getLifeSituation().getMoney() - moneySpent);
                setEarbuds(getEarbuds() + numberBought);

                if (quest.getLifeSituation().getMoney() < 0) {

                    System.out.println("You don't have enough drachmas to purchase this.");
                    quest.getLifeSituation().setMoney(quest.getLifeSituation().getMoney() + moneySpent);

                }

                Utilities.pressEnterToContinue();

            } else if (shopChoice == 4) {

                System.out.println("How many BANDAGES would you like to purchase? ");

                try {

                    numberBought = scanner.nextInt();
                    scanner.nextLine();

                } catch (Exception e) {

                    System.out.println("Bad input. Please enter a number between 1 and 6.");
                    System.out.println("");
                    continue;

                }

                int moneySpent = numberBought * 25;
                quest.getLifeSituation().setMoney(quest.getLifeSituation().getMoney() - moneySpent);
                setBandages(getBandages() + numberBought);

                if (quest.getLifeSituation().getMoney() < 0) {

                    System.out.println("You don't have enough drachmas to purchase this.");
                    quest.getLifeSituation().setMoney(quest.getLifeSituation().getMoney() + moneySpent);

                }

                Utilities.pressEnterToContinue();

            } else if (shopChoice == 5) {

                int animalNum = Utilities.randomAnimalCalc();

                int moneySpent = 100;
                quest.getLifeSituation().setMoney(quest.getLifeSituation().getMoney() - moneySpent);

                if (quest.getLifeSituation().getMoney() < 0) {

                    System.out.println("You don't have enough drachmas to purchase this.");
                    quest.getLifeSituation().setMoney(quest.getLifeSituation().getMoney() + moneySpent);

                } else {

                    if (animalNum == 1) {

                        String animal = "Pegasus";
                        setPegasus(true);
                        System.out.println("You have purchased a mystery egg. You have received a " + animal);


                    } else if (animalNum == 2) {

                        String animal = "Phoenix";
                        setPhoenix(true);
                        System.out.println("You have purchased a mystery egg. You have received a " + animal);


                    } else if (animalNum == 3) {

                        String animal = "Three Headed Dog";
                        setThreeHeadedDog(true);
                        System.out.println("You have purchased a mystery egg. You have received a " + animal);


                    } else {

                        System.out.println("The egg you purchased was a dupe! No special mythical asset. ");

                    }

                }

                Utilities.pressEnterToContinue();

            } else if (shopChoice == 6) {

                System.out.println("Ambrosia - Food supply to sustain your crew during their travels. It is recommended to buy at least 20 pounds of ambrosia for your journey.");
                System.out.println("Sails - Useful in case of damages to your ship by storm. It is recommended to buy at least 2 spare sails for your journey.");
                System.out.println("Earbuds - A strange purchase, but could prove useful against certain opponents in the future. It is recommended to buy at least 1 pair of earbuds for your journey.");
                System.out.println("Bandages - Potentially life-savers for major injuries. It is recommended to buy about 2 pairs of bandages for your journey.");
                System.out.println("Mystery Eggs - Kind of shady, but there is a chance to gain an important, mythical asset to your journey. No recommended amount of eggs.");

                Utilities.pressEnterToContinue();

            } else if (shopChoice == 7) {

                System.out.println("All set? Let's go!");
                break;

            } else {

                System.out.println("Bad input. Please enter a number between 1 and 6.");
                continue;

            }


        }


    }

}
