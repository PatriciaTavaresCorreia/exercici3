import java.time.LocalTime;
import java.time.Duration;

public class exer7 {
    public static void main(String[] args) {
        LocalTime horaInicio = LocalTime.of(9, 30, 15);
        LocalTime horaFim = LocalTime.of(17, 45, 30);

        Duration duracao = Duration.between(horaInicio, horaFim);

        long horas = duracao.toHours();
        long minutos = duracao.toMinutesPart();
        long segundos = duracao.toSecondsPart();

        System.out.println("Duracao entre " + horaInicio + " e " + horaFim + ":");
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
