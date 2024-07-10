package marroq.BasicAPIRestSpringBoot.service;

import marroq.BasicAPIRestSpringBoot.model.WalletModel;

import java.util.List;

public interface WalletService {
    public List<WalletModel> getWallets();

    public WalletModel newWallet(WalletModel wallet);
}
