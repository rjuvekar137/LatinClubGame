package com.apcs;

public class Quest {

   private LifeSituation lifeSituation = new LifeSituation();
   private Crew crew = new Crew();
   private Shop shop = new Shop();
   private Encounters encounters = new Encounters();
   private MajorEncounters mEncounters = new MajorEncounters();
   private int turnCounter = 0;

    public LifeSituation getLifeSituation() {
        return lifeSituation;
    }

    public void setLifeSituation(LifeSituation lifeSituation) {
        this.lifeSituation = lifeSituation;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Encounters getEncounters() {
        return encounters;
    }

    public void setEncounters(Encounters encounters) {
        this.encounters = encounters;
    }

    public int getTurnCounter() {
        return turnCounter;
    }

    public void setTurnCounter(int turnCounter) {
        this.turnCounter = turnCounter;
    }

    void welcomeScreen() {

       System.out.println("\n" +
               "░██████╗░██╗░░░██╗███████╗░██████╗████████╗\n" +
               "██╔═══██╗██║░░░██║██╔════╝██╔════╝╚══██╔══╝\n" +
               "██║██╗██║██║░░░██║█████╗░░╚█████╗░░░░██║░░░\n" +
               "╚██████╔╝██║░░░██║██╔══╝░░░╚═══██╗░░░██║░░░\n" +
               "░╚═██╔═╝░╚██████╔╝███████╗██████╔╝░░░██║░░░\n" +
               "░░░╚═╝░░░░╚═════╝░╚══════╝╚═════╝░░░░╚═╝░░░\n");
       System.out.println("A game by Richa Juvekar and Tanya Vasireddy.");
       Utilities.pressEnterToContinue();

   }

   public void start() {

       welcomeScreen();
       lifeSituation.chooseLife();
       crew.chooseCrew();
       shop.shopDisplay(this);
       Utilities.readyMessage();
       while (turnCounter < 4) {

           encounters.randomEncounter(this);
           Utilities.pressEnterToContinue();

       }
       mEncounters.circeIsland();
       shop.shopDisplay(this);
       while (turnCounter < 7) {

           encounters.randomEncounter(this);
           Utilities.pressEnterToContinue();

       }
       mEncounters.monsterStraits(this);
       while (turnCounter < 10) {

           encounters.randomEncounter(this);
           Utilities.pressEnterToContinue();

       }
       mEncounters.cyclopsIsland();
       Utilities.scoreCalc(this);

   }

}
