package com.example.lab2_inputviewsactivities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radioButton1 ->
                    if (checked) {
                        textView.text = "True"
                    }
                R.id.radioButton2 ->
                if (checked) {
                    textView.text = "False"
                }
                R.id.radioButton3 ->
                    if (checked) {
                        textView.text = "Get it together"
                    }
            }
        }
    }

}
