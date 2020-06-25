package com.pawelotorowski.spockTests

import spock.lang.Specification

import java.time.Instant

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic

class StationFactoryTest extends Specification {

    def "should create station based on InstallStationCommand"() {
        given:
            String stationName = randomAlphabetic(10)
            String city = randomAlphabetic(10)
            String street = randomAlphabetic(10)
            String countryCode = randomAlphabetic(10)
            String stationOwner = randomAlphabetic(10)
            Instant installationDate = Instant.now()
            InstallStationCommand command = new InstallStationCommand(stationName, city, street, countryCode, stationOwner, installationDate)

        when:
            Station station = StationFactory.stationBasedOn(command)

        then:
            station.name() == stationName
            station.address().city() == city
            station.address().street() == street
            station.address().countryCode() == countryCode
            station.owner() == stationOwner
            station.installedAt() == installationDate
    }
}
