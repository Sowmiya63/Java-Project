import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
	import java.awt.Color;
	import java.awt.Container;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
    import java.awt.event.WindowAdapter;
	import java.awt.event.WindowEvent;
	import java.awt.event.WindowListener;
	import java.io.BufferedInputStream;
	import java.io.BufferedOutputStream;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.DataInputStream;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.io.OutputStreamWriter;
	import java.net.InetAddress;
	import java.net.ServerSocket;
	import java.net.Socket;
	import java.net.UnknownHostException;
	import java.security.KeyPair;
import java.util.Random;
	import java.util.StringTokenizer;
	import java.util.TimerTask;
	import java.util.Vector;

	import javax.swing.BorderFactory;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JCheckBox;
	import javax.swing.JComboBox;
	import javax.swing.JFileChooser;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JList;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JProgressBar;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;

	import javax.swing.border.Border;
	import javax.swing.border.TitledBorder;
	import javax.swing.table.DefaultTableModel;
	import javax.swing.table.JTableHeader;
	import java.util.TimerTask;
import java.util.Timer;
	public class Network2 implements ActionListener {		
		private static int DELAY = 500;
		String dd;String name,orname,name1000,orname1000;String TTPip,SerIP,serverfile;Object serobject,verobj;
		String txtstr=null;String r1,r2,r3;Object obj=null,clentob=null;
		BufferedOutputStream bos = null;
		byte[] byteArray;// =str.getBytes();
	    public JLabel T1a= new JLabel("Correlation-Based Traffic Analysis Attacks on Anonymity Networks");
		public JLabel T1b= new JLabel("");
		public Font f = new Font("Rockwell" , Font.ROMAN_BASELINE , 20);	
		public Font f1 = new Font("Rockwell", Font.ROMAN_BASELINE , 15);
		public Font f2 = new Font("Rockwell", Font.ROMAN_BASELINE , 15);
		public Font f3 = new Font("Rockwell", Font.ROMAN_BASELINE , 18);
		public JLabel T10= new JLabel("");
		public JLabel T0= new JLabel("IP Address Connect");
		
		public JLabel T1= new JLabel("Platform As a Service");
		public JLabel T2= new JLabel("Software As a Service");
		
		public JLabel T5= new JLabel("Message Box:");
		
		JPanel jp=new JPanel();
		JPanel jp1=new JPanel();
		public JLabel bf= new JLabel();
		
		public JTextArea tfffB=new JTextArea();
		public JScrollPane scB=new JScrollPane();
		
		
		
		public JLabel  leftButton;
		public JLabel  proxyques;
		public JLabel line=new JLabel();;
		public JFrame jf;
		public Container c;
	
		    JPanel p=new JPanel();
		    JScrollPane pane;
		    String data[][] = {};
		    Vector v=new Vector();
		    String col[] = {"Packet Count","Packet Length(Bits)","Bandwidth(Kbps)","TimeDelay(ms)","Packet Status"};
		    DefaultTableModel model = new DefaultTableModel(data,col);
		    JTable table = new JTable(model);
		    
		    
		    
		    //------------
		    JScrollPane panen;
		    String datan[][] = {};
		    Vector vn=new Vector();
		    String coln[] = {"Number of Mobiles","Weight"};
		    DefaultTableModel modeln = new DefaultTableModel(datan,coln);
		    JTable tablen = new JTable(modeln);
		    //-------------
		  //------------
		    JScrollPane panent;
		    String datant[][] = {};
		    Vector vnt=new Vector();
		    String colnt[] = {"Neighbor Discovery"};
		    DefaultTableModel modelnt = new DefaultTableModel(datant,colnt);
		    JTable tablent = new JTable(modelnt);
		    //-------------
		    
		    //------------
		    JScrollPane panent1;
		    String datant1[][] = {};
		    Vector vnt1=new Vector();
		    String colnt1[] = {"collisions"};
		    DefaultTableModel modelnt1 = new DefaultTableModel(datant1,colnt1);
		    JTable tablent1 = new JTable(modelnt1);
		    //-------------
		    //------------
		    JScrollPane panent2;
		    String datant2[][] = {};
		    Vector vnt2=new Vector();
		    String colnt2[] = {"Mobiles","Status"};
		    DefaultTableModel modelnt2 = new DefaultTableModel(datant2,colnt2);
		    JTable tablent2 = new JTable(modelnt2);
		    //-------------
		    
		    int g=1 ,a1;Thread t1;String attack;
		    public JPanel ipaddrcon=new JPanel();
			public JLabel panadd = new JLabel();
			public JLabel des1 = new JLabel("Network 1: ");
			public JLabel des2 = new JLabel("Network 3: ");
			public JLabel des3 = new JLabel("Topology: ");
			public JTextField txtfldd1=new JTextField("127.0.0.1");
			public JTextField txtfldd2=new JTextField("127.0.0.1");
			public JTextField txtfldd3=new JTextField("127.0.0.1");
			public JButton bt=new JButton("");
			
			public JLabel recsplit= new JLabel();
			String event1="null";
			String event2="null";
			String event3="null";
		Network2()
		{	
			
			jf = new JFrame("Network2");
			c = jf.getContentPane();
			c.setLayout(null);
			jf.setSize(815, 730);
			bf.setIcon(new javax.swing.ImageIcon("P1NW05.png"));
			bf.setBounds(0, 0, 799, 699);
			//jf.setLocation(120, -3);
			 jf.setResizable(false);  
			T1a.setBounds(105, 15, 750,45);
			T1a.setFont(f);
			T1a.setForeground(Color.YELLOW);
			T1b.setBounds(225, 40, 450,45);
			T1b.setFont(f);
			T1b.setForeground(Color.yellow);
			recsplit.setBounds(50, 200, 180,30);
			
			TitledBorder leftBorder5 = BorderFactory.createTitledBorder("IP Address Connect");
			leftBorder5.setTitleJustification(TitledBorder.LEFT);

			ipaddrcon.setBackground(new Color(255,255,153));
			//ipaddrcon.setForeground(Color.BLUE);
			ipaddrcon.setBorder(leftBorder5);
			ipaddrcon.setBounds(240,290,430,100);
			leftBorder5.setTitleColor(new Color(120,0,0));
			jp.setBounds(30,200,735,440);
			jp.setBackground(new Color(15,36,62));
			
			jp1.setBounds(120,350,550,200);
			jp1.setBackground(new Color(204,204,204));
		    
			des1.setForeground(Color.black);
			des1.setBounds(160,400,250,30);
			des1.setFont(f2);
			des2.setForeground(Color.black);
			des2.setBounds(160,440,250,30);
			des2.setFont(f2);
			des3.setForeground(Color.black);
			des3.setBounds(160,480,250,30);
			des3.setFont(f2);
			txtfldd1.setForeground(new Color(120,0,0));
			txtfldd1.setBounds(350,400,130,30);
			txtfldd1.setFont(f2);
			txtfldd2.setForeground(new Color(120,0,0));
			txtfldd2.setBounds(350,440,130,30);
			txtfldd2.setFont(f2);
			txtfldd3.setForeground(new Color(120,0,0));
			txtfldd3.setBounds(350,480,130,30);
			txtfldd3.setFont(f2);
			bt.setForeground(new Color(120,0,0));
			bt.setBounds(500,430,130,40);
			bt.setIcon(new javax.swing.ImageIcon("connect.png"));
			jp.setVisible(false);
			
			TitledBorder lineBorder = BorderFactory.createTitledBorder("AdversaryMobile");
			line = new JLabel();
			line.setBorder(lineBorder);
			line.setBounds(8,100,900,490);
			lineBorder.setTitleColor(Color.white);

			TitledBorder leftBorder = BorderFactory.createTitledBorder("Network B");
		    leftBorder.setTitleJustification(TitledBorder.LEFT);
		    leftButton = new JLabel();
		    leftButton.setBorder(leftBorder);
		  
		    leftButton.setBounds(100,400,700,300);
		    leftBorder.setTitleColor(Color.WHITE);
			
		   
			tfffB.setRows(8);
			tfffB.setColumns(10);
			tfffB.setFont(f1);
			tfffB.setForeground(new Color(120,0,0));
			scB.setViewportView(tfffB);
			scB.setBounds(350,520,320,140);
		
			
			T0.setBounds(300,350,350,40);
		    T0.setFont(f);
		    T0.setForeground(Color.black);
		   
			T2.setBounds(100, 330, 250,45);
			T2.setFont(f1);
			T2.setForeground(Color.WHITE);
			
			
			T5.setBounds(100, 540, 250,45);
			T5.setFont(f1);
			T5.setForeground(Color.WHITE);
		
			T1.setForeground(Color.WHITE);
			T1.setBounds(100,170,250,45);
			T1.setFont(f1);
			T10.setForeground(Color.WHITE);
			T10.setBounds(320,200,250,40);
			T10.setFont(f);
			
		
			p.setVisible(false);
			
			JTableHeader header = table.getTableHeader();
			header.setFont(f1);
			header.setForeground(new Color(120,0,0));
			 pane = new JScrollPane(table);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			table.setShowGrid(true);
			table.setEnabled(true);
			table.setForeground(Color.BLUE);
			table.setFont(f1);
			pane.setBounds(50,240,700,150);
			
			JTableHeader headern = tablen.getTableHeader();
			headern.setFont(f1);
			headern.setForeground(new Color(120,0,0));
			 panen = new JScrollPane(tablen);
			tablen.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			tablen.setShowGrid(true);
			tablen.setEnabled(true);
			tablen.setForeground(Color.BLUE);
			tablen.setFont(f1);
			panen.setBounds(50,420,200,150);
			
			
			JTableHeader headernt = tablent.getTableHeader();
			headernt.setFont(f1);
			headernt.setForeground(new Color(120,0,0));
			 panent = new JScrollPane(tablent);
			tablent.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			tablent.setShowGrid(true);
			tablent.setEnabled(true);
			tablent.setForeground(Color.BLUE);
			tablent.setFont(f1);
			panent.setBounds(260,420,170,150);
			
			JTableHeader headernt1 = tablent1.getTableHeader();
			headernt1.setFont(f1);
			headernt1.setForeground(new Color(120,0,0));
			 panent1 = new JScrollPane(tablent1);
			tablent1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			tablent1.setShowGrid(true);
			tablent1.setEnabled(true);
			tablent1.setForeground(Color.BLUE);
			tablent1.setFont(f1);
			panent1.setBounds(440,420,100,150);
			
			JTableHeader headernt2 = tablent2.getTableHeader();
			headernt2.setFont(f1);
			headernt2.setForeground(new Color(120,0,0));
			 panent2 = new JScrollPane(tablent2);
			tablent2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			tablent2.setShowGrid(true);
			tablent2.setEnabled(true);
			tablent2.setForeground(Color.BLUE);
			tablent2.setFont(f1);
			panent2.setBounds(550,420,200,150);
			
			jf.setUndecorated(false);
		    table.setAutoResizeMode(1);
		    pane.setVisible(false);
		    tablen.setAutoResizeMode(1);
		    panen.setVisible(false);
		    tablent.setAutoResizeMode(1);
		    panent.setVisible(false);
		    tablent1.setAutoResizeMode(1);
		    panent1.setVisible(false);
		    tablent2.setAutoResizeMode(1);
		    panent2.setVisible(false);
		    T10.setVisible(false);
		    bt.addActionListener(this);
		    recsplit.setVisible(false);
			
			
			jf.show();
			c.add(des1);
			c.add(des2);
			c.add(des3);
		    c.add(txtfldd1);
		    c.add(txtfldd2);
		    c.add(txtfldd3);
		    c.add(bt);
		   
			//c.add(ipaddrcon);
		    c.add(panent1);
		    c.add(panent2);
		    c.add(panent);
		    c.add(panen);
			c.add(pane);
			
			//c.add(pane);
			
			//c.add(T1a);
			//c.add(T1b);
			//c.add(scB);
		  
			c.add(T0);
			c.add(T10);
			c.add(jp);
			c.add(jp1);
			
			 c.add(recsplit);
			c.add(bf);
			jf.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent win) {
				//	System.exit(0);
				}
			});
			
			int[] ports = new int[] { 6002,4546,4402,9992,6667 };

			for (int i = 0; i < 5; i++) {
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
if(this.port==9992){
					
					try {
						server = new ServerSocket(9992);
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
						
							
							br.close();
							connection.close();
						
						}
						
						
					} catch (IOException e) {
					} finally {
					}
					
					

				}//if close

