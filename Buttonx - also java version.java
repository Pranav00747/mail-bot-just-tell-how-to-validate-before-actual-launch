package Buttonx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Buttonx extends JPanel
{
  private String text;
  private Color c1;
  private Color c2;
  private Color c3;
  public Buttonx(String text)
  {
     this.text = text;
     this.c1 = new Color(29, 29, 29);
     this.c2 = new Color(49, 49, 49);
     this.c3 = new Color(255, 255, 255);
     this.setBackground(new Color(255, 255, 255, 0));
     this.addMouseListener(new MouseAdapter()
{
    @Override
      public void mouseEntered(MouseEvent e)
      {
          super.mouseEntered(e);
          c1 = new Color(120, 0, 0);
          c2 = new Color(170, 0, 0);
          c3 = new Color(0, 0, 0);
          repaint();
      }
      @Override
      public void mouseExited(MouseEvent e)
      {
        super.mouseExited(e);
          c1 = new Color(29, 29, 29);
          c2 = new Color(49, 49, 49);
          c3 = new Color(255, 255, 255);
          repaint();
      }
  });
}
@Override
   public void paintComponent(Graphics g)
   {
         super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setPaint(new GradientPaint(getWidth(), getHeight()/2, c1, getWidth(), getHeight(), c2));
    g2.fillRoundRect(0, 0, getWidth(), getHeight(), 18, 18);
   g2.setPaint(new GradientPaint(getWidth()-1, getHeight()/4-1, new Color(255, 255, 255, 10), getWidth()-1, getHeight()/2-1, new Color(255, 255, 255, 12)));
    g2.fillRoundRect(1, 1, getWidth()-1, getHeight()/2-1, 18, 18);
    g2.setColor(c3);
    g2.drawString(text, 20, 12);
   
}
}