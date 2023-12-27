/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.smartt.entities;

import com.fttg.smartt.dtos.BaseBusCooperativaDiscoDto;
import com.fttg.smartt.dtos.BaseBusDto;
import com.fttg.smartt.dtos.BaseBusIdDto;
import com.fttg.smartt.dtos.BaseBusInactivoDto;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author storres
 */
@Entity
@Table(name = "base_bus")

@NamedNativeQuery(name = "BaseBus.findBusOwnerInformationByExternalId",
        query = " select bc.id as idCooperativa, bb.id as idUnidad, bp.identificacion as cedula, case when length(bp.identificacion) = 13 then bp.identificacion else bp.identificacion||'001' end as ruc, bp.nombre as nombre, case when bp.correo is null then 'NA' when bp.correo = '' then 'NA' else bp.correo end as correo, case when bp.telefono is null then 'NA' when bp.telefono = '' then 'NA' else bp.telefono end as telefono, case when bp.direccion is null then 'NA' when bp.direccion = '' then 'NA' else bp.direccion end as direccion, bc.nombre as cooperativa, bc.external_id as externalIdCooperativa, bb.external_id as externalIdBus, bb.placa as placa, bb.disco as disco, bm.nombre as marca, bb.anio_fabricacion as anio, regexp_replace(bbt.nombre, '[^0-9]', '', 'g') as capacidad from base_cooperativa bc inner join base_bus bb on bc.id = bb.cooperativa_id inner join base_persona bp on bp.id = bb.propietario_id inner join base_marca bm on bm.id = bb.marca_id left join base_bustipo bbt on bbt.id = bb.bus_tipo_id where bb.is_active is true and bb.external_id =?1",
        resultSetMapping = "Mapping.BaseBusDto")
@SqlResultSetMapping(name = "Mapping.BaseBusDto",
        classes = @ConstructorResult(targetClass = BaseBusDto.class,
                columns = {
                    @ColumnResult(name = "idCooperativa"),
                    @ColumnResult(name = "idUnidad"),
                    @ColumnResult(name = "cedula"),
                    @ColumnResult(name = "ruc"),
                    @ColumnResult(name = "nombre"),
                    @ColumnResult(name = "correo"),
                    @ColumnResult(name = "telefono"),
                    @ColumnResult(name = "direccion"),
                    @ColumnResult(name = "cooperativa"),
                    @ColumnResult(name = "externalIdCooperativa"),
                    @ColumnResult(name = "externalIdBus"),
                    @ColumnResult(name = "placa"),
                    @ColumnResult(name = "disco"),
                    @ColumnResult(name = "marca"),
                    @ColumnResult(name = "anio"),
                    @ColumnResult(name = "capacidad")}))

@NamedNativeQuery(name = "BaseBus.findBusCooperativaByDisco",
        query = " select bc.id as idCooperativa, bb.id as idUnidad, bp.identificacion as cedula, case when length(bp.identificacion) = 13 then bp.identificacion else bp.identificacion||'001' end as ruc, bp.nombre as nombre, case when bp.correo is null then 'NA' when bp.correo = '' then 'NA' else bp.correo end as correo, case when bp.telefono is null then 'NA' when bp.telefono = '' then 'NA' else bp.telefono end as telefono, case when bp.direccion is null then 'NA' when bp.direccion = '' then 'NA' else bp.direccion end as direccion, bc.nombre as cooperativa, bc.external_id as externalIdCooperativa, bb.external_id as externalIdBus, bb.placa as placa, bb.disco as disco, bm.nombre as marca, bb.anio_fabricacion as anio, regexp_replace(bbt.nombre, '[^0-9]', '', 'g') as capacidad from base_cooperativa bc inner join base_bus bb on bc.id = bb.cooperativa_id inner join base_persona bp on bp.id = bb.propietario_id inner join base_marca bm on bm.id = bb.marca_id left join base_bustipo bbt on bbt.id = bb.bus_tipo_id where bb.is_active is true and bc.external_id =?1 and bb.disco =?2 ",
        resultSetMapping = "Mapping.BaseBusCooperativaDiscoDto")
