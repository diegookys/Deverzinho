package Veiculos;

public class GerenciamentoVeiculos {

    public static void main(String[] args){

        Carro carro1 = new Carro(2006,"Fiesta","Ford",4);
        Moto moto1 = new Moto(2010, "Pop100","Honda",97);

        carro1.exibirDetalhes();
        System.out.println("Custo de Manutenção: R$ " + carro1.calcularCustoManutencao());

        moto1.exibirDetalhes();
        System.out.println("Custo de Manutenção: R$ " + moto1.calcularCustoManutencao());
    }
}
