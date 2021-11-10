/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import cajadelUnapec.ModPago;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class ModPagoFacade extends AbstractFacade<ModPago> {

    @PersistenceContext(unitName = "CajaDeLUnapecPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ModPagoFacade() {
        super(ModPago.class);
    }
    
}
