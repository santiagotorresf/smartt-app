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
@Table(name = "base_cooperativa")
@NamedQueries({
    @NamedQuery(name = "BaseCooperativa.findAll", query = "SELECT b FROM BaseCooperativa b"),
    @NamedQuery(name = "BaseCooperativa.findById", query = "SELECT b FROM BaseCooperativa b WHERE b.id = :id"),
    @NamedQuery(name = "BaseCooperativa.findByCreacion", query = "SELECT b FROM BaseCooperativa b WHERE b.creacion = :creacion"),
    @NamedQuery(name = "BaseCooperativa.findByActualizacion", query = "SELECT b FROM BaseCooperativa b WHERE b.actualizacion = :actualizacion"),
    @NamedQuery(name = "BaseCooperativa.findByIsActive", query = "SELECT b FROM BaseCooperativa b WHERE b.isActive = :isActive"),
    @NamedQuery(name = "BaseCooperativa.findByIsEnable", query = "SELECT b FROM BaseCooperativa b WHERE b.isEnable = :isEnable"),
    @NamedQuery(name = "BaseCooperativa.findByEstablecimiento", query = "SELECT b FROM BaseCooperativa b WHERE b.establecimiento = :establecimiento"),
    @NamedQuery(name = "BaseCooperativa.findByRepresentanteLegal", query = "SELECT b FROM BaseCooperativa b WHERE b.representanteLegal = :representanteLegal"),
    @NamedQuery(name = "BaseCooperativa.findByRazonSocial", query = "SELECT b FROM BaseCooperativa b WHERE b.razonSocial = :razonSocial"),
    @NamedQuery(name = "BaseCooperativa.findByRuc", query = "SELECT b FROM BaseCooperativa b WHERE b.ruc = :ruc"),
    @NamedQuery(name = "BaseCooperativa.findByNombreComercial", query = "SELECT b FROM BaseCooperativa b WHERE b.nombreComercial = :nombreComercial"),
    @NamedQuery(name = "BaseCooperativa.findByDireccionMatriz", query = "SELECT b FROM BaseCooperativa b WHERE b.direccionMatriz = :direccionMatriz"),
    @NamedQuery(name = "BaseCooperativa.findByCorreo", query = "SELECT b FROM BaseCooperativa b WHERE b.correo = :correo"),
    @NamedQuery(name = "BaseCooperativa.findByObligadoContabilidad", query = "SELECT b FROM BaseCooperativa b WHERE b.obligadoContabilidad = :obligadoContabilidad"),
    @NamedQuery(name = "BaseCooperativa.findByContribuyenteEspecial", query = "SELECT b FROM BaseCooperativa b WHERE b.contribuyenteEspecial = :contribuyenteEspecial"),
    @NamedQuery(name = "BaseCooperativa.findByContribuyenteEspecialDetalle", query = "SELECT b FROM BaseCooperativa b WHERE b.contribuyenteEspecialDetalle = :contribuyenteEspecialDetalle"),
    @NamedQuery(name = "BaseCooperativa.findByFacturacionElectronicaApiKey", query = "SELECT b FROM BaseCooperativa b WHERE b.facturacionElectronicaApiKey = :facturacionElectronicaApiKey"),
    @NamedQuery(name = "BaseCooperativa.findByLogo", query = "SELECT b FROM BaseCooperativa b WHERE b.logo = :logo"),
    @NamedQuery(name = "BaseCooperativa.findByEmisionFacturacion", query = "SELECT b FROM BaseCooperativa b WHERE b.emisionFacturacion = :emisionFacturacion"),
    @NamedQuery(name = "BaseCooperativa.findByAmbiente", query = "SELECT b FROM BaseCooperativa b WHERE b.ambiente = :ambiente"),
    @NamedQuery(name = "BaseCooperativa.findByTelefono", query = "SELECT b FROM BaseCooperativa b WHERE b.telefono = :telefono"),
    @NamedQuery(name = "BaseCooperativa.findByLeyendaRide", query = "SELECT b FROM BaseCooperativa b WHERE b.leyendaRide = :leyendaRide"),
    @NamedQuery(name = "BaseCooperativa.findByNombre", query = "SELECT b FROM BaseCooperativa b WHERE b.nombre = :nombre"),
    @NamedQuery(name = "BaseCooperativa.findByVentanilla", query = "SELECT b FROM BaseCooperativa b WHERE b.ventanilla = :ventanilla"),
    @NamedQuery(name = "BaseCooperativa.findByAsumeTasa", query = "SELECT b FROM BaseCooperativa b WHERE b.asumeTasa = :asumeTasa"),
    @NamedQuery(name = "BaseCooperativa.findByPuedeAnular", query = "SELECT b FROM BaseCooperativa b WHERE b.puedeAnular = :puedeAnular"),
    @NamedQuery(name = "BaseCooperativa.findByUsaApi", query = "SELECT b FROM BaseCooperativa b WHERE b.usaApi = :usaApi"),
    @NamedQuery(name = "BaseCooperativa.findBySistemaExterno", query = "SELECT b FROM BaseCooperativa b WHERE b.sistemaExterno = :sistemaExterno"),
    @NamedQuery(name = "BaseCooperativa.findByTiempoGracia", query = "SELECT b FROM BaseCooperativa b WHERE b.tiempoGracia = :tiempoGracia"),
    @NamedQuery(name = "BaseCooperativa.findByOmitirPasajeros", query = "SELECT b FROM BaseCooperativa b WHERE b.omitirPasajeros = :omitirPasajeros"),
    @NamedQuery(name = "BaseCooperativa.findByCortesiasPorViaje", query = "SELECT b FROM BaseCooperativa b WHERE b.cortesiasPorViaje = :cortesiasPorViaje"),
    @NamedQuery(name = "BaseCooperativa.findByExternalId", query = "SELECT b FROM BaseCooperativa b WHERE b.externalId = :externalId"),
    @NamedQuery(name = "BaseCooperativa.findBySincronizado", query = "SELECT b FROM BaseCooperativa b WHERE b.sincronizado = :sincronizado"),
    @NamedQuery(name = "BaseCooperativa.findByHabilitarDjsequence", query = "SELECT b FROM BaseCooperativa b WHERE b.habilitarDjsequence = :habilitarDjsequence"),
    @NamedQuery(name = "BaseCooperativa.findByValidarTarifa", query = "SELECT b FROM BaseCooperativa b WHERE b.validarTarifa = :validarTarifa"),
    @NamedQuery(name = "BaseCooperativa.findByAuthorizationCallback", query = "SELECT b FROM BaseCooperativa b WHERE b.authorizationCallback = :authorizationCallback"),
    @NamedQuery(name = "BaseCooperativa.findByUrlCallback", query = "SELECT b FROM BaseCooperativa b WHERE b.urlCallback = :urlCallback"),
    @NamedQuery(name = "BaseCooperativa.findByEnviarTasa", query = "SELECT b FROM BaseCooperativa b WHERE b.enviarTasa = :enviarTasa"),
    @NamedQuery(name = "BaseCooperativa.findByMoverBoletosViaje", query = "SELECT b FROM BaseCooperativa b WHERE b.moverBoletosViaje = :moverBoletosViaje")})
