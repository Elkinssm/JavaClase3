package com.dh.ventas;

public abstract class Vendedor {
    protected String nombre;
    protected int ventas;
    protected int PUNTOS_POR_VENTA;


    public void vender(int cantVentas) {
        this.ventas += cantVentas;
    }

    public abstract int calcularPuntos();

    public String mostrarCategoria() {
        return this.nombre + " tiene un total de " + calcularPuntos() + " puntos y categoriza como " + getNombreCategoria();
    }

    //Validamos categoria de Afiliados y Empleados
    public String getNombreCategoria() {
        int puntosVendedor = calcularPuntos();
        if (puntosVendedor < 20) {
            return "novato";
        } else if (puntosVendedor < 31) {
            return "aprendiz";

        } else if (puntosVendedor < 41) {
            return "buenos";
        } else {
            return "maestro";
        }
    }


}

