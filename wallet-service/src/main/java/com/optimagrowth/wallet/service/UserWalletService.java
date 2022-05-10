package com.optimagrowth.wallet.service;

import com.optimagrowth.wallet.model.User;
import com.optimagrowth.wallet.model.UserWallet;
import com.optimagrowth.wallet.repository.UserWalletRepository;
import com.optimagrowth.wallet.repository.WalletRepository;
import com.optimagrowth.wallet.service.client.UserRestTemplateClient;
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

    @Autowired
    UserRestTemplateClient userRestTemplateClient;

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
    public String deductBalance(Long userId,Long walletId, Long amount) {
        String message = "";
        User user = IsUser(userId);
        Long newBalance = 0L;
        if(user.getUserId().equals(null)) {
            message = "No User Found";
        }
        else{
           UserWallet userWallet = userWalletRepository.findUserWalletByUserId(user.getUserId());

           if(userWallet.getWalletId() == walletId)
           {
               if (userWallet.getBalance() < amount){
                   message = "Limited Balance";
               }
               else {
                   newBalance = userWallet.getBalance() - amount;

                   message = "into your account";
               }

           }

        }
        
        return "You have : "+ newBalance.toString() + message;
    }

    private User IsUser(Long userId) {

        User isUser = userRestTemplateClient.IsUser(userId);

        return isUser;
    }
}
