import java.time.*;

public class Bird {
  public static void main(String[] args) throws InterruptedException  {
  
    LocalTime time0=LocalTime.now();
    System.out.println(time0);      
    
    LocalTime time1=LocalTime.of(12,10);  //24 hour clock, no am/pm
    LocalTime time2=LocalTime.of(13,15,10);
    System.out.println(time1);
    System.out.println(time2);   
    
    LocalTime timep=LocalTime.parse("15:08:23");
    System.out.println(timep);   

    //LocalTime time3=LocalTime.of(120,10);  
    //Exception in thread "main" java.time.DateTimeException: Invalid value for HourOfDay (valid values 0 - 23): 120
    
    //error: integer number too large: 120222222222222222222
    //LocalTime time3=LocalTime.of(120222222222222222222,10);  
    
    //LocalTime.MIN 0
    //LocalTime.MAX 23:59:59.999999999999
    //LocalTime.MIDNIGHT - 00:00
    //Localtime.NOON - 12:00
    
    //getHour not getHours, getMinutes
    LocalTime time = LocalTime.of(16, 20, 12, 98547);
    System.out.println(time.getHour());
    System.out.println(time.getMinute());
    System.out.println(time.getSecond());
    System.out.println(time.getNano());
    
    LocalTime shreyaFinishTime = LocalTime.parse("17:09:04");
    LocalTime paulFinishTime = LocalTime.parse("17:09:12");
    if (shreyaFinishTime.isBefore (paulFinishTime))
            System.out.println("Shreya wins");
    else
        System.out.println("Paul wins");

   //plusHours(), plusMinutes(), plusSeconds(), plusNanos()
   //minusMinutes(), minusMinutes(), minusSeconds(), minusNanos()
    LocalTime movieStartTime =LocalTime.parse("21:00:00");
    int commuteMin=35;
    LocalTime shreyaStartTime=movieStartTime.minusMinutes(commuteMin);
    System.out.println("Start by "+ shreyaStartTime+ " from office");
    
    
    LocalTime startTime = LocalTime.of(5, 7, 9);
    startTime = startTime.withMinute(0);
    System.out.println (startTime);
/*    
    for (int i=0; i<20; i++) {
      LocalTime clocktime=LocalTime.now();
      System.out.println(clocktime);
      Thread.sleep(5000);
    }
*/    


//LocalDateTime: 2050-06-18T14:20:30:908765 (T separate the date and time)


    LocalDateTime prizeCeremony = LocalDateTime.parse("2050-06-05T14:00:00");
    LocalDateTime dateTimeNow = LocalDateTime.now();
    if (prizeCeremony.getMonthValue() == 6) 
       System.out.println("Can't invite president");
    else 
       System.out.println("President invited");

    LocalDateTime chiefGuestDeparture=LocalDateTime.parse("2050-06-05T14:30:00");
    if (prizeCeremony.plusHours(2).isAfter(chiefGuestDeparture))
       System.out.println("Chief Guest will leave before ceremony completes");
       
    LocalDateTime eventMgrArrival = LocalDateTime.of(2050, 6, 5, 14, 30, 0);
    if (eventMgrArrival.isAfter(prizeCeremony.minusHours(3)))
      System.out.println("Manager is supposed to arrive 3 hrs earlier") ;

  }
}


