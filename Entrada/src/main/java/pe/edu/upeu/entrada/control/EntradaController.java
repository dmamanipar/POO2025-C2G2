package pe.edu.upeu.entrada.control;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.entrada.modelo.Persona;
import pe.edu.upeu.entrada.servicio.PersonaServicioI;
import pe.edu.upeu.entrada.servicio.PersonaServicioImp;

@Controller
public class EntradaController {

    //PersonaServicioI pe=new PersonaServicioImp();
    @Autowired
    private PersonaServicioI personaServicioI;

    @FXML
    private Label idMsg;
    @FXML TextField txtDato;

    //@FXML Button btnEnter;
    @FXML
    void enter() {
        System.out.println("Enviando persona");
        idMsg.setText(txtDato.getText());
    }
    @FXML
    void regPersona() {

        Persona persona=new Persona();
        persona.setNombre(new SimpleStringProperty(txtDato.getText()));
        persona.setEstado(new SimpleBooleanProperty(true));

        personaServicioI.save(persona);
        listarPersonas();
    }

    void listarPersonas(){
        for (Persona p: personaServicioI.findAll()) {
            System.out.println(p.getNombre());
        }
    }

}
