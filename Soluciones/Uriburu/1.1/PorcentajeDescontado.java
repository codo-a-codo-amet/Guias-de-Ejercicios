package com.amet;

public class PorcentajeDescontado {
    
    private double precioPagado;
    private double precioTarifa;
    
    public PorcentajeDescontado (double precioPagado, double precioTarifa) {
        this.precioPagado = precioPagado;
        this.precioTarifa = precioTarifa;
    }
    
    public void calc() {
        double descontado = (this.precioTarifa - this.precioPagado);
        //Hallar porcentaje de la diferencia sabiendo que el precio de tarifa
        //equivale al 100% y la diferencia ???
        System.out.println(descontado);
    }
}
