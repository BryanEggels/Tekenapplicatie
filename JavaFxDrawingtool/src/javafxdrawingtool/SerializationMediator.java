/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdrawingtool;

import java.io.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryan
 */
public class SerializationMediator implements PersistencyMediator{
    private Properties props;

    @Override
    public Drawing load(String nameDrawing) {
        Drawing drawing = null;
      try {
         FileInputStream fileIn = new FileInputStream("C:\\Users\\fam_e\\Desktop\\Drawing.drw");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         drawing = (Drawing) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i) {
         return null;
      } catch (ClassNotFoundException ex) {
            Logger.getLogger(SerializationMediator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return drawing;
    }

    @Override
    public Boolean save(Drawing drawing) {
        try {
         FileOutputStream fileOut =
         new FileOutputStream("C:\\Users\\fam_e\\Desktop\\Drawing.drw");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(drawing);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in C:\\Users\\fam_e\\DesktopDrawing.drw");
      }catch(IOException i) {
          return null;
      }
        return null;
    }

    @Override
    public Boolean init(Properties props) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
