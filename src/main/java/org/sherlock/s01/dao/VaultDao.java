package org.sherlock.s01.dao;

import org.sherlock.s01.model.Vault;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Evgeny Borisov
 */
public interface VaultDao extends JpaRepository<Vault,Long>{

}
