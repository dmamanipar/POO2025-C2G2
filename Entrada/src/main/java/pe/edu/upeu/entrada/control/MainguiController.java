package pe.edu.upeu.entrada.control;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@Controller
public class MainguiController {

    @FXML
    private BorderPane bp;
    @FXML
    MenuBar menuBar;
    @FXML
    TabPane tabPane;
    @FXML
    MenuItem menuItem1,menuItemC;
    @Autowired
    ApplicationContext context;

    @FXML
    public void initialize(){
        MenuItemListener mIL=new MenuItemListener();
        menuItem1.setOnAction(mIL::handle);
        menuItemC.setOnAction(mIL::handle);
    }
    class MenuItemListener{
        Map<String,String[]> menuConfig=Map.of(
                "menuItem1", new String[]{"/fxml/main_persona.fxml","Reg.Persona","T"},
                "menuItemC", new String[]{"/fxml/login.fxml","Salir","C"}
        );

        public void handle(ActionEvent e){
            String id=((MenuItem)e.getSource()).getId();
            if(menuConfig.containsKey(id)){
            String[] items=menuConfig.get(id);
                if(items[2].equals("C")){
                Platform.exit();
                System.exit(0);
                }else{
                    abrirTapPaneFXML(items[0],items[1]);
                }
            }
        }
        private void abrirTapPaneFXML(String fxmlPath, String tittle ){
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlPath));
                fxmlLoader.setControllerFactory(context::getBean);
                Parent root = fxmlLoader.load();
                ScrollPane scrollPane = new ScrollPane(root);
                scrollPane.setFitToWidth(true);
                scrollPane.setFitToHeight(true);

                Tab newtab = new Tab(tittle,scrollPane);
                tabPane.getTabs().clear();
                tabPane.getTabs().add(newtab);

            }catch(IOException ex){
            throw new RuntimeException(ex);
            }

        }

    }
    class MenuListener{
        public void handle(ActionEvent e){

        }

    }

}
