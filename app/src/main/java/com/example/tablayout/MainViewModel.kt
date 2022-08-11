package com.example.tablayout

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    val plant = MutableLiveData<PlantModel>()
}