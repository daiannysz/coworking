/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 55619
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String m = JOptionPane.showInputDialog("Anyone there?");
        SalaCoworking salaA = new SalaCoworking("Sala A");
        SalaCoworking salaB = new SalaCoworking("Sala B");
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Listar salas");
            System.out.println("2. Reservar sala");
            System.out.println("3. Liberar sala");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(salaA.getNome() + " - " + (salaA.isOcupada() ? "Ocupada" : "Livre"));
                    System.out.println(salaB.getNome() + " - " + (salaB.isOcupada() ? "Ocupada" : "Livre"));
                    break;
                case 2:
                    System.out.print("Escolha a sala para reservar (1 - Sala A, 2 - Sala B): ");
                    int reserva = scanner.nextInt();
                    if (reserva == 1 && !salaA.isOcupada()) {
                        salaA.reservar();
                        System.out.println("Sala A reservada.");
                    } else if (reserva == 2 && !salaB.isOcupada()) {
                        salaB.reservar();
                        System.out.println("Sala B reservada.");
                    } else {
                        System.out.println("Sala já está ocupada ou opção inválida.");
                    }
                    break;
                case 3:
                    System.out.print("Escolha a sala para liberar (1 - Sala A, 2 - Sala B): ");
                    int liberar = scanner.nextInt();
                    if (liberar == 1 && salaA.isOcupada()) {
                        salaA.liberar();
                        System.out.println("Sala A liberada.");
                    } else if (liberar == 2 && salaB.isOcupada()) {
                        salaB.liberar();
                        System.out.println("Sala B liberada.");
                    } else {
                        System.out.println("Sala já está livre ou opção inválida.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

