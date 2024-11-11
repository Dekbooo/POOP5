/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author estudiante
 */
public class Persona {
    
    private int edad;
    private float altura;
    private String nombre;
    private Fecha fechaDeNacimiento;
    String ocupacion;
    
    public Persona(){
        
    }
    
    public Persona(int edad, float altura, String nombre, String ocupacion, Fecha fechaDeNacimiento){
      this.edad = edad;
      this.altura = altura;
      this.nombre = nombre;
      this.fechaDeNacimiento = fechaDeNacimiento;
      this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", altura=" + altura + ", nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + ", ocupacion=" + ocupacion + '}';
    }
}
