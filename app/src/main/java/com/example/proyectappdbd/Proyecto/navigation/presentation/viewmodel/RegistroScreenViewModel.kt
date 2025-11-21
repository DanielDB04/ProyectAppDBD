package com.example.proyectappdbd.Proyecto.navigation.presentation.viewmodel

import androidx.compose.lint.Name
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RegistroScreenViewModel: ViewModel() {
    private val _username = MutableStateFlow("")
    val username: StateFlow<String> = _username

    private val _password = MutableStateFlow("")
    val password: StateFlow<String> = _password

    private val _name = MutableStateFlow("")
    val name: StateFlow<String> = _username

    private val _surname = MutableStateFlow("")
    val surname: StateFlow<String> = _username

    private val _email = MutableStateFlow("")
    val email: StateFlow<String> = _email

    fun setUsername(username: String) {
        _username.value = username
    }

    fun setPassword(password: String) {
        _password.value = password
    }

    fun setName(name: String) {
        _name.value = name
    }

    fun setSurname(surname: String) {
        _surname.value = surname
    }

    fun setEmail(emai: String) {
        _email.value = emai
    }

    fun clear() {
        _username.value = ""
        _password.value = ""
        _name.value=""
        _surname.value=""
    }
}