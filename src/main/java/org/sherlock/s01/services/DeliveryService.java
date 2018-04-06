package org.sherlock.s01.services;

import org.sherlock.s01.model.Vault;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Evgeny Borisov
 */
@Service
public class DeliveryService {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public long deliverVault(Vault vault) {
        entityManager.persist(vault);
        return vault.getId();
    }

}
