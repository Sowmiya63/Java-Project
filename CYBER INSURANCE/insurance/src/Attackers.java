

	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Container;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.KeyEvent;
	import java.awt.event.WindowAdapter;
	import java.awt.event.WindowEvent;
	import java.io.BufferedInputStream;
	import java.io.BufferedOutputStream;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.DataInputStream;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.net.ServerSocket;
	import java.net.Socket;
	import java.net.UnknownHostException;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	import javax.swing.BorderFactory;
	import javax.swing.JButton;
	import javax.swing.JCheckBox;
	import javax.swing.JComboBox;
	import javax.swing.JFileChooser;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;
	import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

	public class Attackers implements ActionListener{
		
		public JFrame jf;
		public Container c;
		public JButton btn1=new JButton("");
		public JTextArea textarea=new JTextArea("");
		public JScrollPane scrpane = new JScrollPane();
		public JLabel filepath = new JLabel("Attackers Received files");
		public JLabel Mobile = new JLabel("");
		public JComboBox jcombo; 
		public static String Messages ;
		 String cmb[]={"Select","Mobile 1","Mobile 2","Mobile 3","Mobile 4","Mobile 5","Mobile 6","Mobile 7","Mobile 8","Mobile 9","Mobile 10","Mobile 11","Mobile 12","Mobile 13","Mobile 14","Mobile 15","Mobile 16","Mobile 17","Mobile 18","Mobile 19","Mobile 20","Mobile 21","Mobile 22","Mobile 23","Mobile 24","Mobile 25","Mobile 26","Mobile 27","Mobile 28","Mobile 29","Mobile 30"};
		Attackers()
		{	
				
			jf = new JFrame("Rootkit Attacks");
			c = jf.getContentPane();
			c.setLayout(null);
			jf.setSize(400, 300);
			
			 jf.setResizable(false);  
			//c.setBackground(new Color(59,96,175));
			 jcombo=new JComboBox(cmb);
			 jcombo.setBounds(50,50,130,40);//malicious host
			 jcombo.setForeground(Color.RED);
			 
			 filepath.setBounds(210,20,130,40);//malicious host
			 
			 Mobile.setBounds(210,150,130,40);//malicious host
			 
			 textarea.setBounds(200,50,150,200);
			 scrpane.setBounds(200,50,150,200);
			 textarea.setColumns(20);
			 textarea.setRows(10);
			 textarea.setForeground(Color.DARK_GRAY);
			 scrpane.setViewportView(textarea);
			
			 
			btn1.setBounds(50,100,130,40);
			btn1.setIcon(new javax.swing.ImageIcon("send.png"));
			btn1.addActionListener(this);
			
			btn1.setMnemonic(KeyEvent.VK_B);
			
			
			
			jf.show();
			
			 c.add(filepath);
			 c.add(scrpane,BorderLayout.CENTER);
			 c.add(Mobile);
			 c.add(jcombo);
			c.add(btn1);
		 	
			
			
			jf.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent win) {
				//	System.exit(0);
				}
			});
			
			int[] ports = new int[] {3939 };

			for (int i = 0; i < 1; i++) {
				Thread t = new Thread(new PortListener(ports[i]));
				t.setName("Listener-" + ports[i]);
				t.start();

			}
		
		}		
		
		class PortListener implements Runnable {

			ServerSocket server;
			Socket connection;
			BufferedReader br = null;
			int port;

			public PortListener(int port) {
				this.port = port;
			}

			public void run() {
			    
				if(this.port==3939){
					try {
						server = new ServerSocket(3939);
						while (true) {
							connection = server.accept();
							br = new BufferedReader(
									new InputStreamReader(new BufferedInputStream(
											connection.getInputStream())));
							String strLine;
							StringBuffer buffer = new StringBuffer();
							while ((strLine = br.readLine()) != null) {
								buffer.append(strLine+"\n");
							}
							
							 String temp = buffer.toString() +"\n\n";
							 textarea.setText(temp);
							 String Message =  textarea.getText();
								Messages =  textarea.getText() +" \n\n" ;
								char[] bb = new char[Message.length()]; 
						           textarea.setText(null);
						     	   
						     	   for(int i =0;i<Message.length();i++)
						     	   {
						     		   bb[i]=Message.charAt(i);             		   
						     		  textarea.setText(textarea.getText() + (char)((int)bb[i]+50) );
						     	   }  
								
						}
					}
							 catch (IOException e) {} 
								} 
								

			}
				
				

			
			
		}
		
			public void actionPerformed(ActionEvent e)
			 {
				
				if(e.getSource()==btn1){
					String cmb=(String)jcombo.getSelectedItem();
					Mobile.setText(cmb);
					Mobile.setVisible(true);
					if(cmb.equals("Select"))
					{
						 JOptionPane.showMessageDialog(null,"Select Attacking Mobile!!", "Message Box", 1); 
					}
					else if(cmb.equals("Mobile 1"))
					{
						detail1(7701);
					}
					else if(cmb.equals("Mobile 2"))
					{
						detail1(7702);
					}
					else if(cmb.equals("Mobile 3"))
					{
						detail1(7703);
					}
					else if(cmb.equals("Mobile 4"))
					{
						detail1(7704);
					}
					else if(cmb.equals("Mobile 5"))
					{
						detail1(7705);
					}
					else if(cmb.equals("Mobile 6"))
					{
						detail1(7706);
					}
					else if(cmb.equals("Mobile 7"))
					{
						detail1(7707);
					}
					else if(cmb.equals("Mobile 8"))
					{
						detail1(7708);
					}
					else if(cmb.equals("Mobile 9"))
					{
						detail1(7709);
					}
					else if(cmb.equals("Mobile 10"))
					{
						detail1(7710);
					}
					else if(cmb.equals("Mobile 11"))
					{
						detail1(7711);
					}
					else if(cmb.equals("Mobile 12"))
					{
						detail1(7712);
					}
					else if(cmb.equals("Mobile 13"))
					{
						detail1(7713);
					}
					else if(cmb.equals("Mobile 14"))
					{
						detail1(7714);
					}
					else if(cmb.equals("Mobile 15"))
					{
						detail1(7715);
					}
					else if(cmb.equals("Mobile 16"))
					{
						detail1(7716);
					}
					else if(cmb.equals("Mobile 17"))
					{
						detail1(7717);
					}
					else if(cmb.equals("Mobile 18"))
					{
						detail1(7718);
					}
					else if(cmb.equals("Mobile 19"))
					{
						detail1(7719);
					}
					else if(cmb.equals("Mobile 20"))
					{
						detail1(7720);
					}
					else if(cmb.equals("Mobile 21"))
					{
						detail1(7721);
					}
					else if(cmb.equals("Mobile 22"))
					{
						detail1(7722);
					}
					else if(cmb.equals("Mobile 23"))
					{
						detail1(7723);
					}
					else if(cmb.equals("Mobile 24"))
					{
						detail1(7724);
					}
					else if(cmb.equals("Mobile 25"))
					{
						detail1(7725);
					}
					else if(cmb.equals("Mobile 26"))
					{
						detail1(7726);
					}
					else if(cmb.equals("Mobile 27"))
					{
						detail1(7727);
					}
					else if(cmb.equals("Mobile 28"))
					{
						detail1(7728);
					}
					else if(cmb.equals("Mobile 29"))
					{
						detail1(7729);
					}
					else if(cmb.equals("Mobile 30"))
					{
						 
						detail1(7730);
					}
					
					
				
				}
				
			 }
					   
			void detail1(int port) {
				// TODO Auto-generated method stub
				BufferedOutputStream bos = null;
				byte[] byteArray;			 
				Socket client = null;
				try     { 

				//	/********SERVER IP Adddress*********************/

					client = new Socket("127.0.0.1",port );//Mobile C
				
					bos = new BufferedOutputStream(client.getOutputStream()); 

					
					byteArray = Mobile.getText().getBytes();
					bos.write(byteArray, 0, byteArray.length);
					bos.flush();
					bos.close();
					client.close();
				}

				catch (UnknownHostException e1) 
				{

					e1.printStackTrace();
				}
				catch (IOException e1) 
				{}

				finally 
				{}
			}	
		
			//*****************************************************************************************
			public static void main(String args[])
		{
				
				/*
			        * Set the Nimbus look and feel
			        */
			       //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
			       /*
			        * If Nimbus (introduced in Java SE 6) is not available, stay with the
			        * default look and feel. For details see
			        * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
			        */
			       try {
			           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
			               if ("Nimbus".equals(info.getName())) {
			                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
			                   break;
			               }
			           }
			       } catch (ClassNotFoundException ex) {
			           java.util.logging.Logger.getLogger(Attackers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			       } catch (InstantiationException ex) {
			           java.util.logging.Logger.getLogger(Attackers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			       } catch (IllegalAccessException ex) {
			           java.util.logging.Logger.getLogger(Attackers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
			           java.util.logging.Logger.getLogger(Attackers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			       }
			new Attackers();
		}


	}


