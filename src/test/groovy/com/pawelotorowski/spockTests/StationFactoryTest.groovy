package com.pawelotorowski.spockTests

import spock.lang.Specification

import java.time.Instant

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic

class StationFactoryTest extends Specification {

    def "should create station based on InstallStationCommand"() {
        given:
            InstallStationCommand command = validInstallationCommand()

        when:
            Station station = StationFactory.stationBasedOn(command)

        then:
            station.name() == command.stationName
            station.address().city() == command.city
            station.address().street() == command.street
            station.address().countryCode() == command.countryCode
            station.owner() == command.stationOwner
            station.installedAt() == command.installationDate
    }

    private static InstallStationCommand validInstallationCommand() {
        new InstallStationCommand(someStationName(), someCity(), someStreet(), someCountryCode(), someStationOwner(), today())
    }

    private static String someStationName() {
        randomAlphabetic(10)
    }

    private static String someCity() {
        randomAlphabetic(10)
    }

    private static String someStreet() {
        randomAlphabetic(10)
    }

    private static String someCountryCode() {
        randomAlphabetic(10)
    }

    private static String someStationOwner() {
        randomAlphabetic(10)
    }

    private static Instant today() {
        Instant.now()
    }
}
