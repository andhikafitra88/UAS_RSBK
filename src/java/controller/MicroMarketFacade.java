/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.MicroMarket;

/**
 *
 * @author ASUS
 */
@Stateless
public class MicroMarketFacade extends AbstractFacade<MicroMarket> {

    @PersistenceContext(unitName = "uas_rsbkPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MicroMarketFacade() {
        super(MicroMarket.class);
    }
    
}
