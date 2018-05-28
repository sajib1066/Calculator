package calculator;

// import packages

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// main Class

public class Calculator extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private ImageIcon icon;
	private JTextField display, display1;
	private JButton ce, c, x, div, seven, eight, nine, mul, four, five, six, min, one, two, three, sum, plusMin, zero, dot, equal;
	private Container con;
	private Font font, font1;
	private Cursor cursor;
	private String num, operations, answer;
	private double firstNum, secondNum, result;
	
	Calculator() {
		component();
	}
	public void component() {
		
		Action action = new Action();
		
		this.setSize(350, 505);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Calculator");
		this.setResizable(false);
		
		con = this.getContentPane();
		con.setLayout(null);
		con.setBackground(Color.GRAY);
		
		icon = new ImageIcon(getClass().getResource("cal.png"));
		this.setIconImage(icon.getImage());
		
		font = new Font("Tahoma", Font.BOLD, 28);
		font1 = new Font("Tahoma", Font.PLAIN, 18);
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		display = new JTextField();
		display.setBounds(5, 50, 335, 50);
		display.setFont(font1);
		display.setBorder(null);
		display.setBackground(Color.LIGHT_GRAY);
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setEditable(false);
		con.add(display);
		
		display1 = new JTextField("0");
		display1.setBounds(5, 100, 335, 50);
		display1.setFont(font);
		display1.setBorder(null);
		display1.setBackground(Color.LIGHT_GRAY);
		display1.setHorizontalAlignment(JTextField.RIGHT);
		con.add(display1);
		
		//Button Area Start//
		
		ce = new JButton("CE");
		ce.setBounds(5, 200, 80, 50);
		ce.setFont(font1);
		ce.setBackground(Color.LIGHT_GRAY);
		ce.setBorder(null);
		ce.setCursor(cursor);
		con.add(ce);
		ce.addActionListener(action);
		
		c = new JButton("C");
		c.setBounds(90, 200, 80, 50);
		c.setFont(font1);
		c.setBorder(null);
		c.setBackground(Color.LIGHT_GRAY);
		c.setCursor(cursor);
		con.add(c);
		c.addActionListener(action);

		x = new JButton("x");
		x.setBounds(175, 200, 80, 50);
		x.setFont(font1);
		x.setBorder(null);
		x.setBackground(Color.LIGHT_GRAY);
		x.setCursor(cursor);
		con.add(x);
		x.addActionListener(action);

		div = new JButton("/");
		div.setBounds(260, 200, 80, 50);
		div.setFont(font1);
		div.setBorder(null);
		div.setBackground(Color.LIGHT_GRAY);
		div.setCursor(cursor);
		con.add(div);
		div.addActionListener(action);
		
		seven = new JButton("7");
		seven.setBounds(5, 255, 80, 50);
		seven.setFont(font);
		seven.setBorder(null);
		seven.setBackground(Color.white);
		seven.setCursor(cursor);
		con.add(seven);
		seven.addActionListener(action);
		
		eight = new JButton("8");
		eight.setBounds(90, 255, 80, 50);
		eight.setFont(font);
		eight.setBorder(null);
		eight.setBackground(Color.WHITE);
		eight.setCursor(cursor);
		con.add(eight);
		eight.addActionListener(action);
		
		nine = new JButton("9");
		nine.setBounds(175, 255, 80, 50);
		nine.setFont(font);
		nine.setBorder(null);
		nine.setBackground(Color.WHITE);
		nine.setCursor(cursor);
		con.add(nine);
		nine.addActionListener(action);
		
		mul = new JButton("*");
		mul.setBounds(260, 255, 80, 50);
		mul.setFont(font1);
		mul.setCursor(cursor);
		mul.setBackground(Color.LIGHT_GRAY);
		mul.setBorder(null);
		con.add(mul);
		mul.addActionListener(action);
		
		four = new JButton("4");
		four.setBounds(5, 310, 80, 50);
		four.setFont(font);
		four.setBorder(null);
		four.setBackground(Color.WHITE);
		four.setCursor(cursor);
		con.add(four);
		four.addActionListener(action);
		
		five = new JButton("5");
		five.setBounds(90, 310, 80, 50);
		five.setFont(font);
		five.setBorder(null);
		five.setBackground(Color.WHITE);
		five.setCursor(cursor);
		con.add(five);
		five.addActionListener(action);
		
		six = new JButton("6");
		six.setBounds(175, 310, 80, 50);
		six.setFont(font);
		six.setBorder(null);
		six.setBackground(Color.WHITE);
		six.setCursor(cursor);
		con.add(six);
		six.addActionListener(action);
		
		min = new JButton("-");
		min.setBounds(260, 310, 80, 50);
		min.setFont(font1);
		min.setCursor(cursor);
		min.setBackground(Color.LIGHT_GRAY);
		min.setBorder(null);
		con.add(min);
		min.addActionListener(action);
		
		one = new JButton("1");
		one.setBounds(5, 365, 80, 50);
		one.setFont(font);
		one.setBorder(null);
		one.setBackground(Color.WHITE);
		one.setCursor(cursor);
		con.add(one);
		one.addActionListener(action);
		
		two = new JButton("2");
		two.setBounds(90, 365, 80, 50);
		two.setFont(font);
		two.setBorder(null);
		two.setBackground(Color.WHITE);
		two.setCursor(cursor);
		con.add(two);
		two.addActionListener(action);
		
		three = new JButton("3");
		three.setBounds(175, 365, 80, 50);
		three.setFont(font);
		three.setBorder(null);
		three.setBackground(Color.WHITE);
		three.setCursor(cursor);
		con.add(three);
		three.addActionListener(action);
		
		sum = new JButton("+");
		sum.setBounds(260, 365, 80, 50);
		sum.setFont(font1);
		sum.setCursor(cursor);
		sum.setBackground(Color.LIGHT_GRAY);
		sum.setBorder(null);
		con.add(sum);
		sum.addActionListener(action);
		
		plusMin = new JButton("+-");
		plusMin.setBounds(5, 420, 80, 50);
		plusMin.setFont(font1);
		plusMin.setCursor(cursor);
		plusMin.setBackground(Color.LIGHT_GRAY);
		plusMin.setBorder(null);
		con.add(plusMin);
		plusMin.addActionListener(action);
		
		zero = new JButton("0");
		zero.setBounds(90, 420, 80, 50);
		zero.setFont(font);
		zero.setBorder(null);
		zero.setBackground(Color.WHITE);
		zero.setCursor(cursor);
		con.add(zero);
		zero.addActionListener(action);
		
		dot = new JButton(".");
		dot.setBounds(175, 420, 80, 50);
		dot.setFont(font1);
		dot.setCursor(cursor);
		dot.setBackground(Color.LIGHT_GRAY);
		dot.setBorder(null);
		con.add(dot);
		dot.addActionListener(action);
		
		equal = new JButton("=");
		equal.setBounds(260, 420, 80, 50);
		equal.setFont(font1);
		equal.setCursor(cursor);
		equal.setBackground(Color.LIGHT_GRAY);
		equal.setBorder(null);
		con.add(equal);
		equal.addActionListener(action);
		
	}
	class Action implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(one)) {
			    num = display1.getText() + one.getText();
				display1.setText(num);
			}else if(e.getSource().equals(two)) {
				num = display1.getText() + two.getText();
				display1.setText(num);
			}else if(e.getSource().equals(three)) {
				num = display1.getText() + three.getText();
				display1.setText(num);
			}else if(e.getSource().equals(four)) {
				num = display1.getText() + four.getText();
				display1.setText(num);
			}else if(e.getSource().equals(five)) {
				num = display1.getText() + five.getText();
				display1.setText(num);
			}else if(e.getSource().equals(six)) {
				num = display1.getText() + six.getText();
				display1.setText(num);
			}else if(e.getSource().equals(seven)) {
				num = display1.getText() + seven.getText();
				display1.setText(num);
			}else if(e.getSource().equals(eight)) {
				num = display1.getText() + eight.getText();
				display1.setText(num);
			}else if(e.getSource().equals(nine)) {
				num = display1.getText() + nine.getText();
				display1.setText(num);
			}else if(e.getSource().equals(zero)) {
				num = display1.getText() + zero.getText();
				display1.setText(num);
			}else if(e.getSource().equals(dot)) {
				num = display1.getText() + dot.getText();
				display1.setText(num);
			}else if(e.getSource().equals(sum)) {
				firstNum = Double.parseDouble(display1.getText());
				String obj = String.valueOf(firstNum);
				display.setText(obj+"+");
				display1.setText(null);
				operations = "+";
				
			}else if(e.getSource().equals(min)) {
				firstNum = Double.parseDouble(display1.getText());
				String obj = String.valueOf(firstNum);
				display.setText(obj+"-");
				display1.setText(null);
				operations = "-";
			}else if(e.getSource().equals(mul)) {
				firstNum = Double.parseDouble(display1.getText());
				String obj = String.valueOf(firstNum);
				display.setText(obj+"*");
				display1.setText(null);
				operations = "*";
			}else if(e.getSource().equals(div)) {
				firstNum = Double.parseDouble(display1.getText());
				String obj = String.valueOf(firstNum);
				display.setText(obj+"/");
				display1.setText(null);
				operations = "/";
			}else if(e.getSource().equals(equal)) {
				secondNum = Double.parseDouble(display1.getText());
				if(operations.equals("+")) {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					display.setText(firstNum+"+"+secondNum);
					display1.setText(answer);
				}else if(operations.equals("-")) {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					display.setText(firstNum+"-"+secondNum);
					display1.setText(answer);
				}else if(operations.equals("*")) {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					display.setText(firstNum+"*"+secondNum);
					display1.setText(answer);
				}else if(operations.equals("/")) {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					display.setText(firstNum+"/"+secondNum);
					display1.setText(answer);
				}
				
				
				
				
			}else if(e.getSource().equals(plusMin)) {
				double ops = Double.parseDouble(String.valueOf(display1.getText()));
				ops = ops * (-1);
				display1.setText(String.valueOf(ops));
			}else if(e.getSource().equals(ce)) {
				display1.setText(null);
			}else if(e.getSource().equals(c)) {
				display.setText(null);
				display1.setText(null);
			}else if(e.getSource().equals(x)) {
				String backspace = null;
				if(display1.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(display1.getText());
					strB.deleteCharAt(display1.getText().length() - 1);
					backspace = strB.toString();
					display1.setText(backspace);
				}
			}
		}
	}

	public static void main(String[] args) {		// main function
		Calculator frame = new Calculator();
		frame.setVisible(true);
	}
}
