/*
Caroline Hsu - 9/20/2021
example gui spedrun in class
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

public class Start extends JFrame implements ActionListener
{
  public static final Color NICE_COLOR = new Color(5,67,129,250); // r,g,b,opacity
  public static final Font BIG_FONT = new Font("Comic Sans", Font.BOLD | Font.ITALIC, 25);
  // | signifies both bold and italic fonts
  private final URL RANDOM_IMG_PATH = getClass().getResource("Random Photo copy.JPG");
  private final ImageIcon RANDOM_IMAGE = new ImageIcon(new ImageIcon
    (RANDOM_IMG_PATH).getImage().getScaledInstance(252,329,Image.SCALE_DEFAULT));
  
  // label, panel, and button is attribute of Start
  // not static so it is an instance variable
  // 
  private JLabel message;
  private JLabel randomImageLabel;
  
  private JPanel buttonPanel;
  private JButton input;
  
  // constructor = public, same as class name, no return type
  public Start()
  {
    // constructing/initializing the frame
    super("Starting Frame");
    // 75 from top left, go 40 down
    // 1000 and 800 is size
    this.setBounds(75,40,1000,800);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.getContentPane().setBackground(NICE_COLOR);
    this.setLayout(new BorderLayout());
    
    // construct the labels
    this.message = new JLabel("welcome to my lovely program!", SwingConstants.CENTER);
    this.message.setFont(BIG_FONT);
    this.message.setForeground(Color.WHITE);
    this.randomImageLabel = new JLabel(RANDOM_IMAGE);
    
    
    // construct the panel and the button
    input = new JButton("Input");
    input.addActionListener(this);
    this.buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.setBackground(Color.MAGENTA);
    buttonPanel.add(input);
    
    // add components to frame
    this.add(message, BorderLayout.NORTH);
    this.add(randomImageLabel, BorderLayout.CENTER);
    this.add(buttonPanel, BorderLayout.SOUTH);
    
    // always the last statement in any constructor
    this.setVisible(true);
  }
  
  public static void main(String[] args)
  {
    // no name = anonymous object
    new Start();
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    // action command gets button name
    String command = e.getActionCommand();
    if (command.equals("Input"))
    {
      this.dispose();
      new Input();
    }
  }
  
}
