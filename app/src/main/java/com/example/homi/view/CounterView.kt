package com.example.homi.view

import android.widget.Toast

interface CounterView {
    fun changeCount(count: Int)
    fun changeTextColor()
    fun showToast()
    fun backTextColor()
}