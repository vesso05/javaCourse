package solutions.objectsinjava;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Sumator {



  public Integer sum(Integer a, Integer b)
  {

      return a+b;
  }

    public Double sum(Double a, Double b)
    {

        return a+b;
    }
    public String sum(String a, String b)
    {

        return a+b;
    }
    public BigInteger sum(BigInteger a, BigInteger b)
    {

        return a.add(b);

    }
    public BigDecimal sum(BigDecimal a, BigDecimal b)
    {

        return a.add(b);
    }


    public TestMethod sum(String a, String b)
    {

        return (a+b)+a/0;
    }

}
