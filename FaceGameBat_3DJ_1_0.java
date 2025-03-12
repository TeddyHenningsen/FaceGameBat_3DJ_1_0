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
import javax.swing.JColorChooser;



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



//import java.util.;
import java.util.prefs.Preferences;



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
	
	
	
	private static final String COLOR_KEY = "background_color";
	private static final Preferences prefs = Preferences.userNodeForPackage(FaceGameBat_3DJ_1_0.class);
	
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
		c1.setBackground(new Color(0x000000));
		
		
		
		// Panel
		JPanel panel = new JPanel();
		
		// Panel Bounds
		panel.setBounds(0,45,1130,485);
		
		// Layout
		panel.setLayout(null);

		// Panel Color Hex Background
		Color savedColor = loadBackgroundColor();
		panel.setBackground(savedColor);
		
		
		
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
		exit.setBackground(savedColor);
		
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
		command.setBackground(savedColor);
		
		// Button ActionListener
		command.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==command) {
					
					f1.dispose();
					
					command();
					
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
		document.setBackground(savedColor);
		
		// Button ActionListener
		document.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==document) {
					
					f1.dispose();
					
					document();
					
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
		
		
		
		
		
		
		
		
		
		
		
		// Start Panel Background Visible
		f1.add(panel);
		
		// Start Frame Visible
		f1.setVisible(true);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void command() {
		
		
		// Frame Title
		JFrame f1 = new JFrame(FrameName);
		
		// Frame Bounds
		f1.setBounds(x,y,width,height);
		
		// Frame Layout
		f1.setLayout(null);
		
		// Container
		Container c1 = f1.getContentPane();
		
		// Color Hex Background
		c1.setBackground(new Color(0x000000));
		
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
		
		
		
		
		
		
		
		
		
		
		// Label Title
		JLabel commandname = new JLabel("C:>");
		
		// Label Font
		commandname.setFont(new Font("Arial", Font.BOLD, 17));
		
		// Label Bounds
	    commandname.setBounds(10,60,45,25);
		
		// Color Hex Label Foreground
		commandname.setForeground(new Color(0xFFFFFF));
		
		f1.add(commandname);
		
		
		
		
		
		
		
		
		
		
		
		// the command code is correct // The command code is incorrect //
		
		// Label Title
		JLabel textcoin1 = new JLabel("");
		
		// Label Bounds
		textcoin1.setBounds(10,80,45,25);
		
		// Color Hex Label Foreground
		textcoin1.setForeground(new Color(0xFFFFFF));
		
		f1.add(textcoin1);
		
		// Label Title
		JLabel textcoin2 = new JLabel("");
		
		// Label Bounds
		textcoin2.setBounds(40,80,45,25);
		
		// Color Hex Label Foreground
		textcoin2.setForeground(new Color(0xFFFFFF));
		
		f1.add(textcoin2);
		
		// Label Title
		JLabel textcoin3 = new JLabel("");
		
		// Label Bounds
		textcoin3.setBounds(75,80,45,25);
		
		// Color Hex Label Foreground
		textcoin3.setForeground(new Color(0xFFFFFF));
		
		f1.add(textcoin3);
		
		// Label Title
		JLabel textcoin4 = new JLabel("");
		
		// Label Bounds
		textcoin4.setBounds(105,80,45,25);
		
		// Color Hex Label Foreground
		textcoin4.setForeground(new Color(0xFFFFFF));
		
		f1.add(textcoin4);
		
		// Label Title
		JLabel textcoin5 = new JLabel("");
		
		// Label Bounds
		textcoin5.setBounds(138,80,45,25);
		
		// Color Hex Label Foreground
		textcoin5.setForeground(new Color(0xFFFFFF));
		
		f1.add(textcoin5);
		
		// Label Title
		JLabel textcoin6 = new JLabel("");
		
		// Label Bounds
		textcoin6.setBounds(169,80,45,25);
		
		// Color Hex Label Foreground
		textcoin6.setForeground(new Color(0xFFFFFF));
		
		f1.add(textcoin6);
		
		
		
		
		
		
		
		
		
		
		
		// Directory //
		
		// Label Title
		JLabel textdy1 = new JLabel("");
		
		// Label Font
		textdy1.setFont(new Font("Arial", Font.BOLD, 14));
		
		// Label Bounds
		textdy1.setBounds(10,150,45,25);
		
		// Color Hex Label Foreground
		textdy1.setForeground(new Color(0xFFFFFF));
		
		f1.add(textdy1);
		
		// Label Title
		JLabel textdy2 = new JLabel("");
		
		// Label Font
		textdy2.setFont(new Font("Arial", Font.BOLD, 14));
		
		// Label Bounds
		textdy2.setBounds(38,150,45,25);
		
		// Color Hex Label Foreground
		textdy2.setForeground(new Color(0xFFFFFF));
		
		f1.add(textdy2);
		
		
		
		
		
		
		
		
		
		
		// Dir // Command //
		
		// Label Title
		JLabel textdir1 = new JLabel("");
		
		// Label Bounds
		textdir1.setBounds(10,170,45,25);
		
		// Color Hex Label Foreground
		textdir1.setForeground(new Color(0xFFFFFF));
		
		f1.add(textdir1);
		
		// Label Title
		JLabel textdir2 = new JLabel("");
		
		// Label Bounds
		textdir2.setBounds(40,170,45,25);
		
		// Color Hex Label Foreground
		textdir2.setForeground(new Color(0xFFFFFF));
		
		f1.add(textdir2);
		
		// Label Title
		JLabel textdir3 = new JLabel("");
		
		// Label Bounds
		textdir3.setBounds(75,170,45,25);
		
		// Color Hex Label Foreground
		textdir3.setForeground(new Color(0xFFFFFF));
		
		f1.add(textdir3);
		
		
		
		
		
		
		
		
		
		
		// Dir // document //
		
		// Label Title
		JLabel textdir4 = new JLabel("");
		
		// Label Bounds
		textdir4.setBounds(10,190,45,25);
		
		// Color Hex Label Foreground
		textdir4.setForeground(new Color(0xFFFFFF));
		
		f1.add(textdir4);
		
		// Label Title
		JLabel textdir5 = new JLabel("");
		
		// Label Bounds
		textdir5.setBounds(40,190,45,25);
		
		// Color Hex Label Foreground
		textdir5.setForeground(new Color(0xFFFFFF));
		
		f1.add(textdir5);
		
		// Label Title
		JLabel textdir6 = new JLabel("");
		
		// Label Bounds
		textdir6.setBounds(68,190,45,25);
		
		// Color Hex Label Foreground
		textdir6.setForeground(new Color(0xFFFFFF));
		
		f1.add(textdir6);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TextField Title
		JTextField commandfield = new JTextField();
		
		// TextField Font
		commandfield.setFont(new Font("Arial", Font.BOLD, 17));
		
		commandfield.setCaretColor(new Color(0xFFFFFF));
		
		// Button BorderFactory
		commandfield.setBorder(BorderFactory.createEmptyBorder());
		
		// TextField Bounds
		commandfield.setBounds(40,60,165,25);
		
		// Color Hex TextField Foreground
		commandfield.setForeground(new Color(0xFFFFFF));
		
		// Color Hex TextField Background
		commandfield.setBackground(new Color(0x000000));
		
		// TextField ActionListener
		commandfield.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String commandcode = commandfield.getText();
				
				if(commandcode.equals("dir")) {
					
					// the command code is correct
					textcoin1.setText("The c");
					textcoin2.setText("omma");
					textcoin3.setText("nd co");
					textcoin4.setText("de is c");
					textcoin5.setText(" orrect");
					textcoin6.setText("");
					
					// Directory
					textdy1.setText("Dire");
					textdy2.setText("ctory");
					
					// Dir // command
					textdir1.setText("DIR>");
					textdir2.setText("comm");
					textdir3.setText("and");
					
					// Dir // document
					textdir4.setText("DIR>");
					textdir5.setText("docu");
					textdir6.setText("ment");
					
				}
				else {
					
					// The command code is incorrect
					textcoin1.setText("The c");
					textcoin2.setText("omma");
					textcoin3.setText("nd co");
					textcoin4.setText("de is i");
					textcoin5.setText("ncorr");
					textcoin6.setText("ect");
					
					// Directory
					textdy1.setText("");
					textdy2.setText("");
					
					// Dir // command
					textdir1.setText("");
					textdir2.setText("");
					textdir3.setText("");
					
					// Dir // document
					textdir4.setText("");
					textdir5.setText("");
					textdir6.setText("");
					
				}
				
			}
			
		});
		f1.add(commandfield);
		
		
		
		
		
		
		
		
		
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
		JButton exit = new JButton("Exit Command");
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void document() {
		
		
		// Frame Title
		JFrame f1 = new JFrame(FrameName);
		
		// Frame Bounds
		f1.setBounds(x,y,width,height);
		
		// Frame Layout
		f1.setLayout(null);
		
		// Container
		Container c1 = f1.getContentPane();
		
		// Color Hex Background
		c1.setBackground(new Color(0x000000));
		
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TextArea
		JTextArea ta1 = new JTextArea();
		
		// TextArea Font
		ta1.setFont(new Font("Arial", Font.BOLD, 17));
		
		// ScrollPane
		JScrollPane sc1 = new JScrollPane(ta1);
		
		sc1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sc1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		// ScrollPane Bounds
		sc1.setBounds(0,45,1130,485);
		
		f1.add(sc1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
		JButton exit = new JButton("Exit Document");
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
	
		
		
		
		
		
		
		
		
		
		
		
		
		// Button Title
		JButton newfile = new JButton("New File");
		newfile.setFocusable(false);
		
		// Button ImageIcon
		newfile.setIcon(new ImageIcon("File_Logo/new_file.png"));
		newfile.setVerticalTextPosition(JButton.BOTTOM);
		newfile.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		newfile.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		newfile.setBounds(120,10,120,63);
		
		// Color Hex Button Foreground
		newfile.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		newfile.setBackground(new Color(0x000080));
		
		// Button ActionListener
		newfile.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==newfile) {
					
					f1.dispose();
					
					document();
					
				}
				
			}
			
		});
		p3.add(newfile);
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Button Title
		JButton openfile = new JButton("Open File");
		openfile.setFocusable(false);
		
		// Button ImageIcon
		openfile.setIcon(new ImageIcon("File_Logo/open_file.png"));
		openfile.setVerticalTextPosition(JButton.BOTTOM);
		openfile.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		openfile.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		openfile.setBounds(220,10,120,63);
		
		// Color Hex Button Foreground
		openfile.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		openfile.setBackground(new Color(0x000080));
		
		// Button ActionListener
		openfile.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				FileDialog fedg1 = new FileDialog(f1, "Open File", FileDialog.LOAD);
				fedg1.setVisible(true);
				
				String fileName;
				String fileAddress;
				
				if(fedg1.getFile()!=null) {
					
					fileName = fedg1.getFile();
					fileAddress = fedg1.getDirectory();
					
					try {
						
						BufferedReader br1 = new BufferedReader(new FileReader(fileAddress + fileName));
						
						String line = null;
						
						while((line = br1.readLine())!=null) {
							
							ta1.append(line + "\n");
							
						}
						br1.close();
						
					} catch(Exception ex) {
						
					}
					
				}
				
			}
			
		});
		p3.add(openfile);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
		save.setBounds(320,10,120,63);
		
		// Color Hex Button Foreground
		save.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		save.setBackground(new Color(0x000080));
		
		// Button ActionListener
		save.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				FileDialog fedg1 = new FileDialog(f1, "Save", FileDialog.SAVE);
				fedg1.setVisible(true);
				
				String fileName;
				String fileAddress;
				
				if(fedg1.getFile()!=null) {
					
					fileName = fedg1.getFile();
					fileAddress = fedg1.getDirectory();
					
					try {
						
						FileWriter fw1 = new FileWriter(fileAddress + fileName);
						fw1.write(ta1.getText());
						fw1.close();
						
					} catch(Exception ex) {
						
					}
					
				}
				
			}
			
		});
		p3.add(save);
		
		
		
		
		
		
		
		
		
		
		
		
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
		JButton background = new JButton("Color Background");
		background.setFocusable(false);
		
		// Button ImageIcon
		background.setIcon(new ImageIcon("File_Logo/color_background.png"));
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
					
					colorbackground();
					
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void colorbackground() {
		
		
		// Frame Title
		JFrame f1 = new JFrame(FrameName);
		
		// Frame Bounds
		f1.setBounds(x,y,width,height);
		
		// Frame Layout
		f1.setLayout(null);
		
		// Container
		Container c1 = f1.getContentPane();
		
		// Color Hex Background
		c1.setBackground(new Color(0x000000));
		
		
		
		// Panel
		JPanel panel = new JPanel();
		
		// Panel Bounds
		panel.setBounds(0,45,1130,485);
		
		// Layout
		panel.setLayout(null);

		// Panel Color Hex Background
		Color savedColor = loadBackgroundColor();
		panel.setBackground(savedColor);
		
		
		
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
		JButton exit = new JButton("Exit Color Background");
		exit.setFocusable(false);
		
		// Button ImageIcon
		exit.setIcon(new ImageIcon("File_Logo/exit.png"));
		exit.setVerticalTextPosition(JButton.BOTTOM);
		exit.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		exit.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		exit.setBounds(10,10,150,63);
		
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
		JButton red = new JButton("Switch Color Background");
		red.setFocusable(false);
		
		// Button ImageIcon
		red.setIcon(new ImageIcon("File_Logo/switch_color_background.png"));
		red.setVerticalTextPosition(JButton.BOTTOM);
		red.setHorizontalTextPosition(JButton.CENTER);
		
		// Button BorderFactory
		red.setBorder(BorderFactory.createEmptyBorder());
		
		// Button Bounds
		red.setBounds(160,10,150,63);
		
		// Color Hex Button Foreground
		red.setForeground(new Color(0xFFFFFF));
		
		// Color Hex Button Background
		red.setBackground(new Color(0x000080));
		
		// Button ActionListener
		red.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Color savedColor = loadBackgroundColor();
				
				Color newColor = JColorChooser.showDialog(f1, "Switch Color Background", panel.getBackground());
				
				if (newColor != null) {
					
					panel.setBackground(newColor);
					saveBackgroundColor(newColor);
					
				}
				
			}
			
		});
		p3.add(red);
		
		
		
		
		
		
		
		
		
		
		// Start Panel Background Visible
		f1.add(panel);
		
		// Start Frame Visible
		f1.setVisible(true);
		
		
		
	}
	
    private static void saveBackgroundColor(Color color) {
		
        prefs.putInt(COLOR_KEY, color.getRGB());
		
    }
	
    private static Color loadBackgroundColor() {
		
        return new Color(prefs.getInt(COLOR_KEY, Color.WHITE.getRGB()));
		
    }
	
	
	
	
	
	
	
	
	
	
	
	
}