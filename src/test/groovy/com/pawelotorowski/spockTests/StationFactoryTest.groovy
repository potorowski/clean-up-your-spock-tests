package com.pawelotorowski.spockTests

import spock.lang.Specification

import static com.pawelotorowski.spockTests.InstallStationCommandFixture.validInstallationCommand
import static com.pawelotorowski.spockTests.InstallStationCommandFixture.validInstallationCommandFromTheFuture

class StationFactoryTest extends Specification implements StationSupport {

    def "should create station based on InstallStationCommand"() {
        given:
            InstallStationCommand command = validInstallationCommand()

        when:
            Station station = StationFactory.stationBasedOn(command)

        then:
            stationWasCreatedProperlyFromCommand(station, command)
    }

    def "should not create station based on InstallStationCommand from the future"() {
        given:
            InstallStationCommand command = validInstallationCommandFromTheFuture()

        when:
            StationFactory.stationBasedOn(command)

        then:
            thrown StationCannotBeFromTheFuture
    }
}
