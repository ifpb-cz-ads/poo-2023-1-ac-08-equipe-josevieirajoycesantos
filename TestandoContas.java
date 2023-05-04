import java.util.Scanner;
import java.util.ArrayList;

public class TestandoContas {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> listaContas = new ArrayList<ContaBancaria>();
        int mantedor = 0;

        while (mantedor == 0) {
            Scanner menu1 = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("------------MENU------------");
            System.out.println("Informe a opção desejada:");
            System.out.println("1 - Criar nova Conta");
            System.out.println("2 - Impimir");
            System.out.println("Informe a opção desejada:");
            int number = menu1.nextInt();

            switch (number) {
                case 1:
                    Scanner menu2 = new Scanner(System.in);
                    System.out.println(" ");
                    System.out.println("------------MENU------------");
                    System.out.println("Informe o tipo de conta:");
                    System.out.println("1 - Conta Bancaria");
                    System.out.println("2 - Conta Especial");
                    System.out.println("3 - Conta Poupança");
                    System.out.println("Informe a opção desejada:");
                    int number2 = menu2.nextInt();
                    switch (number2) {
                        case 1:
                            Scanner name = new Scanner(System.in);
                            System.out.println("Insira o nome do titular: ");
                            String nome = name.next();

                            Scanner num = new Scanner(System.in);
                            System.out.println("Insira o numero da conta: ");
                            int numero = num.nextInt();

                            Scanner value = new Scanner(System.in);
                            System.out.println("Insira o valor do saldo inicial da conta: ");
                            int valor = value.nextInt();

                            ContaBancaria conta1 = new ContaBancaria(nome, numero, valor);
                            listaContas.add(conta1);

                            conta1.extrato();
                            break;
                        case 2:
                            Scanner name2 = new Scanner(System.in);
                            System.out.println("Insira o nome do titular: ");
                            String nome2 = name2.next();

                            Scanner num2 = new Scanner(System.in);
                            System.out.println("Insira o numero da conta: ");
                            int numero2 = num2.nextInt();

                            Scanner value2 = new Scanner(System.in);
                            System.out.println("Insira o valor do saldo inicial da conta: ");
                            int valor2 = value2.nextInt();

                            ContaBancaria conta2 = new ContaEspecial(nome2, numero2, valor2);
                            listaContas.add(conta2);

                            conta2.extrato();

                        case 3:
                            Scanner name3 = new Scanner(System.in);
                            System.out.println("Insira o nome do titular: ");
                            String nome3 = name3.next();

                            Scanner num3 = new Scanner(System.in);
                            System.out.println("Insira o numero da conta: ");
                            int numero3 = num3.nextInt();

                            Scanner value3 = new Scanner(System.in);
                            System.out.println("Insira o valor do saldo inicial da conta: ");
                            int valor3 = value3.nextInt();

                            ContaBancaria conta3 = new ContaPoupança(nome3, numero3, valor3);
                            listaContas.add(conta3);

                            conta3.extrato();
                        default:
                            break;
                    }
                    break;

                default:
                    break;
            }
        }
    }
}