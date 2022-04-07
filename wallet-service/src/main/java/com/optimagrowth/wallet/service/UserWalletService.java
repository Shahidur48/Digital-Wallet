package com.optimagrowth.wallet.service;

import com.optimagrowth.wallet.model.UserWallet;
import com.optimagrowth.wallet.repository.UserWalletRepository;
import com.optimagrowth.wallet.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class UserWalletService {

    private UserWalletRepository userWalletRepository;

    @Autowired
    public UserWalletService(UserWalletRepository userWalletRepository) {
        this.userWalletRepository = userWalletRepository;
    }

    public UserWallet saveUserWallet(UserWallet userWallet){
        return userWalletRepository.save(userWallet);
    }

    public UserWallet userWalletById(@PathVariable("id") Long id) {
        Optional<UserWallet> optionalUserWallet = userWalletRepository.findById(id);
        if (optionalUserWallet.isPresent()) {
            return optionalUserWallet.get();
        }
        return null;
    }
}
