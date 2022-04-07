package com.optimagrowth.wallet.controller;

import com.optimagrowth.wallet.model.UserWallet;
import com.optimagrowth.wallet.service.UserWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/userwallets",                      // <1>
        produces="application/json")
public class UserWalletController {
    private UserWalletService userWalletService;

    @Autowired
    public UserWalletController(UserWalletService userWalletService) {
        this.userWalletService = userWalletService;
    }

    @PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public UserWallet postUserWallet(@RequestBody UserWallet userWallet) {
        return userWalletService.saveUserWallet(userWallet);
    }

    @GetMapping("/{id}")
    public UserWallet userWalletById(@PathVariable("id") Long id) {
        return userWalletService.userWalletById(id);
    }
}
