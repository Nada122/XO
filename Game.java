/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package advanced.project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Nada
 */
public class Game extends JFrame implements ActionListener {
    JPanel p, p1,p2,pwin;
    JButton []b;
    JLabel score1, score2,w;
    JTextField text1,text2;
    
    boolean player1=true;
    JFrame f;
    JButton clear;
    

    public Game () {
      
    f= new JFrame();
    p= new JPanel();
    clear=new JButton("new game");
    clear.addActionListener(this);
    p.setLayout(new BorderLayout());
    p1= new JPanel();
    p1.setLayout(new GridLayout(3,3));
    p2= new JPanel();
   pwin= new JPanel();
    b=new JButton[9];
    score1= new JLabel(" first player Score");
    score2= new JLabel(" second player Score");
    w= new JLabel(" who wins ??");
    w.setFont(new Font("Arial", Font.ITALIC, 60));

    text1= new JTextField(10);
    text2= new JTextField(10);
    for (int i=0; i<9;i++){
        b[i] = new JButton();
       p1.add(b[i]);
        b[i].addActionListener(this);
         b[i].setBackground(new Color(0,0,0));
    }
    pwin.add(w);
    pwin.add(clear);
    p.add(pwin,BorderLayout.SOUTH);
    p.add(p1,BorderLayout.CENTER);
    p2.add(score1);
    p2.add(text1);
    p2.add(score2);
    p2.add(text2);
    p.add(p2, BorderLayout.NORTH);
    this.add(p);
    reset();
    }
public void win(){
    if(b[0].getText()=="X" && b[1].getText()=="X" && b[2].getText()=="X")
        {
           enable();
        w.setText("x win");
        score1();
        winner(0,1,2);
        }
        
    else if(b[3].getText()=="X" && b[4].getText()=="X" && b[5].getText()=="X")
       {
           enable();
            w.setText("x win");
            score1();
             winner(3,4,5);
        }
    
    else if(b[6].getText()=="X" && b[7].getText()=="X" && b[8].getText()=="X")
       {
           enable();
            w.setText("x win");
            score1();
             winner(6,7,8);
        }
    else if(b[0].getText()=="X" && b[4].getText()=="X" && b[8].getText()=="X")
        {
           enable();
            w.setText("x win");
            score1();
             winner(0,4,8);
        }
    else if(b[2].getText()=="X" && b[4].getText()=="X" && b[6].getText()=="X")
        {
           enable();
            w.setText("x win");
            score1();
             winner(2,4,6);
        }
    
    
    else if(b[2].getText()=="X" && b[4].getText()=="X" && b[6].getText()=="X")
       {
           enable();
            w.setText("x win");
            score1();
             winner(2,4,6);
        }
    else if(b[0].getText()=="X" && b[3].getText()=="X" && b[6].getText()=="X")
        {
           enable();
            w.setText("x win");
            score1();
             winner(0,3,6);
        }
    else if(b[1].getText()=="X" && b[4].getText()=="X" && b[7].getText()=="X")
        {
           enable();
            w.setText("x win");
            score1();
             winner(1,4,7);
        }
    else if(b[2].getText()=="X" && b[5].getText()=="X"&& b[8].getText()=="X")
       {
           enable();
            w.setText("x win");
            score1();
            winner(2,5,6);
        }
    else if(b[0].getText()=="O" && b[1].getText()=="O" && b[2].getText()=="O")
       {
            w.setText("O win");
           enable();
           score2();
           winner(0,1,2);
        }
    else if(b[3].getText()=="O" && b[4].getText()=="O" && b[5].getText()=="O")
        {
           enable();
            w.setText("O win");
            score2();
            winner(3,4,5);
        }
    
    else if(b[6].getText()=="O" && b[7].getText()=="O" && b[8].getText()=="O")
       {
           enable();
            w.setText("O win");
            score2();
            winner(6,7,8);
        }
    else if(b[0].getText()=="O" && b[4].getText()=="O" && b[8].getText()=="O")
        {
           enable();
            w.setText("O win");
            score2();
            winner(0,4,8);
        }
    else if(b[2].getText()=="O" && b[4].getText()=="O" && b[6].getText()=="O")
       {
           enable();
            w.setText("O win");
            score2();
            winner(2,4,6);
        }
    else if(b[0].getText()=="O" && b[3].getText()=="O" && b[6].getText()=="O")
        {
           enable();
            w.setText("O win");
            score2();
            winner(0,3,6);
        }
    else if(b[1].getText()=="O" && b[4].getText()=="O" && b[7].getText()=="O")
        {
           enable();
            w.setText("O win");
            score2();
            winner(1,4,7);
        }
    else if(b[2].getText()=="O" && b[5].getText()=="O" && b[8].getText()=="O")
       {
           enable();
            w.setText("O win");
            score2();
            winner(2,5,8);
        }
   
}
  public void enable(){
         for(int i=0;i<9;i++) {
			b[i].setEnabled(false);
                        player1=true;
		}
  }
      public void reset(){
           text1.setText("0");
       text2.setText("0");
      
     
  }
  public void winner (int n, int m, int T)
  {
    b[n].setBackground(Color.green);
    b[m].setBackground(Color.green);
    b[T].setBackground(Color.green);

  }
 public void score1()
 {
       int num1= Integer.parseInt(text1.getText());
       
         num1++;
         
         text1.setText(Integer.toString(num1));
         if(num1==3){
             reset();
         }

 }
 public void score2()
 {
      
 int num2= Integer.parseInt(text2.getText());
       
         num2++;
         
         text2.setText(Integer.toString(num2));
        if(num2==3){
             reset();
         }
 }
    @Override
    public void actionPerformed(ActionEvent n) {
    
  Object y = n.getSource();
        for(int i=0;i<9;i++) {
            if(y == clear)
           {   b[i].setText("");
               b[i].setEnabled(true);
               b[i].setBackground(new Color(0,0,0));
                 w.setText("Who wins??");
           }
            

			 if(n.getSource()==b[i])
         {       if(b[i].getText()=="")
                     if(player1)
                          {
                                b[i].setText("X");
                                b[i].setFont(new Font("ARIAL",Font.BOLD,120));
                                b[i].setForeground(new Color(200,23,255));
                                 player1=false;
                                 win();             
                          }
                    else 
                     {
                         b[i].setText("O");
                          b[i].setFont(new Font("ARIAL",Font.BOLD,120));
                          b[i].setForeground(Color.pink);
                              player1=true;
                                win();
                         }
                          
           
               
                }

              }
    }
        
        }
    

