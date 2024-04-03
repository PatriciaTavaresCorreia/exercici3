import java.time.LocalDate;
import java.time.Period;

public class CalculoDiferencaDatas {
    public static void main(String[] args) {
        LocalDate dataInicial = LocalDate.of(2020, 1, 1);
        LocalDate dataFinal = LocalDate.now();

        Period diferenca = Period.between(dataInicial, dataFinal);

        System.out.println("Calculando diferenca entre duas datas:");
        System.out.println("Anos de diferenca: " + diferenca.getYears());
        System.out.println("Meses de diferenca: " + diferenca.getMonths());
        System.out.println("Dias de diferenca: " + diferenca.getDays());
    }
}
