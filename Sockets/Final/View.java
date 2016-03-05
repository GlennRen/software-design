import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class View extends JFrame {
		
	public View()
	{
		super(); //look this up
		frame.setSize(350, 400); //sets dimensions
		//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(true);
		
	}
	
	public void initialize() //Initialize tic tac toe game board
	{
		JFrame frame = new JFrame("Tic Tac Toe");
		JLabel messageLabel = new JLabel("");
		
		JButton[][] buttons = new JButton[3][3];
		boolean gameWin=false;

		JPanel mainPanel = new JPanel(new BorderLayout()); //main panel container
		//JPanel menu = new JPanel(new BorderLayout());
		JPanel game = new JPanel(new GridLayout(3,3)); //two more panels with layouts for buttons
		
		frame.add(mainPanel);
		
		mainPanel.setPreferredSize (new Dimension(325, 425)); //dimensions
		//menu.setPreferredSize (new Dimension(300, 50));
		game.setPreferredSize (new Dimension(300, 300));
		
	    mainPanel.add(game, BorderLayout.SOUTH);
		
	    
	    textBox=new JLabel();
		textBox.setText("     let's play - your turn!");
		textBox.setVisible(true);
		mainPanel.add(textBox, BorderLayout.CENTER);
		
		//blah blah blah
		
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				buttons[i][j]=new JButton();
				buttons[i][j].setText(" ");
				buttons[i][j].setVisible(true);
				
				game.add(buttons[i][j]);
				buttons[i][j].addActionListener(new myActionListener());
			}
		}
		
	
	}
	
private void checkWin(int row, int col)
{
	if (buttons[row][0].getText()==buttons[row][1].getText()&&buttons[row][2].getText()==buttons[row][1].getText())
	{
		gameWin=true;
		//System.out.println(buttons[row][0].getText()+" wins");
		textBox.setText("     "+buttons[row][0].getText()+" wins!");
	}
	else if (buttons[0][col].getText()==buttons[1][col].getText()&&buttons[2][col].getText()==buttons[1][col].getText())
	{
		gameWin=true;
		textBox.setText("     "+buttons[0][col].getText()+" wins!");
	}
	
	
	else if ((row==0&&col==0||row==1&&col==1||row==2&&col==2)&&buttons[0][0].getText()==buttons[1][1].getText()&&buttons[1][1].getText()==buttons[2][2].getText())
	{
		gameWin=true;
		//System.out.println(buttons[0][0].getText()+" wins");
		textBox.setText("     "+buttons[0][0].getText()+" wins!");
	}
	
	else if ((row==2&&col==0||row==1&&col==1||row==1&&col==1)&&buttons[2][0].getText()==buttons[1][1].getText()&&buttons[1][1].getText()==buttons[0][2].getText())
	{
		gameWin=true;
		//System.out.println(buttons[2][0].getText()+" wins");
		textBox.setText("     "+buttons[2][0].getText()+" wins!");
	}
}
	
private class myActionListener implements ActionListener
{
	public void actionPerformed(ActionEvent a) // :^)
	{
		if(a.getSource() == buttons[0][0])
		{
			buttons[0][0].setText("X");
			buttons[0][0].setEnabled(false);
			checkWin(0,0);
		}
		if(a.getSource() == buttons[1][0])
		{
			buttons[1][0].setText("X");
			buttons[1][0].setEnabled(false);
			checkWin(1,0);
		}
		if(a.getSource() == buttons[2][0])
		{
			buttons[2][0].setText("X");
			buttons[2][0].setEnabled(false);
			checkWin(2,0);
		}
		if(a.getSource() == buttons[0][1])
		{
			buttons[0][1].setText("X");
			buttons[0][1].setEnabled(false);
			checkWin(0,1);
		}
		if(a.getSource() == buttons[1][1])
		{
			buttons[1][1].setText("X");
			buttons[1][1].setEnabled(false);
			checkWin(1,1);
		}
		if(a.getSource() == buttons[2][1])
		{
			buttons[2][1].setText("X");
			buttons[2][1].setEnabled(false);
			checkWin(2,1);
		}
		if(a.getSource() == buttons[0][2])
		{
			buttons[0][2].setText("X");
			buttons[0][2].setEnabled(false);
			checkWin(0,2);
		}
		if(a.getSource() == buttons[1][2])
		{
			buttons[1][2].setText("X");
			buttons[1][2].setEnabled(false);
			checkWin(1,2);
		}
		if(a.getSource() == buttons[2][2])
		{
			buttons[2][2].setText("X");
			buttons[2][2].setEnabled(false);
			checkWin(2,2);
		}
	}
			
		
}
	
	
	
	
}