/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author estudiante
 */

// se le quita el "public" para trabajar con getter y setter
class Fecha {
    private int dia;
    private int año;
    private int mes;

    public Fecha() {
    }

    public Fecha(int dia, int año, int mes) {
        this.dia = dia;
        this.año = año;
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String imprimirFecha(){
        System.out.println(dia+"-"+mes+"-"+año);
        return (dia+"-"+mes+"-"+año);
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", a\u00f1o=" + año + ", mes=" + mes + '}';
    }
}
