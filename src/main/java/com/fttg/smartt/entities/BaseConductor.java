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
@Table(name = "base_conductor")
@NamedQueries({
    @NamedQuery(name = "BaseConductor.findAll", query = "SELECT b FROM BaseConductor b"),
    @NamedQuery(name = "BaseConductor.findById", query = "SELECT b FROM BaseConductor b WHERE b.id = :id"),
    @NamedQuery(name = "BaseConductor.findByCreacion", query = "SELECT b FROM BaseConductor b WHERE b.creacion = :creacion"),
    @NamedQuery(name = "BaseConductor.findByActualizacion", query = "SELECT b FROM BaseConductor b WHERE b.actualizacion = :actualizacion"),
    @NamedQuery(name = "BaseConductor.findByIsActive", query = "SELECT b FROM BaseConductor b WHERE b.isActive = :isActive"),
    @NamedQuery(name = "BaseConductor.findByIsEnable", query = "SELECT b FROM BaseConductor b WHERE b.isEnable = :isEnable"),
    @NamedQuery(name = "BaseConductor.findByEstado", query = "SELECT b FROM BaseConductor b WHERE b.estado = :estado"),
    @NamedQuery(name = "BaseConductor.findByTipo", query = "SELECT b FROM BaseConductor b WHERE b.tipo = :tipo"),
    @NamedQuery(name = "BaseConductor.findByDocumentacion", query = "SELECT b FROM BaseConductor b WHERE b.documentacion = :documentacion"),
    @NamedQuery(name = "BaseConductor.findByFechaEmisionLicencia", query = "SELECT b FROM BaseConductor b WHERE b.fechaEmisionLicencia = :fechaEmisionLicencia"),
    @NamedQuery(name = "BaseConductor.findByFechaVencimientoLicencia", query = "SELECT b FROM BaseConductor b WHERE b.fechaVencimientoLicencia = :fechaVencimientoLicencia"),
    @NamedQuery(name = "BaseConductor.findByPuntos", query = "SELECT b FROM BaseConductor b WHERE b.puntos = :puntos")})
public class BaseConductor implements Serializable {

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
    @Column(name = "estado")
    private int estado;
    @Basic(optional = false)
    @Column(name = "tipo")
    private int tipo;
    @Column(name = "documentacion")
    private String documentacion;
    @Column(name = "fecha_emision_licencia")
    @Temporal(TemporalType.DATE)
    private Date fechaEmisionLicencia;
    @Column(name = "fecha_vencimiento_licencia")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimientoLicencia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "puntos")
    private BigDecimal puntos;
    @JoinColumn(name = "usuario_actualizacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioActualizacionId;
    @JoinColumn(name = "usuario_creacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioCreacionId;
    @JoinColumn(name = "cooperativa_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BaseCooperativa cooperativaId;
    @JoinColumn(name = "persona_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BasePersona personaId;
    @OneToMany(mappedBy = "conductorId")
    private List<BaseBus> baseBusList;

    public BaseConductor() {
    }

    public BaseConductor(Integer id) {
        this.id = id;
    }

    public BaseConductor(Integer id, Date creacion, Date actualizacion, boolean isActive, boolean isEnable, int estado, int tipo, BigDecimal puntos) {
        this.id = id;
        this.creacion = creacion;
        this.actualizacion = actualizacion;
        this.isActive = isActive;
        this.isEnable = isEnable;
        this.estado = estado;
        this.tipo = tipo;
        this.puntos = puntos;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDocumentacion() {
        return documentacion;
    }

    public void setDocumentacion(String documentacion) {
        this.documentacion = documentacion;
    }

    public Date getFechaEmisionLicencia() {
        return fechaEmisionLicencia;
    }

    public void setFechaEmisionLicencia(Date fechaEmisionLicencia) {
        this.fechaEmisionLicencia = fechaEmisionLicencia;
    }

    public Date getFechaVencimientoLicencia() {
        return fechaVencimientoLicencia;
    }

    public void setFechaVencimientoLicencia(Date fechaVencimientoLicencia) {
        this.fechaVencimientoLicencia = fechaVencimientoLicencia;
    }

    public BigDecimal getPuntos() {
        return puntos;
    }

    public void setPuntos(BigDecimal puntos) {
        this.puntos = puntos;
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

    public BaseCooperativa getCooperativaId() {
        return cooperativaId;
    }

    public void setCooperativaId(BaseCooperativa cooperativaId) {
        this.cooperativaId = cooperativaId;
    }

    public BasePersona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(BasePersona personaId) {
        this.personaId = personaId;
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
        if (!(object instanceof BaseConductor)) {
            return false;
        }
        BaseConductor other = (BaseConductor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fttg.smartt.entities.BaseConductor[ id=" + id + " ]";
    }
    
}
