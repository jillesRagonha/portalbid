package br.com.agilles.portalbid.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Jilles Ragonha on 02/05/2016.
 */
public class JPAUtil {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("portalbid");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
