/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.smartt.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author storres
 */
@Entity
@Table(name = "base_localidad")
@NamedQueries({
    @NamedQuery(name = "BaseLocalidad.findAll", query = "SELECT b FROM BaseLocalidad b"),
    @NamedQuery(name = "BaseLocalidad.findById", query = "SELECT b FROM BaseLocalidad b WHERE b.id = :id"),
    @NamedQuery(name = "BaseLocalidad.findByCreacion", query = "SELECT b FROM BaseLocalidad b WHERE b.creacion = :creacion"),
    @NamedQuery(name = "BaseLocalidad.findByActualizacion", query = "SELECT b FROM BaseLocalidad b WHERE b.actualizacion = :actualizacion"),
    @NamedQuery(name = "BaseLocalidad.findByIsActive", query = "SELECT b FROM BaseLocalidad b WHERE b.isActive = :isActive"),
    @NamedQuery(name = "BaseLocalidad.findByIsEnable", query = "SELECT b FROM BaseLocalidad b WHERE b.isEnable = :isEnable"),
    @NamedQuery(name = "BaseLocalidad.findByEstablecimiento", query = "SELECT b FROM BaseLocalidad b WHERE b.establecimiento = :establecimiento"),
    @NamedQuery(name = "BaseLocalidad.findByRepresentanteLegal", query = "SELECT b FROM BaseLocalidad b WHERE b.representanteLegal = :representanteLegal"),
    @NamedQuery(name = "BaseLocalidad.findByRazonSocial", query = "SELECT b FROM BaseLocalidad b WHERE b.razonSocial = :razonSocial"),
    @NamedQuery(name = "BaseLocalidad.findByRuc", query = "SELECT b FROM BaseLocalidad b WHERE b.ruc = :ruc"),
    @NamedQuery(name = "BaseLocalidad.findByNombreComercial", query = "SELECT b FROM BaseLocalidad b WHERE b.nombreComercial = :nombreComercial"),
    @NamedQuery(name = "BaseLocalidad.findByDireccionMatriz", query = "SELECT b FROM BaseLocalidad b WHERE b.direccionMatriz = :direccionMatriz"),
    @NamedQuery(name = "BaseLocalidad.findByCorreo", query = "SELECT b FROM BaseLocalidad b WHERE b.correo = :correo"),
    @NamedQuery(name = "BaseLocalidad.findByObligadoContabilidad", query = "SELECT b FROM BaseLocalidad b WHERE b.obligadoContabilidad = :obligadoContabilidad"),
    @NamedQuery(name = "BaseLocalidad.findByContribuyenteEspecial", query = "SELECT b FROM BaseLocalidad b WHERE b.contribuyenteEspecial = :contribuyenteEspecial"),
    @NamedQuery(name = "BaseLocalidad.findByContribuyenteEspecialDetalle", query = "SELECT b FROM BaseLocalidad b WHERE b.contribuyenteEspecialDetalle = :contribuyenteEspecialDetalle"),
    @NamedQuery(name = "BaseLocalidad.findByFacturacionElectronicaApiKey", query = "SELECT b FROM BaseLocalidad b WHERE b.facturacionElectronicaApiKey = :facturacionElectronicaApiKey"),
    @NamedQuery(name = "BaseLocalidad.findByLogo", query = "SELECT b FROM BaseLocalidad b WHERE b.logo = :logo"),
    @NamedQuery(name = "BaseLocalidad.findByEmisionFacturacion", query = "SELECT b FROM BaseLocalidad b WHERE b.emisionFacturacion = :emisionFacturacion"),
    @NamedQuery(name = "BaseLocalidad.findByAmbiente", query = "SELECT b FROM BaseLocalidad b WHERE b.ambiente = :ambiente"),
    @NamedQuery(name = "BaseLocalidad.findByTelefono", query = "SELECT b FROM BaseLocalidad b WHERE b.telefono = :telefono"),
    @NamedQuery(name = "BaseLocalidad.findByLeyendaRide", query = "SELECT b FROM BaseLocalidad b WHERE b.leyendaRide = :leyendaRide"),
    @NamedQuery(name = "BaseLocalidad.findByNombre", query = "SELECT b FROM BaseLocalidad b WHERE b.nombre = :nombre"),
    @NamedQuery(name = "BaseLocalidad.findByTarifaTasa", query = "SELECT b FROM BaseLocalidad b WHERE b.tarifaTasa = :tarifaTasa"),
    @NamedQuery(name = "BaseLocalidad.findByTiempoGracia", query = "SELECT b FROM BaseLocalidad b WHERE b.tiempoGracia = :tiempoGracia"),
    @NamedQuery(name = "BaseLocalidad.findBySatelite", query = "SELECT b FROM BaseLocalidad b WHERE b.satelite = :satelite"),
    @NamedQuery(name = "BaseLocalidad.findByPuntoEmisionContingencias", query = "SELECT b FROM BaseLocalidad b WHERE b.puntoEmisionContingencias = :puntoEmisionContingencias"),
    @NamedQuery(name = "BaseLocalidad.findByValidarBus", query = "SELECT b FROM BaseLocalidad b WHERE b.validarBus = :validarBus"),
    @NamedQuery(name = "BaseLocalidad.findByValidarConductor", query = "SELECT b FROM BaseLocalidad b WHERE b.validarConductor = :validarConductor")})
