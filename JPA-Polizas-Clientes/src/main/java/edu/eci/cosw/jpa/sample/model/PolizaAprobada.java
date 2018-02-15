package edu.eci.cosw.jpa.sample.model;
// Generated Mar 9, 2016 7:01:57 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PolizasAprobadas generated by hbm2java
 */
@Entity
@Table(name = "POLIZAS_APROBADAS")
public class PolizaAprobada  implements java.io.Serializable {


     private PolizaAprobadaId id;
     private Cliente clientes;
     private TipoPoliza tiposPoliza;
     private Date fechaAprobacion;
     private Date fechaVencimiento;

    public PolizaAprobada() {
    }

    public PolizaAprobada(PolizaAprobadaId id, Cliente clientes, TipoPoliza tiposPoliza, Date fechaAprobacion, Date fechaVencimiento) {
       this.id = id;
       this.clientes = clientes;
       this.tiposPoliza = tiposPoliza;
       this.fechaAprobacion = fechaAprobacion;
       this.fechaVencimiento = fechaVencimiento;
    }
    @EmbeddedId
    public PolizaAprobadaId getId() {
        return this.id;
    }
    
    public void setId(PolizaAprobadaId id) {
        this.id = id;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns({
        @JoinColumn(name = "CLIENTES_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "CLIENTES_tipo_id", referencedColumnName = "tipo_id", nullable = false, insertable = false, updatable = false)
    })
    public Cliente getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "POLIZAS_codigo_poliza", referencedColumnName = "codigo_poliza", nullable = false, insertable = false, updatable = false)
    })
    public TipoPoliza getTiposPoliza() {
        return this.tiposPoliza;
    }
    
    public void setTiposPoliza(TipoPoliza tiposPoliza) {
        this.tiposPoliza = tiposPoliza;
    }
    @Column(name = "fecha_aprobacion", nullable = false)
    public Date getFechaAprobacion() {
        return this.fechaAprobacion;
    }
    
    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }
    @Column(name = "fecha_vencimiento", nullable = false)
    public Date getFechaVencimiento() {
        return this.fechaVencimiento;
    }
    
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }




}