if(this.port==6667){
	
	try {
		server = new ServerSocket(6667);
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
		
			modelnt2.insertRow(0,new Object[]{temp,"Attackers"});	
			tablent2.setModel(modelnt2);
			br.close();
			connection.close();
		
		}
		
		
	} catch (IOException e) {
	} finally {
	}
	
	

}//if close

if(this.port==4546){
					
					try {
						server = new ServerSocket(4546);
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
								  
							     
								
							//JOptionPane.showMessageDialog(null, "success","Message Box",1);
							modelnt.insertRow(0,new Object[]{temp});	
							tablent.setModel(modelnt);
							
							modelnt2.insertRow(0,new Object[]{temp,"No"});	
							tablent2.setModel(modelnt2);	
							
							br.close();
							connection.close();
						
						}
						
						
					} catch (IOException e) {
					} finally {
					}
					
					

				}//if close

if(this.port==4402){
	
	try {
		server = new ServerSocket(4402);
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
				  
			     
				
			//JOptionPane.showMessageDialog(null, "success","Message Box",1);
			modelnt1.insertRow(0,new Object[]{temp});	
			tablent1.setModel(modelnt1);
			
			modelnt2.insertRow(0,new Object[]{temp,"Collision"});	
			tablent2.setModel(modelnt2);	
			
			br.close();
			connection.close();
		
		}
		
		
	} catch (IOException e) {
	} finally {
	}
	
	

}//if close
			    
				if(this.port==6002){
				try {
					
					server = new ServerSocket(6002);

					while (true) {
						 connection = server.accept();
						 long startTime =System.currentTimeMillis();
						 ObjectInputStream ois=new ObjectInputStream(connection.getInputStream());
						
							try {
								obj= ois.readObject();
							} catch (ClassNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							String sss=(String) obj;
							
							 Random randomGenerator = new Random();
							  
						      a1 = randomGenerator.nextInt(10+g);
						 	 if(g>2){
							       if(a1>=9){
							  		 try {
										    t1=new Thread();
											t1.sleep(200);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										
										
								  attack="Packet Send";
								 
							       }else{
							    try {
										
										t1.sleep(200);
									} catch (InterruptedException e) {
										
										e.printStackTrace();
									}
									
									
									 attack="Packet Send";
							       }
							 
							       }
							       else{
							    	   try {
											
											t1.sleep(200);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										
										 attack="Packet Send";
							       }
								
						 	 
						 	 
					      
							 long endTime =System.currentTimeMillis();
					         float filesize=sss.length();
	      					
	      					float cal=(endTime-startTime);
	      					float ttime=cal/filesize;
	      				
	      					float milliseconds = Round(ttime,4);
	      					String totaltimedelay = Float.toString(milliseconds);
	      					
	      					float bandwidth = sss.length();
	      					float tbandwidth=(bandwidth*ttime)/1024;
	      					String totalbandwidth = Float.toString(tbandwidth);
	      				/*	if(attack.toString().trim().equals("TimeOut"))
	      					{
	      					model.insertRow(0,new Object[]{g,filesize,totalbandwidth,totaltimedelay,attack});
	      					 System.out.println("TimeOut"+g);
	      					String stx=String.valueOf(g);
					    	   recsplit.setVisible(true);
					    	   recsplit.setText(stx);
					    	   splitsend1();
	      					}*/
	      					//else 
	      						if(attack.toString().trim().equals("Packet Send"))
	      					{
	      						model.insertRow(0,new Object[]{g,filesize,totalbandwidth,totaltimedelay,attack});
	      						 System.out.println("Packet Send"+g);
	      						String stx=String.valueOf(g);
						    	   recsplit.setText(stx);
						    	  
	      					}
					        g++;
					       
					        
					       tfffB.setText(tfffB.getText().toString().trim()+"\n"+sss.toString().trim()+"\n");
					      
						
					//	System.out.println("**************************************************");
					   ois.close();
						connection.close();
						
					}
					
				} catch (IOException e) {
				} finally {
				}
				
				/*try {
					
					 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					 Connection c= DriverManager.getConnection("jdbc:odbc:reconfig","sa","test");
					 Statement s= c.createStatement();
					 ResultSet rs = s.executeQuery(" select * from request" );
					 while(rs.next())																			
					 {
						 String Fileid = rs.getString(1);
						 String Username = rs.getString(2);
						 String Userkey = rs.getString(3);
						
						  
					 }
				 }
				 
				 catch(Exception ee) {
					 System.out.print(ee);
				 }*/
				//-----------------------

			}
				
			}

		}
		public static float Round(float Rval, int Rpl) {
			  float p = (float)Math.pow(10,Rpl);
			  Rval = Rval * p;
			  float tmp = Math.round(Rval);
			  return (float)tmp/p;
			    }
	
			public void actionPerformed(ActionEvent e)
			 {
				

				
				if(e.getSource()==bt){

					if(txtfldd1.getText().isEmpty()||txtfldd2.getText().isEmpty()||txtfldd3.getText().isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Please , You will give valid Ip Address!","Message Box",1);

					}
					else{
						JOptionPane.showMessageDialog(null,"Connecting IP Address!!", "Message Box", 1);
						event1=txtfldd1.getText().toString().trim();//clientip
						event2=txtfldd2.getText().toString().trim();//clientip
						event3=txtfldd3.getText().toString().trim();//clientip
					
							txtfldd1.setVisible(false);
						    des1.setVisible(false);
						    txtfldd2.setVisible(false);
						    des2.setVisible(false);
						    txtfldd3.setVisible(false);
						    des3.setVisible(false);
						    bt.setVisible(false);
						    ipaddrcon.setVisible(false);
						    pane.setVisible(true);
						    panen.setVisible(true);
						    panent1.setVisible(true);
						    panent2.setVisible(true);
						    panent.setVisible(true);
						    jp1.setVisible(false);
						    jp.setVisible(true);
						    T10.setVisible(true);
						    recsplit.setVisible(true);
						  //----------------------
							 modeln.insertRow(0,new Object[]{"Mobile20","11"});
							 modeln.insertRow(0,new Object[]{"Mobile19","19"});
							 modeln.insertRow(0,new Object[]{"Mobile18","22"});
							 modeln.insertRow(0,new Object[]{"Mobile17","25"});
							 modeln.insertRow(0,new Object[]{"Mobile16","5"});
							 modeln.insertRow(0,new Object[]{"Mobile15","17"});
							 modeln.insertRow(0,new Object[]{"Mobile14","21"});
							 modeln.insertRow(0,new Object[]{"Mobile13","12"});
							 modeln.insertRow(0,new Object[]{"Mobile12","14"});
							 modeln.insertRow(0,new Object[]{"Mobile11","15"});
							 tablen.setModel(modeln);
							 //---------------------
					}
					
				
				}
			 
			 }
					   
			void sendpacket(Object o)
			{
						byte[] byteArray;
						Socket client = null;
						BufferedOutputStream bos = null;
						
						try {
				    		
							
							  client = new Socket(txtfldd2.getText().toString().trim(),7000);
					    	  ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
					       	  oos.writeObject(o);
						      oos.flush();
						      oos.close();
							  client.close();
							 
						}

						catch (UnknownHostException e1) {

							e1.printStackTrace();
						} catch (IOException e1) {
						}

						finally {}
						
						
						
					
						
					
				
			}	
			
			
			//************************************************************************************
			
			void sendpacket1(Object o)
			{
						byte[] byteArray;
						Socket client = null;
						BufferedOutputStream bos = null;
						
						try {
				    		
							
							  client = new Socket(txtfldd3.getText().toString().trim(),7001);
					    	  ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
					       	  oos.writeObject(o);
						      oos.flush();
						      oos.close();
							  client.close();
							 
						}

						catch (UnknownHostException e1) {

							e1.printStackTrace();
						} catch (IOException e1) {
						}

						finally {}
						
						
						
					
						
					
				
			}
			//***********************************************************************************
			
			//*****************************************************************************************
			void splitsend()
			{
				
						
			
						byte[] byteArray;			 
						Socket client = null;
						try     { 
			
						//	/********SERVER IP Adddress*********************/
			
							client = new Socket(event2, 9900);//8000
						
							bos = new BufferedOutputStream(client.getOutputStream()); 
			
							byteArray = recsplit.getText().getBytes();
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
			
			//*****************************************************************************************
			void splitsend1()
			{
				
						
			
						byte[] byteArray;			 
						Socket client = null;
						try     { 
			
						//	/********SERVER IP Adddress*********************/
			
							client = new Socket(event3, 8800);//8000
						
							bos = new BufferedOutputStream(client.getOutputStream()); 
			
							byteArray = recsplit.getText().getBytes();
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
		           java.util.logging.Logger.getLogger(Network2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		       } catch (InstantiationException ex) {
		           java.util.logging.Logger.getLogger(Network2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		       } catch (IllegalAccessException ex) {
		           java.util.logging.Logger.getLogger(Network2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		           java.util.logging.Logger.getLogger(Network2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		       }
			
			
			new Network2();
		}
	}


