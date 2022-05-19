package com.dh.ventas;

public class main {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado("EPedro", 2);
        emp1.vender(2);
        Empleado emp2 = new Empleado("EMaria", 1);
        emp2.vender(1);

        Vendedor afi1 = new Afiliado("ARamon");
        afi1.vender(4);
        Vendedor afi2 = new Afiliado("APepe");
        afi2.vender(1);
        Vendedor afi3 = new Afiliado("ASantiago");

        Pasante pas = new Pasante("Juan");
        pas.vender(2);

        Pasante pas1 = new Pasante("Pedro");
        pas1.vender(20);

        emp1.addAfiliado(afi1);
        emp1.addAfiliado(afi2);
        emp1.addAfiliado(afi3);

        System.out.println(emp1.mostrarCategoria());
        System.out.println(emp2.mostrarCategoria());
        System.out.println(afi1.mostrarCategoria());
        System.out.println(pas.mostrarCategoriaPasantes());
        System.out.println(pas1.mostrarCategoriaPasantes());
    }

}
