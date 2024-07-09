package marroq.BasicAPIRestSpringBoot.controller;

import marroq.BasicAPIRestSpringBoot.model.WalletModel;
import marroq.BasicAPIRestSpringBoot.service.WalletService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @GetMapping("/wallet")
    public List<WalletModel> getWallets() {
        return this.walletService.getWallets();
    }

    @GetMapping("/wallet/{id}")
    public WalletModel getWallet() {
        throw new UnsupportedOperationException("Method to implement");
    }

    @PostMapping("/wallet")
    public int newWallet(@RequestBody WalletModel wallet) {
        throw new UnsupportedOperationException("Method to implement");
    }

    @PutMapping("/wallet")
    public int updateWallet(@RequestBody WalletModel wallet) {
        throw new UnsupportedOperationException("Method to implement");
    }

    @PatchMapping("/wallet/{id}")
    public boolean updatePartialWallet(@RequestBody WalletModel wallet) {
        throw new UnsupportedOperationException("Method to implement");
    }

    @DeleteMapping("/wallet/{id}")
    public boolean deleteWallet() {
        throw new UnsupportedOperationException("Method to implement");
    }
}
