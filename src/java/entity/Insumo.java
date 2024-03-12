/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
/**
 *
 * @author RobinsonConcha
 */
public class Insumo implements Serializable {
   private int codigo;
   private String nombre;
   private int valor;

    public Insumo() {
    }

    public Insumo(int codigo, String nombre, int valor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

  
}