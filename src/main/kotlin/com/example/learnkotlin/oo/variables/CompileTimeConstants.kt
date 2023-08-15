package com.example.learnkotlin.oo.variables

/**
 * Constants are defined using UPPERCASE names
 * This example has a custom setter to map any provided priority into the
 * given range.
 *
 * val is a Kotlin keyword and const is a modifier
 * const must be used along with val and does not replace it
 */
class Task(val name: String, _priority: Int = DEFAULT_PRIORITY) {
    companion object {
        const val MIN_PRIORITY = 1
        const val MAX_PRIORITY = 5
        const val DEFAULT_PRIORITY = 3
    }

    var priority = validPriority(_priority)

    private fun validPriority(priority: Int) =
        priority.coerceIn(MIN_PRIORITY, MAX_PRIORITY)

    override fun toString(): String {
        return "Task(name='$name', priority=$priority)"
    }
}