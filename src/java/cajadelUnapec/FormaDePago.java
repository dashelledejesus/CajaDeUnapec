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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "FORMA_DE_PAGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormaDePago.findAll", query = "SELECT f FROM FormaDePago f")
    , @NamedQuery(name = "FormaDePago.findByIdFormaDePago", query = "SELECT f FROM FormaDePago f WHERE f.idFormaDePago = :idFormaDePago")
    , @NamedQuery(name = "FormaDePago.findByDescripcionFormaDePago", query = "SELECT f FROM FormaDePago f WHERE f.descripcionFormaDePago = :descripcionFormaDePago")
    , @NamedQuery(name = "FormaDePago.findByEstadoFormaDePago", query = "SELECT f FROM FormaDePago f WHERE f.estadoFormaDePago = :estadoFormaDePago")})
public class FormaDePago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FORMA_DE_PAGO")
    private Integer idFormaDePago;
    @Size(max = 40)
    @Column(name = "DESCRIPCION_FORMA_DE_PAGO")
    private String descripcionFormaDePago;
    @Size(max = 20)
    @Column(name = "ESTADO_FORMA_DE_PAGO")
    private String estadoFormaDePago;

    public FormaDePago() {
    }

    public FormaDePago(Integer idFormaDePago) {
        this.idFormaDePago = idFormaDePago;
    }

    public Integer getIdFormaDePago() {
        return idFormaDePago;
    }

    public void setIdFormaDePago(Integer idFormaDePago) {
        this.idFormaDePago = idFormaDePago;
    }

    public String getDescripcionFormaDePago() {
        return descripcionFormaDePago;
    }

    public void setDescripcionFormaDePago(String descripcionFormaDePago) {
        this.descripcionFormaDePago = descripcionFormaDePago;
    }

    public String getEstadoFormaDePago() {
        return estadoFormaDePago;
    }

    public void setEstadoFormaDePago(String estadoFormaDePago) {
        this.estadoFormaDePago = estadoFormaDePago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFormaDePago != null ? idFormaDePago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormaDePago)) {
            return false;
        }
        FormaDePago other = (FormaDePago) object;
        if ((this.idFormaDePago == null && other.idFormaDePago != null) || (this.idFormaDePago != null && !this.idFormaDePago.equals(other.idFormaDePago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cajadelUnapec.FormaDePago[ idFormaDePago=" + idFormaDePago + " ]";
    }
    
}
