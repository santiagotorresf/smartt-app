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
@Table(name = "base_persona")
@NamedQueries({
    @NamedQuery(name = "BasePersona.findAll", query = "SELECT b FROM BasePersona b"),
    @NamedQuery(name = "BasePersona.findById", query = "SELECT b FROM BasePersona b WHERE b.id = :id"),
    @NamedQuery(name = "BasePersona.findByCreacion", query = "SELECT b FROM BasePersona b WHERE b.creacion = :creacion"),
    @NamedQuery(name = "BasePersona.findByActualizacion", query = "SELECT b FROM BasePersona b WHERE b.actualizacion = :actualizacion"),
    @NamedQuery(name = "BasePersona.findByIsActive", query = "SELECT b FROM BasePersona b WHERE b.isActive = :isActive"),
    @NamedQuery(name = "BasePersona.findByIsEnable", query = "SELECT b FROM BasePersona b WHERE b.isEnable = :isEnable"),
    @NamedQuery(name = "BasePersona.findByTipoCliente", query = "SELECT b FROM BasePersona b WHERE b.tipoCliente = :tipoCliente"),
    @NamedQuery(name = "BasePersona.findByIdentificacion", query = "SELECT b FROM BasePersona b WHERE b.identificacion = :identificacion"),
    @NamedQuery(name = "BasePersona.findByNombre", query = "SELECT b FROM BasePersona b WHERE b.nombre = :nombre"),
    @NamedQuery(name = "BasePersona.findByCorreo", query = "SELECT b FROM BasePersona b WHERE b.correo = :correo"),
    @NamedQuery(name = "BasePersona.findByTelefono", query = "SELECT b FROM BasePersona b WHERE b.telefono = :telefono"),
    @NamedQuery(name = "BasePersona.findByDireccion", query = "SELECT b FROM BasePersona b WHERE b.direccion = :direccion"),
    @NamedQuery(name = "BasePersona.findByExtranjero", query = "SELECT b FROM BasePersona b WHERE b.extranjero = :extranjero"),
    @NamedQuery(name = "BasePersona.findByFechaNacimiento", query = "SELECT b FROM BasePersona b WHERE b.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "BasePersona.findByAceptoTerminos", query = "SELECT b FROM BasePersona b WHERE b.aceptoTerminos = :aceptoTerminos")})
public class BasePersona implements Serializable {

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
    @Column(name = "tipo_cliente")
    private String tipoCliente;
    @Basic(optional = false)
    @Column(name = "identificacion")
    private String identificacion;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo")
    private String correo;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "extranjero")
    private boolean extranjero;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @Column(name = "acepto_terminos")
    private boolean aceptoTerminos;
    @OneToMany(mappedBy = "personaId")
    private List<AuthUser> authUserList;
    @JoinColumn(name = "usuario_actualizacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioActualizacionId;
    @JoinColumn(name = "usuario_creacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioCreacionId;
    @JoinColumn(name = "formato_cliente_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BaseTipocliente formatoClienteId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personaId")
    private List<BaseConductor> baseConductorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propietarioId")
    private List<BaseBus> baseBusList;

    public BasePersona() {
    }

    public BasePersona(Integer id) {
        this.id = id;
    }

    public BasePersona(Integer id, Date creacion, Date actualizacion, boolean isActive, boolean isEnable, String tipoCliente, String identificacion, String nombre, boolean extranjero, boolean aceptoTerminos) {
        this.id = id;
        this.creacion = creacion;
        this.actualizacion = actualizacion;
        this.isActive = isActive;
        this.isEnable = isEnable;
        this.tipoCliente = tipoCliente;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.extranjero = extranjero;
        this.aceptoTerminos = aceptoTerminos;
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

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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

    public boolean getExtranjero() {
        return extranjero;
    }

    public void setExtranjero(boolean extranjero) {
        this.extranjero = extranjero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean getAceptoTerminos() {
        return aceptoTerminos;
    }

    public void setAceptoTerminos(boolean aceptoTerminos) {
        this.aceptoTerminos = aceptoTerminos;
    }

    public List<AuthUser> getAuthUserList() {
        return authUserList;
    }

    public void setAuthUserList(List<AuthUser> authUserList) {
        this.authUserList = authUserList;
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

    public BaseTipocliente getFormatoClienteId() {
        return formatoClienteId;
    }

    public void setFormatoClienteId(BaseTipocliente formatoClienteId) {
        this.formatoClienteId = formatoClienteId;
    }

    public List<BaseConductor> getBaseConductorList() {
        return baseConductorList;
    }

    public void setBaseConductorList(List<BaseConductor> baseConductorList) {
        this.baseConductorList = baseConductorList;
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
        if (!(object instanceof BasePersona)) {
            return false;
        }
        BasePersona other = (BasePersona) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fttg.smartt.entities.BasePersona[ id=" + id + " ]";
    }
    
}
