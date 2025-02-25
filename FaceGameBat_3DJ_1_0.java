//import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;



//import java.awt.event.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



//import java.awt.*;
import java.awt.Container;
import java.awt.Color;
import java.awt.Point;
import java.awt.Font;
import java.awt.FileDialog;



//import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;



public class FaceGameBat_3DJ_1_0 extends JFrame {
	
	
	
	// Methods
	public static void main(String[] args) {
		
		new FaceGameBat_3DJ_1_0().menu();
		
	}
	
	
	
	String FrameName = "FaceGameBat 3DJ 1.0";
	
	String FrameName1 = "FaceG";
	String FrameName2 = "ameB";
	String FrameName3 = "at 3DJ";
	String FrameName4 = " 1.0";
	
	int x = 200;
	int y = 150;
	int width = 1130;
	int height = 640;
	
	int ColorBackground = 0x0000FF;
	
	
	
	static Point compCoords;
	
	public void menu() {
		
		
		// Frame Title
		JFrame f1 = new JFrame(FrameName);
		
		// Frame Bounds
		f1.setBounds(x,y,width,height);
		
		// Frame Layout
		f1.setLayout(null);
		
		// Container
		Container c1 = f1.getContentPane();
		
		// Color Hex Background
		c1.setBackground(new Color(ColorBackground));
		
		// Frame Logo
		ImageIcon i1 = new ImageIcon("Logo/logo-1.png");
		f1.setIconImage(i1.getImage());
		
		
		
		
		
		
		
		
		
		
		// Undecorated
		f1.setUndecorated(true);
		
		
		
		// Panel
		JPanel p1 = new JPanel();
		
		// Panel Bounds
		p1.setBounds(0,0,1130,45);
		
		// Layout
		p1.setLayout(null);
		
		// Color Hex Panel
		p1.setBackground(new Color(0x008000));
		
		// Panel ActionListener
		compCoords = null;
		p1.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				
				compCoords = null;
				
			}
			
			public void mousePressed(MouseEvent e) {
				
				compCoords = e.getPoint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
			}
			
