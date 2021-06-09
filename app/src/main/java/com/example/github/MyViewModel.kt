package com.example.github

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel :ViewModel() {
    private var sum=0
    private val _number=MutableLiveData<Int>()
    val number:LiveData<Int> = _number

    init{
        _number.value=0
    }

    fun add(n:Int){
        sum+=n
        _number.value=sum
    }
    fun resert(){
        _number.value=0
        sum=0
    }
}