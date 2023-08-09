package com.example.datastructurealgorithm

import com.example.datastructurealgorithm.search.Searching

fun main() {
    val collects = listOf(10, 14, 19, 26, 27, 31, 33, 35, 42, 44, 45)

    println("result 1: ${Searching.linearSearch(collects, 31)}")
    println("Result 2: ${Searching.binarySearch(collects, 42)}")
}