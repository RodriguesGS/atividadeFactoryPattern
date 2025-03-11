package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("Escolha um tipo de notificação:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");
        System.out.println("==========================");
        System.out.print("Digite uma opção: ");

        int op = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a mensagem: ");
        String message = scanner.nextLine();

        Notification notification;

        switch (op) {
            case 1:
                notification = NotificationFactory.criarNotificacao("email");
                break;
            case 2:
                notification = NotificationFactory.criarNotificacao("sms");
                break;
            case 3:
                notification = NotificationFactory.criarNotificacao("push");
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        notification.send(message);
    }
}