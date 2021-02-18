package com.example.part1_kotlin

// Find common elements between two arrays.

class Ques5 {
    fun common() {
        var arr1 = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        var arr2 = intArrayOf(4, 5, 6, 7, 8, 9)
        for (i in arr1.indices) {
            for (j in arr2.indices) {
                if (arr1[i] == arr2[j]) {
                    println(arr1[i])
                }
            }
        }
        println("------------------------------------------------------------")
    }
}