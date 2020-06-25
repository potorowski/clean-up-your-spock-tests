package com.pawelotorowski.spockTests

import java.time.Instant

class TimeFixture {

    static Instant today() {
        Instant.now()
    }
}
