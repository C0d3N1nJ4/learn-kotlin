package com.example.collections

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertTrue

class ArrayTests {

    @Test
    fun `valid indices`() {
        val strings = arrayOf("this", "is", "an", "array", "of", "strings")
        val indices = strings.indices
        assertThat(indices).containsExactly(0, 1, 2, 3, 4, 5)
    }

    @Test
    fun `withIndex returns IndexValues`() {
        val strings = arrayOf("this", "is", "an", "array", "of", "strings")
        for ((index, value) in strings.withIndex()) {
            println("Index $index maps to $value")
            assertTrue(index in 0..5)
        }
    }

    @Test
    fun `withIndex return IndexValues`() {
        val strings = arrayOf("this" , "is", "an", "array", "of", "strings")
         for ((index, value) in strings.withIndex()) {
            println("Index $index maps to $value")
            assertTrue(index in 0..5)
        }
    }
}