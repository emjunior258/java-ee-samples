package mz.stdbank.test;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Mário Júnior
 */
public class EntityManagerFactoryObject {

    private static EntityManagerFactory entityManagerFactory;

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory(
                "example-db");
    }

    @Produces
    @ApplicationScoped
    public EntityManager createEntityManager() {

        return entityManagerFactory.
                createEntityManager();

    }

}
