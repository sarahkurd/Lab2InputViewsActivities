package com.example.lab2_inputviewsactivities

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.widget.RadioButton
import android.view.View
import android.widget.SeekBar
import android.widget.TextView
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // UPDATE STATUS
                textView5.text = seekBar?.progress.toString()

                // UPDATE TEXT COLOR
                if (seekBar?.progress != null && seekBar?.progress < 34 ) {
                    textView4.setTextColor(Color.RED)
                } else if (seekBar?.progress != null && seekBar?.progress >= 34 && seekBar?.progress <= 66) {
                    textView4.setTextColor(Color.YELLOW)
                } else {
                    textView4.setTextColor(Color.GREEN)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        })


//        plain_text_input.addTextChangedListener(object: TextWatcher {
//
////            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
////                //textView3.text = s
////            }
//
//
//
//        })

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
