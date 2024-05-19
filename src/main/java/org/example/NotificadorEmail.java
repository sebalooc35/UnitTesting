package org.example;

import java.util.regex.Pattern;

public class NotificadorEmail {
    private final EmailCliente emailCliente;
    public NotificadorEmail(EmailCliente emailCliente){
        this.emailCliente = emailCliente;
    }
    public void notificar(String direccion, String mensaje){
        String regex = "^[A-Za-z0-9.!#$%&'*+/=?^_`{|}~-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        if(direccion == null) direccion = "";
        if(mensaje == null) mensaje = "";

        if(!Pattern.matches(regex, direccion)) return;

        emailCliente.enviarCorreo(direccion, mensaje);
    }
}
