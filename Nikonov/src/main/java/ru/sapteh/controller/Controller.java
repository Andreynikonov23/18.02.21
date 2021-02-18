package ru.sapteh.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import ru.sapteh.model.Computer;

public class Controller {

    @FXML
    private TableView<Computer> TableViewFromComputer;

    @FXML
    private TableColumn<Computer, Integer> columnId;

    @FXML
    private TableColumn<Computer, String> columnProcessor;

    @FXML
    private TableColumn<Computer, String> columnVideoCard;

    @FXML
    private TableColumn<Computer, String> columnRam;

    @FXML
    private TableColumn<Computer, String> columnHdd;

    @FXML
    private TableColumn<Computer, String> columnPowerSupply;

    @FXML
    private Button buttonNew;

    @FXML
    private Button buttonEdit;

    @FXML
    private Button buttonDelete;

    @FXML
    private TextField textFieldProcessor;

    @FXML
    private TextField textFieldVideoCard;

    @FXML
    private TextField textFieldRam;

    @FXML
    private TextField textFieldHdd;

    @FXML
    private TextField textFieldPowerSupply;

    @FXML
    public void initialize() {

    }
}
