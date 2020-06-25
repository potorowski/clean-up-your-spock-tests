package com.pawelotorowski.spockTests

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic

class StationOwnerFixture {

    static String someStationOwner() {
        randomAlphabetic(10)
    }
}
