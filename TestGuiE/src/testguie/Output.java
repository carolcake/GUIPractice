/*

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

/**
 *
 * @author carolinehsu
 */
public class Output extends JFrame implements ActionListener
{

  // labels
  private JLabel outputLabel;
  private JButton exitButton;
  private JButton closeButton;
  private JPanel buttonPanel;

  // receives the message from the force class and passes to this for frame
  public Output(String message)
  {
    super("Output Frame");
    this.setBounds(150, 150, 500, 500);
    // default close operation to do nothing on close
    this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    this.getContentPane().setBackground(Color.CYAN);
    // making an anonymous object
    this.setLayout(new BorderLayout());
    this.outputLabel = new JLabel(message, SwingConstants.CENTER);
    outputLabel.setFont(Start.BIG_FONT);

    // construct buttons for navigation
    exitButton = new JButton("Exit the Program");
    exitButton.addActionListener(this);
    closeButton = new JButton("Close the Window");
    closeButton.addActionListener(this);
    buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.setBackground(Color.BLUE);

    buttonPanel.add(closeButton);
    buttonPanel.add(exitButton);
    this.add(outputLabel, BorderLayout.NORTH);
    this.add(buttonPanel, BorderLayout.SOUTH);

    // construct label to display message
    this.setVisible(true);
  }

  public static void main(String[] args)
  {
    new Output("Hello Output!");
  }

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
