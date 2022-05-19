package com.dh.ventas;

import java.util.ArrayList;

public class Empleado extends Vendedor {
    private int aniosDeAntiguedad;

    public Empleado(String nombre, int aniosDeAntiguedad) {
        super.nombre = nombre;
        super.PUNTOS_POR_VENTA = 5;
        this.aniosDeAntiguedad = aniosDeAntiguedad;
    }

    public void addAfiliado(Vendedor afiliado) {
        this.afiliados.add(afiliado);
    }

    private ArrayList<Vendedor> afiliados = new ArrayList<>();

    @Override
    public int calcularPuntos() {
        return (this.afiliados.size() * 10) + (this.aniosDeAntiguedad * 5) + (this.ventas * PUNTOS_POR_VENTA);
    }


}