@SqlResultSetMapping(name = "Mapping.BaseBusCooperativaDiscoDto",
        classes = @ConstructorResult(targetClass = BaseBusCooperativaDiscoDto.class,
                columns = {
                    @ColumnResult(name = "idCooperativa"),
                    @ColumnResult(name = "idUnidad"),
                    @ColumnResult(name = "cedula"),
                    @ColumnResult(name = "ruc"),
                    @ColumnResult(name = "nombre"),
                    @ColumnResult(name = "correo"),
                    @ColumnResult(name = "telefono"),
                    @ColumnResult(name = "direccion"),
                    @ColumnResult(name = "cooperativa"),
                    @ColumnResult(name = "externalIdCooperativa"),
                    @ColumnResult(name = "externalIdBus"),
                    @ColumnResult(name = "placa"),
                    @ColumnResult(name = "disco"),
                    @ColumnResult(name = "marca"),
                    @ColumnResult(name = "anio"),
                    @ColumnResult(name = "capacidad")}))

@NamedNativeQuery(name = "BaseBus.findBusOwnerInformationByExternalIdInactivo",
        query = " select bc.id as idCooperativa, bb.id as idUnidad, bp.identificacion as cedula, case when length(bp.identificacion) = 13 then bp.identificacion else bp.identificacion||'001' end as ruc, bp.nombre as nombre, case when bp.correo is null then 'NA' when bp.correo = '' then 'NA' else bp.correo end as correo, case when bp.telefono is null then 'NA' when bp.telefono = '' then 'NA' else bp.telefono end as telefono, case when bp.direccion is null then 'NA' when bp.direccion = '' then 'NA' else bp.direccion end as direccion, bc.nombre as cooperativa, bc.external_id as externalIdCooperativa, bb.external_id as externalIdBus, bb.placa as placa, bb.disco as disco, bm.nombre as marca, bb.anio_fabricacion as anio, regexp_replace(bbt.nombre, '[^0-9]', '', 'g') as capacidad from base_cooperativa bc inner join base_bus bb on bc.id = bb.cooperativa_id inner join base_persona bp on bp.id = bb.propietario_id inner join base_marca bm on bm.id = bb.marca_id left join base_bustipo bbt on bbt.id = bb.bus_tipo_id where bb.is_active is false and bb.external_id =?1 order by bb.creacion desc limit 1 ",
        resultSetMapping = "Mapping.BaseBusInactivoDto")
@SqlResultSetMapping(name = "Mapping.BaseBusInactivoDto",
        classes = @ConstructorResult(targetClass = BaseBusInactivoDto.class,
                columns = {
                    @ColumnResult(name = "idCooperativa"),
                    @ColumnResult(name = "idUnidad"),
                    @ColumnResult(name = "cedula"),
                    @ColumnResult(name = "ruc"),
                    @ColumnResult(name = "nombre"),
                    @ColumnResult(name = "correo"),
                    @ColumnResult(name = "telefono"),
                    @ColumnResult(name = "direccion"),
                    @ColumnResult(name = "cooperativa"),
                    @ColumnResult(name = "externalIdCooperativa"),
                    @ColumnResult(name = "externalIdBus"),
                    @ColumnResult(name = "placa"),
                    @ColumnResult(name = "disco"),
                    @ColumnResult(name = "marca"),
                    @ColumnResult(name = "anio"),
                    @ColumnResult(name = "capacidad")}))

@NamedNativeQuery(name = "BaseBus.findBusById",
        query = " select bc.id as idCooperativa, bb.id as idUnidad, bp.identificacion as cedula, case when length(bp.identificacion) = 13 then bp.identificacion else bp.identificacion||'001' end as ruc, bp.nombre as nombre, case when bp.correo is null then 'NA' when bp.correo = '' then 'NA' else bp.correo end as correo, case when bp.telefono is null then 'NA' when bp.telefono = '' then 'NA' else bp.telefono end as telefono, case when bp.direccion is null then 'NA' when bp.direccion = '' then 'NA' else bp.direccion end as direccion, bc.nombre as cooperativa, bc.external_id as externalIdCooperativa, bb.external_id as externalIdBus, bb.placa as placa, bb.disco as disco, bm.nombre as marca, bb.anio_fabricacion as anio, regexp_replace(bbt.nombre, '[^0-9]', '', 'g') as capacidad from base_cooperativa bc inner join base_bus bb on bc.id = bb.cooperativa_id inner join base_persona bp on bp.id = bb.propietario_id inner join base_marca bm on bm.id = bb.marca_id left join base_bustipo bbt on bbt.id = bb.bus_tipo_id where bb.id =?1",
        resultSetMapping = "Mapping.BaseBusIdDto")
