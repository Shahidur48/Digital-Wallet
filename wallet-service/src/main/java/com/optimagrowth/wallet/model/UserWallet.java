package com.optimagrowth.wallet.model;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="user_wallet")
public class UserWallet extends RepresentationModel<UserWallet> {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "wallet_id")
    private Long walletId;

    @Column(name = "balance")
    private Long balance;

    public UserWallet() {
    }
}