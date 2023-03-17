import java.time.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("hi");
        String[] number  ={
                "kote",
                "vaja",
                "alexi",
        };
        String str= String.format("Number %s", number);
        String str1 = String.join("/ " , number);

        System.out.println(str);
        System.out.printf(str1);
        System.out.println();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.printf(String.valueOf(localDateTime));
        System.out.println();
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getMonth());
        LocalDateTime localDate1 =localDateTime.of(
                2000,
                Month.DECEMBER,
                23,
                15,
                33,
                22

        );
        System.out.println(localDate1);

        for (String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }

        System.out.println(Instant.now());

    }

}