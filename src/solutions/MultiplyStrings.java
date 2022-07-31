import java.math.BigInteger;

public class MultiplyStrings{
  public String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        String result = n1.multiply(n2).toString();
        return result;
    }
}
