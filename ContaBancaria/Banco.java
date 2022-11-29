package Exercicios.ContaBancaria;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao;
        double valor;
        String menuInicar;

        ContaBancaria conta = new ContaBancaria(1002, 5, "Jessica", "123.456.789-8", 450.50);

        menuInicar = "Bem vindo ao JessicaBank! \nDigite 1-Deposito / 2-Saque / 3-Info / 0 - Sair ";
        
        do {
            System.out.println(menuInicar);            
            opcao = teclado.nextInt();

            switch(opcao) {
                case 1: 
                    System.out.println("DEPOSITO - Digite o valor:");
                    valor = teclado.nextDouble();
                    if(valor != 0){                    
                        conta.depositar(valor);
                        System.out.printf("Deposito realizado com sucesso! \nSaldo: R$ %.2f\n", conta.getSaldo());
                    } else {
                        System.out.println("Digite um valor valido!");
                    }
                break;

                case 2: 
                    System.out.println("SAQUE - Digite o valor:");
                    valor = teclado.nextDouble();
                    
                    if (valor != 0){
                        boolean resultado = conta.sacar(valor);

                        if (resultado) {
                            System.out.printf("Saque realizado com sucesso! \nSaldo: R$ %.2f\n", conta.getSaldo());
                        } else {
                            System.out.printf("Saldo insuficiente! \nSaldo: R$ %.2f\n", conta.getSaldo());
                        }
                    }else {
                        System.out.println("Digite um valor valido!");
                    }
                break;

                case 3: 
                    System.out.println("Dados da conta: " + conta.exibirDados());
                break;

                case 0: 
                    System.out.println("Obrigado por utilizar o JessicaBank!\n Volte sempre!");
                break;

                default: 
                    System.out.println("Opção inválida");
                break;
            }

        } while (opcao != 0);


        teclado.close();
    }
    
}
