package com.mycompany.assignmet;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Window;

public class PrimaryController {
    
      @FXML
    private Button AboutUS;

    @FXML
    private Button AddHeading;

    @FXML
    private Button EXIT;

    @FXML
    private Button changeFont;

    @FXML
    private ColorPicker color;

    @FXML
    private Label contact;

    @FXML
    private HBox display;

    @FXML
    private Label email;

    @FXML
    private Label names;

    @FXML
    private Button picture;

    @FXML
    private HBox preview;

    @FXML
    private TextField text;

    @FXML
    private Button view;
      @FXML
    private Pane hbox;
      
    @FXML
    private Pane window;

    
    @FXML
    private VBox Newlabel;
    private Window stage;

    @FXML
    void AboutUS(ActionEvent event) {
            names.setText("Itumeleng  Mothibeli");
            email.setText("marymothibeli@gmail.com");
            contact.setText("+(266) 53265014");
}

    @FXML
    void AddHeading() {
       Label label=new Label(text.getText());
       preview.getChildren().add(label);
    }

    @FXML
    void EXIT(ActionEvent event) {
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("EXIT");
        alert.setHeaderText("Are sure you to exit?");

        if(alert.showAndWait().get()==ButtonType.OK){
            System.out.print("successfully logged out");
            System.exit(0);
        }


    }

    @FXML
    void View() {
        
    ColorPicker colorpicker=new ColorPicker();
    colorpicker.getLocalToParentTransform();
    Newlabel.getChildren().add(colorpicker);
    
    ImageView imageView = new ImageView(); 
    Button uploadButton = new Button("Upload Image"); 
    FileChooser fileChooser = new FileChooser(); 
    uploadButton.setOnAction(event -> { 
    var file = fileChooser.showOpenDialog(stage); 
    Image image = new Image(file.getAbsolutePath()); 
     imageView.setImage(image);
     Newlabel.getChildren().add(uploadButton);  }); 

    }

    @FXML
    void changeFont(ActionEvent event) {
        
        
        Slider fontSizeSlider = new Slider(8, 45, 12); 
       
        preview.getChildren().add(fontSizeSlider);
        fontSizeSlider.setShowTickLabels(true); 
        fontSizeSlider.setShowTickMarks(true);
         fontSizeSlider.setMajorTickUnit(4); 
         fontSizeSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
         preview.setStyle("-fx-font-size: " + newValue.intValue() + "px;"); });

    }

    @FXML
    void picture(ActionEvent event) {
        ImageView imageview=new ImageView("a.jpeg");
        display.getChildren().add(imageview);
        

    }

}
