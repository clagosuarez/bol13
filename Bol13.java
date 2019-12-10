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
public class Bol13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Xogador xogador = new Xogador(5,"Dem1",2,"Marcos","Diz",41);
        Adestrador adestrador = new Adestrador("esp",5,"Pablo","Suarez",29);
        Masaxista masaxaxista = new Masaxista("fisioterapeuta",30,2,"Rocio","Fernandez",28);
        Seleccion xogador2 = new Xogador(12,"Dem2",3,"Lucas","Martinez",32);
        xogador.concentrarse();
        xogador2.concentrarse();
        adestrador.concentrarse();
        masaxaxista.concentrarse();

        xogador.viaxar();
        xogador2.viaxar();
        adestrador.viaxar();
        masaxaxista.viaxar();

        xogador.getApelido();

        Seleccion españa = new Seleccion(3,"Paco","Garcia",21);

    }

}
