package com.pawelotorowski.spockTests

import spock.lang.Specification

import static com.pawelotorowski.spockTests.InstallStationCommandFixture.validInstallationCommand

class StationFactoryTest extends Specification implements StationSupport {

    def "should create station based on InstallStationCommand"() {
        given:
            InstallStationCommand command = validInstallationCommand()

        when:
            Station station = StationFactory.stationBasedOn(command)

        then:
            stationWasCreatedProperlyFromCommand(station, command)
    }
}
