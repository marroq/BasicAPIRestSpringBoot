package marroq.BasicAPIRestSpringBoot.service;

import marroq.BasicAPIRestSpringBoot.model.WalletModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WalletServiceImpl implements WalletService {

    // Test object
    List<WalletModel> wallets;

    public WalletServiceImpl() {
        wallets = new ArrayList<>();
        wallets.add(new WalletModel(1, 1000));
        wallets.add(new WalletModel(2, 3500));
    }

    @Override
    public List<WalletModel> getWallets() {
        return wallets;
    }
}
