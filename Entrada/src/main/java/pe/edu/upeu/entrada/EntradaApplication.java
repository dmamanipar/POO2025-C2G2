package pe.edu.upeu.entrada;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EntradaApplication extends Application {
    private ConfigurableApplicationContext configurableApplicationContext;
    private Parent parent;

	public static void main(String[] args) {
		//SpringApplication.run(EntradaApplication.class, args);
        launch(args);
	}

    @Override

    public void init() throws Exception {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(EntradaApplication.class);
        builder.application().setWebApplicationType(WebApplicationType.NONE);
        configurableApplicationContext = builder.run(getParameters().getRaw().toArray(new String[0]));

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/maingui.fxml"));
        fxmlLoader.setControllerFactory(configurableApplicationContext::getBean);
        parent= fxmlLoader.load();

    }

    @Override

    public void start(Stage stage) throws Exception {

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getBounds();
        stage.setScene(new Scene(parent,bounds.getWidth(), bounds.getHeight()- 80));
        //stage.show();
        stage.setTitle("Spring Java-FX");
        stage.show();

    }
}
