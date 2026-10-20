public class CalculadoraCientifica extends Calculadora implements IOperacaoMatematica {

    public CalculadoraCientifica(String nome, double valor1, double valor2) {
        super(nome, valor1, valor2);
    }

    public CalculadoraCientifica(String nome) {
        super(nome);
    }
    //-----------------------------METODOS HERDADOS---------------------------------//

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

    //----------------------------METODOS OFICIAIS--------------------------------//

    public double calcularPotencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double calcularRaizQuadrada(double valor) {
        if (valor < 0) {
            System.out.println("Erro: Não existe raiz quadrada real de número negativo!");
            return Double.NaN;
        }
        return Math.sqrt(valor);
    }
}