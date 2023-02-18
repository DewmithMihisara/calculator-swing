import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener{
	private JButton[] buttons;
	private JTextField txt1;
	private JPanel displayPanel;
	private JPanel buttonsPanel;
	private JLabel lblName;
	double firstNum;
	double secondNum;
	String operation;

	Calculator() {
		setSize(300,400);
		setTitle("Dew's Calc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		displayPanel = new JPanel(new BorderLayout());	
		buttonsPanel = new JPanel(new GridLayout(5, 4, 5, 5));
		buttonsPanel.setBackground(Color.WHITE);
		displayPanel.setBackground(Color.WHITE);
		
		txt1 = new JTextField(15);
		txt1.setBackground(Color.WHITE);
		txt1.setFont(new Font("Serif", Font.BOLD, 30));
		txt1.setBorder(BorderFactory.createEmptyBorder());
		displayPanel.add(txt1,BorderLayout.CENTER);
		
		lblName = new JLabel();
		lblName.setFont(new Font("Serif", Font.PLAIN, 14));
		lblName.setText("Developed by Dewmith");
		lblName.setForeground(Color.GRAY);
		displayPanel.add(lblName,BorderLayout.PAGE_END);
		
		buttons = new JButton[20];
		String[] btnNames = {"C","+/-","%","x","7","8","9","/","4","5","6","-","1","2","3","+","Back","0",".","="};
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(btnNames[i]);
			buttons[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
			buttonsPanel.add(buttons[i]);	
		}
		
		buttons[0].setForeground(Color.RED);
		
		add(displayPanel, BorderLayout.CENTER);
		add(buttonsPanel, BorderLayout.PAGE_END);
		
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		
		switch(event.getActionCommand()){
			case "1":
				txt1.setText(txt1.getText() + "1");
				lblName.setText(txt1.getText());
			break;
			case "2":
				txt1.setText(txt1.getText() + "2");
				lblName.setText(txt1.getText());
			break;
			case "3":
				txt1.setText(txt1.getText() + "3");
				lblName.setText(txt1.getText());
			break;
			case "4":
				txt1.setText(txt1.getText() + "4");
				lblName.setText(txt1.getText());
			break;
			case "5":
				txt1.setText(txt1.getText() + "5");
				lblName.setText(txt1.getText());
			break;
			case "6":
				txt1.setText(txt1.getText() + "6");
				lblName.setText(txt1.getText());
			break;
			case "7":
				txt1.setText(txt1.getText() + "7");
				lblName.setText(txt1.getText());
			break;
			case "8":
				txt1.setText(txt1.getText() + "8");
				lblName.setText(txt1.getText());
			break;
			case "9":
				txt1.setText(txt1.getText() + "9");
				lblName.setText(txt1.getText());
			break;
			case "0":
				txt1.setText(txt1.getText() + "0");
				lblName.setText(txt1.getText());
			break;
			case ".":
				txt1.setText(txt1.getText() + ".");
				lblName.setText(txt1.getText());
			break;
			case "+":
				firstNum = Double.parseDouble(txt1.getText());
				lblName.setText(txt1.getText()+" + ");
				txt1.setText("");
				operation = "+";
			break;
			case "-":
				firstNum = Double.parseDouble(txt1.getText());
				lblName.setText(txt1.getText()+" - ");
				txt1.setText("");
				operation = "-";
			break;
			case "x":
				firstNum = Double.parseDouble(txt1.getText());
				lblName.setText(txt1.getText()+" x ");
				txt1.setText("");
				operation = "x";
			break;
			case "/":
				firstNum = Double.parseDouble(txt1.getText());
				lblName.setText(txt1.getText()+" / ");
				txt1.setText("");
				operation = "/";
			break;
			case "+/-":
				firstNum = Double.parseDouble(txt1.getText());
				txt1.setText("");
				double maxFirst= firstNum*2;
				double tempFirst = firstNum-maxFirst;
				txt1.setText(tempFirst+"");
			break;
			case "%":
				firstNum = Double.parseDouble(txt1.getText());
				txt1.setText("");
				tempFirst = firstNum /100;
				txt1.setText(tempFirst+"");
			break;
			case "=":
				secondNum = Double.parseDouble(txt1.getText());
				
				switch (operation){
					case "+":
						txt1.setText((firstNum+secondNum)+"");
						lblName.setText(firstNum+" + "+secondNum+" = ");
					break;
					case "-":
						txt1.setText((firstNum-secondNum)+"");
						lblName.setText(firstNum+" - "+secondNum+" = ");
					break;
					case "/":
						txt1.setText((firstNum/secondNum)+"");
						lblName.setText(firstNum+" / "+secondNum+" = ");
					break;
					case "x":
						txt1.setText((firstNum*secondNum)+"");
						lblName.setText(firstNum+" x "+secondNum+" = ");
					break;
				}
				
			break;
			case "Back":
				String tmp = txt1.getText();
				String temp = tmp.substring(0, tmp.length() -1);
				txt1.setText(temp);
			break;
			case "C":
				tmp = txt1.getText();
				temp = tmp.substring(0, tmp.length() -tmp.length());
				txt1.setText(temp);
				lblName.setText("Developed by Dewmith");
			break;
		}

	}
}

class Demo{
	public static void main(String args[]){
		new Calculator().setVisible(true);
	}
}

