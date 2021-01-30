package adaitw.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    List<Item> items;
    String nombre;
    Boolean jubilado;
    LocalDate fechaNacimiento;

    public void agregarItem(int cantidad, Producto producto){
        items.add(new Item(cantidad, producto));
    }
    public Double calcularTotal(){
        Double total = 0.0;
        for(Item i: items)
            total += i.getCantidad() * i.getProducto().getPrecioUnitario();

        if(jubilado)
            total -= total * 0.15;

        LocalDate hoy = LocalDate.now();
        int esteAnio = hoy.getYear();
        int mesCumple = fechaNacimiento.getMonthValue();
        int diaCumple = fechaNacimiento.getDayOfMonth();
        Boolean cumpleAnios = hoy.equals(LocalDate.of(esteAnio,mesCumple, diaCumple));

        if(cumpleAnios)
            total -= total * 0.10;

        return total;
    }

    public Cliente(String nombre, LocalDate fechaNacimiento, Boolean jubilado) {
        this.items = new ArrayList<>();
        this.nombre = nombre;
        this.jubilado = jubilado;
        this.fechaNacimiento = fechaNacimiento;
    }

}

/*
*  int diaActual = hoy.getDayOfMonth();
            int mesActual = hoy.getMonthValue();

            if(diaActual == diaCumple && mesActual == mesCumple)
                total -= total *0.10;

            if(cumpleAnios)
                total -= total * 0.10;*/
