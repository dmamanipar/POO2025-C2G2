package pe.edu.upeu.entrada.control;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.entrada.enums.Persona;
import pe.edu.upeu.entrada.enums.Tipo;
import pe.edu.upeu.entrada.servicio.PersonaServicioI;

@Controller
public class PersonaController {

    @FXML
    private TextField txtNombre, txtApellido, txtDni, txtId, txtFecha, txtHoraingreso, txtHorasalida;
    @FXML
    private ComboBox <Persona> cbxPersona;
    @FXML
    private ComboBox <Tipo> cbxTipo;

    @FXML
    private TableView<Persona> tableView;
    ObservableList<Persona> listapersonas;
    @FXML
    private TableColumn<Persona, String> dniColum, nombreColum, apellidoColum, personaColum, tipoColum, fechaColum, horaingresoColum, horaSalidaColum, idColum;
    @Autowired
    PersonaServicioI ps;

    @FXML
    public void initialize(){
        cbxPersona.getItems().addAll(Persona.values());
        cbxTipo.getItems().addAll(Tipo.values());
        definirColumnas();
    }

    public void  definirColumnas(){
        dniColum=new TableColumn("DNI");
        idColum=new TableColumn("ID");
        nombreColum=new TableColumn("Nombre");
        apellidoColum=new TableColumn("Apellido");
        personaColum=new TableColumn("Persona");
        tipoColum=new TableColumn("Tipo");
        fechaColum=new TableColumn("Fecha");
        horaingresoColum=new TableColumn("Horaingreso");
        horaSalidaColum=new TableColumn("Horasalida");
        tableView.getColumns().addAll(dniColum, idColum, nombreColum, apellidoColum, personaColum, tipoColum, fechaColum, horaingresoColum, horaSalidaColum);

    }
        public void listarPersonas(){



        }

}
