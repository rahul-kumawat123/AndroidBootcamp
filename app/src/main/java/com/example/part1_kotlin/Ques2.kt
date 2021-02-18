package com.example.part1_kotlin

//Write a program to find the number of occurrences of the duplicate words in a string and print them.

class Ques2() {
    fun duplicatewords(){
        var str: String ="In this this sentence sentence many words words are repeated repeated"
        str = str.toLowerCase()
        //System.out.println(str)
        var words = str.split(" ")
        System.out.println(words)
        for( i in 0 until  words.size-1 )
        {
            var count: Int = 1
            var dupword: String? = null
            for (j in i+1 until words.size) {
                if (words[i] == words[j]) {
                    dupword = words[i]
                    count++
                }
            }
            if (dupword != null ) {
                System.out.println( "Duplicate Word: '"+dupword+ "' , Ocurrences: " +count)
            }
         }
        println("------------------------------------------------------------")
    }
}