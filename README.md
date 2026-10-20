1. Tema

Programação Orientada a Objetos (POO) em Java: desenvolvimento de uma calculadora utilizando classes, encapsulamento, propriedades get e set, herança, polimorfismo, sobrecarga de métodos e interfaces.

2. Contextualização

Uma empresa de desenvolvimento de software deseja criar uma Calculadora Inteligente, capaz de realizar operações matemáticas básicas e avançadas. O sistema deverá permitir que o usuário escolha diferentes tipos de cálculos, como adição, subtração, multiplicação, divisão e cálculo de potências.

Para tornar o software organizado, reutilizável e fácil de expandir, a equipe de desenvolvimento decidiu utilizar os conceitos de Programação Orientada a Objetos da linguagem Java.

O sistema deverá possuir uma classe principal chamada Calculadora, responsável por armazenar informações e implementar operações matemáticas. Também deverão ser criadas classes especializadas que herdem características da classe principal, além de uma interface que estabeleça um contrato para a execução dos cálculos.

Durante o desenvolvimento, os estudantes deverão aplicar os conceitos de encapsulamento, herança, polimorfismo, sobrecarga de métodos e interfaces.

3. Desafio proposto

Desenvolva uma aplicação em Java que simule uma calculadora inteligente, utilizando os conceitos de POO apresentados a seguir.
Requisitos do sistema

1. Classes e objetos

Crie uma classe chamada Calculadora, que deverá possuir os seguintes atributos:
- nome: nome da calculadora.
- valor1: primeiro número utilizado na operação.
- valor2: segundo número utilizado na operação.
Implemente métodos para realizar as operações matemáticas e crie objetos para representar diferentes calculadoras.

2. Encapsulamento e propriedades get e set

Os atributos da classe Calculadora deverão ser declarados como private.

Implemente métodos get e set para permitir o acesso controlado aos atributos.

O método setValor2(), por exemplo, deverá permitir a alteração do segundo valor. Para evitar erros, o sistema deverá validar os valores informados quando necessário, especialmente nas operações de divisão.

3. Herança

Crie duas classes derivadas da classe Calculadora:
- CalculadoraBasica: responsável por realizar operações básicas.
- CalculadoraCientifica: responsável por realizar operações matemáticas avançadas.
As duas classes deverão herdar os atributos e comportamentos comuns da classe Calculadora, podendo implementar funcionalidades específicas.

4. Polimorfismo

Implemente o polimorfismo por sobrescrita de métodos (@Override).

Por exemplo, a classe CalculadoraBasica deverá implementar uma forma de executar operações básicas, enquanto a classe CalculadoraCientifica deverá permitir operações adicionais, como potência e raiz quadrada.

O programa deverá conseguir utilizar uma referência do tipo Calculadora para executar comportamentos específicos de cada objeto.

5. Sobrecarga de métodos

Implemente métodos com o mesmo nome, mas com diferentes parâmetros.

Na classe Calculadora, crie diferentes versões do método somar():
- somar(double valor1, double valor2): soma dois números.
- somar(double valor1, double valor2, double valor3): soma três números.
- somar(int valor1, int valor2): soma dois números inteiros.
O Java deverá identificar qual método executar de acordo com os parâmetros recebidos.

6. Interface

Crie uma interface chamada OperacaoMatematica, contendo métodos que deverão ser implementados pelas classes responsáveis pelos cálculos.

A interface deverá definir, no mínimo, os métodos:
- somar()
- subtrair()
- multiplicar()
- dividir()
As classes CalculadoraBasica e CalculadoraCientifica deverão implementar essa interface, garantindo que ambas disponibilizem as operações matemáticas definidas no contrato.

4. Exemplo de estrutura do projeto

ProjetoCalculadora
OperacaoMatematica.java
Interface com o contrato das operações matemáticas.


Calculadora.java
Classe-base com atributos privados, getters, setters e métodos sobrecarregados.


CalculadoraBasica.java
Classe derivada para operações matemáticas básicas.


CalculadoraCientifica.java
Classe derivada para operações básicas e científicas.


Principal.java
Classe com o método main para testar o sistema
