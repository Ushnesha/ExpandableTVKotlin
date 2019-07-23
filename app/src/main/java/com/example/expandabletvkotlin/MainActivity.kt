package com.example.expandabletvkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.animation.OvershootInterpolator


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        expandableTextView.setAnimationDuration(750L)
        expandableTextView.setInterpolator(OvershootInterpolator())
        expandableTextView.expandInterpolator = OvershootInterpolator()
        expandableTextView.collapseInterpolator = OvershootInterpolator()

        button_toggle.setOnClickListener{
            if(expandableTextView.isExpanded) {
                expandableTextView.collapse()
                button_toggle.text = getString(R.string.collapse)
            }else {
                expandableTextView.expand()
                button_toggle.text = getString(R.string.expand)
            }
        }

    }


}
