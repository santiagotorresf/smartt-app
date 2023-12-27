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
@Table(name = "base_tipocooperativa")
@NamedQueries({
    @NamedQuery(name = "BaseTipocooperativa.findAll", query = "SELECT b FROM BaseTipocooperativa b"),
    @NamedQuery(name = "BaseTipocooperativa.findById", query = "SELECT b FROM BaseTipocooperativa b WHERE b.id = :id"),
    @NamedQuery(name = "BaseTipocooperativa.findByCreacion", query = "SELECT b FROM BaseTipocooperativa b WHERE b.creacion = :creacion"),
    @NamedQuery(name = "BaseTipocooperativa.findByActualizacion", query = "SELECT b FROM BaseTipocooperativa b WHERE b.actualizacion = :actualizacion"),
    @NamedQuery(name = "BaseTipocooperativa.findByIsActive", query = "SELECT b FROM BaseTipocooperativa b WHERE b.isActive = :isActive"),
    @NamedQuery(name = "BaseTipocooperativa.findByIsEnable", query = "SELECT b FROM BaseTipocooperativa b WHERE b.isEnable = :isEnable"),
    @NamedQuery(name = "BaseTipocooperativa.findByNombre", query = "SELECT b FROM BaseTipocooperativa b WHERE b.nombre = :nombre")})
public class BaseTipocooperativa implements Serializable {

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
    @OneToMany(mappedBy = "tipoId")
    private List<BaseCooperativa> baseCooperativaList;
    @JoinColumn(name = "usuario_actualizacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioActualizacionId;
    @JoinColumn(name = "usuario_creacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioCreacionId;

    public BaseTipocooperativa() {
    }

    public BaseTipocooperativa(Integer id) {
        this.id = id;
    }

    public BaseTipocooperativa(Integer id, Date creacion, Date actualizacion, boolean isActive, boolean isEnable, String nombre) {
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

    public List<BaseCooperativa> getBaseCooperativaList() {
        return baseCooperativaList;
    }

    public void setBaseCooperativaList(List<BaseCooperativa> baseCooperativaList) {
        this.baseCooperativaList = baseCooperativaList;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BaseTipocooperativa)) {
            return false;
        }
        BaseTipocooperativa other = (BaseTipocooperativa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fttg.smartt.entities.BaseTipocooperativa[ id=" + id + " ]";
    }
    
}
