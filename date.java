import java.time.*;

public class Gosling { 
  public static void main(String[] args) {
    LocalDate d1=LocalDate.of(2015,12,27);
    LocalDate d2=LocalDate.of(2019,Month.DECEMBER,27);
    LocalDate d3=LocalDate.now();
    LocalDate d4=LocalDate.parse("2025-11-09");
    
    //yyyy-mm-dd  2 digits for mm/dd otherwise getting DateTimeParseException.
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);    
    System.out.println(d4);
    
    LocalDate date = LocalDate.parse("2020-08-30");
    
    System.out.println(date.getDayOfMonth());
    System.out.println(date.getDayOfWeek());
    System.out.println(date.getDayOfYear());
    System.out.println(date.getMonth());
    System.out.println(date.getMonthValue());
    System.out.println(date.getYear());   
    
    
    LocalDate JohnBday=LocalDate.parse("2002-08-30");
    LocalDate SaraBday=LocalDate.parse("2002-07-29");
    System.out.println(JohnBday.isAfter(SaraBday));
    System.out.println(JohnBday.isBefore(SaraBday));
    
    //LocalDate is immutable like String
    //Thrown DateTimeParseException
    LocalDate bday = LocalDate.of (2052,03,10);
    System. out .println(bday.minusDays(10));
    System.out.println(bday.minusMonths(2));
    System.out .println(bday.minusWeeks(30));
    System.out .println(bday.minusYears(1));

    System. out .println(bday.plusDays(10));
    System.out.println(bday.plusMonths(2));
    System.out .println(bday.plusWeeks(30));
    System.out .println(bday.plusYears(1));    


    LocalDate firstDay= LocalDate.of(2036,02,28) ;
    System.out.println(firstDay.withDayOfMonth(1));
    System.out.println(firstDay.withDayOfYear(1));
    System.out.println(firstDay.withMonth(7));
    System.out.println(firstDay.withYear(1));
   

  }
}





