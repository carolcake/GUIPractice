/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testguie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author carolinehsu
 */
public class Help extends JFrame
{
  private JLabel helpLabel;
  public Help()
  {
    this.setBounds(100,100,400,400);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.getContentPane().setBackground(Color.red);
    this.setLayout(new BorderLayout());
    
    this.helpLabel = new JLabel("Figure it out!");
    helpLabel.setFont(new Font("Arial",Font.PLAIN,25));
    
    this.add(helpLabel, BorderLayout.CENTER);
    this.setVisible(true);
  }
  
  public static void main (String[] args)
  {
    new Help();
  }
}


