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
@Table(name = "MOD_PAGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModPago.findAll", query = "SELECT m FROM ModPago m")
    , @NamedQuery(name = "ModPago.findByIdModPago", query = "SELECT m FROM ModPago m WHERE m.idModPago = :idModPago")
    , @NamedQuery(name = "ModPago.findByEstadoModPago", query = "SELECT m FROM ModPago m WHERE m.estadoModPago = :estadoModPago")
    , @NamedQuery(name = "ModPago.findByEstadosModPago", query = "SELECT m FROM ModPago m WHERE m.estadosModPago = :estadosModPago")})
public class ModPago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MOD_PAGO")
    private Integer idModPago;
    @Size(max = 20)
    @Column(name = "ESTADO_MOD_PAGO")
    private String estadoModPago;
    @Size(max = 20)
    @Column(name = "ESTADOS_MOD_PAGO")
    private String estadosModPago;

    public ModPago() {
    }

    public ModPago(Integer idModPago) {
        this.idModPago = idModPago;
    }

    public Integer getIdModPago() {
        return idModPago;
    }

    public void setIdModPago(Integer idModPago) {
        this.idModPago = idModPago;
    }

    public String getEstadoModPago() {
        return estadoModPago;
    }

    public void setEstadoModPago(String estadoModPago) {
        this.estadoModPago = estadoModPago;
    }

    public String getEstadosModPago() {
        return estadosModPago;
    }

    public void setEstadosModPago(String estadosModPago) {
        this.estadosModPago = estadosModPago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idModPago != null ? idModPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModPago)) {
            return false;
        }
        ModPago other = (ModPago) object;
        if ((this.idModPago == null && other.idModPago != null) || (this.idModPago != null && !this.idModPago.equals(other.idModPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cajadelUnapec.ModPago[ idModPago=" + idModPago + " ]";
    }
    
}
