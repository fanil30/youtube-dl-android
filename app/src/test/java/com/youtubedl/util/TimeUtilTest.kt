package com.youtubedl.util

import com.youtubedl.util.TimeUtil.convertMilliSecondsToTimer
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by cuongpm on 1/29/19.
 */
class TimeUtilTest {

    @Test
    fun `test convert milliseconds to timer`() {
        val timer1 = 111000L
        val timer2 = 929000L
        val timer3 = 8725000L

        assertEquals("01:51", convertMilliSecondsToTimer(timer1))
        assertEquals("15:29", convertMilliSecondsToTimer(timer2))
        assertEquals("2:25:25", convertMilliSecondsToTimer(timer3))
    }

}