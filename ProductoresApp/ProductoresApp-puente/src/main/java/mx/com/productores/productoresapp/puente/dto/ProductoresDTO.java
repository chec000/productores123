/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.productores.productoresapp.puente.dto;

import java.io.Serializable;

/**
 *
 * @author pablo.bravo
 */
public class ProductoresDTO implements Serializable {

    private Integer id;
    private String nombre;
    private float precio;

    public ProductoresDTO() {
    }

    public ProductoresDTO(Integer id, String nombre, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "EjemploDTO{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

}
