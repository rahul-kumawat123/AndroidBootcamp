package com.example.part1_kotlin

//Check letter in string which do not have pair.

class Ques6 {
    fun checkstring(){
        val str = "XXBDDC"
        var i = 0
        println("Non pair elements are: ")
        while (i < str.length-1) {
            if (str[i] != str[i+1]) {
                println(str[i] + " ")
                i++
            }
            else
                i += 2
        }
        if (str[str.length-1] != str[str.length-2])
            println(str[str.length-1])
        println("------------------------------------------------------------")
    }
}