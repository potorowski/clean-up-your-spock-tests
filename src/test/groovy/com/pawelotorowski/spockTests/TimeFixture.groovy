package com.pawelotorowski.spockTests

import java.time.Instant
import java.time.temporal.ChronoUnit

class TimeFixture {

    static Instant today() {
        Instant.now()
    }

    static Instant tomorrow() {
        today().plus(1, ChronoUnit.DAYS)
    }
}
