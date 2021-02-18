package com.example.part1_kotlin

// Write a program to find the number of occurrences of a character in a string without using loop.

class Ques3 {
    fun character(){
        var str: String = "Hello World to Kotlin"
        var c: Int = str.count() - str.replace("o","").count()

        System.out.println("Number of Occurences of 'o' in string is "+ c)
        println("------------------------------------------------------------")
    }
}