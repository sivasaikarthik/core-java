package javaDateTime;
/*import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Set;
*/
import java.time.Period;
import java.time.LocalDate;

public class datee {


public static void main(String[] args)
 {
	 
	LocalDate id=LocalDate.now();
	LocalDate fd=id.plusDays(2);
	int days=Period.between(id, fd).getDays();
	System.out.println(fd+""+days);
}
/*
private static void datetime() {
	LocalDateTime ldt=LocalDate.now();
 
	 System.out.println(ldt);
	 LocalDateTime ldt2= LocalDateTime.parse("2021-01-22T12:00:00.100");
	 System.out.println(ldt2);
	 java.time.LocalDate ldt3=ldt2.toLocalDate();
	 LocalTime ldt4=ldt2.toLocalTime();
	 
	 
	 
	 
	 ZoneId zi= ZoneId.of("Asia/Kolkata");
	 System.out.println(zi);
	Set<String> allzone= ZoneId.getAvailableZoneIds();
	allzone.forEach(System.out::println);
	System.out.println();
}*/
}
