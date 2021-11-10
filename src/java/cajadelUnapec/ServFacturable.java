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
@Table(name = "SERV_FACTURABLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServFacturable.findAll", query = "SELECT s FROM ServFacturable s")
    , @NamedQuery(name = "ServFacturable.findByIdServFacturable", query = "SELECT s FROM ServFacturable s WHERE s.idServFacturable = :idServFacturable")
    , @NamedQuery(name = "ServFacturable.findByDescripcionServFacturable", query = "SELECT s FROM ServFacturable s WHERE s.descripcionServFacturable = :descripcionServFacturable")
    , @NamedQuery(name = "ServFacturable.findByEstadoServFacturables", query = "SELECT s FROM ServFacturable s WHERE s.estadoServFacturables = :estadoServFacturables")})
public class ServFacturable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SERV_FACTURABLE")
    private Integer idServFacturable;
    @Size(max = 60)
    @Column(name = "DESCRIPCION_SERV_FACTURABLE")
    private String descripcionServFacturable;
    @Size(max = 20)
    @Column(name = "ESTADO_SERV_FACTURABLES")
    private String estadoServFacturables;

    public ServFacturable() {
    }

    public ServFacturable(Integer idServFacturable) {
        this.idServFacturable = idServFacturable;
    }

    public Integer getIdServFacturable() {
        return idServFacturable;
    }

    public void setIdServFacturable(Integer idServFacturable) {
        this.idServFacturable = idServFacturable;
    }

    public String getDescripcionServFacturable() {
        return descripcionServFacturable;
    }

    public void setDescripcionServFacturable(String descripcionServFacturable) {
        this.descripcionServFacturable = descripcionServFacturable;
    }

    public String getEstadoServFacturables() {
        return estadoServFacturables;
    }

    public void setEstadoServFacturables(String estadoServFacturables) {
        this.estadoServFacturables = estadoServFacturables;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServFacturable != null ? idServFacturable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServFacturable)) {
            return false;
        }
        ServFacturable other = (ServFacturable) object;
        if ((this.idServFacturable == null && other.idServFacturable != null) || (this.idServFacturable != null && !this.idServFacturable.equals(other.idServFacturable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cajadelUnapec.ServFacturable[ idServFacturable=" + idServFacturable + " ]";
    }
    
}
