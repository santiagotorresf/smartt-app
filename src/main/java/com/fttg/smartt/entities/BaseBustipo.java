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
@Table(name = "base_bustipo")
@NamedQueries({
    @NamedQuery(name = "BaseBustipo.findAll", query = "SELECT b FROM BaseBustipo b"),
    @NamedQuery(name = "BaseBustipo.findById", query = "SELECT b FROM BaseBustipo b WHERE b.id = :id"),
    @NamedQuery(name = "BaseBustipo.findByCreacion", query = "SELECT b FROM BaseBustipo b WHERE b.creacion = :creacion"),
    @NamedQuery(name = "BaseBustipo.findByActualizacion", query = "SELECT b FROM BaseBustipo b WHERE b.actualizacion = :actualizacion"),
    @NamedQuery(name = "BaseBustipo.findByIsActive", query = "SELECT b FROM BaseBustipo b WHERE b.isActive = :isActive"),
    @NamedQuery(name = "BaseBustipo.findByIsEnable", query = "SELECT b FROM BaseBustipo b WHERE b.isEnable = :isEnable"),
    @NamedQuery(name = "BaseBustipo.findByNombre", query = "SELECT b FROM BaseBustipo b WHERE b.nombre = :nombre"),
    @NamedQuery(name = "BaseBustipo.findByFilas", query = "SELECT b FROM BaseBustipo b WHERE b.filas = :filas"),
    @NamedQuery(name = "BaseBustipo.findByAsientosDesactivados", query = "SELECT b FROM BaseBustipo b WHERE b.asientosDesactivados = :asientosDesactivados")})
public class BaseBustipo implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "filas")
    private Serializable filas;
    @Basic(optional = false)
    @Column(name = "asientos_desactivados")
    private Serializable asientosDesactivados;
    @JoinColumn(name = "usuario_actualizacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioActualizacionId;
    @JoinColumn(name = "usuario_creacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioCreacionId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "busTipoId")
    private List<BaseBus> baseBusList;

    public BaseBustipo() {
    }

    public BaseBustipo(Integer id) {
        this.id = id;
    }

    public BaseBustipo(Integer id, Date creacion, Date actualizacion, boolean isActive, boolean isEnable, String nombre, Serializable filas, Serializable asientosDesactivados) {
        this.id = id;
        this.creacion = creacion;
        this.actualizacion = actualizacion;
        this.isActive = isActive;
        this.isEnable = isEnable;
        this.nombre = nombre;
        this.filas = filas;
        this.asientosDesactivados = asientosDesactivados;
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

    public Serializable getFilas() {
        return filas;
    }

    public void setFilas(Serializable filas) {
        this.filas = filas;
    }

    public Serializable getAsientosDesactivados() {
        return asientosDesactivados;
    }

    public void setAsientosDesactivados(Serializable asientosDesactivados) {
        this.asientosDesactivados = asientosDesactivados;
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

    public List<BaseBus> getBaseBusList() {
        return baseBusList;
    }

    public void setBaseBusList(List<BaseBus> baseBusList) {
        this.baseBusList = baseBusList;
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
        if (!(object instanceof BaseBustipo)) {
            return false;
        }
        BaseBustipo other = (BaseBustipo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fttg.smartt.entities.BaseBustipo[ id=" + id + " ]";
    }
    
}
