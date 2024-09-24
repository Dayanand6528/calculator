import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class combo extends JFrame implements ItemListener{
 JComboBox jc;
JLabel l1,l2,l3,l4;
JTextField t1,t2,t3;
public combo()
{
setSize(400,300);
Container c=getContentPane();
c.setLayout(new GridLayout(4,2));
l1=new JLabel("First Number:");
l2=new JLabel("Second Number:");
l3=new JLabel("Operator:");
l4=new JLabel("Result");
t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
jc=new JComboBox();
jc.addItem("+");
jc.addItem("-");
jc.addItem("/");
jc.addItem("*");
c.add(l1);
c.add(t1);
c.add(l2);
c.add(t2);
c.add(l3);
c.add(jc);
c.add(l4);
c.add(t3);
jc.addItemListener(this);
setVisible(true);

}
public void itemStateChanged(ItemEvent e)
{
     	int a,b,c=0;;
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        String s=(String)jc.getSelectedItem();
        if(s.equals("+"))
 	c=a+b;
	else if(s.equals("-"))
	c=a-b;
	else if(s.equals("/"))
	c=a/b;
	else if(s.equals("*"))
	c=a*b;
	t3.setText(Integer.toString(c));

   }
}
class Combobox {
    public static void main(String args[])
  {
	new combo();
     }
}
























