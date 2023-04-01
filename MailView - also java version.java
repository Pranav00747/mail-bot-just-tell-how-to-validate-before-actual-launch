package MailView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MailView extends JPanel
{
    private String m_subject;
    private Color cb= new Color(29, 29, 29);
    private Color ct = new Color(255, 255, 255);
    public MailView(String subject, String from, String to, String text)
    {
       this.m_subject = subject;
       this.setBackground(this.cb);
       this.setForeground(this.ct);
       this.addMouseListener(new MouseAdapter()
{
    @Override
      public void mouseEntered(MouseEvent e)
      {
          super.mouseEntered(e);
          cb = new Color(0, 51, 102);
          ct = new Color(0, 0, 0);
          setBackground(cb);
          setForeground(ct);
          repaint();
      }
      @Override
      public void mouseExited(MouseEvent e)
      {
        super.mouseExited(e);
          cb = new Color(29, 29, 29);
          ct = new Color(255, 255, 255);
          setBackground(cb);
          setForeground(ct);
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
        g2.setColor(getForeground());
        g2.drawString(m_subject, 20, 12);
   }
}
 
      