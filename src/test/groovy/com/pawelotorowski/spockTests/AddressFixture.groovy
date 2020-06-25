package com.pawelotorowski.spockTests

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic

class AddressFixture {

    static String someCity() {
        randomAlphabetic(10)
    }

    static String someStreet() {
        randomAlphabetic(10)
    }

    static String someCountryCode() {
        randomAlphabetic(10)
    }
}
