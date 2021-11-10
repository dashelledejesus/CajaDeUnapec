/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajadelUnapec;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "EMPLEADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")
    , @NamedQuery(name = "Empleado.findByIdCliente", query = "SELECT e FROM Empleado e WHERE e.idCliente = :idCliente")
    , @NamedQuery(name = "Empleado.findByNombreEmpleado", query = "SELECT e FROM Empleado e WHERE e.nombreEmpleado = :nombreEmpleado")
    , @NamedQuery(name = "Empleado.findByCedulaEmpleado", query = "SELECT e FROM Empleado e WHERE e.cedulaEmpleado = :cedulaEmpleado")
    , @NamedQuery(name = "Empleado.findByTandaEmpleado", query = "SELECT e FROM Empleado e WHERE e.tandaEmpleado = :tandaEmpleado")
    , @NamedQuery(name = "Empleado.findByFechaIngresoEmpleado", query = "SELECT e FROM Empleado e WHERE e.fechaIngresoEmpleado = :fechaIngresoEmpleado")
    , @NamedQuery(name = "Empleado.findByEstadoEmpleado", query = "SELECT e FROM Empleado e WHERE e.estadoEmpleado = :estadoEmpleado")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @Size(max = 40)
    @Column(name = "NOMBRE_EMPLEADO")
    private String nombreEmpleado;
    @Column(name = "CEDULA_EMPLEADO")
    private Integer cedulaEmpleado;
    @Size(max = 10)
    @Column(name = "TANDA_EMPLEADO")
    private String tandaEmpleado;
    @Column(name = "FECHA_INGRESO_EMPLEADO")
    @Temporal(TemporalType.DATE)
    private Date fechaIngresoEmpleado;
    @Size(max = 20)
    @Column(name = "ESTADO_EMPLEADO")
    private String estadoEmpleado;

    public Empleado() {
    }

    public Empleado(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Integer getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(Integer cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public String getTandaEmpleado() {
        return tandaEmpleado;
    }

    public void setTandaEmpleado(String tandaEmpleado) {
        this.tandaEmpleado = tandaEmpleado;
    }

    public Date getFechaIngresoEmpleado() {
        return fechaIngresoEmpleado;
    }

    public void setFechaIngresoEmpleado(Date fechaIngresoEmpleado) {
        this.fechaIngresoEmpleado = fechaIngresoEmpleado;
    }

    public String getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(String estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cajadelUnapec.Empleado[ idCliente=" + idCliente + " ]";
    }
    
}
