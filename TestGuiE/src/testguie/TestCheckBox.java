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
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author carolinehsu
 */
public class TestCheckBox extends JFrame implements ActionListener
{
  // declare checkboxes
  private JCheckBox pineappleBox;
  private JCheckBox pepperoniBox;
  private JCheckBox chilliesBox;
  // declare radiobuttons and button group
  private JRadioButton sauceButton;
  private JRadioButton noSauceButton;
  private ButtonGroup sauceGroup;
  // declare jbuttons and panel and label
  private JButton orderButton;
  private JPanel orderPanel;
  private JLabel orderLabel;
  
  public TestCheckBox()
  {
    // if you call super it has to be first line of constructor
    super("Pizza Order Form");
    this.setBounds(100,100,500,300);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.getContentPane().setBackground(Color.red);
    this.setLayout(new BorderLayout());
    
    // constructing checkboxes
    this.pineappleBox = new JCheckBox("Pineapple");
    this.pepperoniBox = new JCheckBox("Pepperoni");
    this.chilliesBox = new JCheckBox("Chillies");   
    
    // constructing radio buttons and the button group
    this.sauceButton = new JRadioButton("Sauce");
    this.noSauceButton = new JRadioButton("No Sauce");
    this.sauceGroup = new ButtonGroup();
    sauceGroup.add(sauceButton);
    sauceGroup.add(noSauceButton);
    
    // constructing the button, label, and panel
    this.orderButton = new JButton("Order");
    orderButton.addActionListener(this);
    this.orderLabel = new JLabel("");
    this.orderPanel = new JPanel(new FlowLayout());
    orderPanel.setBackground(Color.ORANGE);
    
    // adding buttons and checkboxes to the panel
    orderPanel.add(pineappleBox);
    orderPanel.add(pepperoniBox);
    orderPanel.add(chilliesBox);
    orderPanel.add(sauceButton);
    orderPanel.add(noSauceButton);
    orderPanel.add(orderButton);
    
    // add to the frame
    this.add(orderPanel, BorderLayout.CENTER);
    this.setVisible(true);
  }
  
  public static void main (String[] args)
  {
    new TestCheckBox();
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    String command = e.getActionCommand();
    String order = "The order is:";
    
    if (command.equals("Order"))
    {
      if (pineappleBox.isSelected())
      {
        order = order + " Pineapple";
      }
      // needs to be if statement, so then it won't take away checkbox
      if (pepperoniBox.isSelected())
      {
        order = order + " Pepperoni";
      }
      // needs to be if statement, so then it won't take away checkbox
      if (chilliesBox.isSelected())
      {
        order = order + " Chillies";
      }
      if (sauceButton.isSelected())
      {
        order = order + " With Sauce";
      }
      if (noSauceButton.isSelected())
      {
        order = order + " With No Sauce";
      }
      
      orderLabel.setText(order);
      this.add(orderLabel, BorderLayout.NORTH);
      
      this.validate();
      this.repaint();
    }
  }
}

