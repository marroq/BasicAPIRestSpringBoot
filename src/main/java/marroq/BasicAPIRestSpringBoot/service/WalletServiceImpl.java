package marroq.BasicAPIRestSpringBoot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import marroq.BasicAPIRestSpringBoot.controller.WalletController;
import marroq.BasicAPIRestSpringBoot.model.WalletModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WalletServiceImpl implements WalletService {

    private final Logger logger = LoggerFactory.getLogger(WalletController.class);

    List<WalletModel> wallets;

    public WalletServiceImpl() {
        wallets = new ArrayList<>();
        logger.info("Wallet service created");
    }

    @Override
    public List<WalletModel> getWallets() {
        return wallets;
    }

    @Override
    public WalletModel newWallet(WalletModel wallet) {
        wallets.add(wallet);

        return wallet;
    }
}
