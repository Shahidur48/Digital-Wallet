package com.optimagrowth.wallet.repository;
import com.optimagrowth.wallet.model.Wallet;
import org.springframework.data.repository.CrudRepository;

public interface WalletRepository extends CrudRepository<Wallet,Long> {
}
