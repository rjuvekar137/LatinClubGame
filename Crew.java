package com.apcs;
import java.util.ArrayList;
import java.util.Scanner;

public class Crew {

    private ArrayList<String> crew = new ArrayList<String>();
    String name1 = null;
    String name2 = null;
    String name3 = null;
    String name4 = null;
    String name5 = null;

    public void addCrewMember(String name) {

        String crewMember = new String(name);
        crew.add(crewMember);

    }

    public void killCrewMember() {

        if (crew.size() > 0) {

            crew.remove(crew.size() - 1);

        }

    }


    public void chooseCrew() {

        System.out.println("");
        System.out.println("Now, name your crew. ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("1) ");
        String name1 = scanner.nextLine();
        addCrewMember(name1);

        System.out.print("2) ");
        String name2 = scanner.nextLine();
        addCrewMember(name2);

        System.out.print("3) ");
        String name3 = scanner.nextLine();
        addCrewMember(name3);

        System.out.print("4) ");
        String name4 = scanner.next();
        addCrewMember(name4);

        System.out.print("5) ");
        String name5 = scanner.next();
        addCrewMember(name5);

        printCrew();

    }

    public void printCrew() {

        System.out.println("");
        System.out.println("Your crew has been named! Here is the role call once more for you to see: ");
        System.out.println("1) " + crew.get(0));
        System.out.println("2) " + crew.get(1));
        System.out.println("3) " + crew.get(2));
        System.out.println("4) " + crew.get(3));
        System.out.println("5) " + crew.get(4));
        Utilities.pressEnterToContinue();

    }

    public int getCount() {

        return crew.size();

    }

}
