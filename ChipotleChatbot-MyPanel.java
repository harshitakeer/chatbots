import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class MyPanel{


MyPanel(){

    // Type Code here
  ImageIcon image1 = new ImageIcon("theRealChip.jpeg");

  //JLabel which has text and images

  JLabel label1 = new JLabel();
  label1.setText("I'm Chip, your Chipotle Chatbot! :)");
  label1.setIcon(image1);

  label1.setHorizontalTextPosition(JLabel.CENTER);
  //sets text in relation to image, right left, center
  label1.setVerticalTextPosition(JLabel.TOP);
  //center, top or bottom

  label1.setHorizontalAlignment(JLabel.RIGHT);
  label1.setVerticalAlignment(JLabel.TOP);

  label1.setFont(new Font("Times New Roman", Font.BOLD,18));
  label1.setForeground(new Color(0xFFFFFF));
  label1.setBackground(new Color(0xBE3749));
  label1.setOpaque(true);
  //new color(0x______);

  Border border1 = BorderFactory.createLineBorder(new Color(0x659948), 10);
  label1.setBorder(border1);



  //create a Jframe called frame1
  JFrame frame1 = new JFrame();
  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame1.setSize(500,500);
  frame1.setVisible(true);    
  frame1.add(label1);
  frame1.pack();



}




}