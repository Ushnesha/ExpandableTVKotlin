package com.example.expandabletvkotlin

import android.content.Context
import android.util.AttributeSet
import android.view.View.MeasureSpec.makeMeasureSpec
import androidx.appcompat.widget.AppCompatTextView
import androidx.lifecycle.Lifecycle

class ExpandableTextView : AppCompatTextView {

    private val DEFAULT_TRIM_LENGTH = 200
    private val ELLIPSIS = "..."
    private var originalText : String = ""
    private var trimmedText : String = ""
    private var bufferType = null
    private var trim = true
    private var trimLength: Int = 0

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs){
        val typedArray = context!!.obtainStyledAttributes(attrs, R.styleable.ExpandableTextView)
            trimLength =typedArray.getInt(R.styleable.ExpandableTextView_trimLength, DEFAULT_TRIM_LENGTH)
        typedArray.recycle()

    }





}