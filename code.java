import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class photo {
    public  photo (){
        JFrame Frm=new JFrame("My Window") ;
        JLabel lab=new JLabel("Enter The Name");
        Frm.setLayout(new FlowLayout());
        Frm.setSize(500,500);
        Frm.add(lab);
        Frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField jtf=new JTextField(20);
        Frm.add(jtf);
        String s =jtf.getText();
        ImageIcon il=new ImageIcon("C:\\Users\\shreya\\Pictures\\Saved Pictures\\rabbit.jpg");
        JLabel l2=new JLabel();
        Frm.add(l2);
        jtf.addActionListener(new ActionListener(){
   
           
           public void actionPerformed(ActionEvent arg0) {
             l2.setText(jtf.getText())  ;
               
           }
       });
        JButton jb=new JButton ("Icon");
         jb.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent arg) {
               String s =arg.getActionCommand();
               if(s.equals("Icon")){
                   l2.setIcon(il);
               }
           }
         });
           
         Frm.add(jb);
          Frm.setVisible(true);
   
       }
       public static void main (String [] args){
           SwingUtilities.invokeLater(new Runnable (){
           public void run(){
               new  photo();
           }
       });
       
     }
    
}
