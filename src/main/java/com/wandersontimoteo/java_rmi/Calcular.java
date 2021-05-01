/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandersontimoteo.java_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Wanderson de Almeida Timóteo
 */
public interface Calcular extends Remote {
    public int multiplicar (int x, int y) throws RemoteException;
    public int somar (int x, int y) throws RemoteException;
    public int dividir (int x, int y) throws RemoteException;
    public int subtrair (int x, int y) throws RemoteException;
}
