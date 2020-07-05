package com.pawelotorowski.spockTests

import java.time.Instant

import static com.pawelotorowski.spockTests.AddressFixture.someCity
import static com.pawelotorowski.spockTests.AddressFixture.someCountryCode
import static com.pawelotorowski.spockTests.AddressFixture.someStreet
import static com.pawelotorowski.spockTests.StationNameFixture.someStationName
import static com.pawelotorowski.spockTests.StationOwnerFixture.someStationOwner
import static com.pawelotorowski.spockTests.TimeFixture.today

class InstallStationCommandFixture {

    static InstallStationCommandBuilder stationInstalled() {
        new InstallStationCommandBuilder()
    }

    static class InstallStationCommandBuilder {

        private String stationName = someStationName()
        private String city = someCity()
        private String street = someStreet()
        private String countryCode = someCountryCode()
        private String stationOwner = someStationOwner()
        private Instant installationDate = today()

        InstallStationCommandBuilder at(Instant pointInTime) {
            installationDate = pointInTime
            this
        }

        InstallStationCommand build() {
            new InstallStationCommand(stationName, city, street, countryCode, stationOwner, installationDate)
        }
    }
}
