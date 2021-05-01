/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandersontimoteo.java_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Wanderson de Almeida Timóteo
 */
public class RMI extends UnicastRemoteObject implements Calcular{
    public RMI() throws RemoteException {int x, y;}
    
    public int multiplicar(int x, int y) throws RemoteException {
        return x * y;
    }
    
    public int somar(int x, int y) throws RemoteException {
        return x + y;
    }
    
    public int dividir(int x, int y) throws RemoteException {
        return x / y;
    }
    
    public int subtrair(int x, int y) throws RemoteException {
        return x - y;
    }
}
