package com.optimagrowth.wallet.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="wallets")
public class Wallet implements Serializable{
    @Id
    @Column(name = "wallet_id", nullable = false)
    private Long walletId;

    @Column(name = "wallet_name")
    private String walletName;

    @Column(name = "wallet_desc")
    private String walletDesc;

    @Column(name = "is_default")
    private String isDefault;

}