import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        String dataNasc = "07/09/1994 15:00:00";

        LocalDateTime localDateTime = LocalDateTime.parse(dataNasc, DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(localDateTime);
        LocalDateTime now = LocalDateTime.now();

        Duration d = Duration.between(localDateTime, now);
        System.out.println("Horas: " + d.toHours());
        System.out.println("Dias: " + d.toDays());

        Period p = Period.between(localDateTime.toLocalDate(), now.toLocalDate()); // para valores maiores que dias e horas, tem que se convertar para LocalDate.
        System.out.println("Meses: " + p.toTotalMonths());

        System.out.println("Semanas: " + ChronoUnit.WEEKS.between(localDateTime, now));
        System.out.println("Anos: " + ChronoUnit.YEARS.between(localDateTime, now));

        YearMonth ym = YearMonth.of(2030, 9);
        System.out.println(ym);

        Month month = Month.of(3);
        System.out.println(month);

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        ld = ld.plusMonths(1);
        System.out.println(ld);
        ld = ld.plusDays(2);
        System.out.println(ld);

    }
}

