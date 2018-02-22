package br.com.posfacisa.conversordeandroid;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import static org.junit.Assert.*;

import br.com.posfacisa.conversordeandroid.models.Logador;
import br.com.posfacisa.conversordeandroid.models.Pessoa;
import br.com.posfacisa.conversordeandroid.pageObject.ComprimentoPageObject;
import br.com.posfacisa.conversordeandroid.pageObject.LoginPageObject;

/**
 * Created by Bruno Ribeiro on 22/02/2018.
 */

public class LoginRobotiumTest extends ActivityInstrumentationTestCase2<LoginActivity> {

    private Solo solo;
    private LoginPageObject loginPage;

    public LoginRobotiumTest(){
        super(LoginActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
        loginPage = new LoginPageObject(solo);
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testLoginSucesso() throws Exception{
        Logador.add(new Pessoa("bruno","1234"));
        loginPage.preencherUsername("bruno");
        loginPage.preencherSenha("1234");
        loginPage.clicarBotaoLogar();
        assertTrue("Mensagem não exibida",solo.searchText("Bem vindo"));
    }

    public void testLoginEmBranco() throws Exception{
        loginPage.preencherUsername("");
        loginPage.preencherSenha("");
        loginPage.clicarBotaoLogar();
        assertTrue("Mensagem não exibida",solo.searchText("Campo em branco"));
        //solo.sleep(1000);

        loginPage.preencherUsername("bruno");
        loginPage.preencherSenha("");
        loginPage.clicarBotaoLogar();
        assertTrue("Mensagem não exibida",solo.searchText("Campo em branco"));
        //solo.sleep(1000);

        loginPage.preencherUsername("");
        loginPage.preencherSenha("1234");
        loginPage.clicarBotaoLogar();
        assertTrue("Mensagem não exibida",solo.searchText("Campo em branco"));
    }

    public void testLoginIncorreto() throws Exception{
        loginPage.preencherUsername("fulanoNaoExiste");
        loginPage.preencherSenha("12341234");
        loginPage.clicarBotaoLogar();
        assertTrue("Mensagem não exibida",solo.searchText("Senha ou login incorreto"));
    }

    public void testAccessCriarConta() throws Exception{
        loginPage.clicarBotaoCriarConta();
        solo.assertCurrentActivity("Activity não é a Criar Conta",CriarContaActivity.class);
    }

}
