package chap24;

import java.time.*;

public class DateTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2022,7,2));
        System.out.println(LocalDateTime.of(2022,7,2,14,00,30,300));
        System.out.println(LocalTime.of(14,00,30,150));
        ZoneOffset offset = ZoneOffset.ofHours(9);
        System.out.println(ZoneOffset.ofHours(9));
        System.out.println(OffsetDateTime.of(2022,7,2,14,00,30,250,offset));
        System.out.println(OffsetTime.of(14,00,30,150,offset));
        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        System.out.println(ZoneId.of("Asia/Seoul"));
        System.out.println(ZonedDateTime.of(2022,7,2,14,00,45,250,zoneId));
    }
}
