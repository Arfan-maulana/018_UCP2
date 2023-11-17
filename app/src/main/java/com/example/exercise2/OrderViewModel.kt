package com.example.exercise2

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.exercise2.Data.OrderUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class OrderViewModel : ViewModel() {
    private val _stateUI = MutableStateFlow(OrderUiState())
    val stateUI: StateFlow<OrderUiState> = _stateUI.asStateFlow()


    fun setContact(listContact: MutableList<String>){
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                namaMahasiswa = listContact[0],
                NIM =  listContact[1],
                Konsetrasi = listContact[2],
                judulSkripsi = listContact[3]
            )

        }
    }
}

