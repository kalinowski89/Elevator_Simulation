
package elevator_simulation;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


/**
 * Alex Kalinowski
 * Mar 6, 2014
 */

public class windowUI extends JFrame{
    private JTextField txtFloors;
    private JTextField txtElevators;
    private JButton btnSave;
    private int elevators, floors;
    
    public windowUI(){
        super("Elevator Config");
        setLayout(new FlowLayout());
        
        txtFloors = new JTextField("Floors");
        add(txtFloors);
        
        txtElevators = new JTextField("Elevators");
        add(txtElevators);
        
        btnSave = new JButton("Save");
        //add(btnSave);
        
        Handler handler = new Handler();
        txtFloors.addActionListener(handler);
        txtElevators.addActionListener(handler);
    }
    
    private class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String s = "";
            String sInt ="";
            int temp = 1;
            
            if(e.getSource()==txtFloors){
                s = String.format("Floors : %s",e.getActionCommand());//WHERE THE EVEN OCCURRED
                sInt = e.getActionCommand();
                temp = Integer.parseInt(sInt);
                floors = temp;
                
            }
            
            else if(e.getSource()==txtElevators){
                s = String.format("Elevators : %s",e.getActionCommand());
                sInt = e.getActionCommand();
                temp = Integer.parseInt(sInt);
                elevators = temp;
            }
            
            JOptionPane.showMessageDialog(null, s);
            
        }
    }
    
    public int getFloors(){
        return floors;
    }
    
    public void setFloors(int floors){
        this.floors = floors;
    }
    
    public int getElevators(){
        return elevators;
    }
    
    public void setElevators(int elevators){
        this.elevators = elevators;
    }
    
    
    
    
    
    
    
    /*private Button btnSave;
    private TextField txtFloors = new TextField(2);
    private TextField txtElevators = new TextField(2);
     
    public windowUI(){
        setTitle("Building configuration");
        setLayout(new FlowLayout());
       
        add(new Label("Floors"));
        add(txtFloors);
        add(new Label("Elevators"));
        add(txtElevators);
        
        btnSave = new Button("Save Values");
        add(btnSave);
        btnSave.addActionListener(new ButtonHandler(this));
        
        addWindowListener(new CloseWindow());
    }
    
    class ButtonHandler implements ActionListener
    {
        windowUI f;
        ButtonHandler(windowUI pf)
        { f = pf;}
        public void actionPerformed (ActionEvent event)
        {
              f.buttonMethod( );
              f.repaint( );
        }// actionPerformed (ActionEvent event)
        
    }
    
    void buttonMethod( )
    {
        //What button does
        //change properties of config
        txtFloors.setText("Saved");
        txtElevators.setText("Saved");  
        
    }
    
        public void actionPerformed (ActionEvent event)
    {
        repaint( );
    }
        
         public class CloseWindow extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
    * */
}
