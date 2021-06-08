package com.company;

public enum Planet {
    Mercury(0),
    Venus(0),
    Earth(1),
    Mars(2),
    Jupiter(79),
    Saturn(82),
    Uranus(27),
    Neptune(14),
    ;
    private final int countOfSatellite;

    Planet(int countOfSatellite) {
        this.countOfSatellite = countOfSatellite;
    }

    public int getSatellite() {
        return countOfSatellite;
    }

    @Override
    public String toString() {
        return name() +
                ", колличество спуников = " + countOfSatellite;
    }
}
