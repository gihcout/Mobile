package com.example.mobile.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mobile.Model.ItemsModel
import com.example.mobile.Repository.MainRepository

class MainViewModel:ViewModel() {
    private val repository=MainRepository()

    fun loadFiltered(id:Int): LiveData<MutableList<ItemsModel>>{
        return repository.loadFiltered(id)
    }
}