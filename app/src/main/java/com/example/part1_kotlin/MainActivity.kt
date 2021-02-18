package com.example.part1_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Write a program to replace a substring inside a string with another string.
         */
        val q1 = Ques1()
        q1.changestring()

        /*
        Write a program to find the number of occurrences of the duplicate words in a string and print them.
         */
        val q2 =Ques2()
        q2.duplicatewords()

        /*
        Write a program to find the number of occurrences of a character in a string without using loop.
         */
        val q3 = Ques3()
        q3.character()

        /*
        Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String.
         */
        val q4 = Ques4()
        q4.calculate()

        /*
        Find common elements between two arrays.
         */
        val q5 = Ques5()
        q5.common()

        /*
        Check letter in string which do not have pair.
         */
        val q6 = Ques6()
        q6.checkstring()

    }
}