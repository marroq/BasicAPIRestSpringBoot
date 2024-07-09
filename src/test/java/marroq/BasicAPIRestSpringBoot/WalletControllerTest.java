package marroq.BasicAPIRestSpringBoot;

import marroq.BasicAPIRestSpringBoot.controller.WalletController;
import marroq.BasicAPIRestSpringBoot.model.WalletModel;
import marroq.BasicAPIRestSpringBoot.service.WalletService;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(WalletController.class)
public class WalletControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private WalletService walletService;

    @Test
    public void shouldGetAllWallets() throws Exception {
        List<WalletModel> wallets = new ArrayList<>() {
            {
                add(new WalletModel(1, 1000));
                add(new WalletModel(2, 1400));
            }
        };

        Mockito.when(walletService.getWallets())
                .thenReturn(wallets);

        mvc.perform(MockMvcRequestBuilders.get("/wallet")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].income", Matchers.is(1400)));
    }
}