public class BaseCooperativa implements Serializable {

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
    @Column(name = "ventanilla")
    private String ventanilla;
    @Basic(optional = false)
    @Column(name = "asume_tasa")
    private boolean asumeTasa;
    @Basic(optional = false)
    @Column(name = "puede_anular")
    private boolean puedeAnular;
    @Basic(optional = false)
    @Column(name = "usa_api")
    private boolean usaApi;
    @Basic(optional = false)
    @Column(name = "sistema_externo")
    private String sistemaExterno;
    @Basic(optional = false)
    @Column(name = "tiempo_gracia")
    private short tiempoGracia;
    @Basic(optional = false)
    @Column(name = "omitir_pasajeros")
    private boolean omitirPasajeros;
    @Basic(optional = false)
    @Column(name = "cortesias_por_viaje")
    private short cortesiasPorViaje;
    @Column(name = "external_id")
    private Integer externalId;
    @Basic(optional = false)
    @Column(name = "sincronizado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sincronizado;
    @Basic(optional = false)
    @Column(name = "habilitar_djsequence")
    private boolean habilitarDjsequence;
    @Basic(optional = false)
    @Column(name = "validar_tarifa")
    private boolean validarTarifa;
    @Column(name = "authorization_callback")
    private String authorizationCallback;
    @Column(name = "url_callback")
    private String urlCallback;
    @Basic(optional = false)
    @Column(name = "enviar_tasa")
    private boolean enviarTasa;
    @Basic(optional = false)
    @Column(name = "mover_boletos_viaje")
    private boolean moverBoletosViaje;
    @JoinColumn(name = "usuario_actualizacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioActualizacionId;
    @JoinColumn(name = "usuario_creacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioCreacionId;
    @JoinColumn(name = "gremio_id", referencedColumnName = "id")
    @ManyToOne
    private BaseGremio gremioId;
    @JoinColumn(name = "tipo_id", referencedColumnName = "id")
    @ManyToOne
    private BaseTipocooperativa tipoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cooperativaId")
    private List<BaseConductor> baseConductorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cooperativaId")
    private List<BaseBus> baseBusList;

    public BaseCooperativa() {
    }

    public BaseCooperativa(Integer id) {
        this.id = id;
    }

    public BaseCooperativa(Integer id, Date creacion, Date actualizacion, boolean isActive, boolean isEnable, boolean obligadoContabilidad, boolean contribuyenteEspecial, String emisionFacturacion, String ambiente, String nombre, boolean asumeTasa, boolean puedeAnular, boolean usaApi, String sistemaExterno, short tiempoGracia, boolean omitirPasajeros, short cortesiasPorViaje, Date sincronizado, boolean habilitarDjsequence, boolean validarTarifa, boolean enviarTasa, boolean moverBoletosViaje) {
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
        this.asumeTasa = asumeTasa;
        this.puedeAnular = puedeAnular;
        this.usaApi = usaApi;
        this.sistemaExterno = sistemaExterno;
        this.tiempoGracia = tiempoGracia;
        this.omitirPasajeros = omitirPasajeros;
        this.cortesiasPorViaje = cortesiasPorViaje;
        this.sincronizado = sincronizado;
        this.habilitarDjsequence = habilitarDjsequence;
        this.validarTarifa = validarTarifa;
        this.enviarTasa = enviarTasa;
        this.moverBoletosViaje = moverBoletosViaje;
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

    public String getVentanilla() {
        return ventanilla;
    }

    public void setVentanilla(String ventanilla) {
        this.ventanilla = ventanilla;
    }

    public boolean getAsumeTasa() {
        return asumeTasa;
    }

    public void setAsumeTasa(boolean asumeTasa) {
        this.asumeTasa = asumeTasa;
    }

    public boolean getPuedeAnular() {
        return puedeAnular;
    }

    public void setPuedeAnular(boolean puedeAnular) {
        this.puedeAnular = puedeAnular;
    }

    public boolean getUsaApi() {
        return usaApi;
    }

    public void setUsaApi(boolean usaApi) {
        this.usaApi = usaApi;
    }

    public String getSistemaExterno() {
        return sistemaExterno;
    }

    public void setSistemaExterno(String sistemaExterno) {
        this.sistemaExterno = sistemaExterno;
    }

    public short getTiempoGracia() {
        return tiempoGracia;
    }

    public void setTiempoGracia(short tiempoGracia) {
        this.tiempoGracia = tiempoGracia;
    }

    public boolean getOmitirPasajeros() {
        return omitirPasajeros;
    }

    public void setOmitirPasajeros(boolean omitirPasajeros) {
        this.omitirPasajeros = omitirPasajeros;
    }

    public short getCortesiasPorViaje() {
        return cortesiasPorViaje;
    }

    public void setCortesiasPorViaje(short cortesiasPorViaje) {
        this.cortesiasPorViaje = cortesiasPorViaje;
    }

    public Integer getExternalId() {
        return externalId;
    }

    public void setExternalId(Integer externalId) {
        this.externalId = externalId;
    }

    public Date getSincronizado() {
        return sincronizado;
    }

    public void setSincronizado(Date sincronizado) {
        this.sincronizado = sincronizado;
    }

    public boolean getHabilitarDjsequence() {
        return habilitarDjsequence;
    }

    public void setHabilitarDjsequence(boolean habilitarDjsequence) {
        this.habilitarDjsequence = habilitarDjsequence;
    }

    public boolean getValidarTarifa() {
        return validarTarifa;
    }

    public void setValidarTarifa(boolean validarTarifa) {
        this.validarTarifa = validarTarifa;
    }

    public String getAuthorizationCallback() {
        return authorizationCallback;
    }

    public void setAuthorizationCallback(String authorizationCallback) {
        this.authorizationCallback = authorizationCallback;
    }

    public String getUrlCallback() {
        return urlCallback;
    }

    public void setUrlCallback(String urlCallback) {
        this.urlCallback = urlCallback;
    }

    public boolean getEnviarTasa() {
        return enviarTasa;
    }

    public void setEnviarTasa(boolean enviarTasa) {
        this.enviarTasa = enviarTasa;
    }

    public boolean getMoverBoletosViaje() {
        return moverBoletosViaje;
    }

    public void setMoverBoletosViaje(boolean moverBoletosViaje) {
        this.moverBoletosViaje = moverBoletosViaje;
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

    public BaseGremio getGremioId() {
        return gremioId;
    }

    public void setGremioId(BaseGremio gremioId) {
        this.gremioId = gremioId;
    }

    public BaseTipocooperativa getTipoId() {
        return tipoId;
    }

    public void setTipoId(BaseTipocooperativa tipoId) {
        this.tipoId = tipoId;
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
        if (!(object instanceof BaseCooperativa)) {
            return false;
        }
        BaseCooperativa other = (BaseCooperativa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fttg.smartt.entities.BaseCooperativa[ id=" + id + " ]";
    }
    
}
