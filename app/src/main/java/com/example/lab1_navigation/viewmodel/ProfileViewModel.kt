package com.example.lab1_navigation.viewmodel

import DataRepository
import Product
import User
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lab1_navigation.model.Account
import com.example.lab1_navigation.model.AccountInfo
import kotlinx.coroutines.launch

class ProfileViewModel: ViewModel() {
    private val repository = DataRepository()

    val users = MutableLiveData<List<User>>()
    val products = MutableLiveData<List<Product>>()

    init {
        users.value = repository.getUsers()
        products.value = repository.getProducts()
    }
}