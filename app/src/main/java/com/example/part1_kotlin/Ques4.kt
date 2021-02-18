package com.example.part1_kotlin

//Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String.

class Ques4 {
    fun calculate(){
        var s: String = "ConGR@tuL@Ti0n5"
        var sUpper: Int = 0
        var sLower: Int = 0
        var sDigits: Int =0
        var sChar: Int = 0

        for(i in 0 until s.length){
            if(s[i].isUpperCase())
                sUpper++
            else if (s[i].isLowerCase())
                sLower++
            else if (s[i].isDigit())
                sDigits++
            else
                sChar++
        }
        println("Number of Upper Case characters are: "+sUpper+" and percentage is "+(sUpper*100)/s.length+" %")
        println("Number of Lower Case characters are: "+sLower+" and percentage is "+(sLower*100)/s.length+" %")
        println("Number of Digit characters are: "+sDigits+" and percentage is "+(sDigits*100)/s.length+" %")
        println("Number of Special characters are: "+sChar+" and percentage is "+(sChar*100)/s.length+" %")
        println("------------------------------------------------------------")
    }
}