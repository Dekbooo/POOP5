/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author estudiante
 */
public class Circulo {
    
    final float PI = 3.14f;
    private float radio;
   
    public Circulo(){
        
    }
    
    public Circulo(float radio){
        this.radio = radio;
    }
    
    public float getRadio(){
        return radio;
    }
    
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public void calcularPerimetro(){
        float perimetro = 2*PI*radio;
        System.out.println("Perimetro: "+perimetro);
    }
    
    public void calcularArea(){
        float area = PI*radio*radio;
        System.out.println("Area es: "+area);
    }
}
