package com.example.datastructurealgorithm.search

object Searching {


    /**
     * Categories:
     * 1. Linear or Sequential Searching
     * Complexity:
    Best Case: O(1)
    Worst Case: O(N)
    Average Case: O(N)
     */

    fun linearSearch(values: List<Int>, target: Int): Int {
        var value = -1

        values.forEachIndexed { index, v ->
            if (v == target) value = index
            return@forEachIndexed
        }
        return value
    }

    /**
     * Note: Collection must be sorted
     *
     * Categories:
     * 2. Internal Searching
     * Complexity:
    Best Case: O(1)
    Worst Case: O(log N)
    Average Case: O(log N)
     */

    fun binarySearch(values: List<Int>, target: Int): Int {
        var value = -1
        var low = 0
        var high = values.size - 1
        while (true) {
            if ( high < low) {
                break
            }
            val mid = low + (high - low) / 2
            println("$low $high $mid")
            if (target == values[mid] ) {
                value = mid
                break
            }
            else if (target < values[mid])
                high = mid - 1
            else
                low = mid + 1
        }

        return value
    }


}