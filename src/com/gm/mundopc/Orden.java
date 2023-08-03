package com.gm.mundopc;

public class Orden {

    private int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden(){
        this.idOrden = ++this.contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];

    }

    public void agregarComputadora( Computadora computadora ){
        if(this.contadorComputadoras < MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Nuestro esta agotado por el momento.");
        }

    }

    public double calcularTotal(){
        int total = 0;
        for( int i = 0; i < this.contadorComputadoras; i++ ){
            total += this.computadoras[i].getPrecio();
        }

        return total;

    }


    public void mostrarOrden(){

        System.out.println("El numero de orden es: " + this.idOrden);
        System.out.println("El total a pagar es $" + this.calcularTotal());
        for( int i = 0; i < this.contadorComputadoras; i++ ){
            System.out.println(computadoras[i]);
        }
        System.out.println("El total de ordenes es " + this.contadorOrdenes);

    }





}
