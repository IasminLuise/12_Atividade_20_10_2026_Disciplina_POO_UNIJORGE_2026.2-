public class CalculadoraBasica extends Calculadora implements IOperacaoMatematica {

    public CalculadoraBasica(String nome, double valor1, double valor2) {
        super(nome, valor1, valor2); // Chama o construtor da superclasse
    }

    public CalculadoraBasica(String nome) {
        super(nome);
    }
    //----------------------------METODOS HERDADOS----------------------------------//

    @Override
    public double somar() {
        return getValor1() + getValor2();
    }

    @Override
    public double subtrair() {
        return getValor1() - getValor2();
    }

    @Override
    public double multiplicar() {
        return getValor1() * getValor2();
    }

    @Override
    public double dividir() {
        if (getValor2() == 0) {
            System.out.println("Erro: Divisão por zero não permitida na " + getNome() + "!");
            return Double.NaN;
        }

        return getValor1() / getValor2();
    }

}