public class Principal {
    public static void main(String[] args) {

                System.out.println("==========================================================");
                System.out.println("              TESTE DO PROJETO CALCULADORA                ");
                System.out.println("==========================================================\n");

                // 1. Instanciação e teste da CalculadoraBasica
                CalculadoraBasica basica = new CalculadoraBasica("HP Básica", 20.0, 4.0);
                System.out.println("--> Testando " + basica.getNome() + ":");
                System.out.println("Soma: " + basica.somar());
                System.out.println("Subtração: " + basica.subtrair());
                System.out.println("Multiplicação: " + basica.multiplicar());
                System.out.println("Divisão: " + basica.dividir());

                // Testando a validação de segurança de divisão por zero via setter
                System.out.println("\n--> Testando Validação de Divisão por Zero:");
                basica.setValor2(0);
                basica.dividir();

                // 2. Teste de Sobrecarga de Métodos (Overloading) na classe base
                System.out.println("\n----------------------------------------------------------");
                System.out.println("--> Teste de Sobrecarga do Método somar():");
                Calculadora calcGenerica = new Calculadora("Calculadora Utilitária");
                System.out.println("somar(int, int): 5 + 10 = " + calcGenerica.somar(5, 10));
                System.out.println("somar(double, double): 2.5 + 3.5 = " + calcGenerica.somar(2.5, 3.5));
                System.out.println("somar(double, double, double): 1.0 + 2.0 + 3.0 = " + calcGenerica.somar(1.0, 2.0, 3.0));

                // 3. Teste de Polimorfismo e Operações Científicas
                System.out.println("\n----------------------------------------------------------");
                System.out.println("--> Teste de Polimorfismo com a Interface:");
                IOperacaoMatematica opCientifica = new CalculadoraCientifica("Casio Científica", 9.0, 3.0);
                System.out.println("Soma via referência da Interface: " + opCientifica.somar());
                System.out.println("Divisão via referência da Interface: " + opCientifica.dividir());

                // Acesso aos métodos avançados da subclasse científica
                CalculadoraCientifica cientifica = (CalculadoraCientifica) opCientifica;
                System.out.println("Potência (2 ^ 3): " + cientifica.calcularPotencia(2, 3));
                System.out.println("Raiz Quadrada de 81: " + cientifica.calcularRaizQuadrada(81));
            }
        }


