/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.supermercado.business.impl;

import java.util.Scanner;
import cl.duoc.pgy2121.supermercado.business.SupermercadoBusiness;

/**
 *
 * @author CETECOM
 */
public class SupermercadoBusinessImpl implements SupermercadoBusiness{

    @Override
    public String crearComentario() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un comentario");
        
        return s.nextLine();
    }
    
}
