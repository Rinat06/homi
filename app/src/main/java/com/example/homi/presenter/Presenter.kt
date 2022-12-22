package com.example.homi.presenter

import com.example.homi.model.CounterModel
import com.example.homi.view.CounterView

class Presenter {
    private val model = CounterModel()
    lateinit var view: CounterView

    fun increment(){
        model.increment()
        view.changeCount(model.count)
    }

    fun decrement(){
        model.decrement()
        view.changeCount(model.count)
    }

    fun attachView(view: CounterView){
        this.view = view
    }
    fun checkCounter() {
        if (model.count == 10) {
            view.showToast()
        } else if (model.count == 15) {
            view.changeTextColor()
        } else if (model.count == 14){
            view.backTextColor()
        }
    }
}