

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.BreakIterator;
import java.text.spi.BreakIteratorProvider;

public class f extends JFrame{

    JButton button;
    JButton button2;
    JButton button3;
    JButton button4;
    JTextArea textArea;
    JTextField field1;
    JTextField field2;
    int click=0;
    boolean jack = false;

    public f(){
        
       

        super("SLOT MACHINE");

       // setLayout(getLayout());

        setSize(500, 500);

        setLocationRelativeTo(null);

        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        field2 = new JTextField();
        field1 = new JTextField();
        button3 = new JButton("INIZIA");

        add(textArea, BorderLayout.CENTER);
        add(field2, BorderLayout.LINE_END);  
        add(field1, BorderLayout.LINE_START);
        add(button3, BorderLayout.PAGE_END);  
        
        field1.setText("                                                  ");
        field2.setText("                                                  ");

        textArea.append("\n\n\n             PUNTEGGI");
        textArea.append("\n\n       entro 3 giri → 100€");
        textArea.append("\n\n        entro 6 giri → 50€");
        textArea.append("\n\n        entro 9 giri → 10€");
        textArea.append("\n\n           giri>9 → -20€");
        textArea.append("\n\n       abbandona → -30€");
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.CYAN);
        textArea.setForeground(Color.CYAN);
        textArea.setBackground(Color.black);
        field1.setBackground(Color.CYAN);
        field2.setBackground(Color.CYAN);
        field1.setBorder(null);
        field2.setBorder(null);
        textArea.setBorder(null);
        
        textArea.setFont(new Font("Emoji",Font.PLAIN,15));
       // field1.setFont(new Font("Emoji",Font.PLAIN,15));
        //textArea.setFont(new Font("Emoji",Font.PLAIN,15));



        button3.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){

                textArea.setText(" ");
                
                remove(field1);
                remove(field2);
                remove(button3);
                secondo();
                            
            }
        });
 
        setVisible(true);
       
    }

    public void secondo(){

        field2 = new JTextField();
        field1 = new JTextField();
        button = new JButton("GIRA");
        button2 = new JButton("ABBANDONA");
         
        add(field2, BorderLayout.LINE_END);  
        add(field1, BorderLayout.LINE_START);
        add(button, BorderLayout.PAGE_START);
        add(button2, BorderLayout.PAGE_END);

        field1.setText("                                       ");
        field2.setText("                                       ");
        textArea.setForeground(Color.RED);
        textArea.setFont(new Font("Emoji",Font.PLAIN,40));
        String [] a = {"🍎","🍒","🍉"};

        button.setBackground(Color.BLACK);
        button.setForeground(Color.RED);
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.RED);

        field1.setBackground(Color.RED);
        field2.setBackground(Color.RED);

        field1.setBorder(null);
        field2.setBorder(null);
        textArea.setBorder(null);
        

        button.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){

            if(jack==false)
            {

            click++;

            int n1 = (int)(Math.random()*3);
            int n2 = (int)(Math.random()*3);
            int n3 = (int)(Math.random()*3);   
            
            String [][]mat = new String[1][3]; 

                mat[0][0]=a[n1];
                mat[0][1]=a[n2];
                mat[0][2]=a[n3];
            
            textArea.setText(""); 
            
            textArea.append("\n"+"   "+mat[0][0]+" - "+mat[0][1]+" - "+mat[0][2]+"\n");           
            
            if(n1==n2&&n1==n3)
            {
                
                jack=true;
                textArea.setText("");  
                textArea.append("\n"+" "+mat[0][0]+" - "+mat[0][1]+" - "+mat[0][2]+"\n");  
                
                if(click>9)
                {
                    textArea.append("\n\n   GIRI > 9");
                    textArea.append("\n\n      -20€");
                }

                else
                {
                textArea.append("\n  JACKPOT");
                if(click<=3)
                {
                    textArea.append("\n\n      100€");
                }
                if(click<=6 && click>3)
                {
                    textArea.append("\n\n       50€");
                }
                if(click<=9 && click>6)
                {
                    textArea.append("\n\n       10€");
                }
                
                }
                
            }
        }   
        else
        {
            saluti();
        }
        } 

        });

        button2.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){

            if(jack==false)
            {
            
            jack=true;   
            textArea.setText("");
            textArea.setText("\n\n              EXIT");      
            textArea.append("\n\n"+"              -30€");
            textArea.append("\n\n\n\n             premi\n         abbandona\n          per uscire");
            textArea.setFont(new Font("Emoji",Font.PLAIN,22));
            }

            else
            {
                saluti();
            }
        } 

        });
        
    }

    public void saluti(){

        System. exit(0);
       
    }

}