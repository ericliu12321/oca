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
    
  }
}





