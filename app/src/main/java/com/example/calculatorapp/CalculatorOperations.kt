package com.example.calculatorapp

sealed class CalculatorOperations(val symbol:String){
    object Add : CalculatorOperations("+")
    object Minus : CalculatorOperations("-")
    object Multiply : CalculatorOperations("x")
    object Divide : CalculatorOperations("/")
}