@SqlResultSetMapping(name = "Mapping.BaseBusIdDto",
        classes = @ConstructorResult(targetClass = BaseBusIdDto.class,
                columns = {
                    @ColumnResult(name = "idCooperativa"),
                    @ColumnResult(name = "idUnidad"),
                    @ColumnResult(name = "cedula"),
                    @ColumnResult(name = "ruc"),
                    @ColumnResult(name = "nombre"),
                    @ColumnResult(name = "correo"),
                    @ColumnResult(name = "telefono"),
                    @ColumnResult(name = "direccion"),
                    @ColumnResult(name = "cooperativa"),
                    @ColumnResult(name = "externalIdCooperativa"),
                    @ColumnResult(name = "externalIdBus"),
                    @ColumnResult(name = "placa"),
                    @ColumnResult(name = "disco"),
                    @ColumnResult(name = "marca"),
                    @ColumnResult(name = "anio"),
                    @ColumnResult(name = "capacidad")}))

public class BaseBus implements Serializable {

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
    @Column(name = "disco")
    private String disco;
    @Basic(optional = false)
    @Column(name = "anio_fabricacion")
    private int anioFabricacion;
    @Column(name = "placa")
    private String placa;
    @Column(name = "documentacion")
    private String documentacion;
    @Column(name = "fecha_emision_matricula")
    @Temporal(TemporalType.DATE)
    private Date fechaEmisionMatricula;
    @Column(name = "fecha_vencimiento_matricula")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimientoMatricula;
    @Column(name = "asientos_desactivados")
    private Serializable asientosDesactivados;
    @Column(name = "external_id")
    private Integer externalId;
    @Basic(optional = false)
    @Column(name = "saldo")
    private double saldo;
    @Basic(optional = false)
    @Column(name = "kit_seguro")
    private boolean kitSeguro;
    @Basic(optional = false)
    @Column(name = "sincronizado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sincronizado;
    @Basic(optional = false)
    @Column(name = "internacional")
    private boolean internacional;
    @Column(name = "fecha_emision_rtv")
    @Temporal(TemporalType.DATE)
    private Date fechaEmisionRtv;
    @Column(name = "saldo_inicializado_cero")
    private Boolean saldoInicializadoCero;
    @Column(name = "fecha_vencimiento_rtv")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimientoRtv;
    @Lob
    @Column(name = "ultimas_marcaciones")
    private Object ultimasMarcaciones;
    @Basic(optional = false)
    @Column(name = "num_vuelta")
    private short numVuelta;
    @Basic(optional = false)
    @Column(name = "valor_vuelta")
    private double valorVuelta;
    @Column(name = "fecha_revision")
    @Temporal(TemporalType.DATE)
    private Date fechaRevision;
    @JoinColumn(name = "usuario_actualizacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioActualizacionId;
    @JoinColumn(name = "usuario_creacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AuthUser usuarioCreacionId;
    @JoinColumn(name = "bus_tipo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BaseBustipo busTipoId;
    @JoinColumn(name = "conductor_id", referencedColumnName = "id")
    @ManyToOne
    private BaseConductor conductorId;
    @JoinColumn(name = "cooperativa_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BaseCooperativa cooperativaId;
    @JoinColumn(name = "marca_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BaseMarca marcaId;
    @JoinColumn(name = "propietario_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BasePersona propietarioId;
    @JoinColumn(name = "tipo_servicio_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BaseTiposervicio tipoServicioId;

    public BaseBus() {
    }

    public BaseBus(Integer id) {
        this.id = id;
    }

    public BaseBus(Integer id, Date creacion, Date actualizacion, boolean isActive, boolean isEnable, int anioFabricacion, double saldo, boolean kitSeguro, Date sincronizado, boolean internacional, short numVuelta, double valorVuelta) {
        this.id = id;
        this.creacion = creacion;
        this.actualizacion = actualizacion;
        this.isActive = isActive;
        this.isEnable = isEnable;
        this.anioFabricacion = anioFabricacion;
        this.saldo = saldo;
        this.kitSeguro = kitSeguro;
        this.sincronizado = sincronizado;
        this.internacional = internacional;
        this.numVuelta = numVuelta;
        this.valorVuelta = valorVuelta;
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

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDocumentacion() {
        return documentacion;
    }

    public void setDocumentacion(String documentacion) {
        this.documentacion = documentacion;
    }

    public Date getFechaEmisionMatricula() {
        return fechaEmisionMatricula;
    }

    public void setFechaEmisionMatricula(Date fechaEmisionMatricula) {
        this.fechaEmisionMatricula = fechaEmisionMatricula;
    }

    public Date getFechaVencimientoMatricula() {
        return fechaVencimientoMatricula;
    }

    public void setFechaVencimientoMatricula(Date fechaVencimientoMatricula) {
        this.fechaVencimientoMatricula = fechaVencimientoMatricula;
    }

    public Serializable getAsientosDesactivados() {
        return asientosDesactivados;
    }

    public void setAsientosDesactivados(Serializable asientosDesactivados) {
        this.asientosDesactivados = asientosDesactivados;
    }

    public Integer getExternalId() {
        return externalId;
    }

    public void setExternalId(Integer externalId) {
        this.externalId = externalId;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getKitSeguro() {
        return kitSeguro;
    }

    public void setKitSeguro(boolean kitSeguro) {
        this.kitSeguro = kitSeguro;
    }

    public Date getSincronizado() {
        return sincronizado;
    }

    public void setSincronizado(Date sincronizado) {
        this.sincronizado = sincronizado;
    }

    public boolean getInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    public Date getFechaEmisionRtv() {
        return fechaEmisionRtv;
    }

    public void setFechaEmisionRtv(Date fechaEmisionRtv) {
        this.fechaEmisionRtv = fechaEmisionRtv;
    }

    public Boolean getSaldoInicializadoCero() {
        return saldoInicializadoCero;
    }

    public void setSaldoInicializadoCero(Boolean saldoInicializadoCero) {
        this.saldoInicializadoCero = saldoInicializadoCero;
    }

    public Date getFechaVencimientoRtv() {
        return fechaVencimientoRtv;
    }

    public void setFechaVencimientoRtv(Date fechaVencimientoRtv) {
        this.fechaVencimientoRtv = fechaVencimientoRtv;
    }

    public Object getUltimasMarcaciones() {
        return ultimasMarcaciones;
    }

    public void setUltimasMarcaciones(Object ultimasMarcaciones) {
        this.ultimasMarcaciones = ultimasMarcaciones;
    }

    public short getNumVuelta() {
        return numVuelta;
    }

    public void setNumVuelta(short numVuelta) {
        this.numVuelta = numVuelta;
    }

    public double getValorVuelta() {
        return valorVuelta;
    }

    public void setValorVuelta(double valorVuelta) {
        this.valorVuelta = valorVuelta;
    }

    public Date getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(Date fechaRevision) {
        this.fechaRevision = fechaRevision;
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

    public BaseBustipo getBusTipoId() {
        return busTipoId;
    }

    public void setBusTipoId(BaseBustipo busTipoId) {
        this.busTipoId = busTipoId;
    }

    public BaseConductor getConductorId() {
        return conductorId;
    }

    public void setConductorId(BaseConductor conductorId) {
        this.conductorId = conductorId;
    }

    public BaseCooperativa getCooperativaId() {
        return cooperativaId;
    }

    public void setCooperativaId(BaseCooperativa cooperativaId) {
        this.cooperativaId = cooperativaId;
    }

    public BaseMarca getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(BaseMarca marcaId) {
        this.marcaId = marcaId;
    }

    public BasePersona getPropietarioId() {
        return propietarioId;
    }

    public void setPropietarioId(BasePersona propietarioId) {
        this.propietarioId = propietarioId;
    }

    public BaseTiposervicio getTipoServicioId() {
        return tipoServicioId;
    }

    public void setTipoServicioId(BaseTiposervicio tipoServicioId) {
        this.tipoServicioId = tipoServicioId;
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
        if (!(object instanceof BaseBus)) {
            return false;
        }
        BaseBus other = (BaseBus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fttg.smartt.entities.BaseBus[ id=" + id + " ]";
    }

}
