package com.example.hw5m5

import com.example.hw5m5.model.PercentageModel

interface RegistrationView {

    fun showLoading()
    fun hideLoading()
    fun showSuccessResult(result: PercentageModel)
    fun showError(errorMessage: String)

}