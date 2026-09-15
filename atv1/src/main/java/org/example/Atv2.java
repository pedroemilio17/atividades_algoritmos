package org.example;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.println("\n------- Digite a atividade que deseja ver --------");
            System.out.println("1 - Classificação por idade");
            System.out.println("2 - Características de um número");
            System.out.println("3 - Alertas de temperatura e umidade");
            System.out.println("4 - Verificar múltiplo");
            System.out.println("5 - Verificar ano bissexto");
            System.out.println("6 - Compra com cálculo de frete");
            System.out.println("7 - Saudação conforme a hora");
            System.out.println("8 - Classificação de infração de trânsito");
            System.out.println("9 - Cálculo de bônus por tempo de empresa");
            System.out.println("10 - Login de usuário");
            System.out.println("11 - Situação do aluno");
            System.out.println("12 - Saque bancário");
            System.out.println("13 - Calculadora com switch");
            System.out.println("14 - Quantidade de dias do mês");
            System.out.println("15 - Terminal de estacionamento");
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
                case 11 -> System.out.println(atv11(scanner));
                case 12 -> System.out.println(atv12(scanner));
                case 13 -> System.out.println(atv13(scanner));
                case 14 -> System.out.println(atv14(scanner));
                case 15 -> System.out.println(atv15(scanner));
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

    public static String atv1(Scanner scanner) {
        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();
        scanner.nextLine();
        String resultado = "";
        if (idade >= 16) resultado += "Pode votar.\n";
        if (idade >= 18) resultado += "Pode dirigir.\n";
        if (idade >= 60) resultado += "É idoso.\n";
        return resultado.trim();
    }

    public static String atv2(Scanner scanner) {
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        String resultado = "";
        int modulo = Math.abs(numero);
        if (numero > 0) resultado += "É positivo.\n";
        if (numero % 2 == 0) resultado += "É par.\n";
        if (numero % 5 == 0) resultado += "É múltiplo de 5.\n";
        if (modulo >= 10 && modulo <= 99) resultado += "Tem dois dígitos.\n";
        return resultado.trim();
    }

    public static String atv3(Scanner scanner) {
        System.out.println("Digite a temperatura em graus Celsius:");
        double temperatura = scanner.nextDouble();
        System.out.println("Digite a umidade relativa do ar (%):");
        double umidade = scanner.nextDouble();
        scanner.nextLine();
        String resultado = "";
        if (temperatura >= 38) resultado += "Alerta de calor extremo.\n";
        if (umidade < 30) resultado += "Alerta de umidade baixa.\n";
        if (temperatura >= 35 && umidade < 20) resultado += "Alerta de risco de queimada.\n";
        return resultado.trim();
    }

    public static String atv4(Scanner scanner) {
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();
        scanner.nextLine();
        if (numero2 == 0) return "A verificação não pode ser feita porque o segundo número é zero.";
        return numero1 % numero2 == 0 ? numero1 + " é múltiplo de " + numero2 + "." : numero1 + " não é múltiplo de " + numero2 + ".";
    }

    public static String atv5(Scanner scanner) {
        System.out.println("Digite um ano:");
        int ano = scanner.nextInt();
        scanner.nextLine();
        return ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) ? "O ano " + ano + " é bissexto." : "O ano " + ano + " não é bissexto.";
    }

    public static String atv6(Scanner scanner) {
        System.out.println("Digite o valor da compra:");
        double compra = scanner.nextDouble();
        scanner.nextLine();
        double frete = compra >= 199.00 ? 0.00 : 24.90;
        return String.format("Valor do frete: R$ %.2f%nTotal a pagar: R$ %.2f", frete, compra + frete);
    }

    public static String atv7(Scanner scanner) {
        System.out.println("Digite a hora do dia (0 a 23):");
        int hora = scanner.nextInt();
        scanner.nextLine();
        if (hora >= 0 && hora <= 11) return "Bom dia!";
        else if (hora <= 17 && hora >= 12) return "Boa tarde!";
        else if (hora <= 23 && hora >= 18) return "Boa noite!";
        return "Hora inválida.";
    }

    public static String atv8(Scanner scanner) {
        System.out.println("Digite a velocidade máxima da via:");
        double limite = scanner.nextDouble();
        System.out.println("Digite a velocidade do veículo:");
        double velocidade = scanner.nextDouble();
        scanner.nextLine();
        if (velocidade <= limite) return "Dentro do limite. Não há multa.";
        else if (velocidade <= limite * 1.20) return "Infração média.";
        else if (velocidade <= limite * 1.50) return "Infração grave.";
        return "Infração gravíssima.";
    }

    public static String atv9(Scanner scanner) {
        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();
        System.out.println("Digite o tempo de casa em anos:");
        double tempo = scanner.nextDouble();
        scanner.nextLine();
        double percentual;
        if (tempo < 1) percentual = 0;
        else if (tempo <= 3) percentual = 5;
        else if (tempo <= 10) percentual = 10;
        else percentual = 15;
        return String.format("Percentual do bônus: %.2f%%%nValor do bônus: R$ %.2f", percentual, salario * percentual / 100.0);
    }

    public static String atv10(Scanner scanner) {
        System.out.println("Digite o nome de usuário:");
        String usuario = scanner.nextLine();
        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();
        if (!usuario.equalsIgnoreCase("admin")) return "Usuário não encontrado.";
        if (senha.equals("java123")) return "Acesso liberado.";
        return "Senha incorreta.";
    }

    public static String atv11(Scanner scanner) {
        System.out.println("Digite a frequência do aluno (%):");
        double frequencia = scanner.nextDouble();
        System.out.println("Digite a média final do aluno:");
        double media = scanner.nextDouble();
        scanner.nextLine();
        if (frequencia < 75) return "Reprovado por falta.";
        if (media >= 7) return "Aprovado.";
        if (media >= 5) return "Recuperação.";
        return "Reprovado por nota.";
    }

    public static String atv12(Scanner scanner) {
        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o limite diário de saque:");
        double limite = scanner.nextDouble();
        System.out.println("Digite o valor solicitado para saque:");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        if (saldo < valor) return "Saldo insuficiente.";
        if (valor > limite) return "O valor solicitado ultrapassa o limite diário de saque.";
        return String.format("Saque realizado com sucesso.%nNovo saldo: R$ %.2f", saldo - valor);
    }

    public static String atv13(Scanner scanner) {
        System.out.println("Digite o primeiro número:");
        double a = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double b = scanner.nextDouble();
        System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        int operacao = scanner.nextInt();
        scanner.nextLine();
        return switch (operacao) {
            case 1 -> String.format("Resultado: %.2f", a + b);
            case 2 -> String.format("Resultado: %.2f", a - b);
            case 3 -> String.format("Resultado: %.2f", a * b);
            case 4 -> b == 0 ? "Não é possível dividir por zero." : String.format("Resultado: %.2f", a / b);
            default -> "Opção inválida.";
        };
    }

    public static String atv14(Scanner scanner) {
        System.out.println("Digite o número do mês (1 a 12):");
        int mes = scanner.nextInt();
        scanner.nextLine();
        return switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> "O mês possui 31 dias.";
            case 4, 6, 9, 11 -> "O mês possui 30 dias.";
            case 2 -> "O mês possui 28 dias.";
            default -> "Mês inválido.";
        };
    }

    public static String atv15(Scanner scanner) {
        System.out.println("Digite o tipo de veículo:\n1 - Carro\n2 - Moto");
        int tipo = scanner.nextInt();
        scanner.nextLine();
        double tarifa = switch (tipo) { case 1 -> 8.00; case 2 -> 5.00; default -> -1.00; };
        if (tarifa < 0) return "Opção inválida.";
        System.out.println("Digite a quantidade de horas:");
        double horas = scanner.nextDouble();
        scanner.nextLine();
        double valor = tarifa * horas;
        System.out.println("O cliente possui cupom? (sim / nao)");
        String cupom = scanner.nextLine().trim();
        String resultado = "";
        if (cupom.equalsIgnoreCase("sim")) {
            if (valor >= 50) valor *= 0.80;
            else resultado += "O cupom vale apenas para valores de R$ 50,00 ou mais.\n";
        }
        if (horas > 12) resultado += "Aviso: permanência longa.\n";
        if (horas > 24) resultado += "Aviso: cobrança de diária.\n";
        if (horas <= 2) resultado += "Classificação da permanência: curta.\n";
        else if (horas <= 6) resultado += "Classificação da permanência: média.\n";
        else resultado += "Classificação da permanência: longa.\n";
        return resultado + String.format("Valor final: R$ %.2f", valor);
    }
}
