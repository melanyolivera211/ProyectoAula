/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaula.objects;
/**
 *
 * @author MELANY
 */
public class Electrodomestico {
    public String nombreE; 
    public String nroSerie;
    public String marca; 
     public String cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreE() {
        return nombreE;
    }

    public String getNroserie() {
        return nroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public void setNroserie(String nroserie) {
        this.nroSerie = nroserie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    
    
}
