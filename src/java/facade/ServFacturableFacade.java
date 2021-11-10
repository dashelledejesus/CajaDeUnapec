/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import cajadelUnapec.ServFacturable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author user
 */
@Stateless
public class ServFacturableFacade extends AbstractFacade<ServFacturable> {

    @PersistenceContext(unitName = "CajaDeLUnapecPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServFacturableFacade() {
        super(ServFacturable.class);
    }
    
}
