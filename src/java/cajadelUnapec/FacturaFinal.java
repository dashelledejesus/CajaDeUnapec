/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajadelUnapec;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "FACTURA_FINAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FacturaFinal.findAll", query = "SELECT f FROM FacturaFinal f")
    , @NamedQuery(name = "FacturaFinal.findByIdFacturaFinal", query = "SELECT f FROM FacturaFinal f WHERE f.idFacturaFinal = :idFacturaFinal")
    , @NamedQuery(name = "FacturaFinal.findByIdFormaDePago", query = "SELECT f FROM FacturaFinal f WHERE f.idFormaDePago = :idFormaDePago")
    , @NamedQuery(name = "FacturaFinal.findByIdDocumento", query = "SELECT f FROM FacturaFinal f WHERE f.idDocumento = :idDocumento")
    , @NamedQuery(name = "FacturaFinal.findByIdServFacturable", query = "SELECT f FROM FacturaFinal f WHERE f.idServFacturable = :idServFacturable")
    , @NamedQuery(name = "FacturaFinal.findByIdModPago", query = "SELECT f FROM FacturaFinal f WHERE f.idModPago = :idModPago")
    , @NamedQuery(name = "FacturaFinal.findByIdCliente", query = "SELECT f FROM FacturaFinal f WHERE f.idCliente = :idCliente")
    , @NamedQuery(name = "FacturaFinal.findByIdEmpleado", query = "SELECT f FROM FacturaFinal f WHERE f.idEmpleado = :idEmpleado")})
public class FacturaFinal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FACTURA_FINAL")
    private Integer idFacturaFinal;
    @Column(name = "ID_FORMA_DE_PAGO")
    private Integer idFormaDePago;
    @Column(name = "ID_DOCUMENTO")
    private Integer idDocumento;
    @Column(name = "ID_SERV_FACTURABLE")
    private Integer idServFacturable;
    @Column(name = "ID_MOD_PAGO")
    private Integer idModPago;
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @Column(name = "ID_EMPLEADO")
    private Integer idEmpleado;

    public FacturaFinal() {
    }

    public FacturaFinal(Integer idFacturaFinal) {
        this.idFacturaFinal = idFacturaFinal;
    }

    public Integer getIdFacturaFinal() {
        return idFacturaFinal;
    }

    public void setIdFacturaFinal(Integer idFacturaFinal) {
        this.idFacturaFinal = idFacturaFinal;
    }

    public Integer getIdFormaDePago() {
        return idFormaDePago;
    }

    public void setIdFormaDePago(Integer idFormaDePago) {
        this.idFormaDePago = idFormaDePago;
    }

    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public Integer getIdServFacturable() {
        return idServFacturable;
    }

    public void setIdServFacturable(Integer idServFacturable) {
        this.idServFacturable = idServFacturable;
    }

    public Integer getIdModPago() {
        return idModPago;
    }

    public void setIdModPago(Integer idModPago) {
        this.idModPago = idModPago;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFacturaFinal != null ? idFacturaFinal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaFinal)) {
            return false;
        }
        FacturaFinal other = (FacturaFinal) object;
        if ((this.idFacturaFinal == null && other.idFacturaFinal != null) || (this.idFacturaFinal != null && !this.idFacturaFinal.equals(other.idFacturaFinal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cajadelUnapec.FacturaFinal[ idFacturaFinal=" + idFacturaFinal + " ]";
    }
    
}
