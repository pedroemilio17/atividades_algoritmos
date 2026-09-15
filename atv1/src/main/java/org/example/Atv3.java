package org.example;

import java.util.Scanner;

public class Atv3 {
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
                case 13:
                    System.out.println(atv13(scanner));
                    break;
                case 14:
                    System.out.println(atv14(scanner));
                    break;
                case 15:
                    System.out.println(atv15(scanner));
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

    // 1. IFS INDEPENDENTES - Classificação por idade
    public static String atv1(Scanner scanner) {
        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();
        scanner.nextLine();

        String resultado = "";

        if (idade >= 16) {
            resultado += "Pode votar.\n";
        }

        if (idade >= 18) {
            resultado += "Pode dirigir.\n";
        }

        if (idade >= 60) {
            resultado += "É idoso.\n";
        }

        return resultado.trim();
    }

    // 2. IFS INDEPENDENTES - Características de um número
    public static String atv2(Scanner scanner) {
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        String resultado = "";
        int modulo = Math.abs(numero);

        if (numero > 0) {
            resultado += "É positivo.\n";
        }

        if (numero % 2 == 0) {
            resultado += "É par.\n";
        }

        if (numero % 5 == 0) {
            resultado += "É múltiplo de 5.\n";
        }

        if (modulo >= 10 && modulo <= 99) {
            resultado += "Tem dois dígitos.\n";
        }

        return resultado.trim();
    }

    // 3. IFS INDEPENDENTES - Alertas de temperatura e umidade
    public static String atv3(Scanner scanner) {
        System.out.println("Digite a temperatura em graus Celsius:");
        double temperatura = scanner.nextDouble();

        System.out.println("Digite a umidade relativa do ar (%):");
        double umidade = scanner.nextDouble();
        scanner.nextLine();

        String resultado = "";

        if (temperatura >= 38) {
            resultado += "Alerta de calor extremo.\n";
        }

        if (umidade < 30) {
            resultado += "Alerta de umidade baixa.\n";
        }

        if (temperatura >= 35 && umidade < 20) {
            resultado += "Alerta de risco de queimada.\n";
        }

        return resultado.trim();
    }

    // 4. IF E ELSE - Verificar se o primeiro número é múltiplo do segundo
    public static String atv4(Scanner scanner) {
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();
        scanner.nextLine();

        if (numero2 == 0) {
            return "A verificação não pode ser feita porque o segundo número é zero.";
        } else {
            if (numero1 % numero2 == 0) {
                return numero1 + " é múltiplo de " + numero2 + ".";
            } else {
                return numero1 + " não é múltiplo de " + numero2 + ".";
            }
        }
    }

