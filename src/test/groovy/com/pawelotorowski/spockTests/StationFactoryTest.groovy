package com.pawelotorowski.spockTests

import spock.lang.Specification

import static com.pawelotorowski.spockTests.InstallStationCommandFixture.stationInstalled
import static com.pawelotorowski.spockTests.TimeFixture.tomorrow

class StationFactoryTest extends Specification implements StationSupport {

    def "should create station based on InstallStationCommand"() {
        given:
            InstallStationCommand command = stationInstalled().build()

        when:
            Station station = StationFactory.stationBasedOn(command)

        then:
            stationWasCreatedProperlyFromCommand(station, command)
    }

    def "should not create station based on InstallStationCommand from the future"() {
        given:
            InstallStationCommand command = stationInstalled().at(tomorrow()).build()

        when:
            StationFactory.stationBasedOn(command)

        then:
            thrown StationCannotBeFromTheFuture
    }
}
