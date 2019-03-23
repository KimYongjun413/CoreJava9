package ch02.sec04;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class StaticMethodDemo {
    public static void main(String[] args) {
        int dieToss = RandomNumbers.nextInt(1, 6); 
        System.out.println(dieToss);
        
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;

        //한국이라 \0이라 뜨길래, 다음과 같이 setCurrency를 적용했지만 US$0를 출력한다.
        currencyFormatter.setCurrency(Currency.getInstance(Locale.US));

        NumberFormat dollarFormatter = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println(dollarFormatter.format(x)); // $0.10를 출력한다.
        System.out.println(currencyFormatter.format(x)); // US$0를 출력한다.
        System.out.println(percentFormatter.format(x)); // 10%를 출력한다.
    }
}
