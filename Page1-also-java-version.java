package Pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page1 extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2.drawImage(Toolkit.getDefaultToolkit().getImage("GmailLogo.png"), 30, 20, 131, 90, this);
        g2.setColor(new Color(255, 255, 255, 10));
        g2.fillRoundRect(360, getHeight()/2-120, 600, 300, 18, 18);
        
    } 
}