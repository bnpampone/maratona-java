package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1782588560535L);
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
