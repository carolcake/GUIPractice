/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testguie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author carolinehsu
 */
public class TestRadioButton extends JFrame implements ActionListener
{
  private JRadioButton redButton;
  private JRadioButton greenButton;
  private JRadioButton yellowButton;
  private ButtonGroup colorGroup;
  private JPanel buttonPanel;
  
  public TestRadioButton()
  {
    super("Radio Button");
    this.setBounds(100, 100, 300, 300);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLayout(new BorderLayout());
    
    // constructing radio buttons
    this.redButton = new JRadioButton("Red");
    redButton.addActionListener(this);
    this.greenButton = new JRadioButton("Green");
    greenButton.addActionListener(this);
    this.yellowButton = new JRadioButton("Yellow");
    yellowButton.addActionListener(this);
    this.colorGroup = new ButtonGroup();
    colorGroup.add(redButton);
    colorGroup.add(greenButton);
    colorGroup.add(yellowButton);
    
    // constructing the panel for the buttons
    this.buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.add(redButton);
    buttonPanel.add(greenButton);
    buttonPanel.add(yellowButton);
    
    this.add(buttonPanel, BorderLayout.SOUTH);
    this.setVisible(true);
  }
  
  public static void main (String[] args)
  {
    TestRadioButton object = new TestRadioButton();
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    // getSource = variable name
    Object command = e.getSource();
    if (command == redButton)
    {
      // you have to get the content pane to then set background color
      this.getContentPane().setBackground(Color.red);
    }
    else if (command == greenButton)
    {
      this.getContentPane().setBackground(Color.green);
    }
    else if (command == yellowButton)
    {
      this.getContentPane().setBackground(Color.yellow);
    }
  }
  
}
