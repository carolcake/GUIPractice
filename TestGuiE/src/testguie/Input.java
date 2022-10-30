/*
Caroline Hsu - 9/20/2021
 */
package testguie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Input extends JFrame implements ActionListener
{
  // declaring textfields
  private JLabel massLabel;
  private JTextField massField;
  private JLabel accelerationLabel;
  private JTextField accelerationField;
  private JPanel inputPanel;
  private JButton calculateButton;
  
  // declaring buttons
  private JButton returnButton;
  private JButton exitButton;
  private JPanel buttonPanel;
  
  public Input()
  {
    super("Input Frame");
    this.setBounds(100, 100, 700, 500);
    // default close operation to close on exit
    this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    this.getContentPane().setBackground(Color.BLUE);
    // making an anonymous object
    this.setLayout(new BorderLayout());
    
    // constructing textfields
    this.massLabel = new JLabel("Mass");
    this.massField = new JTextField(10);
    this.accelerationLabel = new JLabel("Acceleration");
    this.accelerationField = new JTextField(10);
    
    // constructing buttons
    this.returnButton = new JButton("Return");
    returnButton.addActionListener(this);
    this.exitButton = new JButton("Exit");
    exitButton.addActionListener(this);
    this.calculateButton = new JButton("Calculate");
    calculateButton.addActionListener(this);
    
    // constructing panels and adding components
    this.inputPanel = new JPanel(new FlowLayout());
    inputPanel.setBackground(Color.MAGENTA);
    inputPanel.add(massLabel);
    inputPanel.add(massField);
    inputPanel.add(accelerationLabel);
    inputPanel.add(accelerationField);
    inputPanel.add(calculateButton);
    
    this.buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.setBackground(Color.CYAN);
    buttonPanel.add(returnButton);
    buttonPanel.add(exitButton);
    
    // adding the panels to the frame
    this.add(inputPanel, BorderLayout.NORTH);
    this.add(buttonPanel, BorderLayout.SOUTH);
    // set visible as true
    this.setVisible(true);
  }
  
  
  public static void main(String[] args)
  {
    new Input();
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    Object command = e.getSource();
    double mass;
    double acceleration;
    double force;
    
    String answer;
    
    if (command == exitButton)
    {
      System.exit(0);
    }
    else if (command == returnButton)
    {
      this.dispose();
      new Start();
    }
    else if (command == calculateButton)
    {
      try
      {
        mass = Double.parseDouble(massField.getText());
        acceleration = Double.parseDouble(accelerationField.getText());
        massField.setText("");
        accelerationField.setText("");
        
        // create a dummy object so you can access the method 
        // method is not static and you cannot use class.name so 
        // you need an object to access it
        Force forceObj = new Force();
        force = forceObj.calculateForce(mass, acceleration);
        answer = "force is " + force;
        new Output(answer);
      }
      catch (NumberFormatException nfe)
      {
        new Warning("<html> <center> Invalid entry, try again and enter a "
            + "number! </html> </center>");
      }
      catch (Exception exp)
      {
        new Warning("<html> <center> Oops! Something went wrong, "
            + "try again!</html> </center>");
      }
    }
  }
}
