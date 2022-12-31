package main.com.thxjxs.calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener
{
    JLabel label;
    JTextField tf;
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, clrBtn, delBtn, eqlBtn, pointBtn, btnPlus, btnMinus, btnMul, btnDiv, btnSqr, btnReci, btnRoot;
    JRadioButton sci, norm;
    ButtonGroup bg;
    double number, answer;
    char operation;

    public Calculator()
    {
        //preparing the GUI
        setTitle("Calculator");
        setSize(300, 490);
        getContentPane().setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //adding other components
        label = new JLabel();
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.black);
        add(label);

        tf = new JTextField();
        tf.setBounds(10, 40, 270, 40);
        tf.setEditable(false);
        tf.setHorizontalAlignment(SwingConstants.RIGHT);
        add(tf);

        norm = new JRadioButton("Norm");
        norm.setBounds(10, 95, 60, 40);
        norm.setSelected(true);
        add(norm);

        sci = new JRadioButton("Sci");
        sci.setBounds(10, 120, 60, 40);
        sci.setSelected(false);
        add(sci);

        
        bg = new ButtonGroup();
        bg.add(norm);
        bg.add(sci);

        clrBtn = new JButton("AC");
        clrBtn.setBounds(80, 110, 60, 40);
        clrBtn.setBackground(Color.red);
        clrBtn.setForeground(Color.white);
        add(clrBtn);

        delBtn = new JButton("Del");
        delBtn.setBounds(150, 110, 60, 40);
        delBtn.setBackground(Color.red);
        delBtn.setForeground(Color.white);
        add(delBtn);

        btnDiv = new JButton("÷");
        btnDiv.setBounds(220, 110, 60, 40);
        add(btnDiv);


        btnRoot = new JButton("√");
        btnRoot.setBounds(10, 170, 60, 40);
        add(btnRoot);

        btnSqr = new JButton("x\u00B2");
        btnSqr.setBounds(80, 170, 60, 40);
        add(btnSqr);

        btnReci = new JButton("1/x");
        btnReci.setBounds(150, 170, 60, 40);
        add(btnReci);

        btnMul = new JButton("\u00D7");
        btnMul.setBounds(220, 170, 60, 40);
        add(btnMul);


        btn7 = new JButton("7");
        btn7.setBounds(10, 230, 60, 40);
        add(btn7);

        btn8 = new JButton("8");
        btn8.setBounds(80, 230, 60, 40);
        add(btn8);

        btn9 = new JButton("9");
        btn9.setBounds(150,230, 60, 40);
        add(btn9);

        btnPlus = new JButton("+");
        btnPlus.setBounds(220, 230, 60, 40);
        add(btnPlus);


        btn4 = new JButton("4");
        btn4.setBounds(10, 290, 60, 40);
        add(btn4);

        btn5 = new JButton("5");
        btn5.setBounds(80, 290, 60, 40);
        add(btn5);

        btn6 = new JButton("6");
        btn6.setBounds(150,290, 60, 40);
        add(btn6);

        btnMinus = new JButton("-");
        btnMinus.setBounds(220, 290, 60, 40);
        add(btnMinus);


        btn1 = new JButton("1");
        btn1.setBounds(10, 350, 60, 40);
        add(btn1);

        btn2 = new JButton("2");
        btn2.setBounds(80, 350, 60, 40);
        add(btn2);

        btn3 = new JButton("3");
        btn3.setBounds(150,350, 60, 40);
        add(btn3);

        eqlBtn = new JButton("=");
        eqlBtn.setBounds(220, 350, 60, 100);
        add(eqlBtn);


        btn0 = new JButton("0");
        btn0.setBounds(10, 410, 130, 40);
        add(btn0);

        pointBtn = new JButton(".");
        pointBtn.setBounds(150, 410, 60, 40);
        add(pointBtn);

        setVisible(true);

        //adding action events
        norm.addActionListener(this);
        sci.addActionListener(this);
        clrBtn.addActionListener(this);
        delBtn.addActionListener(this);
        btnDiv.addActionListener(this);
        btnRoot.addActionListener(this);
        btnSqr.addActionListener(this);
        btnReci.addActionListener(this);
        btnMul.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnPlus.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btnMinus.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        eqlBtn.addActionListener(this);
        btn0.addActionListener(this);
        pointBtn.addActionListener(this);

        //setting scientific operations disabled as default
        btnRoot.setEnabled(false);
        btnSqr.setEnabled(false);
        btnReci.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == sci)
        {
            norm.setEnabled(true);
            sci.setEnabled(true);
            clrBtn.setEnabled(true);
            delBtn.setEnabled(true);
            btnDiv.setEnabled(true);
            btnRoot.setEnabled(true);
            btnSqr.setEnabled(true);
            btnReci.setEnabled(true);
            btnMul.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btnDiv.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btnMinus.setEnabled(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn0.setEnabled(true);
            pointBtn.setEnabled(true);
            eqlBtn.setEnabled(true);
        }   
        else if (source == norm) 
        {
            norm.setEnabled(true);
            sci.setEnabled(true);
            clrBtn.setEnabled(true);
            delBtn.setEnabled(true);
            btnDiv.setEnabled(true);
            btnRoot.setEnabled(false);
            btnSqr.setEnabled(false);
            btnReci.setEnabled(false);
            btnMul.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btnDiv.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btnMinus.setEnabled(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn0.setEnabled(true);
            pointBtn.setEnabled(true);
            eqlBtn.setEnabled(true);
        }
        else if (source == clrBtn) 
        {
            label.setText("");
            tf.setText("");
        } 
        else if (source == delBtn) 
        {
            int length = tf.getText().length();
            int number = length - 1;

            if (length > 0) {
                StringBuilder back = new StringBuilder(tf.getText());
                back.deleteCharAt(number);
                tf.setText(back.toString());

            }
            if (tf.getText().endsWith("")) {
                label.setText("");
            }
        } 
        else if (source == btn0) 
        {
            if (tf.getText().equals("0"))
                return;
            else
                tf.setText(tf.getText() + "0");
        } 
        else if (source == btn1)
            tf.setText(tf.getText() + "1");
        else if (source == btn2) 
            tf.setText(tf.getText() + "2");
        else if (source == btn3) 
            tf.setText(tf.getText() + "3");
        else if (source == btn4) 
            tf.setText(tf.getText() + "4");
        else if (source == btn5) 
            tf.setText(tf.getText() + "5");
        else if (source == btn6) 
            tf.setText(tf.getText() + "6");
        else if (source == btn7) 
            tf.setText(tf.getText() + "7");
        else if (source == btn8) 
            tf.setText(tf.getText() + "8");
        else if (source == btn9) 
            tf.setText(tf.getText() + "9");
        else if (source == pointBtn) 
        {
            if (tf.getText().contains("."))
                return;
            else
                tf.setText(tf.getText() + ".");
        } 
        else if (source == btnPlus) 
        {
            String str = tf.getText();
            number = Double.parseDouble(tf.getText());
            tf.setText("");
            label.setText(str + "+");
            operation = '+';
        } 
        else if (source == btnMinus) 
        {
            String str = tf.getText();
            number = Double.parseDouble(tf.getText());
            tf.setText("");
            label.setText(str + "-");
            operation = '-';
        } 
        else if (source == btnMul) 
        {
            String str = tf.getText();
            number = Double.parseDouble(tf.getText());
            tf.setText("");
            label.setText(str + "X");
            operation = 'x';
        } 
        else if (source == btnDiv) 
        {
            String str = tf.getText();
            number = Double.parseDouble(tf.getText());
            tf.setText("");
            label.setText(str + "/");
            operation = '/';
        } 
        else if (source == btnRoot) 
        {
            number = Double.parseDouble(tf.getText());
            Double sqrt = Math.sqrt(number);
            tf.setText(Double.toString(sqrt));

        } 
        else if (source == btnSqr) 
        {
            String str = tf.getText();
            number = Double.parseDouble(tf.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                tf.setText(string.replace(".0", ""));
            } else {
                tf.setText(string);
            }
            label.setText("(sqr)" + str);
        } 
        else if (source == btnReci)
        {
            number = Double.parseDouble(tf.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                tf.setText(string.replace(".0", ""));
            } else {
                tf.setText(string);
            }
        } 
        else if (source == eqlBtn) 
        {
            switch (operation) 
            {
                case '+':
                    answer = number + Double.parseDouble(tf.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        tf.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        tf.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case '-':
                    answer = number - Double.parseDouble(tf.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        tf.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        tf.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 'x':
                    answer = number * Double.parseDouble(tf.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        tf.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        tf.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case '/':
                    answer = number / Double.parseDouble(tf.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        tf.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        tf.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;

            }
        }
    }

    public static void main(String[] args) 
    {
        new Calculator();
    }
}