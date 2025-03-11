package org.example;

public class NotificationFactory {
    public static Notification criarNotificacao(String tipo) {
        switch (tipo.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Tipo  inválido: " + tipo);
        }
    }
}
