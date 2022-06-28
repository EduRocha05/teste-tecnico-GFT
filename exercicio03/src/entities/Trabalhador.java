package entities;

public class Trabalhador {

    private String nome;
    private Double salarioPorHora;
    private int horasTrabalhadas;

    public Trabalhador(String nome, Double salarioPorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(Double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double salarioTotal(){
        return horasTrabalhadas*salarioPorHora;
    }

    @Override
    public String toString() {
        return "Trabalhador [nome=" + nome +
                ", salarioPorHora=" + salarioPorHora +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", salario total=" + salarioTotal() +
                ']';
    }
}
