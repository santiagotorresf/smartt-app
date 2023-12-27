/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.smartt.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "base_tipocliente")
@NamedQueries({
    @NamedQuery(name = "BaseTipocliente.findAll", query = "SELECT b FROM BaseTipocliente b"),
    @NamedQuery(name = "BaseTipocliente.findById", query = "SELECT b FROM BaseTipocliente b WHERE b.id = :id"),
    @NamedQuery(name = "BaseTipocliente.findByCreacion", query = "SELECT b FROM BaseTipocliente b WHERE b.creacion = :creacion"),
    @NamedQuery(name = "BaseTipocliente.findByActualizacion", query = "SELECT b FROM BaseTipocliente b WHERE b.actualizacion = :actualizacion"),
    @NamedQuery(name = "BaseTipocliente.findByIsActive", query = "SELECT b FROM BaseTipocliente b WHERE b.isActive = :isActive"),
    @NamedQuery(name = "BaseTipocliente.findByIsEnable", query = "SELECT b FROM BaseTipocliente b WHERE b.isEnable = :isEnable"),
    @NamedQuery(name = "BaseTipocliente.findByNombre", query = "SELECT b FROM BaseTipocliente b WHERE b.nombre = :nombre"),
    @NamedQuery(name = "BaseTipocliente.findByEspecial", query = "SELECT b FROM BaseTipocliente b WHERE b.especial = :especial"),
    @NamedQuery(name = "BaseTipocliente.findByValorTarifa", query = "SELECT b FROM BaseTipocliente b WHERE b.valorTarifa = :valorTarifa")})
public class BaseTipocliente implements Serializable {

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
    @Column(name = "especial")
    private boolean especial;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "valor_tarifa")
    private BigDecimal valorTarifa;
    @JoinColumn(name = "usuario_actualizacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioActualizacionId;
    @JoinColumn(name = "usuario_creacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioCreacionId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formatoClienteId")
    private List<BasePersona> basePersonaList;

    public BaseTipocliente() {
    }

    public BaseTipocliente(Integer id) {
        this.id = id;
    }

    public BaseTipocliente(Integer id, Date creacion, Date actualizacion, boolean isActive, boolean isEnable, String nombre, boolean especial, BigDecimal valorTarifa) {
        this.id = id;
        this.creacion = creacion;
        this.actualizacion = actualizacion;
        this.isActive = isActive;
        this.isEnable = isEnable;
        this.nombre = nombre;
        this.especial = especial;
        this.valorTarifa = valorTarifa;
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

    public boolean getEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public BigDecimal getValorTarifa() {
        return valorTarifa;
    }

    public void setValorTarifa(BigDecimal valorTarifa) {
        this.valorTarifa = valorTarifa;
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

    public List<BasePersona> getBasePersonaList() {
        return basePersonaList;
    }

    public void setBasePersonaList(List<BasePersona> basePersonaList) {
        this.basePersonaList = basePersonaList;
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
        if (!(object instanceof BaseTipocliente)) {
            return false;
        }
        BaseTipocliente other = (BaseTipocliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fttg.smartt.entities.BaseTipocliente[ id=" + id + " ]";
    }
    
}
