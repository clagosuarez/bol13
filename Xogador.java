/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bol13;

/**
 *
 * @author clagosuarez
 */
public class Xogador extends Seleccion{
    private int dorsal;
    private String demarcacion;
    
    public Xogador() {
    }

    public Xogador(int dorsal, String demarcacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void xogarPartido() {
        System.out.println("Os xogadores xogan un partido");    
    }
    
    public void entrenar() {
        System.out.println("Os xogadores entrenan");    
    }
    
    @Override
    public String toString() {
        return super.toString() +" dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxan os xogadores");
    }
}