public class BaseLocalidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creacion;
    @Basic(optional = false)
    @Column(name = "actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizacion;
    @Basic(optional = false)
    @Column(name = "is_active")
    private boolean isActive;
    @Basic(optional = false)
    @Column(name = "is_enable")
    private boolean isEnable;
    @Column(name = "establecimiento")
    private String establecimiento;
    @Column(name = "representante_legal")
    private String representanteLegal;
    @Column(name = "razon_social")
    private String razonSocial;
    @Column(name = "ruc")
    private String ruc;
    @Column(name = "nombre_comercial")
    private String nombreComercial;
    @Column(name = "direccion_matriz")
    private String direccionMatriz;
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "obligado_contabilidad")
    private boolean obligadoContabilidad;
    @Basic(optional = false)
    @Column(name = "contribuyente_especial")
    private boolean contribuyenteEspecial;
    @Column(name = "contribuyente_especial_detalle")
    private String contribuyenteEspecialDetalle;
    @Column(name = "facturacion_electronica_api_key")
    private String facturacionElectronicaApiKey;
    @Column(name = "logo")
    private String logo;
    @Basic(optional = false)
    @Column(name = "emision_facturacion")
    private String emisionFacturacion;
    @Basic(optional = false)
    @Column(name = "ambiente")
    private String ambiente;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "leyenda_ride")
    private String leyendaRide;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "tarifa_tasa")
    private double tarifaTasa;
    @Basic(optional = false)
    @Column(name = "tiempo_gracia")
    private short tiempoGracia;
    @Basic(optional = false)
    @Column(name = "satelite")
    private boolean satelite;
    @Column(name = "punto_emision_contingencias")
    private String puntoEmisionContingencias;
    @Basic(optional = false)
    @Column(name = "validar_bus")
    private boolean validarBus;
    @Basic(optional = false)
    @Column(name = "validar_conductor")
    private boolean validarConductor;
    @JoinColumn(name = "usuario_actualizacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioActualizacionId;
    @JoinColumn(name = "usuario_creacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioCreacionId;
    @JoinColumn(name = "ciudad_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BaseCiudad ciudadId;
    @OneToMany(mappedBy = "localidadId")
    private List<AuthUser> authUserList;

    public BaseLocalidad() {
    }

    public BaseLocalidad(Integer id) {
        this.id = id;
    }

    public BaseLocalidad(Integer id, Date creacion, Date actualizacion, boolean isActive, boolean isEnable, boolean obligadoContabilidad, boolean contribuyenteEspecial, String emisionFacturacion, String ambiente, String nombre, double tarifaTasa, short tiempoGracia, boolean satelite, boolean validarBus, boolean validarConductor) {
        this.id = id;
        this.creacion = creacion;
        this.actualizacion = actualizacion;
        this.isActive = isActive;
        this.isEnable = isEnable;
        this.obligadoContabilidad = obligadoContabilidad;
        this.contribuyenteEspecial = contribuyenteEspecial;
        this.emisionFacturacion = emisionFacturacion;
        this.ambiente = ambiente;
        this.nombre = nombre;
        this.tarifaTasa = tarifaTasa;
        this.tiempoGracia = tiempoGracia;
        this.satelite = satelite;
        this.validarBus = validarBus;
        this.validarConductor = validarConductor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public Date getActualizacion() {
        return actualizacion;
    }

    public void setActualizacion(Date actualizacion) {
        this.actualizacion = actualizacion;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(boolean isEnable) {
        this.isEnable = isEnable;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDireccionMatriz() {
        return direccionMatriz;
    }

    public void setDireccionMatriz(String direccionMatriz) {
        this.direccionMatriz = direccionMatriz;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean getObligadoContabilidad() {
        return obligadoContabilidad;
    }

    public void setObligadoContabilidad(boolean obligadoContabilidad) {
        this.obligadoContabilidad = obligadoContabilidad;
    }

    public boolean getContribuyenteEspecial() {
        return contribuyenteEspecial;
    }

    public void setContribuyenteEspecial(boolean contribuyenteEspecial) {
        this.contribuyenteEspecial = contribuyenteEspecial;
    }

    public String getContribuyenteEspecialDetalle() {
        return contribuyenteEspecialDetalle;
    }

    public void setContribuyenteEspecialDetalle(String contribuyenteEspecialDetalle) {
        this.contribuyenteEspecialDetalle = contribuyenteEspecialDetalle;
    }

    public String getFacturacionElectronicaApiKey() {
        return facturacionElectronicaApiKey;
    }

    public void setFacturacionElectronicaApiKey(String facturacionElectronicaApiKey) {
        this.facturacionElectronicaApiKey = facturacionElectronicaApiKey;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getEmisionFacturacion() {
        return emisionFacturacion;
    }

    public void setEmisionFacturacion(String emisionFacturacion) {
        this.emisionFacturacion = emisionFacturacion;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLeyendaRide() {
        return leyendaRide;
    }

    public void setLeyendaRide(String leyendaRide) {
        this.leyendaRide = leyendaRide;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTarifaTasa() {
        return tarifaTasa;
    }

    public void setTarifaTasa(double tarifaTasa) {
        this.tarifaTasa = tarifaTasa;
    }

    public short getTiempoGracia() {
        return tiempoGracia;
    }

    public void setTiempoGracia(short tiempoGracia) {
        this.tiempoGracia = tiempoGracia;
    }

    public boolean getSatelite() {
        return satelite;
    }

    public void setSatelite(boolean satelite) {
        this.satelite = satelite;
    }

    public String getPuntoEmisionContingencias() {
        return puntoEmisionContingencias;
    }

    public void setPuntoEmisionContingencias(String puntoEmisionContingencias) {
        this.puntoEmisionContingencias = puntoEmisionContingencias;
    }

    public boolean getValidarBus() {
        return validarBus;
    }

    public void setValidarBus(boolean validarBus) {
        this.validarBus = validarBus;
    }

    public boolean getValidarConductor() {
        return validarConductor;
    }

    public void setValidarConductor(boolean validarConductor) {
        this.validarConductor = validarConductor;
    }

    public AuthUser getUsuarioActualizacionId() {
        return usuarioActualizacionId;
    }

    public void setUsuarioActualizacionId(AuthUser usuarioActualizacionId) {
        this.usuarioActualizacionId = usuarioActualizacionId;
    }

    public AuthUser getUsuarioCreacionId() {
        return usuarioCreacionId;
    }

    public void setUsuarioCreacionId(AuthUser usuarioCreacionId) {
        this.usuarioCreacionId = usuarioCreacionId;
    }

    public BaseCiudad getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(BaseCiudad ciudadId) {
        this.ciudadId = ciudadId;
    }

    public List<AuthUser> getAuthUserList() {
        return authUserList;
    }

    public void setAuthUserList(List<AuthUser> authUserList) {
        this.authUserList = authUserList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BaseLocalidad)) {
            return false;
        }
        BaseLocalidad other = (BaseLocalidad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fttg.smartt.entities.BaseLocalidad[ id=" + id + " ]";
    }
    
}
