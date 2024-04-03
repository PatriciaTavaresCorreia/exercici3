import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Conversor {
    public static void main(String[] args) {
        ZoneId fusoHorarioCaboVerde = ZoneId.of("Atlantic/Cape_Verde");
        ZonedDateTime dataHoraCaboVerde = ZonedDateTime.now(fusoHorarioCaboVerde);

        ZoneId fusoHorarioToquio = ZoneId.of("Asia/Tokyo");
        ZonedDateTime dataHoraToquio = dataHoraCaboVerde.withZoneSameInstant(fusoHorarioToquio);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        System.out.println("Data e hora atual em Cabo Verde: " + formato.format(dataHoraCaboVerde));
        System.out.println("Data e hora atual em Toquio: " + formato.format(dataHoraToquio));
    }
}
