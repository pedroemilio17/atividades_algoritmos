package org.example;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.println("\n------- Digite a atividade que deseja ver --------");
            System.out.println("1 - Imprimir valores de 1 até N");
            System.out.println("2 - Tabuada com while");
            System.out.println("3 - Validar nota com do-while");
            System.out.println("4 - Menu de operações com do-while");
            System.out.println("5 - Soma dos números pares entre A e B");
            System.out.println("6 - Fatorial");
            System.out.println("7 - Média e situação das notas da turma");
            System.out.println("8 - Leitura de valores até digitar 0");
            System.out.println("9 - Tabuadas de 1 até N");
            System.out.println("10 - Caixa de supermercado");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 0 -> {
                    continuar = false;
                    System.out.println("Saindo do programa...");
                }
                case 1 -> System.out.println(atv1(scanner));
                case 2 -> System.out.println(atv2(scanner));
                case 3 -> System.out.println(atv3(scanner));
                case 4 -> System.out.println(atv4(scanner));
                case 5 -> System.out.println(atv5(scanner));
                case 6 -> System.out.println(atv6(scanner));
                case 7 -> System.out.println(atv7(scanner));
                case 8 -> System.out.println(atv8(scanner));
                case 9 -> System.out.println(atv9(scanner));
                case 10 -> System.out.println(atv10(scanner));
                default -> System.out.println("Opção inválida!");
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

    // 1. WHILE
    public static String atv1(Scanner scanner) {
        System.out.println("Digite um número inteiro N:");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n < 1) {
            return "Não há valores a exibir.";
        }

        String resultado = "";
        int contador = 1;
        while (contador <= n) {
            resultado += contador + "\n";
            contador++;
        }
        return resultado.trim();
    }

    // 2. WHILE
    public static String atv2(Scanner scanner) {
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        String resultado = "";
        int contador = 1;
        while (contador <= 10) {
            resultado += numero + " x " + contador + " = " + (numero * contador) + "\n";
            contador++;
        }
        return resultado.trim();
    }

    // 3. DO-WHILE
    public static String atv3(Scanner scanner) {
        double nota;
        do {
            System.out.println("Digite uma nota entre 0 e 10:");
            nota = scanner.nextDouble();
            scanner.nextLine();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido. Digite novamente.");
            }
        } while (nota < 0 || nota > 10);

        return String.format("Nota aceita: %.2f", nota);
    }

    // 4. DO-WHILE + SWITCH
    public static String atv4(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n------- MENU DE OPERAÇÕES --------");
            System.out.println("1 - Dobro");
            System.out.println("2 - Metade");
            System.out.println("3 - Quadrado");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite um número:");
                    double numero = scanner.nextDouble();
                    System.out.printf("Dobro: %.2f%n", numero * 2);
                }
                case 2 -> {
                    System.out.println("Digite um número:");
                    double numero = scanner.nextDouble();
                    System.out.printf("Metade: %.2f%n", numero / 2);
                }
                case 3 -> {
                    System.out.println("Digite um número:");
                    double numero = scanner.nextDouble();
                    System.out.printf("Quadrado: %.2f%n", numero * numero);
                }
                case 0 -> System.out.println("Saindo do menu de operações...");
                default -> System.out.println("Opção inválida.");
            }
            scanner.nextLine();
        } while (opcao != 0);

        return "Menu de operações encerrado.";
    }

    // 5. FOR
    public static String atv5(Scanner scanner) {
        System.out.println("Digite o valor de A:");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B:");
        int b = scanner.nextInt();
        scanner.nextLine();

        if (a > b) {
            return "Intervalo inválido.";
        }

        int soma = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        return "Soma dos números pares no intervalo: " + soma;
    }

    // 6. FOR
    public static String atv6(Scanner scanner) {
        System.out.println("Digite um número inteiro não negativo:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        if (numero < 0) {
            return "Entrada inválida.";
        }

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return numero + "! = " + fatorial;
    }

    // 7. CONTADOR E ACUMULADOR
    public static String atv7(Scanner scanner) {
        System.out.println("Digite a quantidade de alunos da turma:");
        int quantidadeAlunos = scanner.nextInt();

        if (quantidadeAlunos <= 0) {
            scanner.nextLine();
            return "Quantidade de alunos inválida.";
        }

        double somaNotas = 0;
        int acimaOuIgualASeis = 0;
        int abaixoDeSeis = 0;

        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.println("Digite a nota do aluno " + i + ":");
            double nota = scanner.nextDouble();
            somaNotas += nota;
            if (nota >= 6) {
                acimaOuIgualASeis++;
            } else {
                abaixoDeSeis++;
            }
        }
        scanner.nextLine();

        double media = somaNotas / quantidadeAlunos;
        return String.format(
                "Média da turma: %.2f%nAlunos com nota maior ou igual a 6: %d%nAlunos com nota abaixo de 6: %d",
                media, acimaOuIgualASeis, abaixoDeSeis
        );
    }

    // 8. SENTINELA
    public static String atv8(Scanner scanner) {
        System.out.println("Digite um valor inteiro (0 para encerrar):");
        int valor = scanner.nextInt();

        if (valor == 0) {
            scanner.nextLine();
            return "Nenhum valor foi lido.";
        }

        int quantidade = 0;
        int soma = 0;
        int maior = valor;
        int menor = valor;

        while (valor != 0) {
            quantidade++;
            soma += valor;
            if (valor > maior) maior = valor;
            if (valor < menor) menor = valor;

            System.out.println("Digite outro valor inteiro (0 para encerrar):");
            valor = scanner.nextInt();
        }
        scanner.nextLine();

        return String.format(
                "Quantidade de valores lidos: %d%nSoma: %d%nMaior valor: %d%nMenor valor: %d",
                quantidade, soma, maior, menor
        );
    }

    // 9. LAÇOS ANINHADOS
    public static String atv9(Scanner scanner) {
        System.out.println("Digite um número inteiro de 1 a 9:");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n < 1 || n > 9) {
            return "Entrada inválida.";
        }

        String resultado = "";
        for (int tabuada = 1; tabuada <= n; tabuada++) {
            resultado += "Tabuada do " + tabuada + ":\n";
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                resultado += tabuada + " x " + multiplicador + " = " + (tabuada * multiplicador) + "\n";
            }
            if (tabuada < n) resultado += "\n";
        }
        return resultado.trim();
    }

    // 10. EXERCÍCIO INTEGRADOR
    public static String atv10(Scanner scanner) {
        double totalCompra = 0;
        int quantidadeItens = 0;

        System.out.println("Digite o código do produto (0 para encerrar):");
        int codigo = scanner.nextInt();

        while (codigo != 0) {
            System.out.println("Digite o preço unitário do produto:");
            double precoUnitario = scanner.nextDouble();
            System.out.println("Digite a quantidade:");
            int quantidade = scanner.nextInt();

            totalCompra += precoUnitario * quantidade;
            quantidadeItens += quantidade;

            System.out.println("Digite o código do próximo produto (0 para encerrar):");
            codigo = scanner.nextInt();
        }

        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1 - Dinheiro (5% de desconto)");
        System.out.println("2 - Débito");
        System.out.println("3 - Crédito (3% de acréscimo)");
        int formaPagamento = scanner.nextInt();
        scanner.nextLine();

        double totalFinal = totalCompra;
        String pagamento;

        switch (formaPagamento) {
            case 1 -> {
                totalFinal = totalCompra * 0.95;
                pagamento = "Dinheiro - desconto de 5%.";
            }
            case 2 -> pagamento = "Débito - sem alteração no valor.";
            case 3 -> {
                totalFinal = totalCompra * 1.03;
                pagamento = "Crédito - acréscimo de 3%.";
            }
            default -> pagamento = "Forma de pagamento inválida. Total sem alteração.";
        }

        String resultado = "";
        if (totalCompra > 300.00) resultado += "Aviso: compra grande.\n";
        if (quantidadeItens > 20) resultado += "Aviso: muitos itens.\n";

        resultado += String.format(
                "Quantidade total de itens: %d%nTotal da compra: R$ %.2f%n%s%nTotal final: R$ %.2f",
                quantidadeItens, totalCompra, pagamento, totalFinal
        );
        return resultado;
    }
}
