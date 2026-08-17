import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Operacoes{
    private ArrayList<ArrayList<Object>> extrato = new ArrayList<>();
    private int n_operacao=0;
    private DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

    // Método para mostrar o histórico das operações do usuário

    public void getExtrato() {
        for (int i=0; i< extrato.size();i++){
            System.out.println(extrato.get(i));
        }
    }

    // Metodo para salvar Operacão do usuário
    public void registrarOperacao(String operacao, float valor){
        String dataf = LocalDate.now().format(formatoData);
        String horaf = LocalTime.now().format(formatoHora);

        extrato.add(new ArrayList<>());
        extrato.get(n_operacao).add(operacao);
        extrato.get(n_operacao).add(valor);
        extrato.get(n_operacao).add(dataf);
        extrato.get(n_operacao).add(horaf);
        n_operacao++;
    }
}