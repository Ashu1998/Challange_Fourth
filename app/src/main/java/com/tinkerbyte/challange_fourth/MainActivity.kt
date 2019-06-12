package com.tinkerbyte.challange_fourth

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTextView.visibility = View.GONE
        mSeekBar.max = 100

        mSeekBar.setOnSeekBarChangeListener( object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                mPercentTextView.text = p1.toString()

                if(p1>=40&&p1<=45) {
                    mTextView.visibility = View.VISIBLE
                }else
                    mTextView.visibility = View.GONE

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }


        })
    }
}
