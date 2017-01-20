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

        return ActorList;
    }
}
