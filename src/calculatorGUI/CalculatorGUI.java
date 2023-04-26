package calculatorGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CalculatorGUI {

	private JFrame frame;
	private JButton divideButton;
	private JButton timesButton;
	private JButton minusButton;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton plusButton;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton equalButton;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_0;
	private JButton button_dot;
	private JTextField outputTextField;
	private JLabel myNameLabel;
	
	double firstNum, secondNum, answer;
	String operation;
	String formattedResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 165, 122));
		frame.getContentPane().setLayout(null);
		
		JButton clearButton = new JButton("Clear");
		clearButton.setBackground(Color.ORANGE);
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputTextField.setText("");
			}
		});
		clearButton.setBounds(0, 120, 86, 62);
		frame.getContentPane().add(clearButton);
		
		divideButton = new JButton("/");
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(outputTextField.getText());
				outputTextField.setText("");
				operation = "/";
			}
		});
		divideButton.setBackground(Color.ORANGE);
		divideButton.setBounds(85, 120, 86, 62);
		frame.getContentPane().add(divideButton);
		
		timesButton = new JButton("*");
		timesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(outputTextField.getText());
				outputTextField.setText("");
				operation = "*";
			}
		});
		timesButton.setBackground(Color.ORANGE);
		timesButton.setBounds(170, 120, 86, 62);
		frame.getContentPane().add(timesButton);
		
		minusButton = new JButton("-");
		minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(outputTextField.getText());
				outputTextField.setText("");
				operation = "-";
			}
		});
		minusButton.setBackground(Color.ORANGE);
		minusButton.setBounds(255, 120, 86, 62);
		frame.getContentPane().add(minusButton);
		
		button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = outputTextField.getText() + button_7.getText();
				outputTextField.setText(number);
			}
		});
		button_7.setBackground(Color.ORANGE);
		button_7.setBounds(0, 181, 86, 62);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = outputTextField.getText() + button_8.getText();
				outputTextField.setText(number);
			}
		});
		button_8.setBackground(Color.ORANGE);
		button_8.setBounds(85, 181, 86, 62);
		frame.getContentPane().add(button_8);
		
		button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = outputTextField.getText() + button_9.getText();
				outputTextField.setText(number);
			}
		});
		button_9.setBackground(Color.ORANGE);
		button_9.setBounds(170, 181, 86, 62);
		frame.getContentPane().add(button_9);
		
		plusButton = new JButton("+");
		plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(outputTextField.getText());
				outputTextField.setText("");
				operation = "+";
			}
		});
		plusButton.setBackground(Color.ORANGE);
		plusButton.setBounds(255, 181, 86, 122);
		frame.getContentPane().add(plusButton);
		
		button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = outputTextField.getText() + button_4.getText();
				outputTextField.setText(number);
			}
		});
		button_4.setBackground(Color.ORANGE);
		button_4.setBounds(0, 241, 86, 62);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = outputTextField.getText() + button_5.getText();
				outputTextField.setText(number);
			}
		});
		button_5.setBackground(Color.ORANGE);
		button_5.setBounds(85, 241, 86, 62);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = outputTextField.getText() + button_6.getText();
				outputTextField.setText(number);
			}
		});
		button_6.setBackground(Color.ORANGE);
		button_6.setBounds(170, 241, 86, 62);
		frame.getContentPane().add(button_6);
		
		equalButton = new JButton("=");
		equalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNum = Double.parseDouble(outputTextField.getText());
				
				// Use if statement to check if the result is an integer, by comparing it to the integer value of itself using the (int) cast.
				
				if(operation == "/") {
					answer = firstNum / secondNum;
					if(answer == (int) answer) {
						formattedResult = String.format("%.0f", answer);
					} else {
						formattedResult = String.format("%.1f", answer);
					}
					
					outputTextField.setText(formattedResult);
				}
				if(operation == "*") {
					answer = firstNum * secondNum;
					if(answer == (int) answer) {
						formattedResult = String.format("%.0f", answer);
					} else {
						formattedResult = String.format("%.1f", answer);
					}
					
					outputTextField.setText(formattedResult);
				}
				if(operation == "-") {
					answer = firstNum - secondNum;
					if(answer == (int) answer) {
						formattedResult = String.format("%.0f", answer);
					} else {
						formattedResult = String.format("%.1f", answer);
					}
					
					outputTextField.setText(formattedResult);				}
				if(operation == "+") {
					answer = firstNum + secondNum;
					if(answer == (int) answer) {
						formattedResult = String.format("%.0f", answer);
					} else {
						formattedResult = String.format("%.1f", answer);
					}
					
					outputTextField.setText(formattedResult);
				}
			}
		});
		equalButton.setBackground(Color.ORANGE);
		equalButton.setBounds(255, 301, 86, 122);
		frame.getContentPane().add(equalButton);
		
		button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = outputTextField.getText() + button_1.getText();
				outputTextField.setText(number);
			}
		});
		button_1.setBackground(Color.ORANGE);
		button_1.setBounds(0, 301, 86, 62);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = outputTextField.getText() + button_2.getText();
				outputTextField.setText(number);
			}
		});
		button_2.setBackground(Color.ORANGE);
		button_2.setBounds(85, 301, 86, 62);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = outputTextField.getText() + button_3.getText();
				outputTextField.setText(number);
			}
		});
		button_3.setBackground(Color.ORANGE);
		button_3.setBounds(170, 301, 86, 62);
		frame.getContentPane().add(button_3);
		
		button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = outputTextField.getText() + button_0.getText();
				outputTextField.setText(number);
			}
		});
		button_0.setBackground(Color.ORANGE);
		button_0.setBounds(0, 361, 171, 62);
		frame.getContentPane().add(button_0);
		
		button_dot = new JButton(".");
		button_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = outputTextField.getText() + button_dot.getText();
				outputTextField.setText(number);
			}
		});
		button_dot.setBackground(Color.ORANGE);
		button_dot.setBounds(170, 361, 86, 62);
		frame.getContentPane().add(button_dot);
		
		outputTextField = new JTextField();
		outputTextField.setHorizontalAlignment(SwingConstants.CENTER);
		outputTextField.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 20));
		outputTextField.setBackground(new Color(253, 250, 227));
		outputTextField.setBounds(6, 6, 328, 111);
		frame.getContentPane().add(outputTextField);
		outputTextField.setColumns(10);
		
		myNameLabel = new JLabel("Designed By: Kyle Brent Gallego | CCIS2A");
		myNameLabel.setFont(new Font("Trattatello", Font.PLAIN, 20));
		myNameLabel.setBounds(25, 435, 309, 16);
		frame.getContentPane().add(myNameLabel);
		frame.setBounds(100, 100, 340, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}