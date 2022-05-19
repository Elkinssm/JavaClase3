package com.dh.ventas;

public class Pasante extends Vendedor {


    public Pasante(String nombre) {
        super.nombre = nombre;
        super.PUNTOS_POR_VENTA = 5;
    }

    @Override
    public int calcularPuntos() {
        return (this.ventas * PUNTOS_POR_VENTA);
    };

    public String mostrarCategoriaPasantes() {
        return this.nombre + " tiene un total de " + calcularPuntos() + " puntos y categoriza como " + getNombreCategoriaPasantes();
    }

    public String getNombreCategoriaPasantes() {
        int puntosPasante = calcularPuntos();
        if (puntosPasante < 50) {
            return "pasante novato";
        } else {
            return "pasante experimetado";
        }
    }


}

