package com.efrei.rest;

import java.util.HashMap;
import java.util.Map;

/**
 * Container for all Actors
 * HashMap like Actor ID, Actor object
 */
public class ActorContainer {
    private static Map<Integer, Actor> ActorList = null;

    public static Map<Integer, Actor> getInstance() {
        if (ActorList == null)
        {
            ActorList = buildActorList();
        }

        return ActorList;
    }

    private ActorContainer() {
    }

    private static Map<Integer, Actor> buildActorList() {
        ActorList = new HashMap<>();

        Actor fishburne = new Actor();
        fishburne.setName("Fishburne");
        fishburne.setSurname("Laurence");
        fishburne.setBirthdate("1961");
        fishburne.setId(1);

        ActorList.put(fishburne.getId(), fishburne);

        Actor reeves = new Actor();
        reeves.setName("Reeves");
        reeves.setSurname("Keanu");
        reeves.setBirthdate("1961");
        reeves.setId(2);

        ActorList.put(reeves.getId(), reeves);

        Actor ford = new Actor();
        ford.setName("Ford");
        ford.setSurname("Harrison");
        ford.setBirthdate("1942");
        ford.setId(3);

        ActorList.put(ford.getId(), ford);

        Actor hamill = new Actor();
        hamill.setName("Hamill");
        hamill.setSurname("Mark");
        hamill.setBirthdate("1951");
        hamill.setId(4);

        ActorList.put(hamill.getId(), hamill);

        Actor damon = new Actor();
        damon.setName("Damon");
        damon.setSurname("Matt");
        damon.setBirthdate("1970");
        damon.setId(5);

        ActorList.put(damon.getId(), damon);

        Actor chastain = new Actor();
        chastain.setName("Chastain");
        chastain.setSurname("Jessica");
        chastain.setBirthdate("1977");
        chastain.setId(6);

        ActorList.put(chastain.getId(), chastain);

        Actor luna = new Actor();
        luna.setName("Luna");
        luna.setSurname("Diego");
        luna.setBirthdate("1979");
        luna.setId(7);

        ActorList.put(luna.getId(), luna);

        Actor jones = new Actor();
        jones.setName("Jones");
        jones.setSurname("Felicity");
        jones.setBirthdate("1983");
        jones.setId(8);

        ActorList.put(jones.getId(), jones);

        Actor wiig = new Actor();
        wiig.setName("Wiig");
        wiig.setSurname("Kristen");
        wiig.setBirthdate("1973");
        wiig.setId(9);

        ActorList.put(wiig.getId(), wiig);

        Actor hader = new Actor();
        hader.setName("Hader");
        hader.setSurname("Bill");
        hader.setBirthdate("1978");
        hader.setId(10);

        ActorList.put(hader.getId(), hader);

        return ActorList;
    }
}
