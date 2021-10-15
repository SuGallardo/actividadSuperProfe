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
public class Aseo extends Producto{
    private String areaHogar;

    public Aseo() {
    }

    public Aseo(String areaHogar, long codigo, String descripcion, double precio) {
        super(codigo, descripcion, precio);
        this.areaHogar = areaHogar;
    }

    @Override
    public void Listar(long codigo, String descripcion, double precio) {
        System.out.println("El producto es: " + descripcion);
        System.out.println("El codigo es: " + codigo);
        System.out.println("El precio es: " + precio);
    }
    
    

    public String getAreaHogar() {
        return areaHogar;
    }

    public void setAreaHogar(String areaHogar) {
        this.areaHogar = areaHogar;
    }
    
    
}
