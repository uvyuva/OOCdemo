import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*<applet code="GcdLcm" width=500 height=500> </applet> */
public class GcdLcmApplet extends Applet implements ActionListener
{
  Label l1,l2,l3,l4;
  TextField t1,t2,t3,t4;
  Button b1,b2;
  public void init()
  {
      l1=new Label("Enter a value: ");
      l2=new Label("Enter a value: ");
      l3=new Label("GCD:");
      l4=new Label("LCM:");

      t1=new TextField(10);
      t2=new TextField(10);
      t3=new TextField(10);
      t4=new TextField(10);

      b1=new Button("Calculate");
      b2=new Button("Clear");
      add(l1);
      add(t1);
      add(b1);
      add(b2);
      add(l2);
      add(t2);
      add(l3);
      add(t3);
      add(l4);
      add(t4);

      b1.addActionListener(this);
      b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
      int n1=Integer.parseInt(t1.getText());
      int n2=Integer.parseInt(t2.getText());
      int gcd,lcm,remainder,numerator,denominator;

      if(ae.getSource()==b1)
      {
      if (n1>n2)
      { 
           numerator=n1;
           denominator=n2;
      }
     else
     {
          numerator=n2;
          denominator=n1;
     }
     remainder=numerator%denominator;
     while(remainder!=0)
     {
    	   numerator=denominator;
                  denominator=remainder; 
	    remainder=numerator%denominator;
     }
     gcd = denominator;
     lcm = n1*n2/gcd;


              t3.setText(String.valueOf(gcd));
              t4.setText(String.valueOf(lcm));

      }
      else if(ae.getSource()==b2)
      {
          t1.setText("");
          t2.setText("");
          t3.setText("");
          t4.setText("");

      }
     
  }
