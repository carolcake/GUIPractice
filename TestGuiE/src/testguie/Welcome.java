/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testguie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Welcome extends JFrame implements ActionListener
{
  
  public static final Color CAROLINE_COLOR = new Color(201, 71, 245);
  public static final Font ASK_FONT = new Font("Comic Sans Ms", Font.BOLD, 64);
  private JLabel askLabel;
  private JLabel imageLabel;
  private JButton yesButton;
  private JButton noButton;
  private JPanel buttonPanel;
  public Welcome()
  {
    super("HI!");
    this.setBounds(0, 0, 2560, 1600);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.getContentPane().setBackground(CAROLINE_COLOR);
    this.setLayout(new BorderLayout());
    
    this.askLabel = new JLabel("<html><center>I want you to be the exception that I catch at Hoco.<br>Will you be my ActionListener and notice everything I do too?</center></html>", SwingConstants.CENTER);
    askLabel.setFont(ASK_FONT);
    
    this.yesButton = new JButton("Yes!");
    yesButton.addActionListener(this);
    this.noButton = new JButton("No :(");
    noButton.addActionListener(this);
    this.buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.setBackground(CAROLINE_COLOR);
    buttonPanel.add(yesButton);
    buttonPanel.add(noButton);
    
    this.add(buttonPanel, BorderLayout.SOUTH);
    this.add(askLabel, BorderLayout.NORTH);
    
    this.setVisible(true);
  }
  
  public static void main(String[] args)
  {
    new Welcome();
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    Object command = e.getSource();
    if (command == noButton)
    {
      this.getContentPane().setBackground(Color.RED);
      askLabel.setText("Stop bool(ean)ying me :(");
      askLabel.setFont(new Font("Comic Sans Ms", Font.BOLD|Font.ITALIC, 125));
      this.add(askLabel, BorderLayout.NORTH);
    }
    else if (command == yesButton)
    {
      this.getContentPane().setBackground(Color.GREEN);
      askLabel.setText("YAY!");
      askLabel.setFont(new Font("Comic Sans Ms", Font.BOLD|Font.ITALIC, 500));
      this.add(askLabel, BorderLayout.NORTH);
    }
    this.validate();
    this.repaint();
  }
}