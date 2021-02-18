package com.example.part1_kotlin

//Write a program to replace a substring inside a string with another string.

class Ques1() {
    fun changestring(){
        println("------------------------------------------------------------")
        var strng: String = "My name is Rahul Kumawat"
        var strng2: String = strng.replace("name","Full Name")
        System.out.println(strng)

        System.out.println("Updated String is:")

        System.out.println(strng2)

        println("------------------------------------------------------------")
    }
}
