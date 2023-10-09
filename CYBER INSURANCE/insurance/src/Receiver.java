
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
import java.nio.Buffer;
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
	public class Receiver implements ActionListener {		
		private static int DELAY = 500;Thread t1;
		String dd;String name,orname,name1000,orname1000;String TTPip,SerIP,serverfile;Object serobject,verobj;
		String txtstr=null;String r1,r2,r3;Object obj=null,clentob=null;
		BufferedOutputStream bos = null;
		byte[] byteArray;// =str.getBytes();
	    public JLabel T1a= new JLabel("Correlation-Based Traffic Analysis Attacks on Anonymity Networks");
		public JLabel T1b= new JLabel("");
		public Font f = new Font("Rockwell" , Font.ROMAN_BASELINE , 20);	
		public Font f1 = new Font("Rockwell", Font.BOLD , 15);
		public Font f2 = new Font("Rockwell", Font.ROMAN_BASELINE , 15);
		public Font f3 = new Font("Rockwell", Font.BOLD , 18);
		public JLabel T10= new JLabel("Received Packet Details");
		
		public JLabel recivedfileB= new JLabel("Received File");
		
		public JTextArea tfffB=new JTextArea();
		public JScrollPane scB=new JScrollPane();
		JPanel jp=new JPanel();
		JPanel jp1=new JPanel();
		public JLabel bf= new JLabel();
		public JLabel recsplit= new JLabel();
		String event1="null";
		String event2="null";
		String event3="null";
		String event4="null";
		int len;
		public JLabel  leftButton;
		public JLabel  proxyques;
		public JLabel line=new JLabel();;
		public JFrame jf;
		public Container c;
		//public JLabel T10= new JLabel("AdversaryMobile");
		public JLabel T0= new JLabel("IP Address Connect");
		JPanel p=new JPanel();
	
		JScrollPane pane;
		 String data[][] = {};Vector v=new Vector();
		  String col[] = {"Packet Count","Packet Length(Bits)","Bandwidth(Kbs/ps)","TimeDelay(ms)"};
		  DefaultTableModel model = new DefaultTableModel(data,col);
		  JTable table = new JTable(model);int g=1;int a1;String comsendfile;
		  
		    public JPanel ipaddrcon=new JPanel();
			public JLabel panadd = new JLabel();
			public JLabel des2 = new JLabel("Network 1 Ip Address: ");
			public JLabel des3 = new JLabel("Network 2 Ip Address: ");
			public JLabel des4 = new JLabel("Network 3 Ip Address: ");
			public JLabel des1 = new JLabel("Topology Ip Address: ");
			public JTextField txtfldd1=new JTextField("127.0.0.1");
			public JTextField txtfldd2=new JTextField("127.0.0.1");
			public JTextField txtfldd3=new JTextField("127.0.0.1");
			public JTextField txtfldd4=new JTextField("127.0.0.1");
			public JButton bt=new JButton("");
		Receiver()
		{	
			
			jf = new JFrame("Receiver");
			c = jf.getContentPane();
			c.setLayout(null);
			jf.setSize(815, 730);
			bf.setIcon(new javax.swing.ImageIcon("P1NW05.png"));
			bf.setBounds(0, 0, 799, 699);
			 jf.setResizable(false);  
		//	c.setBackground(new Color(0,122,148));
			T1a.setBounds(105, 15, 750,45);
			T1a.setFont(f);
			T1a.setForeground(Color.YELLOW);
			T1b.setBounds(225, 40, 450,45);
			T1b.setFont(f);
			T1b.setForeground(Color.yellow);
			
			
			
		/*	TitledBorder leftBorder5 = BorderFactory.createTitledBorder("IP Address Connect");
			leftBorder5.setTitleJustification(TitledBorder.LEFT);

			ipaddrcon.setBackground(new Color(255,255,153));
			//ipaddrcon.setForeground(Color.BLUE);
			ipaddrcon.setBorder(leftBorder5); */
			ipaddrcon.setBounds(240,290,430,100);
			//leftBorder5.setTitleColor(new Color(120,0,0));
			jp.setBounds(30,200,735,440);
			 jp.setBackground(new Color(44,66,99));
			jp1.setBounds(120,340,550,230);
			jp1.setBackground(new Color(204,204,204));
		    
			des1.setForeground(Color.black);
			des1.setBounds(145,400,250,30);
			des1.setFont(f2);
			des2.setForeground(Color.black);
			des2.setBounds(145,440,250,30);
			des2.setFont(f2);
			des3.setForeground(Color.black);
			des3.setBounds(145,480,250,30);
			des3.setFont(f2);
			des4.setForeground(Color.black);
			des4.setBounds(145,520,250,30);
			des4.setFont(f2);
			txtfldd1.setForeground(new Color(120,0,0));
			txtfldd1.setBounds(360,400,130,30);
			txtfldd1.setFont(f2);
			txtfldd2.setForeground(new Color(120,0,0));
			txtfldd2.setBounds(360,440,130,30);
			txtfldd2.setFont(f2);
			txtfldd3.setForeground(new Color(120,0,0));
			txtfldd3.setBounds(360,480,130,30);
			txtfldd3.setFont(f2);
			txtfldd4.setForeground(new Color(120,0,0));
			txtfldd4.setBounds(360,520,130,30);
			txtfldd4.setFont(f2);
			bt.setForeground(new Color(120,0,0));
			bt.setBounds(510,460,130,40);
			bt.setIcon(new javax.swing.ImageIcon("connect.png"));
			jp.setVisible(false);
			
			TitledBorder lineBorder = BorderFactory.createTitledBorder("Mixnetwork");
			line = new JLabel();
			line.setBorder(lineBorder);
			line.setBounds(100,100,700,590);
			lineBorder.setTitleColor(Color.white);

			TitledBorder leftBorder = BorderFactory.createTitledBorder("Network B");
		    leftBorder.setTitleJustification(TitledBorder.LEFT);
		    leftButton = new JLabel();
		    leftButton.setBorder(leftBorder);
		  
		    leftButton.setBounds(100,400,700,300);
		    leftBorder.setTitleColor(Color.WHITE);
			
		    T0.setBounds(300,350,350,40);
		    T0.setFont(f);
		   
		    T0.setForeground(Color.black);
			T10.setForeground(Color.WHITE);
			T10.setBounds(320,200,250,40);
			T10.setFont(f);
			
			tfffB.setRows(8);
			tfffB.setColumns(10);
			tfffB.setFont(f1);
			tfffB.setForeground(new Color(120,0,0));
			scB.setViewportView(tfffB);
			scB.setBounds(50,480,700,140);
		
			scB.setVisible(false);
			
			recsplit.setBounds(50, 200, 180,30);
			recivedfileB.setBounds(320, 450, 180,30);
			recivedfileB.setFont(f);
			recivedfileB.setForeground(Color.WHITE);
			
			
			//T0.setBounds(360,60,350,45);
		   // T0.setFont(f);
		   
		   // T0.setForeground(Color.WHITE);
			
			p.setVisible(false);
			recsplit.setVisible(false);
			JTableHeader header = table.getTableHeader();
			header.setFont(f1);
			header.setForeground(new Color(120,0,0));
			 pane = new JScrollPane(table);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			table.setShowGrid(true);
			table.setEnabled(true);
			table.setForeground(Color.BLUE);
			table.setFont(f1);
			pane.setBounds(50,240,700,200);
			
			jf.setUndecorated(false);
		    table.setAutoResizeMode(1);
		    pane.setVisible(false);
		    T10.setVisible(false);
		    recivedfileB.setVisible(false);
		    bt.addActionListener(this);
			
			jf.show();
			c.add(des1);
			c.add(des2);
			c.add(des3);
			c.add(des4);
		    c.add(txtfldd1);
		    c.add(txtfldd2);
		    c.add(txtfldd3);
		    c.add(txtfldd4);
		    c.add(bt);
			//c.add(ipaddrcon);
			c.add(pane);
			c.add(recivedfileB);
			
			//c.add(T1a);
			//c.add(T1b);
			//c.add(line);
		  
		    c.add(scB);
			
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
			
			int[] ports = new int[] { 5000,2200,6600,6565};

			for (int i = 0; i < 4; i++) {
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
				
			    
			    
				if(this.port==5000){
				try {
					
					server = new ServerSocket(5000);

					while (true) {
						 connection = server.accept();
						 long startTime =System.currentTimeMillis();
						 ObjectInputStream ois=new ObjectInputStream(connection.getInputStream());
						
							try {
								obj= ois.readObject();
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							Random randomGenerator = new Random();
							  
						      a1 = randomGenerator.nextInt(10);
							
							String sss=(String) obj;
							 comsendfile=sss.toString().trim();
							 
							  try {
									
									t1.sleep(100);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							long endTime =System.currentTimeMillis();
	                        float filesize=sss.length();
	                        System.out.println("File Size"+filesize);
	      					float cal=(endTime-startTime);
	      					float ttime=cal/1000;
	      					String totaltimedelay = Float.toString(ttime);
	      					float bandwidth = sss.length();
	      					float tbandwidth=(bandwidth*ttime)/1024;
	      					String totalbandwidth = Float.toString(tbandwidth);
	      					
	      					 model.insertRow(0,new Object[]{g,filesize,totalbandwidth,totaltimedelay});
	      					System.out.println("Packets"+g);
	      					
					       
					       tfffB.setText(tfffB.getText().toString().trim()+"\n"+sss.toString().trim()+"\n");
					       
					       int a=0,b=1000;
							len=tfffB.getText().trim().length();
							 System.out.println("xxxxxxxxxxxxxxxxxx"+len);
					       if(len==1000 || len==3000|| len==5000|| len==7000||len==10000||len==11000||len==13000||len==15000||len==18000||len==23000|| len<500||(len>1000 && len<1600)||(len>3500 && len<3997)||(len>6300 && len<6600)||(len>11500 && len<11900)||(len>14300 && len<14700)||(len>16100 && len<16700))
					       {
					    	   System.out.println("Length"+len);
					    	   System.out.println("LengthPackets"+g);
					    	   String stx=String.valueOf(g);
					    	   recsplit.setVisible(true);
					    	   recsplit.setText(stx);
					    	   sendpacket(obj);
					    	 //  splitsend();
					       }
					       
					       else
					       {
					    	   System.out.println("Length1"+len);
					    	   System.out.println("LengthPacketsxxx"+g);
					    	   String stx=String.valueOf(g);
					    	   recsplit.setVisible(true);
					    	   recsplit.setText(stx);
					    	   sendpacket1(obj); 
					       }
					       g++;
					      ois.close();
						  connection.close();
						
						
						
					}
				} catch (IOException e) {
				} finally {
				}
				

			}
				//**********************************************************
				
if(this.port==6565){
					
					try {
						server = new ServerSocket(6565);
						while (true) {
							connection = server.accept();
							 long startTime =System.currentTimeMillis();
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
							
							
							  try {
									
									t1.sleep(100);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							long endTime =System.currentTimeMillis();
	                        float filesize=temp.length();
	                        System.out.println("File Size"+filesize);
	      					float cal=(endTime-startTime);
	      					float ttime=cal/1000;
	      					String totaltimedelay = Float.toString(ttime);
	      					float bandwidth = temp.length();
	      					float tbandwidth=(bandwidth*ttime)/1024;
	      					String totalbandwidth = Float.toString(tbandwidth);
	      					
	      					 model.insertRow(0,new Object[]{g,filesize,totalbandwidth,totaltimedelay});
	      					System.out.println("Packets"+g);
	      					
					       
					       tfffB.setText(tfffB.getText().toString().trim()+"\n"+temp.toString().trim()+"\n");
					       
					       int a=0,b=1000;
							len=tfffB.getText().trim().length();
							 System.out.println("xxxxxxxxxxxxxxxxxx"+len);
					       if(len==1000 || len==3000|| len==5000|| len==7000||len==10000||len==11000||len==13000||len==15000||len==18000||len==23000|| len<500||(len>1000 && len<1600)||(len>3500 && len<3997)||(len>6300 && len<6600)||(len>11500 && len<11900)||(len>14300 && len<14700)||(len>16100 && len<16700))
					       {
					    	   System.out.println("Length"+len);
					    	   System.out.println("LengthPackets"+g);
					    	   String stx=String.valueOf(g);
					    	   recsplit.setVisible(true);
					    	   recsplit.setText(stx);
					    	//   sendpacket(obj);
					    	 //  splitsend();
					       }
					       
					       else
					       {
					    	   System.out.println("Length1"+len);
					    	   System.out.println("LengthPacketsxxx"+g);
					    	   String stx=String.valueOf(g);
					    	   recsplit.setVisible(true);
					    	   recsplit.setText(stx);
					    	 //  sendpacket1(obj); 
					       }
					       g++;
							
							
							//
							
							br.close();
							connection.close();
						
						}
						
						
					} catch (IOException e) {
					} finally {
					}
					
					

				}//if close
				
				//**********************************************************
				
				if(this.port==2200){
					try {
						server = new ServerSocket(port);

						while (true) {
							connection = server.accept();

							
							br = new BufferedReader(
									new InputStreamReader(new BufferedInputStream(
											connection.getInputStream())));
							
							String strLine;
							
							StringBuffer buffer = new StringBuffer();
							System.out.println("Hi Balaji");
							while ((strLine = br.readLine()) != null) {
								
							
								buffer.append(strLine + "\n");

							}
							br.close();
							connection.close();
							
							String a1=buffer.toString();
							recsplit.setText(buffer.toString());
							
						
					}
					}
					catch (IOException e) 
					{
					} 
					finally {}
					

				}
				
				if(this.port==6600){
					try {
						server = new ServerSocket(port);

						while (true) {
							connection = server.accept();

							
							br = new BufferedReader(
									new InputStreamReader(new BufferedInputStream(
											connection.getInputStream())));
							
							String strLine;
							
							StringBuffer buffer = new StringBuffer();
							System.out.println("Hi Balaji");
							while ((strLine = br.readLine()) != null) {
								
							
								buffer.append(strLine + "\n");

							}
							br.close();
							connection.close();
							
							String a1=buffer.toString();
							sendfile();
							
						
					}
						
					}
					catch (IOException e) 
					{
					} 
					finally {}
					

				}
				
				//*************************************************************
				
				
				
			}

		}
		
		void sendpacket(Object arg0)
		{
					byte[] byteArray;
					Socket client = null;
					BufferedOutputStream bos = null;
					String clientdata=arg0.toString();
					try {
			       /*******************Client IP Address*******************/
						
						System.out.println("The original lenght="+clientdata.length());
						
						  client = new Socket(txtfldd2.getText().toString().trim(),6000);
				    	  ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
				       	  oos.writeObject(arg0);
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
		
		//*****************************************************************************************
		void sendpacket1(Object arg0)
		{
					byte[] byteArray;
					Socket client = null;
					BufferedOutputStream bos = null;
					String clientdata=arg0.toString();
					try {
			       /*******************Client IP Address*******************/
						
						System.out.println("The original lenght="+clientdata.length());
						
						  client = new Socket(txtfldd3.getText().toString().trim(),6001);
				    	  ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
				       	  oos.writeObject(arg0);
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
		//****************************************************************************************
		void sendpacket3(Object arg0)
		{
					byte[] byteArray;
					Socket client = null;
					BufferedOutputStream bos = null;
					String clientdata=arg0.toString();
					try {
			       /*******************Client IP Address*******************/
						
						System.out.println("The original lenght="+clientdata.length());
						
						  client = new Socket(txtfldd4.getText().toString().trim(),6601);
				    	  ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
				       	  oos.writeObject(arg0);
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
		//*****************************************************************************************
		void splitsend()
		{
			
					
		
					byte[] byteArray;			 
					Socket client = null;
					try     { 
		
					//	/********SERVER IP Adddress*********************/
		
						client = new Socket(event1, 9900);//8000
					
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
		
		void sendfile()
		{
			
					
		
					byte[] byteArray;			 
					Socket client = null;
					try     { 
		
					//	/********SERVER IP Adddress*********************/
		
						client = new Socket(event4, 6601);//8000
					
						bos = new BufferedOutputStream(client.getOutputStream()); 
		
						byteArray = tfffB.getText().getBytes();
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
						event4=txtfldd4.getText().toString().trim();//clientip
							txtfldd1.setVisible(false);
							txtfldd2.setVisible(false);
							txtfldd3.setVisible(false);
							txtfldd4.setVisible(false);
						    des1.setVisible(false);
						    des2.setVisible(false);
						    des3.setVisible(false);
						    des4.setVisible(false);
						    bt.setVisible(false);
						    ipaddrcon.setVisible(false);
						    pane.setVisible(true);
						    
						    jp.setVisible(true);
						   jp1.setVisible(false);
						  //  pane.setVisible(true);
						    scB.setVisible(true);
						    T10.setVisible(true);
						    recivedfileB.setVisible(true);
						    recsplit.setVisible(true);
					}
					
					
				
				}
			 }
					   
		
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
		           java.util.logging.Logger.getLogger(Receiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		       } catch (InstantiationException ex) {
		           java.util.logging.Logger.getLogger(Receiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		       } catch (IllegalAccessException ex) {
		           java.util.logging.Logger.getLogger(Receiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		           java.util.logging.Logger.getLogger(Receiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		       }
			
			new Receiver();
		}
	}


