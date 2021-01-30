package adaitw.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SuperAda {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        List<Producto> productos = new ArrayList<>();


        clientes.add(new Cliente("pablo", LocalDate.of(2020,9,01),false));
        clientes.add(new Cliente("eric", LocalDate.of(2019,1,30),true));
        clientes.add(new Cliente("ana", LocalDate.of(2015,1,30),false));
        clientes.add(new Cliente("samantha", LocalDate.of(2010,8,14),true));

        productos.add(new Producto("banana","desc",20.0,"comidas"));
        productos.add(new Producto("manzana","desc",25.0,"comidas"));
        productos.add(new Producto("plato","desc",80.0,"bazar"));
        productos.add(new Producto("lavandina","desc",15.0,"limpieza"));

        clientes.get(0).agregarItem(10, productos.get(1));
        clientes.get(0).agregarItem(25, productos.get(0));
        clientes.get(1).agregarItem(20, productos.get(0));

        Cliente cliente0 = clientes.get(0);
        Cliente cliente1 = clientes.get(1);
        System.out.println("El cliente 0 va a gastar: $"+cliente0.calcularTotal());
        System.out.println("El cliente 1 va a gastar: $"+cliente1.calcularTotal());

    }
}
/*
	En una cadena de supermercados se manejan distintos tipos de productos:
		comidas, artículos de limpieza, bazar, librería y perfumería.
	Cada producto tiene un nombre, una descripción y precio unitario.

	Se desea crear un carrito de compras online en el que los clientes puedan seleccionar los productos a comprar (cantidad por producto).
	El sistema debe informar el precio total de la compra.
	Nota: los jubilados tienen un 15% de descuento.
	Nota2: si es el cumpleaños del cliente, tiene un 10% de descuento adicional.
*/