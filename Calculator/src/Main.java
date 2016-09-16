import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public final class Main extends JFrame implements ActionListener{

    private static JFrame frame;  

    
    private static JTextField display = new JTextField();
    private static JButton seven = new JButton("7");
    private static JButton eight = new JButton("8");
    private static JButton nine = new JButton("9");
    private static JButton four = new JButton("4");
    private static JButton five = new JButton("5");
    private static JButton six = new JButton("6");
    private static JButton one = new JButton("1");
    private static JButton two = new JButton("2");
    private static JButton three = new JButton("3");
    private static JButton zero = new JButton("0");
    
    
    private static JButton Add = new JButton("+");
    private static JButton Multiply = new JButton("*");
    private static JButton Div = new JButton("/");
    private static JButton Sub = new JButton("-");
    private static JButton Period = new JButton(".");
    private static JButton Negative = new JButton("+ / -");
    private static JButton Clear = new JButton("C");
    private static JButton Equals = new JButton("=");
    
    static double Result =0, num1 =0, num2 =0;
    static int Operator =0;
   
    
    public Main() throws FileNotFoundException{
     frame = new JFrame("Calc");  
      frame.setSize(420, 468);
      frame.setLayout(null);
      frame.setLocationRelativeTo(null);    //center
      
      display.setBounds(80,50,250,20);
      seven.setBounds(80,90,60,30);
      eight.setBounds(140,90,60,30);
      nine.setBounds(200,90,60,30);
      four.setBounds(80,120,60,30);
      five.setBounds(140,120,60,30);
      six.setBounds(200,120,60,30);
      one.setBounds(80,150,60,30);
      two.setBounds(140,150,60,30);
      three.setBounds(200,150,60,30);
      zero.setBounds(80,180,60,30);
      Period.setBounds(140,180,60,30);
      Negative.setBounds(200,180,60,30);
      Add.setBounds(260,90,50,30);
      Div.setBounds(260,120,50,30);
      Multiply.setBounds(260,150,50,30);
      Sub.setBounds(260,180,50,30);
      Clear.setBounds(330,90,50,60);
      Equals.setBounds(330,150,50,60);
      
      
      
      seven.addActionListener(this);
      eight.addActionListener(this);
      nine.addActionListener(this);
      four.addActionListener(this);
      five.addActionListener(this);
      six.addActionListener(this);
      one.addActionListener(this);
      two.addActionListener(this);
      three.addActionListener(this);
      zero.addActionListener(this);
      Period.addActionListener(this);
      Negative.addActionListener(this);
      Add.addActionListener(this);
      Multiply.addActionListener(this);
      Div.addActionListener(this);
      Sub.addActionListener(this);
      Clear.addActionListener(this);
      Equals.addActionListener(this);
      
     
      frame.add(display);
      frame.add(seven);
      frame.add(eight);
      frame.add(nine);
      frame.add(four);
      frame.add(five);
      frame.add(six);
      frame.add(one);
      frame.add(two);
      frame.add(three);
      frame.add(zero);
      frame.add(Period);
      frame.add(Negative);
      frame.add(Add);
      frame.add(Multiply);
      frame.add(Div);
      frame.add(Sub);
      frame.add(Clear);
      frame.add(Equals);
      
      
      frame.setResizable(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);   //show frame
      
   
    }//end Main

    
    @Override
    public void actionPerformed (ActionEvent e) {      
         try
        {
       // Numbers
        if(e.getSource()==seven){
            display.setText(display.getText().concat("7"));
        }
        
        else if(e.getSource()==eight){
           display.setText(display.getText().concat("8"));
        }
        
        else if(e.getSource()==nine){
            display.setText(display.getText().concat("9"));
        }
        
        else if(e.getSource()==four){
            display.setText(display.getText().concat("4"));
        }
        
        else if(e.getSource()==five){
            display.setText(display.getText().concat("5"));
        }
        
        else if(e.getSource()==six){
            display.setText(display.getText().concat("6"));
        }
        
        else if(e.getSource()==one){
            display.setText(display.getText().concat("1"));
        }
        
        else if(e.getSource()==two){
            display.setText(display.getText().concat("2"));
        }
        
        else if(e.getSource()==three){
            display.setText(display.getText().concat("3"));
        }
        
        else if(e.getSource()==zero){
            display.setText(display.getText().concat("0"));
        }
        
        else if(e.getSource()==Period){
            display.setText(display.getText().concat("."));
        }
        else if(e.getSource()==Negative){
            double sign = Double.parseDouble(String.valueOf(display.getText()));
            sign = sign * (-1);
            display.setText(String.valueOf(sign));
        }
        
        // Operations
        if(e.getSource()==Add){
            num1=Double.parseDouble(display.getText());
            display.setText("");
            Operator=1;
        }
        else if(e.getSource()==Multiply){
            num1=Double.parseDouble(display.getText());
            display.setText("");
            Operator=2;
        }
        else if(e.getSource()==Div){
            num1=Double.parseDouble(display.getText());
            display.setText("");
            Operator=3;
        }
        else if(e.getSource()==Sub){
            num1=Double.parseDouble(display.getText());
            display.setText("");
            Operator=4;
        }
        
       
        if(e.getSource()==Equals){
            
            String value;
            num2=Double.parseDouble(display.getText());
            
            if(Operator == 1) {
                Result = num1 + num2;
                value = String.format("%.0f", Result);
                display.setText(value);
            }
            else if(Operator == 2) {
                Result = num1 * num2;
                value = String.format("%.0f", Result);
                display.setText(value);
            }
            else if(Operator == 3) {
                Result = num1 / num2;
                value = String.format("%.0f", Result);
                display.setText(value);
            }
            else if(Operator == 4) {
                Result = num1 - num2;
                value = String.format("%.0f", Result);
                display.setText(value);
            }
            

        }
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, nfe);
        }catch(RuntimeException re){
            JOptionPane.showMessageDialog(null, re);
        }
        
        if(e.getSource()==Clear){
            display.setText(null);
        }
    }//end action performed()
         
    public static void main(String[] args) throws java.io.IOException{
            Main gui = new Main();
            gui.frame.setVisible(true);
            
    }

}
