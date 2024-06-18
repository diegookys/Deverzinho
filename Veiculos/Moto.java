package Veiculos;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(int ano, String modelo, String marca, int cilindradas) {
        super(ano, modelo, marca);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularCustoManutencao() {
        return 300.00;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Moto: " + getMarca() + " " + getModelo() + " Ano: " + getAno() + " Cilindradas: " + cilindradas);
    }
}
