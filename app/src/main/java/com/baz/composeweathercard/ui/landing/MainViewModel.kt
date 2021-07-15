package com.baz.composeweathercard.ui.landing

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel()  {
    private val mSelected = MutableLiveData(0)
    val selected: LiveData<Int> = mSelected

    fun onDateValueChanged(selected: Int) {
        mSelected.value = selected
    }
}