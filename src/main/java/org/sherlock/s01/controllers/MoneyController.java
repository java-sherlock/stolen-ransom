package org.sherlock.s01.controllers;

import lombok.RequiredArgsConstructor;
import org.sherlock.s01.dao.VaultDao;
import org.sherlock.s01.model.Vault;
import org.sherlock.s01.services.DeliveryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MoneyController {
    private final DeliveryService deliveryService;
    private final VaultDao vaultDao;

    @GetMapping("/send")
    public String sendVault(){
        Vault vault = Vault.builder().bulletproof(true).fireProveHours(12).build();
        long id = deliveryService.deliverVault(vault);
        return "ваша ячейка № " + id;
    }

    @GetMapping("/check/{id}")
    public int checkVaultContent(@PathVariable long id) {
        return vaultDao.findById(id).get().getMoneyAmount();
    }
}
