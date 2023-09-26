package com.apcs;

public class Encounters {

    public int randomEncounter(Quest quest) {

        int encounter = Utilities.randomCalc();

        if (quest.getCrew().getCount() <= 0) {

            System.out.println("Your entire crew has died! GAME OVER. ");
            System.exit(0);

        } else if (quest.getShop().getAmbrosia() <= 0) {

            System.out.println("You have ran out of ambrosia to feed your crew! GAME OVER. ");
            System.exit(0);

        } else if (quest.getLifeSituation().getMoney() <= 0) {

            System.out.println("You have run out of money, leaving your crew unable to continue going forward! GAME OVER. ");
            System.exit(0);

        } else {

            if (encounter == 1) {

                System.out.println("Your crew has incurred the wrath of Lord Poseidon and is caught in a storm. One crew member has died. ");
                quest.getCrew().killCrewMember();
                quest.setTurnCounter(quest.getTurnCounter() + 1);

            } else if (encounter == 2) {

                System.out.println("Your crew has incurred the wrath of Lord Poseidon and is caught in a storm.");

                if (quest.getShop().getSails() > 1) {

                    System.out.println("Thank the gods you purchased those SAILS before! Your entire crew has survived.");
                    quest.getShop().setSails(quest.getShop().getSails() - 2);

                } else {

                    System.out.println("You lacked the proper replacement SAILS to carry everyone safely through the storm. One crew member has died.");
                    quest.getCrew().killCrewMember();

                }
                quest.setTurnCounter(quest.getTurnCounter() + 1);

            } else if (encounter == 3) {

                System.out.println("Your crew has encroached onto siren territory.");

                if (quest.getShop().getEarbuds() > 0) {

                    System.out.println("Thank the gods you purchased those EARBUDS before! Your entire crew has survived.");
                    quest.getShop().setEarbuds(quest.getShop().getEarbuds() - 1);

                } else {

                    System.out.println("You lacked the proper replacement EARBUDS to protect your entire crew from the sirens. One crew member has died.");
                    quest.getCrew().killCrewMember();

                }
                quest.setTurnCounter(quest.getTurnCounter() + 1);

            } else if (encounter == 4) {

                System.out.println("Lord Poseidon has favored your crew! You can travel safely ONE extra turn with no consequences. ");
                quest.setTurnCounter(quest.getTurnCounter() + 2);

            } else if (encounter == 5) {

                System.out.println("A crew member got greedy with the ambrosia supply, spoiling and eating a major portion of your supply. One crew member has died and half of your ambrosia supply is gone.");
                quest.getCrew().killCrewMember();
                quest.getShop().setAmbrosia(quest.getShop().getAmbrosia() / 2);
                quest.setTurnCounter(quest.getTurnCounter() + 1);

            } else if (encounter == 6) {

                System.out.println("Your crew has found a pack of hippocampi, who help your ship travel faster. You can travel safely ONE extra turn with no consequences. ");
                quest.setTurnCounter(quest.getTurnCounter() + 1);

            } else if (encounter == 7) {

                System.out.println("While sailing, your crew rescues someone stranded at sea. To express their gratitude, they offer to join your crew. A new crew member has joined.");
                quest.getCrew().addCrewMember("Fortuna");
                quest.setTurnCounter(quest.getTurnCounter() + 1);

            } else if (encounter == 8) {

                System.out.println("Smooth sailing today. Nothing out of the ordinary happens.");
                quest.setTurnCounter(quest.getTurnCounter() + 1);

            } else if (encounter == 9) {

                System.out.println("The goddess of the rainbow, Iris, has favored your crew and blessed you with some extra wealth. Receive plus 100 DRACHMAS.");
                quest.getLifeSituation().setMoney(quest.getLifeSituation().getMoney() + 100);
                quest.setTurnCounter(quest.getTurnCounter() + 1);

            } else if (encounter == 10) {

                System.out.println("A monster has attacked you and your crew.");

                if (quest.getShop().getBandages() > 4) {

                    System.out.println("Thank the gods you purchased those BANDAGES before! Your entire crew has survived.");
                    quest.getShop().setBandages(quest.getShop().getBandages() - 5);

                } else {

                    System.out.println("You lacked the proper replacement BANDAGES to protect and rehabilitate your crew from the monster. One crew member has died.");
                    quest.getCrew().killCrewMember();

                }
                quest.setTurnCounter(quest.getTurnCounter() + 1);

            } else if (encounter == 11) {

                System.out.println("It's a foggy day.");

                if (quest.getShop().isPegasus() == true) {

                    System.out.println("If you have a PEGASUS, you can travel safely ONE extra turn with no consequences.");
                    quest.setTurnCounter(quest.getTurnCounter() + 1);

                } else {

                    System.out.println("Sailing takes longer than normal, but ultimately you make steady pace. Nothing out of the ordinary happens  ");

                }
                quest.setTurnCounter(quest.getTurnCounter() + 1);

            } else if (encounter == 12) {

                System.out.println("The kerkopes have stolen away on your ship, looking to steal some of your riches.");

                if (quest.getShop().isThreeHeadedDog() == true) {

                    System.out.println("If you have a THREE-HEADED DOG, your money is safe! Nothing out of the ordinary happens");

                } else {

                    System.out.println("The brothers get into your money stash and are gone by the morning. Lose 50 drachmas.  ");
                    quest.getLifeSituation().setMoney(quest.getLifeSituation().getMoney() - 50);
                }
                quest.setTurnCounter(quest.getTurnCounter() + 1);

            } else if (encounter == 13) {

                System.out.println("A crew member has fallen extremely ill and they most likely won't make it. ");

                if (quest.getShop().isPhoenix() == true) {

                    System.out.println("If you have a PHOENIX, you can use the Phoenix tears to save their life. Nothing out of the ordinary happens. ");

                } else {

                    System.out.println("You did not have the proper resources to save the crew member. One crew member has died.");
                    quest.getCrew().killCrewMember();

                }
                quest.setTurnCounter(quest.getTurnCounter() + 1);

            } else if (encounter == 14) {

                System.out.println("A monster has attacked you and your crew. A crew member on the night shift fights back, but ultimately does not make it. One crew member has died.");
                quest.getCrew().killCrewMember();
                quest.setTurnCounter(quest.getTurnCounter() + 1);

            } else {

                return 0;

            }

        }

        return encounter;
    }

}


