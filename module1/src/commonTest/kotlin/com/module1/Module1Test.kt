package com.module1

import kotlin.test.Test
import kotlin.test.assertEquals

class Module1Test {
    @Test
    fun test() {
        // With kotlin.mpp.hierarchicalStructureSupport=false, `com.lib` gets resolved
        assertEquals("Hello from Lib", com.lib.hello)
        // But not transitively exposed `com.sublib`
        assertEquals("Hello from SubLib", com.sublib.hello)
    }
}