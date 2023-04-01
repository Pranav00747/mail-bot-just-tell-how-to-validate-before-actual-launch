import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URI;
import Pages.Page1;
import Buttonx.Buttonx;
import MailView.MailView;
import java.util.regex.Pattern;
import java.util.*;


class BackPane extends JPanel
{
    private String title;
    public BackPane(String title)
    {
      this.title = title;  
    }
  @Override
   public void paintComponent(Graphics g)
   {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(new GradientPaint(getWidth(), getHeight(), new Color(44, 44, 44), getWidth(), getHeight(), new Color(64, 64, 64)));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.setPaint(new GradientPaint(getWidth(), getHeight(), new Color(24, 24, 24, 44), getWidth(), getHeight(), new Color(34, 34, 34, 44)));
        g2.fillRoundRect(0, 0, getWidth(), 29, 18, 18);
        g2.setFont(new Font("Calibri", Font.PLAIN, 11));
        g2.setColor(new Color(255, 255, 255));
        g2.drawString(title, 20, 18);
        
    }
}

public class EmailBot
{
  public static void openLink(JFrame frm, String url)
  {
      try
      {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(URI.create(url));
      }      catch(Exception e)

      {
          JOptionPane.showMessageDialog(frm, "Error", e.getMessage(), JOptionPane.WARNING_MESSAGE);
      }
  }
  public static void showMessageSimply(String msg, String tt)
  {
      final JFrame f  = new JFrame();
       f.setLayout(null);
       f.setUndecorated(true);
       f.setBounds((Toolkit.getDefaultToolkit().getScreenSize().width-600)/2, (Toolkit.getDefaultToolkit().getScreenSize().height-200)/2, 600, 200);
       f.setBackground(new Color(29, 29, 29, 199));
       JLabel l1 = new JLabel(msg);
       l1.setBounds(60, 90, 340, 29);
       l1.setForeground(new Color(255, 255, 255));
       l1.setBackground(new Color(120, 0, 0));
       l1.setFont(new Font("Calibri", Font.PLAIN, 11));
       l1.setVisible(true);
       
       JLabel l2 = new JLabel(tt);
       l2.setBounds(60, 20, 110, 29);
       l2.setForeground(new Color(255, 255, 255));
       l2.setBackground(new Color(120, 0, 0));
       l2.setFont(new Font("Calibri", Font.PLAIN, 29));
       l2.setVisible(true);
       
       JLabel l3  = new JLabel("OK");
       l3.setBounds(60, 170, 90, 18);
       l3.setFont(new Font("Calibri", Font.PLAIN, 18));
       l3.setForeground(new Color(255, 255, 255));
       l3.setBackground(new Color(120, 0, 0));
       l3.setVisible(true);
       l3.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e)
           {
               super.mouseClicked(e);
               f.dispose();
           }
       });
       f.add(l1);
       f.add(l2);
       f.add(l3);
       f.setVisible(true);
     
       
  }
  public static boolean checkEmail(String domain)
  {
     String emailreg ="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    Pattern pat = Pattern.compile(emailreg);
    return pat.matcher(domain).matches();
  }
  
  
  public static void main(String args[]) throws Exception
  {
   final JFrame frm = new JFrame();
   int dx = Toolkit.getDefaultToolkit().getScreenSize().width;
   int dy = Toolkit.getDefaultToolkit().getScreenSize().height;
   final BackPane bx = new BackPane("Email Bot");
   JLabel close_b = new JLabel("×"); 
   
   close_b.setBounds(dx-28, 0, 32, 32);
   close_b.setForeground(new Color(255, 255, 255));
   close_b.setFont(new Font("Arial", Font.PLAIN, 13));
   close_b.setVisible(true);
   close_b.addMouseListener(new MouseAdapter(){
      @Override
      public void mouseEntered(MouseEvent e)
      {
          super.mouseEntered(e);
          JLabel component = (JLabel) e.getComponent();
          component.setForeground(new Color(220, 137,12));
      }
      @Override
      public void mouseExited(MouseEvent e)
      {
        super.mouseExited(e);
        JLabel component = (JLabel) e.getComponent();
        component.setForeground(new Color(255, 255, 255));
      }
      @Override
      public void mouseClicked(MouseEvent e)
      {
        super.mouseClicked(e);
        frm.dispose();
      }
   });
   final Page1 pg1 = new Page1();
 
   JLabel pw = new JLabel("Powered by Google .Inc Sundar"); 
   pw.setBounds(dx/2-129, dy-50, 200, 18);
   pw.setForeground(new Color(255, 255, 255));
   pw.setFont(new Font("Calibri", Font.PLAIN, 12));
   pw.setVisible(true);
  
   JLabel cr = new JLabel("@Pranav"); 
   cr.setBounds(dx/2-85, dy-30, 70, 18);
   cr.setForeground(new Color(255, 255, 255));
   cr.setFont(new Font("Calibri", Font.PLAIN, 14));
   cr.setVisible(true); 
   cr.addMouseListener(new MouseAdapter(){
      @Override
      public void mouseEntered(MouseEvent e)
      {
          super.mouseEntered(e);
          JLabel component = (JLabel) e.getComponent();
          component.setForeground(new Color(220, 137,12));
      }
      @Override
      public void mouseExited(MouseEvent e)
      {
        super.mouseExited(e);
        JLabel component = (JLabel) e.getComponent();
        component.setForeground(new Color(255, 255, 255));
      }
      @Override
      public void mouseClicked(MouseEvent e)
      {
        super.mouseClicked(e);
        EmailBot.openLink(frm, "https://github.com/Pranav00747");
      }
   });
   frm.setUndecorated(true);
   frm.setBounds(0, 0, dx, dy);
   frm.setTitle("EmailBot");
   frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frm.setBackground(new Color(0, 0, 0));
   frm.setLayout(null);
   frm.setIconImage(Toolkit.getDefaultToolkit().getImage("mailbot.png"));
   bx.setBounds(0, 0, frm.getWidth(), frm.getHeight());
   bx.setLayout(null);
   bx.add(close_b);
   bx.add(pw);
   bx.add(cr);
   
   pg1.setBounds(0, 30, dx, dy-60);
   pg1.setLayout(null);
   
     
    
   
   JLabel mlab = new JLabel("Email Bot");
   mlab.setFont(new Font("Calibri", Font.PLAIN, 18));
   mlab.setForeground(new Color(255, 255, 255));
   mlab.setBounds(200, 40, 200, 30);
   String lab_txts[] = {"Username"};
   JLabel labs[] = new JLabel[2];
   final JTextField txt = new JTextField();
   txt.setBackground(new Color(0, 0, 0));
   txt.setForeground(new Color(255, 255, 255));
   txt.setBounds(530, 300, 290, 29);
   txt.setVisible(true);
   int ddy=0;
   for(int x=0;x<1;x++)
   {
       labs[x] = new JLabel(lab_txts[x]);
       labs[x].setBounds(440, 300+ddy, 100, 20);
       labs[x].setFont(new Font("Caliri", Font.PLAIN, 11));
       labs[x].setForeground(new Color(255, 255, 255));
       labs[x].setVisible(true);
       pg1.add(labs[x]);
       ddy+=40;
   }
  
   pg1.add(txt);
 
  
   Buttonx log_b = new Buttonx("Check Validate");
   log_b.setBounds(600, 430, 110, 29);
   log_b.setCursor(new Cursor(Cursor.HAND_CURSOR));
   log_b.setVisible(true);
   log_b.addMouseListener(new MouseAdapter(){
     @Override
     public void mouseClicked(MouseEvent e)
     {
         super.mouseClicked(e);
         if(txt.getText().length()>0)
         {
             if(checkEmail(txt.getText()))
             {
              EmailBot.showMessageSimply("This email is checked or its validated.", "Sucessful");
             }
             else
             {
                EmailBot.showMessageSimply("Please fill email to validate", "Error");
             }
         }
         else
         {
             EmailBot.showMessageSimply("Please fill email to validate", "Error");
         }
     }
   });
   pg1.add(mlab);
   pg1.add(log_b);
   pg1.setVisible(true);
   bx.add(pg1);
   bx.setVisible(true);
   frm.add(bx);
   frm.setVisible(true);
  }
}
