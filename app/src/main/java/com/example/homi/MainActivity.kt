package com.example.homi

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.homi.databinding.ActivityMainBinding
import com.example.homi.presenter.Presenter
import com.example.homi.view.CounterView

class MainActivity : AppCompatActivity(),CounterView {
    var presenter = Presenter()
    var count = 0
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        presenter.attachView(this)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            btnPlus.setOnClickListener{
                presenter.increment()
                presenter.checkCounter()
            }
            btnMinus.setOnClickListener{
                presenter.decrement()


            }
        }
    }

    override fun changeCount(count: Int) {
        binding.resultTv.text = count.toString()
    }

    override fun changeTextColor() {
        binding.resultTv.setTextColor(Color.GREEN)
    }

    override fun showToast() {
        Toast.makeText(this, "ура", Toast.LENGTH_SHORT).show()
    }

    override fun backTextColor() {
        binding.resultTv.setTextColor(Color.BLACK)
    }

}