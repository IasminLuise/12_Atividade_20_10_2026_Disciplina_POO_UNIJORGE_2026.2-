public class Calculadora {
    private String nome;
    private double valor1;
    private double valor2;

    //----------------------CONSTRUCTOR---------------------------//

    public Calculadora(String nome, double valor1, double valor2) {
        this.nome = nome;
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public Calculadora(String nome) {
        this(nome, 0.0, 0.0);
    }

    //-----------------GETTERS AND SETTERS--------------------//

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }


    //-----------------------MÉTODOS--------------------------//

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public double somar(double a, double b, double c) {
        return a + b + c;
    }

}