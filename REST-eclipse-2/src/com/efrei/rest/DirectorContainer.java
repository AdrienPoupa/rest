package com.efrei.rest;

import java.util.HashMap;
import java.util.Map;

/**
 * Container for all directors
 * HashMap like Director ID, Director object
 */
public class DirectorContainer {
    private static Map<Integer, Director> directorList = null;

    public static Map<Integer, Director> getInstance() {
        if (directorList == null)
        {
            directorList = buildDirectorList();
        }

        return directorList;
    }

    private DirectorContainer() {
    }

    private static Map<Integer, Director> buildDirectorList() {
        directorList = new HashMap<>();

        Director wachowski = new Director();
        wachowski.setName("Wachowski");
        wachowski.setSurname("Lana");
        wachowski.setBirthdate("1965");
        wachowski.setId(1);

        directorList.put(wachowski.getId(), wachowski);

        Director abrams = new Director();
        abrams.setName("Abrams");
        abrams.setSurname("Jeffrey Jacob");
        abrams.setBirthdate("1966");
        abrams.setId(2);

        directorList.put(abrams.getId(), abrams);

        Director scott = new Director();
        scott.setName("Scott");
        scott.setSurname("Ridley");
        scott.setBirthdate("1937");
        scott.setId(3);

        directorList.put(scott.getId(), scott);

        Director edwards = new Director();
        edwards.setName("Edwards");
        edwards.setSurname("Gareth");
        edwards.setBirthdate("1975");
        edwards.setId(4);

        directorList.put(edwards.getId(), edwards);

        Director vernon = new Director();
        vernon.setName("Vernon");
        vernon.setSurname("Conrad");
        vernon.setBirthdate("1968");
        vernon.setId(5);

        directorList.put(vernon.getId(), vernon);

        return directorList;
    }
}
