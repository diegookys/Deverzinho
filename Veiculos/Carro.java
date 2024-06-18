package Veiculos;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(int ano, String modelo, String marca, int numeroDePortas) {
        super(ano, modelo, marca);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public double calcularCustoManutencao(){
        return 500.00;
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Carro: " + getMarca() + " " + getModelo() + " Ano: " + getAno() + " Número de Portas: " + numeroDePortas);
    }
}
