import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatacaoDataHora {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String datahoraatual = agora.format(formato);
        System.out.println("Data e hora atual: " + datahoraatual);
    }
}