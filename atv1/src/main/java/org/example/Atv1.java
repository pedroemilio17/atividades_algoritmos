package org.example;
import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.println("\n------- Digite a atividade que deseja ver --------");
            System.out.println("1 - Exibir Nome, Idade e Altura");
            System.out.println("2 - Operações Básicas com dois números");
            System.out.println("3 - Conversão de Reais para Dólar");
            System.out.println("4 - Média Aritmética de 4 Notas");
            System.out.println("5 - Cálculo de Salário com Desconto do INSS");
            System.out.println("6 - Área e Perímetro do Círculo");
            System.out.println("7 - Área, Perímetro e Diagonal do Retângulo");
            System.out.println("8 - Conversão de Celsius para Fahrenheit e Kelvin");
            System.out.println("9 - Verificar Par ou Ímpar");
            System.out.println("10 - Classificação da Média (Aprovado / Recuperação / Reprovado)");
            System.out.println("11 - Maior de Três Números");
            System.out.println("12 - Cálculo da Conta de Energia (kWh)");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 0:
                    continuar = false;
                    System.out.println("Saindo do programa...");
                    break;
                case 1:
                    System.out.println(atv1(scanner));
                    break;
                case 2:
                    System.out.println(atv2(scanner));
                    break;
                case 3:
                    System.out.println(atv3(scanner));
                    break;
                case 4:
                    System.out.println(atv4(scanner));
                    break;
                case 5:
                    System.out.println(atv5(scanner));
                    break;
                case 6:
                    System.out.println(atv6(scanner));
                    break;
                case 7:
                    System.out.println(atv7(scanner));
                    break;
                case 8:
                    System.out.println(atv8(scanner));
                    break;
                case 9:
                    System.out.println(atv9(scanner));
                    break;
                case 10:
                    System.out.println(atv10(scanner));
                    break;
                case 11:
                    System.out.println(atv11(scanner));
                    break;
                case 12:
                    System.out.println(atv12(scanner));
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            if (opcao != 0) {
                System.out.println("\nContinuar? (s / n)");
                String cont = scanner.nextLine().trim();
                if (cont.equalsIgnoreCase("n")) {
                    continuar = false;
                    System.out.println("Saindo do programa...");
                }
            }
        } while (continuar);

        scanner.close();
    }

    // 1. Ler nome, idade e altura
    public static String atv1(Scanner scanner) {
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Digite sua altura (em cm ou metros inteiros):");
        int altura = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        return String.format("Nome: %s%nIdade: %d%nAltura: %d", nome, idade, altura);
    }

    // Formulário adicional
    public static String form(Scanner scanner) {
        System.out.println("Informe o ano que você nasceu: ");
        int anoNascimento = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Qual o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Qual o valor da sua hora trabalhada:");
        double valor = scanner.nextDouble();

        System.out.println("Quantas horas você trabalhou esse mês:");
        double horas = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer

        double salario = horas * valor;
        int idade = 2026 - anoNascimento;

        return String.format("------------- FORMULÁRIO --------------%nNome: %s%nIdade: %d%nSalário: R$ %.2f", nome, idade, salario);
    }

    // 2. Operações básicas com dois números
    public static String atv2(Scanner scanner) {
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;

        if (num2 == 0) {
            return String.format("Soma: %d%nSubtração: %d%nProduto: %d%nDivisão: Impossível dividir por zero.", soma, sub, mult);
        }

        int divint = num1 / num2;
        int divrest = num1 % num2;

        return String.format("Soma: %d%nSubtração: %d%nProduto: %d%nDivisão Inteira: %d%nResto da Divisão: %d", soma, sub, mult, divint, divrest);
    }

    // 3. Conversão de reais para dólar
    public static String atv3(Scanner scanner) {
        System.out.println("Digite o valor em reais (R$):");
        double reais = scanner.nextDouble();
        System.out.println("Digite a cotação do dólar:");
        double cotacao = scanner.nextDouble();
        scanner.nextLine();

        double convertido = reais / cotacao;
        return String.format("Valor convertido em dólares: US$ %.2f", convertido);
    }

    // 4. Média aritmética de 4 notas
    public static String atv4(Scanner scanner) {
        System.out.println("Digite a 1ª nota:");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a 2ª nota:");
        double n2 = scanner.nextDouble();
        System.out.println("Digite a 3ª nota:");
        double n3 = scanner.nextDouble();
        System.out.println("Digite a 4ª nota:");
        double n4 = scanner.nextDouble();
        scanner.nextLine();

        double media = (n1 + n2 + n3 + n4) / 4.0;
        return String.format("Média final: %.2f", media);
    }

    // 5. Cálculo de salário com INSS
    public static String atv5(Scanner scanner) {
        System.out.println("Digite o valor da sua hora trabalhada:");
        double valorHora = scanner.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mês:");
        double horas = scanner.nextDouble();
        scanner.nextLine();

        double salarioBruto = valorHora * horas;
        double inss = salarioBruto * 0.08;
        double salarioLiquido = salarioBruto - inss;

        return String.format("Salário Bruto: R$ %.2f%nDesconto INSS (8%%): R$ %.2f%nSalário Líquido: R$ %.2f", salarioBruto, inss, salarioLiquido);
    }

    // 6. Área e perímetro do círculo
    public static String atv6(Scanner scanner) {
        System.out.println("Digite o raio do círculo:");
        double raio = scanner.nextDouble();
        scanner.nextLine();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        return String.format("Área do círculo: %.2f%nPerímetro do círculo: %.2f", area, perimetro);
    }

    // 7. Área, perímetro e diagonal do retângulo
    public static String atv7(Scanner scanner) {
        System.out.println("Digite a base do retângulo:");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do retângulo:");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        return String.format("Área: %.2f%nPerímetro: %.2f%nDiagonal: %.2f", area, perimetro, diagonal);
    }

    // 8. Conversão de Celsius para Fahrenheit e Kelvin
    public static String atv8(Scanner scanner) {
        System.out.println("Digite a temperatura em graus Celsius (°C):");
        double c = scanner.nextDouble();
        scanner.nextLine();

        double f = (c * 9.0 / 5.0) + 32;
        double k = c + 273.15;

        return String.format("Temperatura em Fahrenheit: %.2f °F%nTemperatura em Kelvin: %.2f K", f, k);
    }

    // 9. Par ou Ímpar
    public static String atv9(Scanner scanner) {
        System.out.println("Digite um número inteiro:");
        int num = scanner.nextInt();
        scanner.nextLine();

        String resultado = (num % 2 == 0) ? "Par" : "Ímpar";
        return String.format("O número %d é %s.", num, resultado);
    }

    // 10. Classificação de aprovação por média
    public static String atv10(Scanner scanner) {
        System.out.println("Digite a média final do aluno:");
        double media = scanner.nextDouble();
        scanner.nextLine();

        String situacao;
        if (media >= 7.0) {
            situacao = "Aprovado";
        } else if (media >= 5.0) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        return String.format("Situação do aluno: %s", situacao);
    }

    // 11. Maior de três números inteiros
    public static String atv11(Scanner scanner) {
        System.out.println("Digite o primeiro número:");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = scanner.nextInt();
        System.out.println("Digite o terceiro número:");
        int n3 = scanner.nextInt();
        scanner.nextLine();

        int maior = n1;
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        return String.format("O maior número digitado é: %d", maior);
    }

    // 12. Cálculo de conta de energia por faixas de consumo
    public static String atv12(Scanner scanner) {
        System.out.println("Digite o consumo mensal de energia em kWh:");
        double consumo = scanner.nextDouble();
        scanner.nextLine();

        double precoKwh;
        if (consumo <= 100) {
            precoKwh = 0.50;
        } else if (consumo <= 300) {
            precoKwh = 0.75;
        } else {
            precoKwh = 1.10;
        }

        double total = consumo * precoKwh;
        return String.format("Preço por kWh aplicado: R$ %.2f%nValor total da conta: R$ %.2f", precoKwh, total);
    }
}
