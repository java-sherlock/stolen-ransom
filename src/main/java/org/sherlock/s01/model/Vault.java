package org.sherlock.s01.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Evgeny Borisov
 */
@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vault {
    @Id
    @GeneratedValue
    private long id;
    private int fireProveHours;
    private boolean bulletproof;
    @ColumnDefault("100500")
    private int moneyAmount = 100500;
}
