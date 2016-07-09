
/*****************************
*Author:Jacob Reza           *  
*Date: 11/19/13              *
*Purpose: Tic tac toe game   *
* GUI.                       *
*****************************/
/*----------------------------------------------------------------------------------------------------------------------------
 * To play tic tac toe on a GUI. First on the right the user will need to choose if they would like the computer to play
 * against with or if they would like to play with an other user. Second they will need to choose if user O would like to go
 * first or not. From there tic tac toe is as easy as clicking where you want to go.
 -----------------------------------------------------------------------------------------------------------------------------*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FINAL_PROGRAM extends JFrame
{
	//here i declared the elements 
	private Container contents; //used to add contents
	
	private JButton [][] Game=new JButton[4][4];
	private JButton [] SmartMove=new JButton [2]; //used to allow user to click on smart move
	private JButton [] FirstMove=new JButton [2]; //used to allow user to click on first move
	
	private JLabel [] OPTION=new JLabel [2];	//used to show OPTION
	private JPanel [] options=new JPanel [2];	// used to allow user to see the options 
	
	public String [][] GameBoard=new String [4][4]; //the game board
	
	public boolean SM=false; //set as false
	public boolean FM=true;	//set as true
	public int MoveCount=0; //counts the moves
	
	public void ClearBoard () //method to declare a clear board
	{
		for (int X=1; X<4; X++)
		{
			for (int Y=1; Y<4; Y++)
			{
				GameBoard [X][Y]="-";
			}
		}
		
	}
	
	public boolean CanCreate3x () //to check if X can create three
	{
		boolean game= false;
		while(game==false)
		{
		if (GameBoard [1][1]=="X" && GameBoard [1][2]=="X" && GameBoard [1][3]=="-")
		{
			game=true;
			GameBoard [1][3]="X";
			break;
		}
		if (GameBoard [1][1]=="X" && GameBoard [1][2]=="-" && GameBoard [1][3]=="X")
		{
			game=true;
			GameBoard [1][2]="X";
			break;
		}
		if (GameBoard [1][1]=="-" && GameBoard [1][2]=="X" && GameBoard [1][3]=="X")
		{
			game=true;
			GameBoard [1][1]="X";
			break;
		}
		if (GameBoard [2][1]=="X" && GameBoard [2][2]=="X" && GameBoard [2][3]=="-")
		{
			game=true;
			GameBoard [2][3]="X";
			break;
		}
		if (GameBoard [2][1]=="X" && GameBoard [2][2]=="-" && GameBoard [2][3]=="X")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		if (GameBoard [2][1]=="-" && GameBoard [2][2]=="X" && GameBoard [2][3]=="X")
		{
			game=true;
			GameBoard [2][1]="X";
			break;
		}
		if (GameBoard [3][1]=="X" && GameBoard [3][2]=="X" && GameBoard [3][3]=="-")
		{
			game=true;
			GameBoard [3][3]="X";
			break;
		}
		if (GameBoard [3][1]=="X" && GameBoard [3][2]=="-" && GameBoard [3][3]=="X")
		{
			game=true;
			GameBoard [3][2]="X";
			break;
		}
		if (GameBoard [3][1]=="-" && GameBoard [3][2]=="X" && GameBoard [3][3]=="X")
		{
			game=true;
			GameBoard [3][1]="X";
			break;
		}
		
		if (GameBoard [1][1]=="X" && GameBoard [2][1]=="X" && GameBoard [3][1]=="-")
		{
			game=true;
			GameBoard [3][1]="X";
			break;
		}
		if (GameBoard [1][1]=="X" && GameBoard [2][1]=="-" && GameBoard [3][1]=="X")
		{
			game=true;
			GameBoard [2][1]="X";
			break;
		}
		if (GameBoard [1][1]=="-" && GameBoard [2][1]=="X" && GameBoard [3][1]=="X")
		{
			game=true;
			GameBoard [1][1]="X";
			break;
		}
		if (GameBoard [1][2]=="X" && GameBoard [2][2]=="X" && GameBoard [3][2]=="-")
		{
			game=true;
			GameBoard [3][2]="X";
			break;
		}
		if (GameBoard [1][2]=="X" && GameBoard [2][2]=="-" && GameBoard [3][2]=="X")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		if (GameBoard [1][2]=="-" && GameBoard [2][2]=="X" && GameBoard [3][2]=="X")
		{
			game=true;
			GameBoard [1][2]="X";
			break;
		}
		if (GameBoard [1][3]=="X" && GameBoard [2][3]=="X" && GameBoard [3][3]=="-")
		{
			game=true;
			GameBoard [3][3]="X";
			break;
		}
		if (GameBoard [1][3]=="X" && GameBoard [2][3]=="-" && GameBoard [3][3]=="X")
		{
			game=true;
			GameBoard [2][3]="X";
			break;
		}
		if (GameBoard [1][3]=="-" && GameBoard [2][3]=="X" && GameBoard [3][3]=="X")
		{
			game=true;
			GameBoard [1][3]="X";
			break;
		}
		
		
		if (GameBoard [3][1]=="X" && GameBoard [2][2]=="X" && GameBoard [1][3]=="-")
		{
			game=true;
			GameBoard [1][3]="X";
			break;
		}
		if (GameBoard [3][1]=="X" && GameBoard [2][2]=="-" && GameBoard [1][3]=="X")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		if (GameBoard [3][1]=="-" && GameBoard [2][2]=="X" && GameBoard [1][3]=="X")
		{
			game=true;
			GameBoard [3][1]="X";
			break;
		}
		if (GameBoard [1][1]=="X" && GameBoard [2][2]=="X" && GameBoard [3][3]=="-")
		{
			game=true;
			GameBoard [3][3]="X";
			break;
		}
		if (GameBoard [1][1]=="X" && GameBoard [2][2]=="-" && GameBoard [3][3]=="X")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		if (GameBoard [1][1]=="-" && GameBoard [2][2]=="X" && GameBoard [3][3]=="X")
		{
			game=true;
			GameBoard [1][1]="X";
			break;
		}
		break;
	 }
		return game;
	}
	
	public boolean CanCreate2X () //used to try to create a pair of Xs
	{
		boolean game= false;
		while(game==false)
		{
		if (GameBoard [1][1]=="-" && GameBoard [1][2]=="-" && GameBoard [1][3]=="X")
		{
			game=true;
			GameBoard [1][2]="X";
			break;
		}
		if (GameBoard [1][1]=="-" && GameBoard [1][2]=="X" && GameBoard [1][3]=="-")
		{
			game=true;
			GameBoard [1][1]="X";
			break;
		}
		if (GameBoard [1][1]=="X" && GameBoard [1][2]=="-" && GameBoard [1][3]=="-")
		{
			game=true;
			GameBoard [1][2]="X";
			break;
		}
		if (GameBoard [2][1]=="-" && GameBoard [2][2]=="-" && GameBoard [2][3]=="X")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		if (GameBoard [2][1]=="-" && GameBoard [2][2]=="X" && GameBoard [2][3]=="-")
		{
			game=true;
			GameBoard [2][1]="X";
			break;
		}
		if (GameBoard [2][1]=="X" && GameBoard [2][2]=="-" && GameBoard [2][3]=="-")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		if (GameBoard [3][1]=="-" && GameBoard [3][2]=="-" && GameBoard [3][3]=="X")
		{
			game=true;
			GameBoard [3][2]="X";
			break;
		}
		if (GameBoard [3][1]=="-" && GameBoard [3][2]=="X" && GameBoard [3][3]=="-")
		{
			game=true;
			GameBoard [3][3]="X";
			break;
		}
		if (GameBoard [3][1]=="X" && GameBoard [3][2]=="-" && GameBoard [3][3]=="-")
		{
			game=true;
			GameBoard [3][2]="X";
			break;
		}
		
		if (GameBoard [1][1]=="-" && GameBoard [2][1]=="-" && GameBoard [3][1]=="X")
		{
			game=true;
			GameBoard [2][1]="X";
			break;
		}
		if (GameBoard [1][1]=="-" && GameBoard [2][1]=="X" && GameBoard [3][1]=="-")
		{
			game=true;
			GameBoard [3][1]="X";
			break;
		}
		if (GameBoard [1][1]=="X" && GameBoard [2][1]=="-" && GameBoard [3][1]=="-")
		{
			game=true;
			GameBoard [2][1]="X";
			break;
		}
		if (GameBoard [1][2]=="-" && GameBoard [2][2]=="-" && GameBoard [3][2]=="X")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		if (GameBoard [1][2]=="-" && GameBoard [2][2]=="X" && GameBoard [3][2]=="-")
		{
			game=true;
			GameBoard [3][2]="X";
			break;
		}
		if (GameBoard [1][2]=="X" && GameBoard [2][2]=="-" && GameBoard [3][2]=="-")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		if (GameBoard [1][3]=="-" && GameBoard [2][3]=="-" && GameBoard [3][3]=="X")
		{
			game=true;
			GameBoard [2][3]="X";
			break;
		}
		if (GameBoard [1][3]=="-" && GameBoard [2][3]=="X" && GameBoard [3][3]=="-")
		{
			game=true;
			GameBoard [1][3]="X";
			break;
		}
		if (GameBoard [1][3]=="X" && GameBoard [2][3]=="-" && GameBoard [3][3]=="-")
		{
			game=true;
			GameBoard [2][3]="X";
			break;
		}
		
		
		if (GameBoard [3][1]=="-" && GameBoard [2][2]=="-" && GameBoard [1][3]=="X")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		if (GameBoard [3][1]=="-" && GameBoard [2][2]=="X" && GameBoard [1][3]=="-")
		{
			game=true;
			GameBoard [1][3]="X";
			break;
		}
		if (GameBoard [3][1]=="X" && GameBoard [2][2]=="-" && GameBoard [1][3]=="-")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		if (GameBoard [1][1]=="-" && GameBoard [2][2]=="-" && GameBoard [3][3]=="X")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		if (GameBoard [1][1]=="-" && GameBoard [2][2]=="X" && GameBoard [3][3]=="-")
		{
			game=true;
			GameBoard [1][1]="X";
			break;
		}
		if (GameBoard [1][1]=="X" && GameBoard [2][2]=="-" && GameBoard [3][3]=="-")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		break;
	}
		return game;
	}
	
	public boolean NeedBlock () //used to check if it can block a pair of Os.

	{
		boolean game= false;
		while(game==false)
		{
		if (GameBoard [1][1]=="O" && GameBoard [1][2]=="O" && GameBoard [1][3]=="-")
		{
			game=true;
			GameBoard [1][3]="X";
			break;
		}
		if (GameBoard [1][1]=="O" && GameBoard [1][2]=="-" && GameBoard [1][3]=="O")
		{
			game=true;
			GameBoard [1][2]="X";
			break;
		}
		if (GameBoard [1][1]=="-" && GameBoard [1][2]=="O" && GameBoard [1][3]=="O")
		{
			game=true;
			GameBoard [1][1]="X";
			break;
		}
		if (GameBoard [2][1]=="O" && GameBoard [2][2]=="O" && GameBoard [2][3]=="-")
		{
			game=true;
			GameBoard [2][3]="X";
			break;
		}
		if (GameBoard [2][1]=="O" && GameBoard [2][2]=="-" && GameBoard [2][3]=="O")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		if (GameBoard [2][1]=="-" && GameBoard [2][2]=="O" && GameBoard [2][3]=="O")
		{
			game=true;
			GameBoard [2][1]="X";
			break;
		}
		if (GameBoard [3][1]=="O" && GameBoard [3][2]=="O" && GameBoard [3][3]=="-")
		{
			game=true;
			GameBoard [3][3]="X";
			break;
		}
		if (GameBoard [3][1]=="O" && GameBoard [3][2]=="-" && GameBoard [3][3]=="O")
		{
			game=true;
			GameBoard [3][2]="X";
			break;
		}
		if (GameBoard [3][1]=="-" && GameBoard [3][2]=="O" && GameBoard [3][3]=="O")
		{
			game=true;
			GameBoard [3][1]="X";
			break;
		}
		
		if (GameBoard [1][1]=="O" && GameBoard [2][1]=="O" && GameBoard [3][1]=="-")
		{
			game=true;
			GameBoard [3][1]="X";
			break;
		}
		if (GameBoard [1][1]=="O" && GameBoard [2][1]=="-" && GameBoard [3][1]=="O")
		{
			game=true;
			GameBoard [2][1]="X";
			break;
		}
		if (GameBoard [1][1]=="-" && GameBoard [2][1]=="O" && GameBoard [3][1]=="O")
		{
			game=true;
			GameBoard [1][1]="X";
			break;
		}
		if (GameBoard [1][2]=="O" && GameBoard [2][2]=="O" && GameBoard [3][2]=="-")
		{
			game=true;
			GameBoard [3][2]="X";
			break;
		}
		if (GameBoard [1][2]=="O" && GameBoard [2][2]=="-" && GameBoard [3][2]=="O")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		if (GameBoard [1][2]=="-" && GameBoard [2][2]=="O" && GameBoard [3][2]=="O")
		{
			game=true;
			GameBoard [1][2]="X";
			break;
		}
		if (GameBoard [1][3]=="O" && GameBoard [2][3]=="O" && GameBoard [3][3]=="-")
		{
			game=true;
			GameBoard [3][3]="X";
			break;
		}
		if (GameBoard [1][3]=="O" && GameBoard [2][3]=="-" && GameBoard [3][3]=="O")
		{
			game=true;
			GameBoard [2][3]="X";
			break;
		}
		if (GameBoard [1][3]=="-" && GameBoard [2][3]=="O" && GameBoard [3][3]=="O")
		{
			game=true;
			GameBoard [1][3]="X";
			break;
		}
		
		
		if (GameBoard [3][1]=="O" && GameBoard [2][2]=="O" && GameBoard [1][3]=="-")
		{
			game=true;
			GameBoard [1][3]="X";
			break;
		}
		if (GameBoard [3][1]=="O" && GameBoard [2][2]=="-" && GameBoard [1][3]=="O")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		if (GameBoard [3][1]=="-" && GameBoard [2][2]=="O" && GameBoard [1][3]=="O")
		{
			game=true;
			GameBoard [3][1]="X";
			break;
		}
		if (GameBoard [1][1]=="O" && GameBoard [2][2]=="O" && GameBoard [3][3]=="-")
		{
			game=true;
			GameBoard [3][3]="X";
			break;
		}
		if (GameBoard [1][1]=="O" && GameBoard [2][2]=="-" && GameBoard [3][3]=="O")
		{
			game=true;
			GameBoard [2][2]="X";
			break;
		}
		if (GameBoard [1][1]=="-" && GameBoard [2][2]=="O" && GameBoard [3][3]=="O")
		{
			game=true;
			GameBoard [1][1]="X";
			break;
		}
		break;
	}
		return game;
	}
	
	public void CheckWinner() //to check if O wins or X wins
	{
		boolean win[]=new boolean [5];
		
		win[3] = false;
		
		if(GameBoard[1][1] == "O" && GameBoard[1][2] == "O" && GameBoard[1][3] == "O")
		{
			win[3] = true;
		}
		
		if(GameBoard[2][1] == "O" && GameBoard[2][2] == "O" && GameBoard[2][3] == "O")
		{
			win[3] = true;
		}
		
		if(GameBoard[3][1] == "O" && GameBoard[3][2] == "O" && GameBoard[3][3] == "O")
		{
			win[3] = true;
		}
		
		if(GameBoard[1][1] == "O" && GameBoard[2][1] == "O" && GameBoard[3][1] == "O")
		{
			win[3] = true;
		}
		
		if(GameBoard[1][2] == "O" && GameBoard[2][2] == "O" && GameBoard[3][2] == "O")
		{
			win[3] = true;
		}
		
		if(GameBoard[1][3] == "O" && GameBoard[2][3] == "O" && GameBoard[3][3] == "O")
		{
			win[3] = true;
		}
		
		if(GameBoard[1][1] == "O" && GameBoard[2][2] == "O" && GameBoard[3][3] == "O")
		{
			win[3] = true;
		}
		
		if(GameBoard[1][3] == "O" && GameBoard[2][2] == "O" && GameBoard[3][1] == "O")
		{
			win[3] = true;
		}
		win[4] = false;
		
		if(GameBoard[1][1] == "X" && GameBoard[1][2] == "X" && GameBoard[1][3] == "X")
		{
			win[4] = true;
		}
		
		if(GameBoard[2][1] == "X" && GameBoard[2][2] == "X" && GameBoard[2][3] == "X")
		{
			win[4] = true;
		}
		
		if(GameBoard[3][1] == "X" && GameBoard[3][2] == "X" && GameBoard[3][3] == "X")
		{
			win[4] = true;
		}
		
		if(GameBoard[1][1] == "X" && GameBoard[2][1] == "X" && GameBoard[3][1] == "X")
		{
			win[4] = true;
		}
		
		if(GameBoard[1][2] == "X" && GameBoard[2][2] == "X" && GameBoard[3][2] == "X")
		{
			win[4] = true;
		}
		
		if(GameBoard[1][3] == "X" && GameBoard[2][3] == "X" && GameBoard[3][3] == "X")
		{
			win[4] = true;
		}
		
		if(GameBoard[1][1] == "X" && GameBoard[2][2] == "X" && GameBoard[3][3] == "X")
		{
			win[4] = true;
		}
		
		if(GameBoard[1][3] == "X" && GameBoard[2][2] == "X" && GameBoard[3][1] == "X")
		{
			win[4] = true;
		}
		
		if (win[3])
		{
			JOptionPane.showMessageDialog(null, "O Wins!");
			System.exit(0);
		}
		if (win[4])
		{
			JOptionPane.showMessageDialog(null, "X Wins!");
			System.exit(0);	
		}
	
	}
	
	public void Xgo1() //used to allow the computer to enter a X at any open position 
	{
		for(int x=3; x>=1; x--)
		{
			for(int y=3; y>=1; y--)
			{
				if (GameBoard[x][y]=="-")
				{
					GameBoard [x][y]="X";
					x=0;
					y=0;
				}
			}
		}
	}
	
	public void XSmartmove() //to allow the computer to move
	{
		boolean threex=false, twox=false, block=false;
		
		threex= CanCreate3x();
		if(threex==false)
		{
			block=NeedBlock ();
			if (block==false)
			{
				twox=CanCreate2X ();
				if (twox==false)
				{
					Xgo1();
				}
			}
		}
		
		for(int x=1; x<=3; x++)
		{
			for(int y=1; y<=3; y++)
			{
				Game[x][y].setText(GameBoard [x][y]);
			}
		}
		
		CheckWinner ();
	}
	
	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent ae) //used to call SmartMove and FirstMove
		{
			if(ae.getSource()==SmartMove [0]) 
			{
				SM=true;
				SmartMove[0].setEnabled(false);
				SmartMove[1].setEnabled(false);
				
			}
			if(ae.getSource()==SmartMove [1])
			{
				SM=false;
				SmartMove[0].setEnabled(false);
				SmartMove[1].setEnabled(false);
			}
			if(ae.getSource()==FirstMove [0])
			{
				FM=true;
				FirstMove[0].setEnabled(false);
				FirstMove[1].setEnabled(false);
			}
			if(ae.getSource()==FirstMove [1])
			{
				FM=false;
				FirstMove[0].setEnabled(false);
				FirstMove[1].setEnabled(false);
			}
			
			for(int i=1; i<=3; i++) //outer forloop to hit the rows of array
			{
				for(int s=1; s<=3; s++) //inner loop to the colmuns of array
				{
					if(SM)
					{
						if(FM)
						{
							if(ae.getSource()==Game [i][s] && GameBoard [i][s] =="-") //allows you to move
							{
								GameBoard[i][s]="O";
								Game [i][s].setText(GameBoard [i][s]);
								MoveCount++;
								CheckWinner();
								XSmartmove();
								MoveCount++;
							}
						}
						else //else lets computer to move first.
						{
							XSmartmove();
							MoveCount++;
							FM=true;
						}
					}
					else
					{
						if(FM) //if first move 
						{
							if(ae.getSource()==Game [i][s] && GameBoard [i][s] =="-") //alows you to move first
							{
								GameBoard[i][s]="O";
								Game [i][s].setText(GameBoard [i][s]);
								MoveCount++;
								FM=false;
								CheckWinner();
							}
						}else //else computer moves first
						{
							if(ae.getSource()==Game [i][s] && GameBoard [i][s] =="-")
							{
								GameBoard[i][s]="X";
								Game [i][s].setText(GameBoard [i][s]);
								MoveCount++;
								FM=true;
								CheckWinner();
							}
						}
					}
					if(MoveCount==9) //if the number of moves are 9 then its a draw.
					{
						JOptionPane.showMessageDialog(null, "Its a Draw!");
						System.exit(0);
					}
				}
			}	
		}
		
	}
	
	public FINAL_PROGRAM() //this allows you to use the buttons
	{
		super("tictactoe");
		contents=getContentPane();
		contents.setLayout(new GridLayout(1,2));
		ClearBoard();
		
		ButtonHandler BH=new ButtonHandler(); //button handler
		
		for(int x=0; x<2; x++)
		{
			SmartMove[x]=new JButton();
			//set up button
			FirstMove[x]=new JButton();
			
			SmartMove[x].setBackground(Color.BLACK);
			//gives button color
			FirstMove[x].setBackground(Color.BLACK);
			
			SmartMove[x].setForeground(Color.BLACK);
			// gives foreground color
			FirstMove[x].setForeground(Color.BLACK);
			
			SmartMove[x].addActionListener(BH);
			//listener to make sure button is used
			FirstMove[x].addActionListener(BH);
			
			OPTION[x]=new JLabel(); 
			//sets it to OPTION and options 
			options[x]=new JPanel();
		}
		
		SmartMove[0].setText("YES");
		//sets text to both smart move and first move
		SmartMove[1].setText("NO");
		
		FirstMove[0].setText("YES");
		
		FirstMove[1].setText("NO");
		
		OPTION[0].setText("Do you want to play the computer?");
		//sets a header for both bathers 
		OPTION[1].setText("         Do you want to go first?");
		
		options[0].setLayout(new GridLayout(3,3));
		//sets options in the grid
		options[1].setLayout(new GridLayout(3,2));
		
		for(int x=0; x<2; x++) //forloop to add button
		{
			options[1].add(OPTION[x]);
			
		}
		
		for(int y=0; y<2; y++) //for loop to add button
		{
			options[1].add(SmartMove[y]);
			options[1].add(FirstMove[y]);
			
		}
		
		for(int j=1; j<=3; j++) //for loop to add game 
		{
			for(int k=1; k<=3; k++)
			{
				Game[j][k]=new JButton("-");
				
				Game[j][k].setFont(Game[j][k].getFont().deriveFont(Font.PLAIN, 50));
				
				Game[j][k].addActionListener(BH);
				
				options[0].add(Game [j][k]);
			}
		}
		contents.add(options[0]);
		//to add contents 
		contents.add(options[1]);
		
		setVisible(true); //set to true 
		
		setSize(900,500); //set size of window
		
	}
	
	
	public static void main(String[] arg) //main method to run
	{
		FINAL_PROGRAM w =new FINAL_PROGRAM();
		
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close the program. 
		
	}
}



