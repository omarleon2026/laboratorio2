package com.gm.mundopc;

public class Raton extends DispositivoDeEntrada{

    private int idRaton;
    private static int contadorRatones;

    public Raton( String tipoEntrada, String marca ){
        super(tipoEntrada, marca);
        this.idRaton = ++this.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton +
                ", contadorRatones=" + contadorRatones +
                '}' + super.toString();
    }
}
