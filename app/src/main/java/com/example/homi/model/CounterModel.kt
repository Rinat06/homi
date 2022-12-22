package com.example.homi.model

import android.content.Context
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.test.core.app.ApplicationProvider.getApplicationContext


class CounterModel {
    var count = 0

    fun increment() {
        count++
    }

    fun decrement() {
        count--
    }
}