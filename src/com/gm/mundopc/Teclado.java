package com.gm.mundopc;

public class Teclado extends DispositivoDeEntrada{

    private int idTeclado;
    private static int contadorTeclados;

    public Teclado( String tipoEntrada, String marca ){
        super(tipoEntrada, marca);
        this.idTeclado = ++this.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "idTeclado=" + idTeclado +
                ", contadorTeclados=" + contadorTeclados +
                '}' + super.toString();
    }
}
