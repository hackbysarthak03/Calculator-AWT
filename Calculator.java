import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener{
    Panel p1,p2,p3,p4,p5;
    Label t1,t2;
    Label result,op;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0, plus, minus, mul, div, mod, dot,ac,cl1,cl2;
    CheckboxGroup cg;
    Checkbox c1,c2;
        public Calculator(){


            setVisible(true);
            setBounds(100,100,300,400);
            setBackground(Color.white);
            setTitle("Calculator");
            
            GridLayout g1 = new GridLayout(2,1);
            setLayout(g1);


            p1 = new Panel();
            add(p1);
            GridLayout g2 = new GridLayout(4,1);
            p1.setLayout(g2);

            p3 = new Panel();
            p1.add(p3);
            GridLayout g3 = new GridLayout(1,3);
            p3.setLayout(g3);
            t1 = new Label("",Label.CENTER);
            t2 = new Label("",Label.CENTER);
            p3.add(t1);
            op = new Label("");
            p3.add(op);
            op.setAlignment(Label.CENTER);
            p3.add(t2);
            p4 = new Panel();
            p4.setLayout(g3);
            p1.add(p4);
            cg = new CheckboxGroup();
            c1 = new Checkbox("First Number",cg,true);
            c2 = new Checkbox("Second Number",cg,false);
            p4.add(c1);
            p4.add(c2);
            
            result = new Label("");
            result.setAlignment(Label.CENTER);
            p1.add(result);
            result.setBackground(Color.YELLOW);
            p5 = new Panel();
            p1.add(p5);
            GridLayout g5 = new GridLayout(1,3);
            p5.setLayout(g5);

            ac = new Button("AC");
            ac.setBackground(Color.cyan);
            p5.add(ac);
            cl1 = new Button("Clr First Num");
            cl1.setBackground(Color.cyan);
            p5.add(cl1);
            cl2 = new Button("Clr Second Num");
            cl2.setBackground(Color.cyan);
            p5.add(cl2);
            ac.addActionListener(this);
            cl1.addActionListener(this);
            cl2.addActionListener(this);

            p2 = new Panel();
            add(p2);
            
            GridLayout g4 = new GridLayout(4,4);
            p2.setLayout(g4);
            b1 = new Button("1");
            b2 = new Button("2");
            b3 = new Button("3");
            b4 = new Button("4");
            b5 = new Button("5");
            b6 = new Button("6");
            b7 = new Button("7");
            b8 = new Button("8");
            b9 = new Button("9");
            b0 = new Button("0");
            plus  = new Button("+");
            minus = new Button("-");
            mul = new Button("*");
            div = new Button("/");
            mod = new Button("%");
            dot = new Button(".");
            p2.add(b7);
            p2.add(b8);
            p2.add(b9);
            p2.add(plus);
            p2.add(b4);
            p2.add(b5);
            p2.add(b6);
            p2.add(minus);
            p2.add(b1);
            p2.add(b2);
            p2.add(b3);
            p2.add(mul);
            p2.add(b0);
            p2.add(dot);
            p2.add(mod);
            p2.add(div);
            b1.setBackground(Color.pink);
            b2.setBackground(Color.pink);
            b3.setBackground(Color.pink);
            b4.setBackground(Color.pink);
            b5.setBackground(Color.pink);
            b6.setBackground(Color.pink);
            b7.setBackground(Color.pink);
            b8.setBackground(Color.pink);
            b9.setBackground(Color.pink);
            b0.setBackground(Color.pink);
            plus.setBackground(Color.CYAN);
            minus.setBackground(Color.CYAN);
            mul.setBackground(Color.CYAN);
            div.setBackground(Color.CYAN);
            dot.setBackground(Color.CYAN);
            mod.setBackground(Color.CYAN);
            plus.addActionListener(this);
            minus.addActionListener(this);
            mul.addActionListener(this);
            div.addActionListener(this);
            mod.addActionListener(this);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            b7.addActionListener(this);
            b8.addActionListener(this);
            b9.addActionListener(this);
            b0.addActionListener(this);
            dot.addActionListener(this);

        }
        public static void main(String[] args){
            Calculator c = new Calculator();
            c.addWindowListener(new Window_a());
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Object obj  = e.getSource();
           
           try{

            if(obj == plus){
                String s = Integer.toString(Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText()));
                result.setText(s);
                op.setText(plus.getLabel());
            }
            if(obj == minus){
                String s = Integer.toString(Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText()));
                result.setText(s);
                op.setText(minus.getLabel());
            }
            if(obj == mul){
                String s = Integer.toString(Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText()));
                result.setText(s);
                op.setText(mul.getLabel());
            }
            if(obj == div){
                String s = Double.toString(Double.parseDouble(t1.getText()) / Double.parseDouble(t2.getText()));
                result.setText(s);
                op.setText(div.getLabel());
            }
            if(obj == mod){
                String s = Integer.toString(Integer.parseInt(t1.getText()) % Integer.parseInt(t2.getText()));
                result.setText(s);
                op.setText(mod.getLabel());
            }
        }catch(Exception a){
            result.setText("Error Occured");
            
        }

        if(obj == ac){
            result.setText("");
            t1.setText("");
            t2.setText("");
        }
        if(obj == cl1){
            t1.setText("");  
        }
        if(obj == cl2){
            t2.setText("");   
        }

            if(obj == b1 || obj == b2 || obj == b3 || obj == b4 || obj == b5 || obj == b6 || obj == b7 || obj == b8 || obj == b9 || obj == b0 || obj == dot){
                if(c1.getState() == true){
                    String s = new String();
                    if( obj == b1)
                    s = t1.getText() + b1.getLabel();
                    if( obj == b2)
                    s = t1.getText() + b2.getLabel();
                    if( obj == b3)
                    s = t1.getText() + b3.getLabel();
                    if( obj == b4)
                    s = t1.getText() + b4.getLabel();
                    if( obj == b5)
                    s = t1.getText() + b5.getLabel();
                    if( obj == b6)
                    s = t1.getText() + b6.getLabel();
                    if( obj == b7)
                    s = t1.getText() + b7.getLabel();
                    if( obj == b8)
                    s = t1.getText() + b8.getLabel();
                    if( obj == b9)
                    s = t1.getText() + b9.getLabel();
                    if( obj == b0)
                    s = t1.getText() + b0.getLabel();
                    if( obj == dot)
                    s = t1.getText() + dot.getLabel();
            
                    
                    t1.setText(s);
                }

                if(c2.getState() == true){
                    String s = new String();
                    if( obj == b1)
                    s = t2.getText() + b1.getLabel();
                    if( obj == b2)
                    s = t2.getText() + b2.getLabel();
                    if( obj == b3)
                    s = t2.getText() + b3.getLabel();
                    if( obj == b4)
                    s = t2.getText() + b4.getLabel();
                    if( obj == b5)
                    s = t2.getText() + b5.getLabel();
                    if( obj == b6)
                    s = t2.getText() + b6.getLabel();
                    if( obj == b7)
                    s = t2.getText() + b7.getLabel();
                    if( obj == b8)
                    s = t2.getText() + b8.getLabel();
                    if( obj == b9)
                    s = t2.getText() + b9.getLabel();
                    if( obj == b0)
                    s = t2.getText() + b0.getLabel();
                    if( obj == dot)
                    s = t2.getText() + dot.getLabel();

                    t2.setText(s);
                }
            }
            
        }
}
class Window_a implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        e.getWindow().dispose();
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Calculator Closed !! ");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
