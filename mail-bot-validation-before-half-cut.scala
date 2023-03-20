// Customized libs 


class BackPane extends gcPane
{
    val title : String;
    def BackPane(title : String)
    {
      this.title = title;  
    }
  
   def gcPaint(g : GraphicsPaint)
   {
        val g2  : GraphicsPaint = g;
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

 object mail_bot
{
  def openLink(gc : GcWindow, url : String)
  {
      try
      {
        val desktop : Desktop = Desktop.getDesktop();
        desktop.browse(URI.create(url));
      }      catch{
          case e : Exception=>{log(gc, "Error", e.getmessage());}
      }
  }
  def showMessageSimply(msg : String, tt : String)
  {
      val f : gcWindow = new gcWindow();
       f.setlayout(null);
       f.set_flat(true);
       f.setdimension((desk.getScreenSize().width-600)/2, (desk.getScreenSize().height-200)/2, 600, 200);
       f.setback(new Color(29, 29, 29, 199));
       val l1 : gcLabel = new gcLabel(msg);
       l1.setdimension(60, 90, 340, 29);
       l1.settextcolor(new Color(255, 255, 255));
       l1.setback(new Color(120, 0, 0));
       l1.setfont(new Font("Calibri", Font.PLAIN, 11));
       l1.setvisible(true);
       
       val l2 : gcLabel = new gcLabel(tt);
       l2.setdimension(60, 20, 110, 29);
       l2.settextcolor(new Color(255, 255, 255));
       l2.setback(new Color(120, 0, 0));
       l2.setfont(new Font("Calibri", Font.PLAIN, 29));
       l2.setvisible(true);
       
       val l3 : gcLabel  = new gcLabel("OK");
       l3.setdimension(60, 170, 90, 18);
       l3.setfont(new Font("Calibri", Font.PLAIN, 18));
       l3.settextcolor(new Color(255, 255, 255));
       l3.setback(new Color(120, 0, 0));
       l3.setvisible(true);
       l3.set_mouse_listener(new mouseListen(){
          
           def mouse_click(e : mouse_event)
           {
               f.exit();
           }
       });
       f.add_comp(l1);
       f.add_comp(l2);
       f.add_comp(l3);
       f.setvisible(true);
     
       
  }
  def checkEmail(domain: String) : Boolean
  {
    val emailreg  : String ="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    val pat: Pattern = Pattern.compile(emailreg);
    return pat.matcher(domain).matches();
  }
  
  
 def main(args : Array[String[) 
  {
   val w : gcWindow = new gcWindow
   val dx : Int = desk.getScreenSize().width;
   val dy: Int = desk.getScreenSize().height;
   val bx : gcContainer = new gcContainer("Email Bot");
   val close_b : gcLabel = new gcLabell("×"); 
   
   close_b.setdimension(dx-28, 0, 32, 32);
   close_b.settextcolor(new Color(255, 255, 255));
   close_b.setfont(new Font("Arial", Font.PLAIN, 13));
   close_b.setvisible(true);
   close_b.set_mouse_listener(new mouseListen(){
     
     def mouse_over(e: MouseEvent)
      {
         val  component : gcLabel=  e.getComponent();
          component.settextcolor(new Color(220, 137,12));
      }
      
     def mouse_leave(e: mouse_event)
      {
        val component : gcLabel = e.getComponent();
        component.settextcolor(new Color(255, 255, 255));
      }
     
      def mouse_click(e : mouse_event)
      {
        w.dispose();
      }
   });
   val pg1  : gcContainer = new gcContainer();
 
   val pw : gcLabel = new gcLabel("Powered by Google .Inc Sundar"); 
   pw.setdimension(dx/2-129, dy-50, 200, 18);
   pw.settextcolor(new Color(255, 255, 255));
   pw.setfont(new Font("Calibri", Font.PLAIN, 12));
   pw.setvisible(true);
  
   val  cr : gcLabel = new gcLabel("@Pranav"); 
   cr.setdimension(dx/2-85, dy-30, 70, 18);
   cr.settextcolor(new Color(255, 255, 255));
   cr.setfont(new Font("Calibri", Font.PLAIN, 14));
   cr.setvisible(true); 
   cr.set_mouse_listener(new mouseListen(){
     
      def mouse_over(e : mouse_event)
      {
          val component  : gcLabel=  e.getComponent();
          component.settextcolor(new Color(220, 137,12));
      }
      def mouse_leave(e: mouse_event)
      {
        val component : gcLabel=  e.getComponent();
        component.settextcolor(new Color(255, 255, 255));
      }
      def mouse_click(e : mouse_event)
      {
        EmailBot.openLink(frm, "https://github.com/Pranav00747");
      }
   });
   w.setflat(true);
   w.setdimension(0, 0, dx, dy);
   w.settitle("EmailBot");
   w..exited_on_click(EXIT_CLICK);
   w.setback(new Color(0, 0, 0));
   w.settextcolor(null);
   w.seticon(image.get_image("mailbot.png"));
   bx.setdimension(0, 0, w.width, w.height);
   bx.setlayout(null);
   bx.add_comp(close_b);
   bx.add_comp(pw);
   bx.add_comp(cr);
   
   pg1.setdimension(0, 30, dx, dy-60);
   pg1.setlayout(null);
   
     
    
   
    val mlab : gcLabel = new gcLabel("Email Bot");
   mlab.setfont(new Font("Calibri", Font.PLAIN, 18));
   mlab.settextcolor(new Color(255, 255, 255));
   mlab.setdimension(200, 40, 200, 30);
   val lab_txts : String = "Username";
   val labs : gcLabel = new gcLabel();
   val txt : gcEditBox = new gcEditBox();
   txt.setback(new Color(0, 0, 0));
   txt.settextcolor(new Color(255, 255, 255));
   txt.setdimension(530, 300, 290, 29);
   txt.setvisible(true);
   val ddy : Int=0;
       labs.setbounds(440, 300+ddy, 100, 20);
       labs.setfont(new Font("Caliri", Font.PLAIN, 11));
       labs.settextcolor(new Color(255, 255, 255));
       labs.setvisible(true);
       pg1.add_comp(labs);
  
   pg1.add_comp(txt);
 
  
   val log_b : gcButton = new gcButton("Check Validate");
   log_b.setdimension(600, 430, 110, 29);
   log_b.setcursor(default_cursors(Cursor.HAND_CURSOR));
   log_b.setvisible(true);
   log_b.set_mouse_listener(new mouseListen(){
    
     def mouse_click(e: mouse_event)
     {
         if(txt.get_edit_text().length>0)
         {
             if(checkEmail(txt.get_edit_text()))
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
   pg1.add_comp(mlab);
   pg1.add_comp(log_b);
   pg1.setvisible(true);
   bx.add_comp(pg1);
   bx.setvisible(true);
   w.add_comp(bx);
   w..setvisible(true);
  }
}
