/*
Ejercicio 4:
El supermercado “DeTodo SA” nos ha pedido crear una demo del módulo productos que permita:
dar de alta, bajas y modificar productos del establecimiento y una serie de consultas de dichos
productos por: rubro, nombre y precios. De cada Producto, interesa conocer: código (numérico),
descripción, precio, stock y rubro (comestible, limpieza y perfumería son los únicos permitidos).
Para dar solución a este requerimiento, lo haremos implementando un TreeSet de Productos, en
donde haremos que se ordenen por código a medida que se van ingresando.
A continuación mostramos las vistas sugeridas para el menú general, la gestión de productos y
para las consultas solicitadas.
Es importante que repartan las tareas entre los miembros del equipo, de tal forma que: uno crea
repositorio en GitHub; los demás clonan, luego cada uno hace una de las clases que forman parte
del proyecto y suben al repositorio los cambios.
 */
package appjavaejercicio4;

public class Producto implements Comparable<Producto> {

    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private Categoria rublo;

    public Producto(int codigo, String descripcion, double precio, int stock, Categoria rublo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rublo = rublo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getRublo() {
        return rublo;
    }

    public void setRublo(Categoria rublo) {
        this.rublo = rublo;
    }

    @Override
    public int compareTo(Producto t) {
        if (codigo == t.codigo) {
            return 0;
        } else if (codigo > t.codigo) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return  codigo  + descripcion  + precio  + stock  + rublo ;
    }
    
    

}
