package sistema.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import sistema.model.*;
//import java.util.Observer;

public class ViewLoginController {

    @FXML
    private AnchorPane painel;

    @FXML
    private TextField caixatxtEmail, caixatxtSenha;

    @FXML
    private Button botaoLogin;

    @FXML
    private Text txtCadastro, txtRedefinirSenha;

    private final Model model;

    public ViewLoginController(Model model) {
        this.model = model;
    }

    @FXML
    public void initialize() {
        painel.setOnKeyPressed((event) -> {
            if (event.getCode() == KeyCode.ENTER) {
                botaoLogin.fire();
            }
        });
    }

    public void mostrar() {
        model.setUsuarioLogado(caixatxtEmail.getText());
        System.out.println(model.getUsuarioLogado());
    }

    /*
    private ViewLogin view;
    private Model model;

    public void initViewLoginController(Model model, ViewLogin view){
        this.model = model;
        this.view = view;
    }

    public void interacao(int caso){
        switch (caso){
            case 1:
                boolean Flag = model.verificarUsuario(view.getEmail(), view.getSenha());
                //Necessario fazer o Metodo verificarUsuario --> Danilo
                //Metodo verificarLogin recebe login e senha e retorna True (to me baseando no codigo do Samurai)
                //Caso nao haja um Usuario com esse login e senha retorne False.
                if(Flag){
                    view.mensagem("Usuario verificado");
                    view.goMenu(view.getEmail());
                    //Necessario fazer os metodo mensagem() e irMenu() --> Rian
                    //Metodo mensagem() digita algo na tela, e o metodo irMenu() instancia um objeto ViewMenu e chama initViewMenu().
                }else{
                    view.mensagem("Login ou Senha invalido");
                }
                break;
            case 2:
                view.goCadastro();
                //Necessario Fazer o metodo cadastrarUsuario() --> Rian
                //O metodo cadastrarUsuario instancia um objeto ViewCadastro e chama initViewCadastro()
                break;
            case 3:
                view.goRedefinirSenha();
                //Necessario Fazer o metodo redefinirSenha() --> Rian
                //O metodo cadastrarUsuario instancia um objeto ViewNovaSenha e chama initViewNovaSenha()
                break;
        }
    }

     */
}