    // 5. IF E ELSE - Ano bissexto
    public static String atv5(Scanner scanner) {
        System.out.println("Digite um ano:");
        int ano = scanner.nextInt();
        scanner.nextLine();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            return "O ano " + ano + " é bissexto.";
        } else {
            return "O ano " + ano + " não é bissexto.";
        }
    }

    // 6. IF E ELSE - Frete de uma compra
    public static String atv6(Scanner scanner) {
        System.out.println("Digite o valor da compra:");
        double compra = scanner.nextDouble();
        scanner.nextLine();

        double frete;
        double total;

        if (compra >= 199.00) {
            frete = 0.00;
            total = compra;
        } else {
            frete = 24.90;
            total = compra + frete;
        }

        return String.format(
                "Valor do frete: R$ %.2f%nTotal a pagar: R$ %.2f",
                frete, total
        );
    }

    // 7. IF, ELSE IF E ELSE - Saudação conforme a hora
    public static String atv7(Scanner scanner) {
        System.out.println("Digite a hora do dia (0 a 23):");
        int hora = scanner.nextInt();
        scanner.nextLine();

        if (hora >= 0 && hora <= 11) {
            return "Bom dia!";
        } else if (hora >= 12 && hora <= 17) {
            return "Boa tarde!";
        } else if (hora >= 18 && hora <= 23) {
            return "Boa noite!";
        } else {
            return "Hora inválida.";
        }
    }

    // 8. IF, ELSE IF E ELSE - Infração de trânsito
    public static String atv8(Scanner scanner) {
        System.out.println("Digite a velocidade máxima da via:");
        double velocidadeMaxima = scanner.nextDouble();

        System.out.println("Digite a velocidade do veículo:");
        double velocidadeVeiculo = scanner.nextDouble();
        scanner.nextLine();

        double limite20 = velocidadeMaxima * 1.20;
        double limite50 = velocidadeMaxima * 1.50;

        if (velocidadeVeiculo <= velocidadeMaxima) {
            return "Dentro do limite. Não há multa.";
        } else if (velocidadeVeiculo <= limite20) {
            return "Infração média.";
        } else if (velocidadeVeiculo <= limite50) {
            return "Infração grave.";
        } else {
            return "Infração gravíssima.";
        }
    }

    // 9. IF, ELSE IF E ELSE - Bônus por tempo de empresa
    public static String atv9(Scanner scanner) {
        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        System.out.println("Digite o tempo de casa em anos:");
        double tempoCasa = scanner.nextDouble();
        scanner.nextLine();

        double percentual;

        if (tempoCasa < 1) {
            percentual = 0;
        } else if (tempoCasa <= 3) {
            percentual = 5;
        } else if (tempoCasa <= 10) {
            percentual = 10;
        } else {
            percentual = 15;
        }

        double bonus = salario * (percentual / 100.0);

        return String.format(
                "Percentual do bônus: %.2f%%%nValor do bônus: R$ %.2f",
                percentual, bonus
        );
    }

    // 10. IF ANINHADO - Login de usuário
    public static String atv10(Scanner scanner) {
        System.out.println("Digite o nome de usuário:");
        String usuario = scanner.nextLine();

        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        if (usuario.equalsIgnoreCase("admin")) {
            if (senha.equals("java123")) {
                return "Acesso liberado.";
            } else {
                return "Senha incorreta.";
            }
        } else {
            return "Usuário não encontrado.";
        }
    }

    // 11. IF ANINHADO - Frequência e média do aluno
    public static String atv11(Scanner scanner) {
        System.out.println("Digite a frequência do aluno (%):");
        double frequencia = scanner.nextDouble();

        System.out.println("Digite a média final do aluno:");
        double media = scanner.nextDouble();
        scanner.nextLine();

        if (frequencia < 75) {
            return "Reprovado por falta.";
        } else {
            if (media >= 7) {
                return "Aprovado.";
            } else if (media >= 5) {
                return "Recuperação.";
            } else {
                return "Reprovado por nota.";
            }
        }
    }

    // 12. IF ANINHADO - Saque bancário
    public static String atv12(Scanner scanner) {
        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();

        System.out.println("Digite o valor solicitado para saque:");
        double valorSaque = scanner.nextDouble();
        scanner.nextLine();

        if (saldo < valorSaque) {
            return "Saldo insuficiente.";
        } else {
            if (valorSaque > limiteDiario) {
                return "O valor solicitado ultrapassa o limite diário de saque.";
            } else {
                saldo -= valorSaque;
                return String.format(
                        "Saque realizado com sucesso.%nNovo saldo: R$ %.2f",
                        saldo
                );
            }
        }
    }

    // 13. SWITCH - Calculadora
    public static String atv13(Scanner scanner) {
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int operacao = scanner.nextInt();
        scanner.nextLine();

        return switch (operacao) {
            case 1 -> String.format("Resultado: %.2f", numero1 + numero2);
            case 2 -> String.format("Resultado: %.2f", numero1 - numero2);
            case 3 -> String.format("Resultado: %.2f", numero1 * numero2);
            case 4 -> {
                if (numero2 == 0) {
                    yield "Não é possível dividir por zero.";
                } else {
                    yield String.format("Resultado: %.2f", numero1 / numero2);
                }
            }
            default -> "Opção inválida.";
        };
    }

    // 14. SWITCH - Quantidade de dias de um mês
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

    // 15. EXERCÍCIO INTEGRADOR - Terminal de estacionamento
    public static String atv15(Scanner scanner) {
        System.out.println("Digite o tipo de veículo:");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");

        int tipoVeiculo = scanner.nextInt();
        scanner.nextLine();

        double tarifaHora = switch (tipoVeiculo) {
            case 1 -> 8.00;
            case 2 -> 5.00;
            default -> -1.00;
        };

        if (tarifaHora == -1.00) {
            return "Opção inválida.";
        }

        System.out.println("Digite a quantidade de horas:");
        double horas = scanner.nextDouble();
        scanner.nextLine();

        double valor = tarifaHora * horas;

        System.out.println("O cliente possui cupom? (sim / nao)");
        String cupom = scanner.nextLine().trim();

        String resultado = "";

        if (cupom.equalsIgnoreCase("sim")) {
            if (valor >= 50.00) {
                double desconto = valor * 0.20;
                valor -= desconto;
                resultado += String.format(
                        "Cupom aplicado. Desconto de 20%%: R$ %.2f%n",
                        desconto
                );
            } else {
                resultado += "O cupom vale apenas para valores de R$ 50,00 ou mais.\n";
            }
        }

        if (horas > 12) {
            resultado += "Aviso: permanência longa.\n";
        }

        if (horas > 24) {
            resultado += "Aviso: cobrança de diária.\n";
        }

        if (horas <= 2) {
            resultado += "Classificação da permanência: curta.\n";
        } else if (horas <= 6) {
            resultado += "Classificação da permanência: média.\n";
        } else {
            resultado += "Classificação da permanência: longa.\n";
        }

        resultado += String.format("Valor final: R$ %.2f", valor);

        return resultado;
    }
}
