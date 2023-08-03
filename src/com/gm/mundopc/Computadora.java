package com.gm.mundopc;

public class Computadora {

    private int idComputadora;
    private double precio;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadora;

    private Computadora(){
        this.idComputadora = ++contadorComputadora;
    }

    public Computadora( double precio, Monitor monitor, Teclado teclado, Raton raton ){
        this.precio = precio;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        this.idComputadora = ++this.contadorComputadora;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public int getContadorComputadora() {
        return contadorComputadora;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "idComputadora=" + idComputadora +
                ", precio='" + precio + '\'' +
                ", monitor=" + monitor +
                ", teclado=" + teclado +
                ", raton=" + raton +
                ", contadorComputadora=" + contadorComputadora +
                '}';
    }
}