			public void mouseEntered(MouseEvent e) {
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
			}
			
		});
		
		p1.addMouseMotionListener(new MouseMotionListener() {
			
			public void mouseMoved(MouseEvent e) {
				
			}
			
			public void mouseDragged(MouseEvent e) {
				
				Point currCoords = e.getLocationOnScreen();
				f1.setLocation(currCoords.x - compCoords.x, currCoords.y - compCoords.y);
				
			}
			
		});
		f1.add(p1);
		
		
		
		// Label Title
		JLabel logo = new JLabel();
		
		// Logo Billede 
		logo.setIcon(new ImageIcon("Logo/logo-2.png"));
		
		// Logo Bounds
		logo.setBounds(5,5,35,35);
		
		p1.add(logo);
		
		
		
		// Label Title
		JLabel t1 = new JLabel(FrameName1);
		
		// Label Bounds
	    t1.setBounds(45,5,45,35);
		
		// Color Hex Label Foreground
		t1.setForeground(new Color(0xFFFFFF));
		
		p1.add(t1);
		
		// Label Title
		JLabel t2 = new JLabel(FrameName2);
		
		// Label Bounds
	    t2.setBounds(80,5,45,35);
		
		// Color Hex Label Foreground
		t2.setForeground(new Color(0xFFFFFF));
		
		p1.add(t2);
		
		// Label Title
		JLabel t3 = new JLabel(FrameName3);
		
		// Label Bounds
	    t3.setBounds(113,5,45,35);
		
		// Color Hex Label Foreground
		t3.setForeground(new Color(0xFFFFFF));
		
		p1.add(t3);
		
		// Label Title
		JLabel t4 = new JLabel(FrameName4);
		
		// Label Bounds
	    t4.setBounds(149,5,45,35);
		
		// Color Hex Label Foreground
		t4.setForeground(new Color(0xFFFFFF));
		
		p1.add(t4);
		
		
		
		// Button Title
		JButton close = new JButton("X");
		close.setFocusable(false);
		
		// Button Bounds
		close.setBounds(1080,5,45,35);
		
		// Color Hex Button Foreground
		close.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		close.setBackground(new Color(0x0000FF));
		
		// Button ActionListener
		close.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==close) {
					
					f1.dispose();
					
				}
				
			}
			
		});
		p1.add(close);
		
		
		
		// Button Title
		JButton minimize = new JButton("--");
		minimize.setFocusable(false);
		
		// Button Bounds
		minimize.setBounds(1030,5,45,35);
		
		// Color Hex Button Foreground
		minimize.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		minimize.setBackground(new Color(0x0000FF));
		
		// Button ActionListener
		minimize.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==minimize) {
					
					f1.setExtendedState(JFrame.ICONIFIED);
					
				}
				
			}
			
		});
		p1.add(minimize);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Button Title
		JButton exit = new JButton("Exit");
		exit.setFocusable(false);
		
		// Button ImageIcon
		exit.setIcon(new ImageIcon("File_Logo/exit.png"));
		exit.setVerticalTextPosition(JButton.BOTTOM);
		exit.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		exit.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		exit.setBounds(30,75,120,60);
		
		// Color Hex Button Foreground
		exit.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		exit.setBackground(new Color(ColorBackground));
		
		// Button ActionListener
		exit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==exit) {
					
					f1.dispose();
					
				}
				
			}
			
		});
		f1.add(exit);
		
		
		
		// Button Title
		JButton command = new JButton("Command");
		command.setFocusable(false);
		
		// Button ImageIcon
		command.setIcon(new ImageIcon("File_Logo/command.png"));
		command.setVerticalTextPosition(JButton.BOTTOM);
		command.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		command.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		command.setBounds(150,75,120,60);
		
		// Color Hex Button Foreground
		command.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		command.setBackground(new Color(ColorBackground));
		
		// Button ActionListener
		command.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==command) {
					
					
					
				}
				
			}
			
		});
		f1.add(command);
		
		
		
		// Button Title
		JButton document = new JButton("Document");
		document.setFocusable(false);
		
		// Button ImageIcon
		document.setIcon(new ImageIcon("File_Logo/document.png"));
		document.setVerticalTextPosition(JButton.BOTTOM);
		document.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		document.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		document.setBounds(280,75,120,60);
		
		// Color Hex Button Foreground
		document.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		document.setBackground(new Color(ColorBackground));
		
		// Button ActionListener
		document.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==document) {
					
					
				}
				
			}
			
		});
		f1.add(document);
		
		
		
		
		
		
		
		
		
		
		
		// Panel
		JPanel p2 = new JPanel();
		
		// Panel Bounds
		p2.setBounds(0,530,1130,25);
		
		// Layout
		p2.setLayout(null);
		
		// Color Hex Panel
		p2.setBackground(new Color(0x008000));
		
		f1.add(p2);
		
		
		
		// Panel
		JPanel p3 = new JPanel();
		
		// Panel Bounds
		p3.setBounds(0,555,1130,85);
		
		// Layout
		p3.setLayout(null);
		
		// Color Hex Panel
		p3.setBackground(new Color(0x000080));
		
		f1.add(p3);
		
		
		
		// Button Title
		JButton settings = new JButton("Settings");
		settings.setFocusable(false);
		
		// Button ImageIcon
		settings.setIcon(new ImageIcon("File_Logo/settings.png"));
		settings.setVerticalTextPosition(JButton.BOTTOM);
		settings.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		settings.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		settings.setBounds(10,10,120,63);
		
		// Color Hex Button Foreground
		settings.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		settings.setBackground(new Color(0x000080));
		
		// Button ActionListener
		settings.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==settings) {
					
					f1.dispose();
					
					settings();
					
				}
				
			}
			
		});
		p3.add(settings);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Start Frame Visible
		f1.setVisible(true);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	public void settings() {
		
		
		// Frame Title
		JFrame f1 = new JFrame(FrameName);
		
		// Frame Bounds
		f1.setBounds(x,y,width,height);
		
		// Frame Layout
		f1.setLayout(null);
		
		// Container
		Container c1 = f1.getContentPane();
		
		// Color Hex Background
		c1.setBackground(new Color(0xC0C0C0));
		
		// Frame Logo
		ImageIcon i1 = new ImageIcon("Logo/logo-1.png");
		f1.setIconImage(i1.getImage());
		
		
		
		
		
		
		
		
		
		
		// Undecorated
		f1.setUndecorated(true);
		
		
		
		// Panel
		JPanel p1 = new JPanel();
		
		// Panel Bounds
		p1.setBounds(0,0,1130,45);
		
		// Layout
		p1.setLayout(null);
		
		// Color Hex Panel
		p1.setBackground(new Color(0x008000));
		
		// Panel ActionListener
		compCoords = null;
		p1.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				
				compCoords = null;
				
			}
			
			public void mousePressed(MouseEvent e) {
				
				compCoords = e.getPoint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
			}
			
			public void mouseEntered(MouseEvent e) {
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
			}
			
		});
		
		p1.addMouseMotionListener(new MouseMotionListener() {
			
			public void mouseMoved(MouseEvent e) {
				
			}
			
			public void mouseDragged(MouseEvent e) {
				
				Point currCoords = e.getLocationOnScreen();
				f1.setLocation(currCoords.x - compCoords.x, currCoords.y - compCoords.y);
				
			}
			
		});
		f1.add(p1);
		
		
		
		// Label Title
		JLabel logo = new JLabel();
		
		// Logo Billede 
		logo.setIcon(new ImageIcon("Logo/logo-2.png"));
		
		// Logo Bounds
		logo.setBounds(5,5,35,35);
		
		p1.add(logo);
		
		
		
		// Label Title
		JLabel t1 = new JLabel(FrameName1);
		
		// Label Bounds
	    t1.setBounds(45,5,45,35);
		
		// Color Hex Label Foreground
		t1.setForeground(new Color(0xFFFFFF));
		
		p1.add(t1);
		
		// Label Title
		JLabel t2 = new JLabel(FrameName2);
		
		// Label Bounds
	    t2.setBounds(80,5,45,35);
		
		// Color Hex Label Foreground
		t2.setForeground(new Color(0xFFFFFF));
		
		p1.add(t2);
		
		// Label Title
		JLabel t3 = new JLabel(FrameName3);
		
		// Label Bounds
	    t3.setBounds(113,5,45,35);
		
		// Color Hex Label Foreground
		t3.setForeground(new Color(0xFFFFFF));
		
		p1.add(t3);
		
		// Label Title
		JLabel t4 = new JLabel(FrameName4);
		
		// Label Bounds
	    t4.setBounds(149,5,45,35);
		
		// Color Hex Label Foreground
		t4.setForeground(new Color(0xFFFFFF));
		
		p1.add(t4);
		
		
		
		// Button Title
		JButton close = new JButton("X");
		close.setFocusable(false);
		
		// Button Bounds
		close.setBounds(1080,5,45,35);
		
		// Color Hex Button Foreground
		close.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		close.setBackground(new Color(0x0000FF));
		
		// Button ActionListener
		close.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==close) {
					
					f1.dispose();
					
				}
				
			}
			
		});
		p1.add(close);
		
		
		
		// Button Title
		JButton minimize = new JButton("--");
		minimize.setFocusable(false);
		
		// Button Bounds
		minimize.setBounds(1030,5,45,35);
		
		// Color Hex Button Foreground
		minimize.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		minimize.setBackground(new Color(0x0000FF));
		
		// Button ActionListener
		minimize.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==minimize) {
					
					f1.setExtendedState(JFrame.ICONIFIED);
					
				}
				
			}
			
		});
		p1.add(minimize);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Button Title
		JButton background = new JButton("Background");
		background.setFocusable(false);
		
		// Button ImageIcon
		background.setIcon(new ImageIcon("File_Logo/background.png"));
		background.setVerticalTextPosition(JButton.BOTTOM);
		background.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		background.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		background.setBounds(30,75,120,60);
		
		// Color Hex Button Foreground
		background.setForeground(new Color(0x000000));
		
		// Color Hex Button Background
		background.setBackground(new Color(0xC0C0C0));
		
		// Button ActionListener
		background.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==background) {
					
					f1.dispose();
					
					background();
					
				}
				
			}
			
		});
		f1.add(background);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Panel
		JPanel p2 = new JPanel();
		
		// Panel Bounds
		p2.setBounds(0,530,1130,25);
		
		// Layout
		p2.setLayout(null);
		
		// Color Hex Panel
		p2.setBackground(new Color(0x008000));
		
		f1.add(p2);
		
		
		
		// Panel
		JPanel p3 = new JPanel();
		
		// Panel Bounds
		p3.setBounds(0,555,1130,85);
		
		// Layout
		p3.setLayout(null);
		
		// Color Hex Panel
		p3.setBackground(new Color(0x000080));
		
		f1.add(p3);
		
		
		
		// Button Title
		JButton exit = new JButton("Exit Settings");
		exit.setFocusable(false);
		
		// Button ImageIcon
		exit.setIcon(new ImageIcon("File_Logo/exit.png"));
		exit.setVerticalTextPosition(JButton.BOTTOM);
		exit.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		exit.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		exit.setBounds(10,10,120,63);
		
		// Color Hex Button Foreground
		exit.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		exit.setBackground(new Color(0x000080));
		
		// Button ActionListener
		exit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==exit) {
					
					f1.dispose();
					
					menu();
					
				}
				
			}
			
		});
		p3.add(exit);
	
		
		
		
		
		
		
		
		
		

		
		// Start Frame Visible
		f1.setVisible(true);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void background() {
		
		
		// Frame Title
		JFrame f1 = new JFrame(FrameName);
		
		// Frame Bounds
		f1.setBounds(x,y,width,height);
		
		// Frame Layout
		f1.setLayout(null);
		
		// Container
		Container c1 = f1.getContentPane();
		
		// Color Hex Background
		c1.setBackground(new Color(ColorBackground));
		
		// Frame Logo
		ImageIcon i1 = new ImageIcon("Logo/logo-1.png");
		f1.setIconImage(i1.getImage());
		
		
		
		
		
		
		
		
		
		
		// Undecorated
		f1.setUndecorated(true);
		
		
		
		// Panel
		JPanel p1 = new JPanel();
		
		// Panel Bounds
		p1.setBounds(0,0,1130,45);
		
		// Layout
		p1.setLayout(null);
		
		// Color Hex Panel
		p1.setBackground(new Color(0x008000));
		
		// Panel ActionListener
		compCoords = null;
		p1.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				
				compCoords = null;
				
			}
			
			public void mousePressed(MouseEvent e) {
				
				compCoords = e.getPoint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
			}
			
			public void mouseEntered(MouseEvent e) {
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
			}
			
		});
		
		p1.addMouseMotionListener(new MouseMotionListener() {
			
			public void mouseMoved(MouseEvent e) {
				
			}
			
			public void mouseDragged(MouseEvent e) {
				
				Point currCoords = e.getLocationOnScreen();
				f1.setLocation(currCoords.x - compCoords.x, currCoords.y - compCoords.y);
				
			}
			
		});
		f1.add(p1);
		
		
		
		// Label Title
		JLabel logo = new JLabel();
		
		// Logo Billede 
		logo.setIcon(new ImageIcon("Logo/logo-2.png"));
		
		// Logo Bounds
		logo.setBounds(5,5,35,35);
		
		p1.add(logo);
		
		
		
		// Label Title
		JLabel t1 = new JLabel(FrameName1);
		
		// Label Bounds
	    t1.setBounds(45,5,45,35);
		
		// Color Hex Label Foreground
		t1.setForeground(new Color(0xFFFFFF));
		
		p1.add(t1);
		
		// Label Title
		JLabel t2 = new JLabel(FrameName2);
		
		// Label Bounds
	    t2.setBounds(80,5,45,35);
		
		// Color Hex Label Foreground
		t2.setForeground(new Color(0xFFFFFF));
		
		p1.add(t2);
		
		// Label Title
		JLabel t3 = new JLabel(FrameName3);
		
		// Label Bounds
	    t3.setBounds(113,5,45,35);
		
		// Color Hex Label Foreground
		t3.setForeground(new Color(0xFFFFFF));
		
		p1.add(t3);
		
		// Label Title
		JLabel t4 = new JLabel(FrameName4);
		
		// Label Bounds
	    t4.setBounds(149,5,45,35);
		
		// Color Hex Label Foreground
		t4.setForeground(new Color(0xFFFFFF));
		
		p1.add(t4);
		
		
		
		// Button Title
		JButton close = new JButton("X");
		close.setFocusable(false);
		
		// Button Bounds
		close.setBounds(1080,5,45,35);
		
		// Color Hex Button Foreground
		close.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		close.setBackground(new Color(0x0000FF));
		
		// Button ActionListener
		close.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==close) {
					
					f1.dispose();
					
				}
				
			}
			
		});
		p1.add(close);
		
		
		
		// Button Title
		JButton minimize = new JButton("--");
		minimize.setFocusable(false);
		
		// Button Bounds
		minimize.setBounds(1030,5,45,35);
		
		// Color Hex Button Foreground
		minimize.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		minimize.setBackground(new Color(0x0000FF));
		
		// Button ActionListener
		minimize.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==minimize) {
					
					f1.setExtendedState(JFrame.ICONIFIED);
					
				}
				
			}
			
		});
		p1.add(minimize);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Panel
		JPanel p2 = new JPanel();
		
		// Panel Bounds
		p2.setBounds(0,530,1130,25);
		
		// Layout
		p2.setLayout(null);
		
		// Color Hex Panel
		p2.setBackground(new Color(0x008000));
		
		f1.add(p2);
		
		
		
		// Panel
		JPanel p3 = new JPanel();
		
		// Panel Bounds
		p3.setBounds(0,555,1130,85);
		
		// Layout
		p3.setLayout(null);
		
		// Color Hex Panel
		p3.setBackground(new Color(0x000080));
		
		f1.add(p3);
		
		
		
		// Button Title
		JButton exit = new JButton("Exit Background");
		exit.setFocusable(false);
		
		// Button ImageIcon
		exit.setIcon(new ImageIcon("File_Logo/exit.png"));
		exit.setVerticalTextPosition(JButton.BOTTOM);
		exit.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		exit.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		exit.setBounds(10,10,120,63);
		
		// Color Hex Button Foreground
		exit.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		exit.setBackground(new Color(0x000080));
		
		// Button ActionListener
		exit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==exit) {
					
					f1.dispose();
					
					settings();
					
				}
				
			}
			
		});
		p3.add(exit);
	
		
		

		
		// Button Title
		JButton red = new JButton("Red");
		red.setFocusable(false);
		
		// Button ImageIcon
		red.setIcon(new ImageIcon("File_Logo/red.png"));
		red.setVerticalTextPosition(JButton.BOTTOM);
		red.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		red.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		red.setBounds(120,10,120,63);
		
		// Color Hex Button Foreground
		red.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		red.setBackground(new Color(0x000080));
		
		// Button ActionListener
		red.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==red) {
					
					c1.setBackground(new Color(0xFF0000));
					
				}
				
			}
			
		});
		p3.add(red);
		
		
		
		
		
		
		
		
		
		
		// Button Title
		JButton lime = new JButton("Lime");
		lime.setFocusable(false);
		
		// Button ImageIcon
		lime.setIcon(new ImageIcon("File_Logo/lime.png"));
		lime.setVerticalTextPosition(JButton.BOTTOM);
		lime.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		lime.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		lime.setBounds(220,10,120,63);
		
		// Color Hex Button Foreground
		lime.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		lime.setBackground(new Color(0x000080));
		
		// Button ActionListener
		lime.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==lime) {
					
					c1.setBackground(new Color(0x00FF00));
					
				}
				
			}
			
		});
		p3.add(lime);
		
		
		
		
		
		
		
		
		
		
		// Button Title
		JButton blue = new JButton("Blue");
		blue.setFocusable(false);
		
		// Button ImageIcon
		blue.setIcon(new ImageIcon("File_Logo/blue.png"));
		blue.setVerticalTextPosition(JButton.BOTTOM);
		blue.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		blue.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		blue.setBounds(320,10,120,63);
		
		// Color Hex Button Foreground
		blue.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		blue.setBackground(new Color(0x000080));
		
		// Button ActionListener
		blue.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==blue) {
					
					c1.setBackground(new Color(0x0000FF));
					
				}
				
			}
			
		});
		p3.add(blue);
		
		
		
		
		
		
		
		// Button Title
		JButton yellow = new JButton("Yellow");
		yellow.setFocusable(false);
		
		// Button ImageIcon
		yellow.setIcon(new ImageIcon("File_Logo/yellow.png"));
		yellow.setVerticalTextPosition(JButton.BOTTOM);
		yellow.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		yellow.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		yellow.setBounds(420,10,120,63);
		
		// Color Hex Button Foreground
		yellow.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		yellow.setBackground(new Color(0x000080));
		
		// Button ActionListener
		yellow.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==yellow) {
					
					c1.setBackground(new Color(0xFFFF00));
					
				}
				
			}
			
		});
		p3.add(yellow);
		
		
		
		
		
		
		
		
		// Button Title
		JButton cyan = new JButton("Cyan");
		cyan.setFocusable(false);
		
		// Button ImageIcon
		cyan.setIcon(new ImageIcon("File_Logo/cyan.png"));
		cyan.setVerticalTextPosition(JButton.BOTTOM);
		cyan.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		cyan.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		cyan.setBounds(520,10,120,63);
		
		// Color Hex Button Foreground
		cyan.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		cyan.setBackground(new Color(0x000080));
		
		// Button ActionListener
		cyan.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==cyan) {
					
					c1.setBackground(new Color(0x00FFFF));
					
				}
				
			}
			
		});
		p3.add(cyan);
		
		
		
		
		
		
		
		// Button Title
		JButton magenta = new JButton("Magenta");
		magenta.setFocusable(false);
		
		// Button ImageIcon
		magenta.setIcon(new ImageIcon("File_Logo/magenta.png"));
		magenta.setVerticalTextPosition(JButton.BOTTOM);
		magenta.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		magenta.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		magenta.setBounds(620,10,120,63);
		
		// Color Hex Button Foreground
		magenta.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		magenta.setBackground(new Color(0x000080));
		
		// Button ActionListener
		magenta.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==magenta) {
					
					c1.setBackground(new Color(0xFF00FF));
					
				}
				
			}
			
		});
		p3.add(magenta);
		
		
		
		
		
		
		
		
		// Button Title
		JButton save = new JButton("Save");
		save.setFocusable(false);
		
		// Button ImageIcon
		save.setIcon(new ImageIcon("File_Logo/save.png"));
		save.setVerticalTextPosition(JButton.BOTTOM);
		save.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		save.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		save.setBounds(720,10,120,63);
		
		// Color Hex Button Foreground
		save.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		save.setBackground(new Color(0x000080));
		
		// Button ActionListener
		save.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
			
		});
		p3.add(save);
		
		
		
		
		
		
		
		// Start Frame Visible
		f1.setVisible(true);
		
		
		
	}
	
	
	
}