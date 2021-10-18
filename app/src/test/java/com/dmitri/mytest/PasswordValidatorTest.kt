package com.dmitri.mytest

import org.junit.Assert.*
import org.junit.Test

class PasswordValidatorTest {
    @Test
    fun passwordValidator_PasswordsMatch_ReturnsTrue() {
        assertTrue(MainActivity().passwordsAreEqual("222", "222"))
    }

    @Test
    fun passwordValidator_PasswordsMatch_ReturnsFalse() {
        assertFalse(MainActivity().passwordsAreEqual("333", "222"))
    }

    @Test
    fun passwordValidator_PasswordsMatch_Equal() {
        assertEquals(MainActivity().passwordsAreEqual("222", "222"), MainActivity().passwordsAreEqual("222", "222"))
    }

    @Test
    fun passwordValidator_PasswordsMatch_NotEqual() {
        assertNotEquals(MainActivity().passwordsAreEqual("222", "222"), MainActivity().passwordsAreEqual("222", "333"))
    }
}