import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class CalculadoraIdadeMedia {
    public static void main(String[] args) {
        List<LocalDate> datasDeNascimento = Arrays.asList(
                LocalDate.of(1995, 6, 25),
                LocalDate.of(1998, 9, 10),
                LocalDate.of(2002, 4, 5)
        );

        double idadeMedia = calcularIdadeMedia(datasDeNascimento);

        System.out.printf("Idade media das pessoas: %.2f anos%n", idadeMedia);
    }

    private static double calcularIdadeMedia(List<LocalDate> datasDeNascimento) {
        return datasDeNascimento.stream()
                .mapToInt(data -> LocalDate.now().getYear() - data.getYear())
                .average()
                .orElse(0);
    }
}