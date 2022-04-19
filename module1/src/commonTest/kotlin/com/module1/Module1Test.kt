package com.module1

import kotlin.test.Test
import kotlin.test.assertEquals

class Module1Test {
    @Test
    fun test() {
        // com.lib.hello is not resolved here
        assertEquals("Hello from Lib", com.lib.hello)
    }
}