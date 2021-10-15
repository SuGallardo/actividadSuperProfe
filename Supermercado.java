/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.supermercado;

import cl.duoc.pgy2121.supermercado.business.SupermercadoBusiness;
import cl.duoc.pgy2121.supermercado.business.impl.SupermercadoBusinessImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CETECOM
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        List<Liquido> liquidoList = new ArrayList<Liquido>();
        List<Aseo> aseoList = new ArrayList<Aseo>();
        
        
        int opcion = 0;
        
        while(opcion != 5){
            System.out.println("1.-Ingrese producto\n2.-Listar productos\n5.-Salir");
            opcion = s.nextInt();
            s.nextLine();
            if(opcion == 1){
                System.out.println("Qué tipo de producto es:\n1.-Liquidos\n2.-aseo");
                int opcionProducto = s.nextInt();
                s.nextLine();
                if(opcionProducto == 1){
                    System.out.println("Ingrese precio");
                    double precio = s.nextDouble();
                    System.out.println("Ingrese codigo:");
                    long codigo = s.nextLong();
                    s.nextLine();
                    System.out.println("Ingrese descripcion:");
                    String desc = s.nextLine();
                    System.out.println("Ingrese la marca:");
                    String marca = s.nextLine();
                    System.out.println("Es alcohol? 1.-Si 2.-No");
                    int opcionAlcohol = s.nextInt();
                    boolean esAlcohol = false;
                    if(opcionAlcohol == 1){
                        esAlcohol = true;
                    }
                    
                    Liquido l = new Liquido(esAlcohol, marca, codigo, desc, precio);
                    liquidoList.add(l);
                }
                if(opcionProducto == 2){
                    System.out.println("Ingrese precio");
                    double precio = s.nextDouble();
                    System.out.println("Ingrese codigo:");
                    long codigo = s.nextLong();
                    s.nextLine();
                    System.out.println("Ingrese descripcion:");
                    String desc = s.nextLine();
                    System.out.println("Ingrese el area del hogar:");
                    String tipoHogar = s.nextLine();
                    
                    Aseo a = new Aseo(tipoHogar, codigo, desc, precio);
                    aseoList.add(a);
                }
            }
            if(opcion == 2){
                Liquido liq = new Liquido();
                Aseo ase = new Aseo();
                for (Liquido liquido : liquidoList) {
                    liq.Listar(liquido.getCodigo(), liquido.getDescripcion(), liquido.getPrecio());
                }
                for (Aseo aseo : aseoList) {
                    ase.Listar(aseo.getCodigo(), aseo.getDescripcion(), aseo.getPrecio());
                }
                
            }
        }
        
        SupermercadoBusinessImpl sb = new SupermercadoBusinessImpl();
        String comentario = sb.crearComentario();
        System.out.println("Tu comentario es: " + comentario);
    }
    
}
