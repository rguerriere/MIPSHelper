package cse220helper;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class CSE220Helper extends Application
{      

    public static void main(String[] args) 
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        primaryStage.setTitle("MIPS Helper");
        
        VBox registers = new VBox();
        registers.setSpacing(2.5);
                        
        //Hbox Setup
        HBox aRegistersBox = new HBox();
        HBox sRegistersBox = new HBox();
        HBox tRegistersBox = new HBox();
        
        HBox a0 = new HBox();
        HBox a1 = new HBox();
        HBox a2 = new HBox();
        HBox a3 = new HBox();
        
        HBox s0 = new HBox();
        HBox s1 = new HBox();
        HBox s2 = new HBox();
        HBox s3 = new HBox();
        
        HBox t0 = new HBox();
        HBox t1 = new HBox();
        HBox t2 = new HBox();
        HBox t3 = new HBox();
        HBox t4 = new HBox();
        HBox t5 = new HBox();
        HBox t6 = new HBox();
        HBox t7 = new HBox();
        HBox t8 = new HBox();
        HBox t9 = new HBox();
        
        //Label Setup
        Label aRegisters = new Label("Argument Registers");
        Label sRegisters = new Label("Saved Registers");
        Label tRegisters = new Label("Temporary Registers");
        
        Label a0Label = new Label("$a0");
        Label a1Label = new Label("$a1");
        Label a2Label = new Label("$a2");
        Label a3Label = new Label("$a3");
        
        Label s0Label = new Label("$s0");
        Label s1Label = new Label("$s1");
        Label s2Label = new Label("$s2");
        Label s3Label = new Label("$s3");
        
        Label t0Label = new Label("$t0");
        Label t1Label = new Label("$t1");
        Label t2Label = new Label("$t2");
        Label t3Label = new Label("$t3");
        Label t4Label = new Label("$t4");
        Label t5Label = new Label("$t5");
        Label t6Label = new Label("$t6");
        Label t7Label = new Label("$t7");
        Label t8Label = new Label("$t8");
        Label t9Label = new Label("$t9");
        
        //Textfield Setup
        TextField a0Text = new TextField();
        TextField a1Text = new TextField();
        TextField a2Text = new TextField();
        TextField a3Text = new TextField();
        
        TextField s0Text = new TextField();
        TextField s1Text = new TextField();
        TextField s2Text = new TextField();
        TextField s3Text = new TextField();
        
        TextField t0Text = new TextField();
        TextField t1Text = new TextField();
        TextField t2Text = new TextField();
        TextField t3Text = new TextField();
        TextField t4Text = new TextField();
        TextField t5Text = new TextField();
        TextField t6Text = new TextField();
        TextField t7Text = new TextField();
        TextField t8Text = new TextField();
        TextField t9Text = new TextField();
        
        //converter.getChildren().addAll(converterInput, convertButton);
        aRegistersBox.getChildren().addAll(aRegisters);
        a0.getChildren().addAll(a0Label, a0Text);
        a1.getChildren().addAll(a1Label, a1Text);
        a2.getChildren().addAll(a2Label, a2Text);
        a3.getChildren().addAll(a3Label, a3Text);
        
        sRegistersBox.getChildren().addAll(sRegisters);
        s0.getChildren().addAll(s0Label, s0Text);
        s1.getChildren().addAll(s1Label, s1Text);
        s2.getChildren().addAll(s2Label, s2Text);
        s3.getChildren().addAll(s3Label, s3Text);
        
        tRegistersBox.getChildren().addAll(tRegisters);
        t0.getChildren().addAll(t0Label, t0Text);
        t1.getChildren().addAll(t1Label, t1Text);
        t2.getChildren().addAll(t2Label, t2Text);
        t3.getChildren().addAll(t3Label, t3Text);
        t4.getChildren().addAll(t4Label, t4Text);
        t5.getChildren().addAll(t5Label, t5Text);
        t6.getChildren().addAll(t6Label, t6Text);
        t7.getChildren().addAll(t7Label, t7Text);
        t8.getChildren().addAll(t8Label, t8Text);
        t9.getChildren().addAll(t9Label, t9Text);
        
        registers.getChildren().addAll(
                aRegistersBox, a0, a1, a2, a3, 
                sRegistersBox, s0, s1, s2, s3, 
                tRegistersBox, t0, t1, t2, t3, t4, t5, t6, t7, t8, t9);
        
        VBox linksVbox = new VBox();
        linksVbox.setSpacing(10);
        
        HBox ascii = new HBox();
        HBox syscalls = new HBox();
        
        Button asciiButton = new Button();
        Button syscallsButton = new Button();
        
        
        
        asciiButton.setOnAction(e ->
                {                   
                    final WebView browser = new WebView();
                    final WebEngine webEngine = browser.getEngine();
                    webEngine.load("http://www.asciitable.com/");
                    
                    Scene secondScene = new Scene(browser, 1280, 720);
 
                    Stage newWindow = new Stage();
                    newWindow.setTitle("Second Stage");
                    newWindow.setScene(secondScene);
                    newWindow.show();
                }           
            );
        
        syscallsButton.setOnAction(e ->
                {                   
                    final WebView browser = new WebView();
                    final WebEngine webEngine = browser.getEngine();
                    webEngine.load("http://courses.missouristate.edu/kenvollmar/mars/help/SyscallHelp.html");
                    Scene secondScene = new Scene(browser, 1280, 720);
 
                    Stage newWindow = new Stage();
                    newWindow.setTitle("Second Stage");
                    newWindow.setScene(secondScene);
                    newWindow.show();
                }           
            );
                   
        asciiButton.setText("ASCII TABLE");
        syscallsButton.setText("SYSCALLS");
                              
        ascii.getChildren().addAll(asciiButton);
        syscalls.getChildren().addAll(syscallsButton);
        
        linksVbox.getChildren().addAll(ascii, syscalls);
        
        BorderPane layout = new BorderPane();
        layout.setLeft(registers);
        layout.setRight(linksVbox);
        
        Scene scene = new Scene(layout, 400, 800);
        scene.getStylesheets().add("style.css");
        
        primaryStage.setScene(scene);
        
        primaryStage.getIcons().add(new Image("file:mipslogo.png"));
        
        primaryStage.show();
    }
       
}
