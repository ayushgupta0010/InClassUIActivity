package edu.temple.inclassuiactivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val ctx: Context, private val nums: Array<Int>) : BaseAdapter() {

    override fun getCount() = nums.size

    override fun getItem(position: Int) = nums[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?) =
        (if (convertView == null) TextView(ctx)
        else {
            (convertView as TextView)
        }).apply {
            text = nums[position].toString()
            textSize = 22f
        }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val textView = (getDropDownView(position, convertView, parent) as TextView)
        textView.textSize = nums[position].toFloat()
        return textView
    }
}