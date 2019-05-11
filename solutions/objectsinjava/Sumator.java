package solutions.objectsinjava;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Sumator {


    /**
     * Calculetes the sum of two numbers type:Integer
     * @param a the first number to sum
     * @param b the second number to sum
     * @return the sum of the specified numbers
     */
    public Integer sum(Integer a, Integer b) {

        return a + b;
    }

    /**
     * Calculetes the sum of two numbers type:Double
     * @param a the first number to sum
     * @param b the second number to sum
     * @return the sum of the specified numbers
     */
    public Double sum(Double a, Double b) {

        return a + b;
    }

    /**
     * Concatenates two strings
     * @param a the first string to sum
     * @param b the second string to sum
     * @return the combination of the input values
     */
    public String sum(String a, String b) {

        return a + b;
    }

    /**
     * Calculetes the sum of two numbers type:BigInteger
     * @param a the first number to sum
     * @param b the second number to sum
     * @return the sum of the specified numbers
     */
    public BigInteger sum(BigInteger a, BigInteger b) {

        return a.add(b);

    }
    /**
     * Calculetes the sum of two numbers type:BigDecimal
     * @param a the first number to sum
     * @param b the second number to sum
     * @return the sum of the specified numbers
     */

    public BigDecimal sum(BigDecimal a, BigDecimal b) {

        return a.add(b);
    }


}
