/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdrawingtool;

import java.awt.*;
import java.awt.Color;
import java.util.Set;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;

/**
 *
 * @author Bryan
 */


public class JavaFxDrawingtool extends Application {
    
    Paintable paintable;
    Drawing drawing;
    private Canvas drawingCanvas;
    private GraphicsContext gc;
    
    @Override
    public void start(Stage primaryStage) {
        
        
        

        drawingCanvas = new Canvas(480,480);
        gc = drawingCanvas.getGraphicsContext2D();
        SerializationMediator med = new SerializationMediator();
        DatabaseMediator db = new DatabaseMediator();
        paintable = new JavaFXPaintable(gc);
        drawing = new Drawing(Color.black); //med.load("drawing");
        
        
        drawing.setName("tekening");
        
        Oval o = new Oval(java.awt.Color.black,new Point(5,2),150,150,-15);
        
        drawing.items.add(o);
        
        drawing.paint((JavaFXPaintable) paintable);
        
        db.save(drawing);
        
        //med.save(drawing);
        
        StackPane root = new StackPane();
        root.getChildren().add(drawingCanvas);
        root.getChildren().add(new ComboBox());
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello sadasdsad");
        primaryStage.setScene(scene);
        primaryStage.show();
        System.out.println("hey");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
