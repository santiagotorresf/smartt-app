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
@Table(name = "auth_user")
@NamedQueries({
    @NamedQuery(name = "AuthUser.findAll", query = "SELECT a FROM AuthUser a"),
    @NamedQuery(name = "AuthUser.findById", query = "SELECT a FROM AuthUser a WHERE a.id = :id"),
    @NamedQuery(name = "AuthUser.findByPassword", query = "SELECT a FROM AuthUser a WHERE a.password = :password"),
    @NamedQuery(name = "AuthUser.findByLastLogin", query = "SELECT a FROM AuthUser a WHERE a.lastLogin = :lastLogin"),
    @NamedQuery(name = "AuthUser.findByIsSuperuser", query = "SELECT a FROM AuthUser a WHERE a.isSuperuser = :isSuperuser"),
    @NamedQuery(name = "AuthUser.findByUsername", query = "SELECT a FROM AuthUser a WHERE a.username = :username"),
    @NamedQuery(name = "AuthUser.findByFirstName", query = "SELECT a FROM AuthUser a WHERE a.firstName = :firstName"),
    @NamedQuery(name = "AuthUser.findByLastName", query = "SELECT a FROM AuthUser a WHERE a.lastName = :lastName"),
    @NamedQuery(name = "AuthUser.findByEmail", query = "SELECT a FROM AuthUser a WHERE a.email = :email"),
    @NamedQuery(name = "AuthUser.findByIsStaff", query = "SELECT a FROM AuthUser a WHERE a.isStaff = :isStaff"),
    @NamedQuery(name = "AuthUser.findByIsActive", query = "SELECT a FROM AuthUser a WHERE a.isActive = :isActive"),
    @NamedQuery(name = "AuthUser.findByDateJoined", query = "SELECT a FROM AuthUser a WHERE a.dateJoined = :dateJoined"),
    @NamedQuery(name = "AuthUser.findByCreacion", query = "SELECT a FROM AuthUser a WHERE a.creacion = :creacion"),
    @NamedQuery(name = "AuthUser.findByActualizacion", query = "SELECT a FROM AuthUser a WHERE a.actualizacion = :actualizacion"),
    @NamedQuery(name = "AuthUser.findByIsEnable", query = "SELECT a FROM AuthUser a WHERE a.isEnable = :isEnable"),
    @NamedQuery(name = "AuthUser.findByTipo", query = "SELECT a FROM AuthUser a WHERE a.tipo = :tipo"),
    @NamedQuery(name = "AuthUser.findByDocumentacion", query = "SELECT a FROM AuthUser a WHERE a.documentacion = :documentacion")})
