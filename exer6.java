import java.util.ArrayList;

public class CidadesCaboVerde {
    public static void main(String[] args) {
        ArrayList<String> cidadesCV = new ArrayList<>();
        cidadesCV.add("Praia");
        cidadesCV.add("Mindelo");
        cidadesCV.add("Assomada");
        cidadesCV.add("Espargos");
        cidadesCV.add("Sao Filipe");
        cidadesCV.remove(2);
        System.out.println("Cidades de Cabo Verde restantes:");
        for (String cidade : cidadesCV) {
            System.out.println(cidade);
        }
    }
}