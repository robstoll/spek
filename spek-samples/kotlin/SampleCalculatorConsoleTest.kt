package org.spek.samples

import org.spek.console.api.ConsoleSpek
import org.spek.api.*

class CalculatorConsoleSpecs: ConsoleSpek() {{
    given("a calculator") {
        val calculator = SampleCalculator()
        on("calling sum with two numbers") {

            val sum = calculator.sum(2, 4)


            it("should return the result of adding the first number to the second number") {
                shouldEqual(6, sum)
            }

            it("should another") {
                shouldEqual(6, sum)
            }
        }

        on("calling substract with two numbers") {
            val subtract = calculator.subtract(4, 2)

            it("should return the result of substracting the second number from the first number") {

                shouldEqual(2, subtract)
            }
        }
    }
}
}
