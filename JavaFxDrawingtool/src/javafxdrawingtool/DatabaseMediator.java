/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdrawingtool;

import java.io.*;
import java.sql.*;
import java.util.Properties;

/**
 *
 * @author Bryan
 */
public class DatabaseMediator implements PersistencyMediator {
    private Properties props;
    private Connection con;

    private void CloseConnection(){

    }
    private void initConnection(){
        try{
            this.con = DriverManager.getConnection("jdbc:mysql://studmysql01.fhict.local/dbi344291", "dbi344291", "Kwibble");
        }
        catch (Exception exc){
            System.out.println(exc.getMessage());
        }
    }

    @Override
    public Drawing load(String nameDrawing) throws SQLException, IOException, ClassNotFoundException{
        initConnection();

        Statement myStatement = con.createStatement();
        ResultSet myRs = null;
        String sql = "SELECT drawingInfo FROM drawing WHERE ID = 1";

        myRs = myStatement.executeQuery(sql);
        byte[] drawingAsBytes;

        if (myRs.next()){
            drawingAsBytes = (byte[])myRs.getObject(1);
            ByteArrayInputStream baip = new ByteArrayInputStream(drawingAsBytes);
            ObjectInputStream ois = new ObjectInputStream(baip);
            Drawing drawing = (Drawing)ois.readObject();
            return drawing;
        }
        return null;
    }

    @Override
    public Boolean save(Drawing drawing) {
        try{
            initConnection();
            PreparedStatement myStatement = con.prepareStatement("INSERT INTO drawing (DrawingID,DrawingName,Drawing) VALUES ?, ?, ?");


            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(drawing);
            byte[] drawingAsBytes = baos.toByteArray();

            ByteArrayInputStream bais = new ByteArrayInputStream(drawingAsBytes);

            myStatement.setInt(1,1);
            myStatement.setString(1,drawing.getName());
            myStatement.setBinaryStream(3, bais);
            myStatement.executeUpdate();

            

        }
        catch(Exception exc){

            return null;
        }
        return null;
    }

    @Override
    public Boolean init(Properties props) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
