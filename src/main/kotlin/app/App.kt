package app

import utils.CalcUtils

class App {

    fun run() {
        printHeader()
        inputValue()
    }

    private fun printHeader() {
        println("============")
        println("Simple Calculator App")
        println("============")
    }

    private fun inputValue() {
        println("-----INPUT ONLY NUMBER-----")
        println("Enter value A: ")
        val a = readLine()?.toInt() ?: 0
        println("Enter value B: ")
        val b = readLine()?.toInt() ?: 0
        calculate(a, b)
    }

    private fun calculate(a: Int, b: Int) {
        val calcUtils = CalcUtils()
        println("-----RESULT-----")
        println("Result for Plus = ${calcUtils.plus(a, b)}")
        println("Result for Minus = ${calcUtils.minus(a, b)}")
        println("Result for Multiplication = ${calcUtils.multiplication(a, b)}")
        println("Result for Division = ${calcUtils.division(a, b)}")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val app = App()
            app.run()
        }
    }

}