/*
warning frame 9/22/2021
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
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;


public class Warning extends JFrame implements ActionListener
{
  private JLabel warningLabel;
  private JButton exitButton;
  private JButton closeButton;
  private JPanel buttonPanel;
  
  public Warning(String message)
  {
    super("Warning Frame");
    this.setBounds(200, 200, 500, 500);
    // default close operation to dispose
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.getContentPane().setBackground(Color.RED);
    // making an anonymous object
    this.setLayout(new BorderLayout());
    this.warningLabel = new JLabel(message, SwingConstants.CENTER);
    warningLabel.setFont(Start.BIG_FONT);

    // construct buttons for navigation
    exitButton = new JButton("Exit the Program");
    exitButton.addActionListener(this);
    closeButton = new JButton("Close the Window");
    closeButton.addActionListener(this);
    buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.setBackground(Color.BLUE);

    buttonPanel.add(closeButton);
    buttonPanel.add(exitButton);
    this.add(warningLabel, BorderLayout.NORTH);
    this.add(buttonPanel, BorderLayout.SOUTH);

    // construct label to display message
    this.setVisible(true);
  }
  
  
  public static void main(String[] args)
  {
    new Warning("what is wrong with you...???");
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    Object command = e.getSource();
    if (command == exitButton)
    {
      System.exit(0);
    }
    else if (command == closeButton)
    {
      this.dispose();
    }
  }
}
