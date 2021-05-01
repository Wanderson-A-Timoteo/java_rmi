/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandersontimoteo.java_rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wanderson de Almeida Timóteo
 */
public class Cliente {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Registry meuRegistro = LocateRegistry.getRegistry("Localhost", 1099);
            Calcular c = (Calcular)Naming.lookup("//LocalHost/Calcular");
            
            while (true) {
                String opcao = JOptionPane.showInputDialog("JAVA RMI \n\n" + "Escolha uma opção \n"
                + "1) ***** Soma \n"
                + "2) ***** Dividir \n"
                + "3) ***** Subtrair \n"
                + "4) ***** Multiplicar \n\n"
                + "Precione CANCELAR para Sair \n"
                );
                
                switch (opcao) {
                    case "1": {
                        int p = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
                        int q = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
                        JOptionPane.showInputDialog(null, "O total da SOMA é: " + c.somar(p, q));
                        break;
                    }
                    
                    case "2": {
                        int p = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
                        int q = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
                        JOptionPane.showInputDialog(null, "O total da DIVISÂO é: " + c.dividir(p, q));
                        break;
                    }
                    
                    case "3": {
                        int p = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
                        int q = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
                        JOptionPane.showInputDialog(null, "O total da Subtração é: " + c.subtrair(p, q));
                        break;
                    }
                    
                    case "4": {
                        int p = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
                        int q = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
                        JOptionPane.showInputDialog(null, "O total da MULTIPLICAÇÃO é: " + c.multiplicar(p, q));
                        break;
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showInputDialog(null, "Conecte-se ao servidor " + e);
        }
    }
}
