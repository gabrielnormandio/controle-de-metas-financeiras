import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MetaFinanceira {

    private String nome;
    private double valorTotal;
    private double valorAtual;
    private LocalDate dataFinal;

    public MetaFinanceira(String nome, double valorTotal, int diasLimite){
        this.nome = nome;
        this.valorTotal = valorTotal;
        this.valorAtual = 0;
        this.dataFinal = LocalDate.now().plusDays(diasLimite);
    }

    public void registrarGanho(double ganho) {
        this.valorAtual += ganho;
    }

    public double getValorRestantes() {
        return valorTotal -  valorAtual;
    }

    public long getDiasRestante(){
        return ChronoUnit.DAYS.between(LocalDate.now(), dataFinal);
    }

    public double getMetaDiaria() {
        long dias = getDiasRestante();
        return dias > 0 ? getValorRestantes() / dias : getValorRestantes();
    }

    public void exibirResumo() {
        System.out.println("Meta: " + nome);
        System.out.println("Total desejado: R$" + String.format("%.2f", valorTotal));
        System.out.println("Economizado até agora: R$" + String.format("%.2f", valorAtual));
        System.out.println("Faltam R$" + String.format("%.2f", getValorRestantes()) + " para atingir a meta.");
        System.out.println("Dias restantes: " + getDiasRestante());
        System.out.println("Você precisa guardar R$" + String.format("%.2f", getMetaDiaria()) + " por dia.");
    }

}
