package marroq.BasicAPIRestSpringBoot.controller;

import marroq.BasicAPIRestSpringBoot.model.WalletModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WalletController {

    @GetMapping("/wallet")
    public List<WalletModel> GetAllWallets() {
        throw new UnsupportedOperationException("Method to implement");
    }

    @GetMapping("/wallet/{id}")
    public WalletModel GetWallet() {
        throw new UnsupportedOperationException("Method to implement");
    }

    @PostMapping("/wallet")
    public int NewWallet(@RequestBody WalletModel wallet) {
        throw new UnsupportedOperationException("Method to implement");
    }

    @PutMapping("/wallet")
    public int UpdateWallet(@RequestBody WalletModel wallet) {
        throw new UnsupportedOperationException("Method to implement");
    }

    @PatchMapping("/wallet/{id}")
    public boolean UpdatePartialWallet(@RequestBody WalletModel wallet) {
        throw new UnsupportedOperationException("Method to implement");
    }

    @DeleteMapping("/wallet/{id}")
    public boolean DeleteWallet() {
        throw new UnsupportedOperationException("Method to implement");
    }
}
