package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class App 
{
    public static void main( String[] args ) {
        LocalDate date = LocalDate.now();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        Locale locale = new Locale("ru", "RU");
        System.out.println("Сегодня " + dayOfWeek.getDisplayName(TextStyle.FULL, locale));
    }
}
