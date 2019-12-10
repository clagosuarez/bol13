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
public class Adestrador extends Seleccion{
    private String idFederacion;

    public Adestrador() {
    }

    public Adestrador(String idFederación, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederación;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void dirixirPartido() {
        System.out.println("O adestrador dirixe un partido");    
    }
    
    public void dirixirAdestramento() {
        System.out.println("O adestrador dirixe un adestramento");    
    }
    
    @Override
    public String toString() {
        return super.toString() + " idFederacion=" + idFederacion;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxan os adestradores");
    }
}
