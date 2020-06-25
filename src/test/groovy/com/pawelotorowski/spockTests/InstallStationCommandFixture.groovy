package com.pawelotorowski.spockTests

import static com.pawelotorowski.spockTests.AddressFixture.someCity
import static com.pawelotorowski.spockTests.AddressFixture.someCountryCode
import static com.pawelotorowski.spockTests.AddressFixture.someStreet
import static com.pawelotorowski.spockTests.StationNameFixture.someStationName
import static com.pawelotorowski.spockTests.StationOwnerFixture.someStationOwner
import static com.pawelotorowski.spockTests.TimeFixture.today

class InstallStationCommandFixture {

    static InstallStationCommand validInstallationCommand() {
        new InstallStationCommand(someStationName(), someCity(), someStreet(), someCountryCode(), someStationOwner(), today())
    }
}
