/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.smartt.dtos;

import java.util.Objects;

/**
 *
 * @author storres
 */
public class BaseBusCooperativaDiscoDto {

    private Integer idCooperativa;
    private Integer idUnidad;
    private String cedula;
    private String ruc;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String cooperativa;
    private Integer externalIdCooperativa;
    private Integer externalIdBus;
    private String placa;
    private String disco;
    private String marca;
    private Integer anio;
    private String capacidad;

    public BaseBusCooperativaDiscoDto(Integer idCooperativa, Integer idUnidad, String cedula, String ruc, String nombre, String correo, String telefono, String direccion, String cooperativa, Integer externalIdCooperativa, Integer externalIdBus, String placa, String disco, String marca, Integer anio, String capacidad) {
        this.idCooperativa = idCooperativa;
        this.idUnidad = idUnidad;
        this.cedula = cedula;
        this.ruc = ruc;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cooperativa = cooperativa;
        this.externalIdCooperativa = externalIdCooperativa;
        this.externalIdBus = externalIdBus;
        this.placa = placa;
        this.disco = disco;
        this.marca = marca;
        this.anio = anio;
        this.capacidad = capacidad;
    }

    public Integer getIdCooperativa() {
        return idCooperativa;
    }

    public void setIdCooperativa(Integer idCooperativa) {
        this.idCooperativa = idCooperativa;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCooperativa() {
        return cooperativa;
    }

    public void setCooperativa(String cooperativa) {
        this.cooperativa = cooperativa;
    }

    public Integer getExternalIdCooperativa() {
        return externalIdCooperativa;
    }

    public void setExternalIdCooperativa(Integer externalIdCooperativa) {
        this.externalIdCooperativa = externalIdCooperativa;
    }

    public Integer getExternalIdBus() {
        return externalIdBus;
    }

    public void setExternalIdBus(Integer externalIdBus) {
        this.externalIdBus = externalIdBus;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idCooperativa);
        hash = 37 * hash + Objects.hashCode(this.disco);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BaseBusCooperativaDiscoDto other = (BaseBusCooperativaDiscoDto) obj;
        if (!Objects.equals(this.disco, other.disco)) {
            return false;
        }
        return Objects.equals(this.idCooperativa, other.idCooperativa);
    }

    @Override
    public String toString() {
        return "BaseBusCooperativaDiscoDto{" + "idCooperativa=" + idCooperativa + ", idUnidad=" + idUnidad + ", cedula=" + cedula + ", ruc=" + ruc + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + ", cooperativa=" + cooperativa + ", externalIdCooperativa=" + externalIdCooperativa + ", externalIdBus=" + externalIdBus + ", placa=" + placa + ", disco=" + disco + ", marca=" + marca + ", anio=" + anio + ", capacidad=" + capacidad + '}';
    }

}
