package com.pawelotorowski.spockTests

trait StationSupport {

    static void stationWasCreatedProperlyFromCommand(Station station, InstallStationCommand command) {
        assert station.name() == command.stationName
        assert station.address().city() == command.city
        assert station.address().street() == command.street
        assert station.address().countryCode() == command.countryCode
        assert station.owner() == command.stationOwner
        assert station.installedAt() == command.installationDate
    }

}