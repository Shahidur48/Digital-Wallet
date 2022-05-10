package com.optimagrowth.wallet.repository;


import com.optimagrowth.wallet.model.UserWallet;
import org.springframework.data.repository.CrudRepository;

public interface UserWalletRepository extends CrudRepository<UserWallet,Long> {
    public UserWallet findUserWalletByUserId(Long userId);
}
