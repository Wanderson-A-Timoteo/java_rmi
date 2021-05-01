/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandersontimoteo.java_rmi;

import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author Wanderson de Almeida Timóteo 
 */
public class Servidor {
    public static void main(String[] args) {
        try {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind ("Calcular", new RMI() );
            JOptionPane.showMessageDialog(null, "Servidor Conectado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível se conectar ao servidor: "+ e);
        }
    }
}
