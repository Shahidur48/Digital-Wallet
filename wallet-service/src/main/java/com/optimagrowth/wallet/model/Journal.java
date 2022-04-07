package com.optimagrowth.wallet.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name="journals")
public class Journal implements Serializable{
    @Id
    @Column(name = "ledger_id", nullable = false)
    private Long ledgerId;

    @Column(name = "debit")
    private Long debit;

    @Column(name = "credit")
    private Long credit;

    @Column(name = "ref_id")
    private Long refId;
}