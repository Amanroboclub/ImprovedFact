package com.rajaman.improvedfact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
        var number = editText!!.text.toString().toInt()
        for(i in 1..number) {
            if (number > i) {
                number /= i
            } else {
                textView.text = "Now this is Answer$number"
            }
        }
        }
    }
}
