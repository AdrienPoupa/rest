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

        return directorList;
    }
}
