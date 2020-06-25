package com.pawelotorowski.spockTests

import spock.lang.Specification

import static com.pawelotorowski.spockTests.InstallStationCommandFixture.validInstallationCommand

class StationFactoryTest extends Specification {

    def "should create station based on InstallStationCommand"() {
        given:
            InstallStationCommand command = validInstallationCommand()

        when:
            Station station = StationFactory.stationBasedOn(command)

        then:
            stationWasCreatedProperlyFromCommand(station, command)
    }

    private static void stationWasCreatedProperlyFromCommand(Station station, InstallStationCommand command) {
        assert station.name() == command.stationName
        assert station.address().city() == command.city
        assert station.address().street() == command.street
        assert station.address().countryCode() == command.countryCode
        assert station.owner() == command.stationOwner
        assert station.installedAt() == command.installationDate
    }
}
