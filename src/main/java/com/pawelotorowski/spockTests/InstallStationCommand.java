package com.pawelotorowski.spockTests;

import java.time.Instant;

class InstallStationCommand {

    private final String stationName;
    private final String city;
    private final String street;
    private final String countryCode;
    private final String stationOwner;
    private final Instant installationDate;

    InstallStationCommand(String stationName, String city, String street, String countryCode, String stationOwner, Instant installationDate) {
        this.stationName = stationName;
        this.city = city;
        this.street = street;
        this.countryCode = countryCode;
        this.stationOwner = stationOwner;
        this.installationDate = installationDate;
    }
}
