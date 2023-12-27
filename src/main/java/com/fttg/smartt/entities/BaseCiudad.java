/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.smartt.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "base_ciudad")
@NamedQueries({
    @NamedQuery(name = "BaseCiudad.findAll", query = "SELECT b FROM BaseCiudad b"),
    @NamedQuery(name = "BaseCiudad.findById", query = "SELECT b FROM BaseCiudad b WHERE b.id = :id"),
    @NamedQuery(name = "BaseCiudad.findByCreacion", query = "SELECT b FROM BaseCiudad b WHERE b.creacion = :creacion"),
    @NamedQuery(name = "BaseCiudad.findByActualizacion", query = "SELECT b FROM BaseCiudad b WHERE b.actualizacion = :actualizacion"),
    @NamedQuery(name = "BaseCiudad.findByIsActive", query = "SELECT b FROM BaseCiudad b WHERE b.isActive = :isActive"),
    @NamedQuery(name = "BaseCiudad.findByIsEnable", query = "SELECT b FROM BaseCiudad b WHERE b.isEnable = :isEnable"),
    @NamedQuery(name = "BaseCiudad.findByNombre", query = "SELECT b FROM BaseCiudad b WHERE b.nombre = :nombre")})
public class BaseCiudad implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciudadId")
    private List<BaseLocalidad> baseLocalidadList;
    @JoinColumn(name = "usuario_actualizacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioActualizacionId;
    @JoinColumn(name = "usuario_creacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioCreacionId;
    @JoinColumn(name = "provincia_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BaseProvincia provinciaId;

    public BaseCiudad() {
    }

    public BaseCiudad(Integer id) {
        this.id = id;
    }

    public BaseCiudad(Integer id, Date creacion, Date actualizacion, boolean isActive, boolean isEnable, String nombre) {
        this.id = id;
        this.creacion = creacion;
        this.actualizacion = actualizacion;
        this.isActive = isActive;
        this.isEnable = isEnable;
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<BaseLocalidad> getBaseLocalidadList() {
        return baseLocalidadList;
    }

    public void setBaseLocalidadList(List<BaseLocalidad> baseLocalidadList) {
        this.baseLocalidadList = baseLocalidadList;
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

    public BaseProvincia getProvinciaId() {
        return provinciaId;
    }

    public void setProvinciaId(BaseProvincia provinciaId) {
        this.provinciaId = provinciaId;
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
        if (!(object instanceof BaseCiudad)) {
            return false;
        }
        BaseCiudad other = (BaseCiudad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fttg.smartt.entities.BaseCiudad[ id=" + id + " ]";
    }
    
}
