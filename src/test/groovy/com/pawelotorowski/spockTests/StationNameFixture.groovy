package com.pawelotorowski.spockTests

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic

class StationNameFixture {

    static String someStationName() {
        randomAlphabetic(10)
    }
}
