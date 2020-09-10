package com.qa.main;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        final SingletonClass singletonOne = SingletonClass.getInstance();

        System.out.println(singletonOne.getInfo());
        // default information :D

        final SingletonClass singletonTwo = SingletonClass.getInstance();

        singletonTwo.setInfo("This is new info");

        System.out.println(singletonTwo.getInfo());
        // this is new info?
        // default information?

        System.out.println(singletonOne.getInfo());
        // default information?
        // this is new info?

        System.out.println(singletonOne);
        System.out.println(singletonTwo);
        // they point to the same object!

        // scanners are the devil because they're basically singletons!
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        sc2.close();

        // even though i've only closed one scanner, this line gives an error!
        // it's pointing to the same instance as sc2 did, which is now closed!
        System.out.println(sc.nextLine());
    }

}
