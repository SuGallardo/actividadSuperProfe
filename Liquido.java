/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.supermercado;

/**
 *
 * @author CETECOM
 */
public class Liquido extends Producto {
    private boolean esAlcohol;
    private String marca;

    public Liquido() {
    }

    public Liquido(boolean esAlcohol, String marca, long codigo, String descripcion, double precio) {
        super(codigo, descripcion, precio);
        this.esAlcohol = esAlcohol;
        this.marca = marca;
    }

    @Override
    public void Listar(long codigo, String descripcion, double precio) {
        System.out.println("El producto es: " + descripcion);
        System.out.println("El codigo es: " + codigo);
        System.out.println("El precio es: " + precio);
    }

    public boolean isEsAlcohol() {
        return esAlcohol;
    }

    public void setEsAlcohol(boolean esAlcohol) {
        this.esAlcohol = esAlcohol;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
