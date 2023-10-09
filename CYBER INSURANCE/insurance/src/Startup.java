

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.util.Random;

public class Startup extends JFrame
{
	private static final long serialVersionUID = 3l;
	public static JTextArea jta;
	static JPanel panel,err[];
	JPanel main;
	JScrollPane jsp;
	Container c;
	JButton send,clear;
	String serverIp;
	static JCheckBox jcb;
	String processor;
	static JLabel lbl1,lbl2;
	JMenuBar jmb;
	JMenu menu;
	JMenuItem upload,cls,path2,path1,buffer,temp,Network,receiver;
	
	public Startup() throws Exception
	{
	  super(" Attacks  ");
	  Global.ACCESS_KEY = new Random().nextInt(1000);
	 
	  //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	  c = getContentPane();
	  c.setBackground(Color.darkGray);
	  c.setLayout(null);
	  panel= new JPanel();
	  panel.setBounds(50,50,400,360);
	  panel.setBackground(Color.black);
	  panel.setLayout(null);
	  c.add(panel);
	 
	  jta = new JTextArea();
	  jta.setForeground(Color.BLACK);
	  jta.setLineWrap(true);
	  jta.setFont(new Font("Italic",Font.BOLD,14));
	  jta.setEditable(false);
	  jsp = new JScrollPane(jta);
	  jsp.setBorder(BorderFactory.createTitledBorder("------- Welcome Screen -------"));
	  jsp.setBounds(50,20,310,200);
	  jta.setText("  Attacks (Choose your form using Main Menu)");
	  panel.add(jsp);

	  clear = new JButton("Exit");
	  GUI.button(clear,"Exit");
	  clear.addActionListener(new Exit());
	  clear.setBackground(Color.white);
	  clear.setForeground(Color.black);
	  clear.setBounds(55,265,270,25);
	  panel.add(clear);
	  
	  jmb = new JMenuBar();
	   setJMenuBar(jmb);
	   
	   menu = new JMenu("Main Menu");
	   jmb.add(menu);
	   
	  
	   cls = new JMenuItem("Sender");
	  
	   menu.add(cls);
	   
	   Network = new JMenuItem("Network 1");
	   menu.add(Network);
	   path1 = new JMenuItem("Network 2");
	   menu.add(path1);
	   path2 = new JMenuItem("Network 3");
	   menu.add(path2);
	   buffer = new JMenuItem("Topology");
	   menu.add(buffer);
	   temp = new JMenuItem("Attacker");
	   menu.add(temp);
	   receiver = new JMenuItem("Receiver");
	   menu.add(receiver);
	  
	   upload = new JMenuItem("Exit");
	   menu.add(upload);
	   
	   GUI.forMenuBar(jmb);
	   
	   GUI.forMenu(menu,'M');
	   GUI.assign(cls,'S');
	   GUI.assign(Network,'T');
	   GUI.assign(path1,'Q');
	   GUI.assign(path2,'P');
	   GUI.assign(buffer,'B');
	   GUI.assign(receiver,'R');
	   GUI.assign(temp,'G');
	   GUI.assign(upload,'E');
	   
	  
	
	  cls.addActionListener(new Clear());
	  Network.addActionListener(new Net1());
	  path1.addActionListener(new path1x());
	  path2.addActionListener(new path2x());
	  buffer.addActionListener(new bufferx());
	  temp.addActionListener(new tempx());
	  receiver.addActionListener(new receiverx());
	  upload.addActionListener(new Uploads());
	  
	  main = new JPanel();
	  main.setBackground(Color.black);
	  main.setLayout(new FlowLayout());
	  main.setBounds(25,225,350,50);
	  panel.add(main);
	  
	  err = new JPanel[12];
	  for(int i=0;i<err.length;i++) {
	  	err[i] = new JPanel();
	  	err[i].setBorder(BorderFactory.createRaisedBevelBorder());
	  	main.add(err[i]);
	  }
	 
	  setSize(500,500);
	  setLocation(300,200);
	  setVisible(true);
	  setResizable(false);
	  setDefaultCloseOperation(3);
	}
	
	public class Clear implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				//dispose();
				new Sender();
				
				
				
				
				
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public class Net1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				//dispose();
				new Network1();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public class path1x implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				//dispose();
				new Network2();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public class path2x implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				//dispose();
				new Network3();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public class bufferx implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				//dispose();
				new topology();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public class tempx implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				//dispose();
				new Attackers();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public class receiverx implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				//dispose();
				new Receiver();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	public class Exit implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				System.exit(0);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public class Uploads implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				dispose();
				
			}
			catch(Exception e1) 
			{
					e1.printStackTrace();
			}
		}
	}

	public static void main(String args[])  throws Exception
	{
		
		 try {
	           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	               if ("Nimbus".equals(info.getName())) {
	                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                   break;
	               }
	           }
	       } catch (ClassNotFoundException ex) {
	           java.util.logging.Logger.getLogger(Startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	       } catch (InstantiationException ex) {
	           java.util.logging.Logger.getLogger(Startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	       } catch (IllegalAccessException ex) {
	           java.util.logging.Logger.getLogger(Startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	           java.util.logging.Logger.getLogger(Startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	       }
		
		
		new Startup();
		for(int i=0;i<11;i++) {
			err[i].setBackground(Color.red);
			Thread.sleep(300);
			err[i].setBackground(Color.gray);
		}
		
	}
	
}