public class AuthUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Column(name = "last_login")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
    @Basic(optional = false)
    @Column(name = "is_superuser")
    private boolean isSuperuser;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "is_staff")
    private boolean isStaff;
    @Basic(optional = false)
    @Column(name = "is_active")
    private boolean isActive;
    @Basic(optional = false)
    @Column(name = "date_joined")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateJoined;
    @Basic(optional = false)
    @Column(name = "creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creacion;
    @Basic(optional = false)
    @Column(name = "actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizacion;
    @Basic(optional = false)
    @Column(name = "is_enable")
    private boolean isEnable;
    @Basic(optional = false)
    @Column(name = "tipo")
    private short tipo;
    @Column(name = "documentacion")
    private String documentacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioActualizacionId")
    private List<BaseTipocliente> baseTipoclienteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCreacionId")
    private List<BaseTipocliente> baseTipoclienteList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioActualizacionId")
    private List<BaseCooperativa> baseCooperativaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCreacionId")
    private List<BaseCooperativa> baseCooperativaList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioActualizacionId")
    private List<BaseProvincia> baseProvinciaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCreacionId")
    private List<BaseProvincia> baseProvinciaList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioActualizacionId")
    private List<BaseBustipo> baseBustipoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCreacionId")
    private List<BaseBustipo> baseBustipoList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioActualizacionId")
    private List<BasePais> basePaisList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCreacionId")
    private List<BasePais> basePaisList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioActualizacionId")
    private List<BaseLocalidad> baseLocalidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCreacionId")
    private List<BaseLocalidad> baseLocalidadList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioActualizacionId")
    private List<BaseTiposervicio> baseTiposervicioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCreacionId")
    private List<BaseTiposervicio> baseTiposervicioList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioActualizacionId")
    private List<BaseCiudad> baseCiudadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCreacionId")
    private List<BaseCiudad> baseCiudadList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioActualizacionId")
    private List<AuthUser> authUserList;
    @JoinColumn(name = "usuario_actualizacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioActualizacionId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCreacionId")
    private List<AuthUser> authUserList1;
    @JoinColumn(name = "usuario_creacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioCreacionId;
    @JoinColumn(name = "localidad_id", referencedColumnName = "id")
    @ManyToOne
    private BaseLocalidad localidadId;
    @JoinColumn(name = "persona_id", referencedColumnName = "id")
    @ManyToOne
    private BasePersona personaId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioActualizacionId")
    private List<BaseTipocooperativa> baseTipocooperativaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCreacionId")
    private List<BaseTipocooperativa> baseTipocooperativaList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioActualizacionId")
    private List<BasePersona> basePersonaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCreacionId")
    private List<BasePersona> basePersonaList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioActualizacionId")
    private List<BaseConductor> baseConductorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCreacionId")
    private List<BaseConductor> baseConductorList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioActualizacionId")
    private List<BaseGremio> baseGremioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCreacionId")
    private List<BaseGremio> baseGremioList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioActualizacionId")
    private List<BaseBus> baseBusList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCreacionId")
    private List<BaseBus> baseBusList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioActualizacionId")
    private List<BaseMarca> baseMarcaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCreacionId")
    private List<BaseMarca> baseMarcaList1;

    public AuthUser() {
    }

    public AuthUser(Integer id) {
        this.id = id;
    }

    public AuthUser(Integer id, String password, boolean isSuperuser, String username, String firstName, String lastName, String email, boolean isStaff, boolean isActive, Date dateJoined, Date creacion, Date actualizacion, boolean isEnable, short tipo) {
        this.id = id;
        this.password = password;
        this.isSuperuser = isSuperuser;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isStaff = isStaff;
        this.isActive = isActive;
        this.dateJoined = dateJoined;
        this.creacion = creacion;
        this.actualizacion = actualizacion;
        this.isEnable = isEnable;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public boolean getIsSuperuser() {
        return isSuperuser;
    }

    public void setIsSuperuser(boolean isSuperuser) {
        this.isSuperuser = isSuperuser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getIsStaff() {
        return isStaff;
    }

    public void setIsStaff(boolean isStaff) {
        this.isStaff = isStaff;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
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

    public boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(boolean isEnable) {
        this.isEnable = isEnable;
    }

    public short getTipo() {
        return tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }

    public String getDocumentacion() {
        return documentacion;
    }

    public void setDocumentacion(String documentacion) {
        this.documentacion = documentacion;
    }

    public List<BaseTipocliente> getBaseTipoclienteList() {
        return baseTipoclienteList;
    }

    public void setBaseTipoclienteList(List<BaseTipocliente> baseTipoclienteList) {
        this.baseTipoclienteList = baseTipoclienteList;
    }

    public List<BaseTipocliente> getBaseTipoclienteList1() {
        return baseTipoclienteList1;
    }

    public void setBaseTipoclienteList1(List<BaseTipocliente> baseTipoclienteList1) {
        this.baseTipoclienteList1 = baseTipoclienteList1;
    }

    public List<BaseCooperativa> getBaseCooperativaList() {
        return baseCooperativaList;
    }

    public void setBaseCooperativaList(List<BaseCooperativa> baseCooperativaList) {
        this.baseCooperativaList = baseCooperativaList;
    }

    public List<BaseCooperativa> getBaseCooperativaList1() {
        return baseCooperativaList1;
    }

    public void setBaseCooperativaList1(List<BaseCooperativa> baseCooperativaList1) {
        this.baseCooperativaList1 = baseCooperativaList1;
    }

    public List<BaseProvincia> getBaseProvinciaList() {
        return baseProvinciaList;
    }

    public void setBaseProvinciaList(List<BaseProvincia> baseProvinciaList) {
        this.baseProvinciaList = baseProvinciaList;
    }

    public List<BaseProvincia> getBaseProvinciaList1() {
        return baseProvinciaList1;
    }

    public void setBaseProvinciaList1(List<BaseProvincia> baseProvinciaList1) {
        this.baseProvinciaList1 = baseProvinciaList1;
    }

    public List<BaseBustipo> getBaseBustipoList() {
        return baseBustipoList;
    }

    public void setBaseBustipoList(List<BaseBustipo> baseBustipoList) {
        this.baseBustipoList = baseBustipoList;
    }

    public List<BaseBustipo> getBaseBustipoList1() {
        return baseBustipoList1;
    }

    public void setBaseBustipoList1(List<BaseBustipo> baseBustipoList1) {
        this.baseBustipoList1 = baseBustipoList1;
    }

    public List<BasePais> getBasePaisList() {
        return basePaisList;
    }

    public void setBasePaisList(List<BasePais> basePaisList) {
        this.basePaisList = basePaisList;
    }

    public List<BasePais> getBasePaisList1() {
        return basePaisList1;
    }

    public void setBasePaisList1(List<BasePais> basePaisList1) {
        this.basePaisList1 = basePaisList1;
    }

    public List<BaseLocalidad> getBaseLocalidadList() {
        return baseLocalidadList;
    }

    public void setBaseLocalidadList(List<BaseLocalidad> baseLocalidadList) {
        this.baseLocalidadList = baseLocalidadList;
    }

    public List<BaseLocalidad> getBaseLocalidadList1() {
        return baseLocalidadList1;
    }

    public void setBaseLocalidadList1(List<BaseLocalidad> baseLocalidadList1) {
        this.baseLocalidadList1 = baseLocalidadList1;
    }

    public List<BaseTiposervicio> getBaseTiposervicioList() {
        return baseTiposervicioList;
    }

    public void setBaseTiposervicioList(List<BaseTiposervicio> baseTiposervicioList) {
        this.baseTiposervicioList = baseTiposervicioList;
    }

    public List<BaseTiposervicio> getBaseTiposervicioList1() {
        return baseTiposervicioList1;
    }

    public void setBaseTiposervicioList1(List<BaseTiposervicio> baseTiposervicioList1) {
        this.baseTiposervicioList1 = baseTiposervicioList1;
    }

    public List<BaseCiudad> getBaseCiudadList() {
        return baseCiudadList;
    }

    public void setBaseCiudadList(List<BaseCiudad> baseCiudadList) {
        this.baseCiudadList = baseCiudadList;
    }

    public List<BaseCiudad> getBaseCiudadList1() {
        return baseCiudadList1;
    }

    public void setBaseCiudadList1(List<BaseCiudad> baseCiudadList1) {
        this.baseCiudadList1 = baseCiudadList1;
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

    public List<AuthUser> getAuthUserList1() {
        return authUserList1;
    }

    public void setAuthUserList1(List<AuthUser> authUserList1) {
        this.authUserList1 = authUserList1;
    }

    public AuthUser getUsuarioCreacionId() {
        return usuarioCreacionId;
    }

    public void setUsuarioCreacionId(AuthUser usuarioCreacionId) {
        this.usuarioCreacionId = usuarioCreacionId;
    }

    public BaseLocalidad getLocalidadId() {
        return localidadId;
    }

    public void setLocalidadId(BaseLocalidad localidadId) {
        this.localidadId = localidadId;
    }

    public BasePersona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(BasePersona personaId) {
        this.personaId = personaId;
    }

    public List<BaseTipocooperativa> getBaseTipocooperativaList() {
        return baseTipocooperativaList;
    }

    public void setBaseTipocooperativaList(List<BaseTipocooperativa> baseTipocooperativaList) {
        this.baseTipocooperativaList = baseTipocooperativaList;
    }

    public List<BaseTipocooperativa> getBaseTipocooperativaList1() {
        return baseTipocooperativaList1;
    }

    public void setBaseTipocooperativaList1(List<BaseTipocooperativa> baseTipocooperativaList1) {
        this.baseTipocooperativaList1 = baseTipocooperativaList1;
    }

    public List<BasePersona> getBasePersonaList() {
        return basePersonaList;
    }

    public void setBasePersonaList(List<BasePersona> basePersonaList) {
        this.basePersonaList = basePersonaList;
    }

    public List<BasePersona> getBasePersonaList1() {
        return basePersonaList1;
    }

    public void setBasePersonaList1(List<BasePersona> basePersonaList1) {
        this.basePersonaList1 = basePersonaList1;
    }

    public List<BaseConductor> getBaseConductorList() {
        return baseConductorList;
    }

    public void setBaseConductorList(List<BaseConductor> baseConductorList) {
        this.baseConductorList = baseConductorList;
    }

    public List<BaseConductor> getBaseConductorList1() {
        return baseConductorList1;
    }

    public void setBaseConductorList1(List<BaseConductor> baseConductorList1) {
        this.baseConductorList1 = baseConductorList1;
    }

    public List<BaseGremio> getBaseGremioList() {
        return baseGremioList;
    }

    public void setBaseGremioList(List<BaseGremio> baseGremioList) {
        this.baseGremioList = baseGremioList;
    }

    public List<BaseGremio> getBaseGremioList1() {
        return baseGremioList1;
    }

    public void setBaseGremioList1(List<BaseGremio> baseGremioList1) {
        this.baseGremioList1 = baseGremioList1;
    }

    public List<BaseBus> getBaseBusList() {
        return baseBusList;
    }

    public void setBaseBusList(List<BaseBus> baseBusList) {
        this.baseBusList = baseBusList;
    }

    public List<BaseBus> getBaseBusList1() {
        return baseBusList1;
    }

    public void setBaseBusList1(List<BaseBus> baseBusList1) {
        this.baseBusList1 = baseBusList1;
    }

    public List<BaseMarca> getBaseMarcaList() {
        return baseMarcaList;
    }

    public void setBaseMarcaList(List<BaseMarca> baseMarcaList) {
        this.baseMarcaList = baseMarcaList;
    }

    public List<BaseMarca> getBaseMarcaList1() {
        return baseMarcaList1;
    }

    public void setBaseMarcaList1(List<BaseMarca> baseMarcaList1) {
        this.baseMarcaList1 = baseMarcaList1;
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
        if (!(object instanceof AuthUser)) {
            return false;
        }
        AuthUser other = (AuthUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fttg.smartt.entities.AuthUser[ id=" + id + " ]";
    }
    
}
