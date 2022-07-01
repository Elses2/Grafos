/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafos;

/**
 *
 * @author elses
 */
public class Vertice {
    
    String nombre;
    int numVertice;
    public Vertice(String x)
    {
        nombre = x;
        numVertice = -1;
    }
    public String nomVertice() // devuelve identificador del vértice
    {
        return nombre;
        }
    public boolean equals(Vertice n) // true, si dos vértices son iguales
    {
        return nombre.equals(n.nombre);
        }
    public void asigVert(int n) // establece el número de vértices
            {
        numVertice = n;
        }
    @Override
    public String toString() // características del vértice
    {
        return nombre + " (" + numVertice + ")";
        }
    }
    

