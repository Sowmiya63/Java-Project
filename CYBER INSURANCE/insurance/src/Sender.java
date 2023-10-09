
	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Container;
	import java.awt.Font;
	import java.awt.Image;
	import java.awt.Toolkit;
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
	import java.io.IOException;
	import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
	import java.net.ServerSocket;
	import java.net.Socket;
	import java.net.UnknownHostException;
import java.util.Random;

	import javax.swing.BorderFactory;
	import javax.swing.ImageIcon;
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


	public class Sender implements ActionListener
	{		
		int port;
		String dd;
		String txtstr=null;
		BufferedOutputStream bos = null;
		byte[] byteArray;// =str.getBytes();
	    public JLabel T1a= new JLabel("Correlation-Based Traffic Analysis Attacks on");
		public JLabel T1b= new JLabel(" Anonymity Networks");
		public Font f = new Font("RockWell" , Font.ROMAN_BASELINE , 20);	
		public Font f1 = new Font("RockWell", Font.ROMAN_BASELINE , 15);
		public Font f2 = new Font("RockWell", Font.ROMAN_BASELINE , 17);
		public Font f3 = new Font("RockWell", Font.ROMAN_BASELINE , 16);
		public JLabel T0= new JLabel("IP Address Connect");
		public JLabel T1= new JLabel("Network 1 IP :");
		public JLabel T11= new JLabel("Topology IP :");
		public JLabel T2= new JLabel("");
		public JLabel bf= new JLabel();
		public JLabel T5= new JLabel("No.Of Packets:");
		public JLabel se= new JLabel("Select the file");
		public JLabel T6= new JLabel("File Length:");
		public JTextField filetxt=new JTextField();
		public JCheckBox chk1=new JCheckBox("");
		public JComboBox TAreu = new JComboBox();	
		public JButton btn = new JButton("");
		public JTextArea tf = new JTextArea();
		public JScrollPane pane = new JScrollPane();
		public JTextArea tf1 = new JTextArea();
		public JScrollPane pane1 = new JScrollPane();
		public JButton btn1 = new JButton("");
		public JButton btn2 = new JButton("");
		public JButton send = new JButton("");
		
		public JTextField txt=new JTextField("127.0.0.1");
		public JTextField txta=new JTextField("127.0.0.1");
		public JTextField txt1=new JTextField();
		public JTextField txt2=new JTextField();
		   
		JPanel jp=new JPanel();
		JPanel jp1=new JPanel();
		public JLabel  leftButton;
		public JLabel  proxyques;
			
		public JLabel line;
	    public JLabel line1;
		public JFrame jf;
		public Container c;
		String event;String conn="";
		public JLabel sys=new JLabel();int len;Object sr,remnpckt,onepacket,onepckts;
		
		int intpart;String remainpacket,sendarray;
		String sendfile,originaldataone,originaldataremain;String[] originaldataarr;byte[] data;
		int modpart;byte[] digitalSignature;Object signdata[];Object senddata;
		String arr[];
		int a1;
		String event1="null";
		
		Sender()
		{	
			
			
			
			jf = new JFrame("Sender");
			c = jf.getContentPane();
			c.setLayout(null);
			jf.setSize(815, 730);
			bf.setIcon(new javax.swing.ImageIcon("P1NW05.png"));
			bf.setBounds(0, 0, 799, 699);
			//jf.setLocation(120, -3);
			 jf.setResizable(false);  
			T1a.setBounds(130, 5, 650,45);
			T1a.setFont(f);
			T1a.setForeground(Color.WHITE);
			T1b.setBounds(235, 40, 450,45);
			T1b.setFont(f);
			T1b.setForeground(Color.WHITE);
			
			
			
			Border lineBorder = BorderFactory.createLineBorder(new Color(211,217,184));
			line = new JLabel();
			line.setBorder(lineBorder);
			line.setBounds(70,140,620,50);
			

			TitledBorder leftBorder = BorderFactory.createTitledBorder("File Transmit");
		    leftBorder.setTitleJustification(TitledBorder.LEFT);
		    leftButton = new JLabel();
		    leftButton.setBorder(leftBorder);
		  
		    leftButton.setBounds(70,200,620,400);
		    leftBorder.setTitleColor(Color.WHITE);
			
		
			
		    T0.setBounds(300,350,350,40);
		    T0.setFont(f);
		   
		    T0.setForeground(Color.black);
			T2.setBounds(300, 200, 250,40);
			T2.setFont(f2);
			T2.setForeground(Color.WHITE);
			
			
			txt1.setBounds(105, 260, 400,40);//browse text
		    txt1.setFont(f1);
		  
			T5.setBounds(260, 590, 250,40);//no of packets
			T5.setFont(f3);
			T5.setForeground(Color.WHITE);
			
			se.setBounds(350, 200, 250,40);//no of packets
			se.setFont(f3);
			se.setForeground(Color.white);
			
			txt2.setBounds(390, 590, 180,40);//no of packets text
			txt2.setForeground(Color.BLUE);
		    txt2.setFont(f1);
		    T6.setBounds(260, 490, 250,40);//file length
			T6.setFont(f3);
			T6.setForeground(Color.WHITE);
		    filetxt.setBounds(390, 488, 180,40);//file length text
		    filetxt.setForeground(Color.BLUE);
		    filetxt.setFont(f1);
		    
		    
		    btn.setIcon(new javax.swing.ImageIcon("Split.png"));
		    btn1.setIcon(new javax.swing.ImageIcon("Open.png"));
		    btn2.setIcon(new javax.swing.ImageIcon("connect.png"));
		    send.setIcon(new javax.swing.ImageIcon("Send.png"));
			btn.setBounds(250,546,130,40);//split button
			btn.setFont(f3);
			btn.setForeground(new Color(120,0,0));
			btn1.setBounds(550,260,130,40);//open/browse button
			btn1.setFont(f3);
			btn1.setForeground(new Color(120,0,0));
			btn2.setBounds(500,430,130,40);//connect button
			btn2.setFont(f3);
			btn2.setForeground(new Color(120,0,0));
			send.setBounds(440,546,130,40);//send
			send.setFont(f3);
			send.setForeground(new Color(120,0,0));
			jp.setBounds(30,200,735,440);
			//jp.setBackground(new Color(153,153,255));
			jp.setBackground(new Color(38,180,197));
			jp1.setBounds(120,350,550,150);
			jp1.setBackground(new Color(204,204,204));
			T1.setFont(f1);
			T1.setForeground(Color.black);
			T1.setBounds(160,400,250,40);
			
			T11.setFont(f1);
			T11.setForeground(Color.black);
			T11.setBounds(160,450,250,40);
			
			txt.setBounds(300,400,180,40);
			txt.setForeground(Color.BLUE);
			txt.setFont(f1);
			
			txta.setBounds(300,450,180,40);
			txta.setForeground(Color.BLUE);
			txta.setFont(f1);
			
			TAreu.setBounds(650,550,200,35);
			
			TAreu.addItem("Mesh Route");
			TAreu.addItem(" Mobile ");
			TAreu.setFont(f3);
			
			TAreu.setForeground(Color.BLUE);
			TAreu.setFont(f);
			pane.setBounds(105, 320, 570, 150);
			
			tf.setColumns(20);
			
			tf.setForeground(Color.MAGENTA);
			tf.setFont(f1);
			tf.setRows(10);
			tf.setName("tf");
			pane.setName("pane");
			pane.setViewportView(tf);
			
			pane1.setBounds(105, 420, 570, 50);
			tf1.setColumns(20);
			tf1.setForeground(Color.MAGENTA);
			tf1.setFont(f1);
			tf1.setRows(10);
			tf1.setName("tf");
			pane1.setName("pane1");
			pane1.setViewportView(tf1);
			
			btn1.addActionListener(this);
			btn.addActionListener(this);
			btn2.addActionListener(this);
			send.addActionListener(this);
			btn1.setMnemonic(KeyEvent.VK_B);
			btn.setMnemonic(KeyEvent.VK_S); 
			
			jp.setVisible(false);
		
			txt1.setVisible(false);
			txt2.setVisible(false);
			filetxt.setVisible(false);
			btn.setVisible(false);
			btn1.setVisible(false);
			send.setVisible(false);
			pane.setVisible(false);
			pane1.setVisible(false);
			T2.setVisible(false);
			T6.setVisible(false);
			T5.setVisible(false);
			se.setVisible(false);
			
			
			jf.show();
		 	
			//c.add(T1a);
			//c.add(T1b);
		 	c.add(T1);
		 	c.add(T11);
		 	c.add(se);
		 	//c.add(line);
		 	c.add(txta);
		 	c.add(txt);
		 	c.add(txt1);
		 	c.add(txt2);
		 	c.add(filetxt);
			c.add(btn);
			c.add(btn2);
			c.add(send);
			c.add(T2);
			c.add(T6);
			c.add(T5);
			
			c.add(pane, BorderLayout.CENTER);
			c.add(btn1);
			c.add(T0);
			c.add(jp);
			c.add(jp1);
			c.add(pane1, BorderLayout.CENTER);
		c.add(bf);
			//c.add(leftButton);		
			
			jf.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent win) {
					//System.exit(0);
				}
			});
			
			int[] ports = new int[] { 9000 };

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

			public void run() {}

		}

			public void actionPerformed(ActionEvent e)
			 {		
			    	DataInputStream input;

			    	BufferedInputStream bis;
			    	BufferedOutputStream bos = null;
			    	BufferedWriter writer = null;
			    	int in;
			    	
			    	StringBuffer buffer = new StringBuffer();
			    			    			 
				    String strLine = null;
				    String newline = "\n";
				    if(e.getSource()== btn2)
						 
					 {
						if(txt.getText().isEmpty()){

							JOptionPane.showMessageDialog(null, "Please , You will give valid Ip Address!","Message Box",1);

						
						}else{
							JOptionPane.showMessageDialog(null, "Connecting Server IP address!!","Message Box",1);
							conn="connect";
							event1=txt.getText().toString().trim();
							jp.setVisible(true);
							txt1.setVisible(true);
							txt2.setVisible(true);
							filetxt.setVisible(true);
							btn.setVisible(true);
							btn1.setVisible(true);
							send.setVisible(true);
							pane.setVisible(true);
							pane1.setVisible(true);
							T2.setVisible(true);
							T6.setVisible(true);
							T5.setVisible(true);
							se.setVisible(true);
							T1.setVisible(false);
							T11.setVisible(false);
							txta.setVisible(false);
							txt.setVisible(false);
							btn2.setVisible(false);
							jp1.setVisible(false);
							T0.setVisible(false);
						}
						
						
					 }	
				    if(e.getSource()== btn)
					 {
				    	String ip=txt.getText().toString().trim();
						if(ip.toString().trim().isEmpty()){
							
							 JOptionPane.showMessageDialog(null, "Please , You will give valid Ip Address!","Message Box",1);

						
						 } else {
                     				int a=0,b=1000;
									len=tf.getText().trim().length();
									if(len<1000){
										onepacket=tf.getText().trim();
										txt2.setText(Integer.toString(1)+" Pckts");
									}
									else
									{
										intpart=len/1000;
										modpart=len%1000;
					
										arr=new String[intpart];
										String st=tf.getText().trim();
										String s;
										
					            	if(intpart>0)
										{
					            		txt2.setText(Integer.toString(intpart)+" Pckts");
											for(int i=0;i<intpart;i++)
											{
												s=st.substring(a,b);
												arr[i]=s;
												a=b;
												b=a+1000;
											}
										}
					
										if(modpart>0)
										{
											txt2.setText(Integer.toString(intpart+1)+" Pckts");
											remainpacket=st.substring(a,a+modpart);
					
										}
					
									}	
								

									if(len<1000)
									 {
					
										tf.setText("");
										tf.setText(tf.getText()+"\n"+"/---------------------------------------------------------------------------------------------------------/");
										tf.setText(tf.getText()+"\n"+"/                                                Signatured packets               ");
										tf.setText(tf.getText()+"\n"+"/---------------------------------------------------------------------------------------------------------/");
										tf.setText(tf.getText()+"\n");
										originaldataone=tf.getText().trim();
										onepacket=tf.getText().trim();
										
										data=onepacket.toString().getBytes();
										try 
										 {
											digitalSignature =data.toString().getBytes();// signData(data, keyPair.getPrivate());
											onepckts=digitalSignature;
											tf.setText(tf.getText()+"\n"+"Packet = "+1+".  "+digitalSignature.toString());
											
											
										 } catch (Exception e1) 
										  {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										  }
					
									}
									else
									{
										signdata=new Object[intpart];
										originaldataarr=new String[intpart];
										try {
											tf.setText("");
											tf.setText(tf.getText()+"\n"+"/---------------------------------------------------------------------------------------------------------/");
											tf.setText(tf.getText()+"\n"+"/                                                Splited packets                ");
											tf.setText(tf.getText()+"\n"+"/---------------------------------------------------------------------------------------------------------/");
											tf.setText(tf.getText()+"\n");
											for(int i=0;i<intpart;i++)
											{
												originaldataarr[i]=arr[i];
												data=arr[i].getBytes();
												
												
												
												String b1=new String(data);
												//System.out.println("the ORIGINAL DATA="+b1);
												digitalSignature =data.toString().getBytes();
												
												sr=digitalSignature;
												signdata[i]=sr;
					
												tf.setText(tf.getText()+"\n"+"Packet = "+(i+1)+".  "+digitalSignature.toString());
											}
					
											if(modpart>0){
												originaldataremain=remainpacket;
												data=remainpacket.getBytes();
												digitalSignature = data.toString().getBytes();
												
												remnpckt=digitalSignature;
					
												tf.setText(tf.getText()+"\n"+"Packet = "+(intpart+1)+".  "+digitalSignature.toString());
											}
										
					
										} catch (Exception e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
					
									}
								
					
							
						 }
					
					 }
				    
				    if (e.getSource()== btn1)
				    {
		        			if(conn.toString().trim().equals("connect")){		
					 JFileChooser chooser = new JFileChooser();
					 File curFile=null;	    
				    try {
				        
				        File f = new File(new File("").getCanonicalPath());
				        
				        
				    
				        chooser.setSelectedFile(f);
				        }      catch (IOException e1) {
				        }
				    		  
				      chooser.showOpenDialog(btn1);
				      int retval = chooser.showOpenDialog(btn1);
	                  if (retval == JFileChooser.APPROVE_OPTION){
	                  File field = chooser.getSelectedFile();
	                  txt1.setText(field.getAbsolutePath());
	                 }		    
	                  String fname=null;
				            curFile = chooser.getSelectedFile();
				            if(curFile!=null){
				            fname=curFile.getName();
						    int len=fname.length();
						    String strlen=Integer.toString(len)+10;
						    dd=strlen+fname;
		        			}
				            
				        try{
					    
					        FileInputStream fstream = new FileInputStream(curFile);
					   
					        DataInputStream ins = new DataInputStream(fstream);
					        BufferedReader br = new BufferedReader(new InputStreamReader(ins));
					 
				    		
					        
					    while ((strLine = br.readLine()) != null)   {
					     
					       
					        buffer.append(strLine+ "\n");
					          
					      
					    }
					       tf.setText(buffer.toString());
					       tf1.setText(buffer.toString());
					       int ilen=tf.getText().toString().trim().length();
					       filetxt.setText(Integer.toString(ilen));
					    }catch (Exception e1){
					      
					    }
		        			}else {
		        				JOptionPane.showMessageDialog(null, "Please , You will give valid Ip Address And Then Click Connect Button!","Message Box",1);

		        			}
		        			
		        			}
				    
				    
				    if(e.getSource()==send){
				    	
				    	 Random randomGenerator = new Random();
				    	 a1 = randomGenerator.nextInt(4);
				    	
				    	//a1=3;
				    	 System.out.println("Value"+a1);
				    	if(a1==0)
						{
				    		rem1();
					    	rem2();
					    	rem3();
				    	nw0();
				    	atk();
						}
				    	else if(a1==1)
						{
				    		rem1();
					    	rem2();
					    	rem3();
				    	nw1();
				    	atk();
						}
				    	else if(a1==2)
						{
				    		rem1();
					    	rem2();
					    	rem3();
				    	nw2();
				    	atk();
						}
				    	else if(a1==3)
						{rem1();
				    	rem2();
				    	rem3();
				    	nw3();
				    	atk();
						}
				    	else if(a1==4)
						{
				    		rem1();
					    	rem2();
					    	rem3();
				    	nw4();
				    	atk();
						}
				    	
		        			
				    	try
						{
							Thread.sleep(5000);
						} catch (InterruptedException ejj)
						{ 
						}
				   	if(len<1000)
						{
							
							senddata=originaldataone;
							sendpacket1(senddata);
							sendpacket2(senddata);
							sendpacket3(senddata);
							//splitsend();
						}
						else
						{
							
							for(int j=0;j<intpart;j++)
							{
								
							
								
								
								sendarray=originaldataarr[j];
 								sendpacket1(sendarray);
 								sendpacket2(sendarray);
 								sendpacket3(sendarray);
								try
								{
									Thread.sleep(1400);
								} catch (InterruptedException ejj)
								{ 
								}

							}
							
							
							
							if(modpart>0)
							{
								senddata=originaldataremain;
								sendpacket1(senddata);
								sendpacket2(senddata);
								sendpacket3(senddata);
								//splitsend();
							}
		
						} 
			    			}
		          }
					   
			void sendpacket1(Object arg0)
			{
						byte[] byteArray;
						Socket client = null;
						BufferedOutputStream bos = null;
						Object clientdata=arg0;
						try {
				       /*******************Client IP Address*******************/
							client = new Socket(txt.getText().toString().trim(),6001);
					    	ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
					        String ss=clientdata.toString();
							oos.writeObject(clientdata);
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
			void sendpacket2(Object arg0)
			{
						byte[] byteArray;
						Socket client = null;
						BufferedOutputStream bos = null;
						Object clientdata=arg0;
						try {
				       /*******************Client IP Address*******************/
							client = new Socket(txt.getText().toString().trim(),6002);
					    	ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
					        String ss=clientdata.toString();
							oos.writeObject(clientdata);
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
			void sendpacket3(Object arg0)
			{
						byte[] byteArray;
						Socket client = null;
						BufferedOutputStream bos = null;
						Object clientdata=arg0;
						try {
				       /*******************Client IP Address*******************/
							client = new Socket(txt.getText().toString().trim(),6003);
					    	ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
					        String ss=clientdata.toString();
							oos.writeObject(clientdata);
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
			
							client = new Socket(event1, 2200);//8000
						
							bos = new BufferedOutputStream(client.getOutputStream()); 
			
							byteArray = txt2.getText().getBytes();
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
//---------------------------------------
private void nw0() 
{
BufferedOutputStream bos = null;byte[] byteArray;Socket client = null;try{ client = new Socket(event1, 4500);//4500
bos = new BufferedOutputStream(client.getOutputStream()); byteArray = txt.getText().getBytes();bos.write(byteArray, 0, byteArray.length);
bos.flush();bos.close();client.close(); } catch (UnknownHostException e1) { e1.printStackTrace(); } catch (IOException e1)  {} finally  {} 
}
			//---------------------------------------
//---------------------------------------
private void nw1() 
{
BufferedOutputStream bos = null;byte[] byteArray;Socket client = null;try{ client = new Socket(event1, 4501);//4500
bos = new BufferedOutputStream(client.getOutputStream()); byteArray = txt.getText().getBytes();bos.write(byteArray, 0, byteArray.length);
bos.flush();bos.close();client.close(); } catch (UnknownHostException e1) { e1.printStackTrace(); } catch (IOException e1)  {} finally  {} 
}
//---------------------------------------
//---------------------------------------
private void nw2() 
{
BufferedOutputStream bos = null;byte[] byteArray;Socket client = null;try{ client = new Socket(event1, 4502);//4500
bos = new BufferedOutputStream(client.getOutputStream()); byteArray = txt.getText().getBytes();bos.write(byteArray, 0, byteArray.length);
bos.flush();bos.close();client.close(); } catch (UnknownHostException e1) { e1.printStackTrace(); } catch (IOException e1)  {} finally  {} 
}
//---------------------------------------

//---------------------------------------
private void nw3() 
{
BufferedOutputStream bos = null;byte[] byteArray;Socket client = null;try{ client = new Socket(event1, 4503);//4500
bos = new BufferedOutputStream(client.getOutputStream()); byteArray = txt.getText().getBytes();bos.write(byteArray, 0, byteArray.length);
bos.flush();bos.close();client.close(); } catch (UnknownHostException e1) { e1.printStackTrace(); } catch (IOException e1)  {} finally  {} 
}
//---------------------------------------

//---------------------------------------
private void nw4() 
{
BufferedOutputStream bos = null;byte[] byteArray;Socket client = null;try{ client = new Socket(event1, 4504);//4500
bos = new BufferedOutputStream(client.getOutputStream()); byteArray = txt.getText().getBytes();bos.write(byteArray, 0, byteArray.length);
bos.flush();bos.close();client.close(); } catch (UnknownHostException e1) { e1.printStackTrace(); } catch (IOException e1)  {} finally  {} 
}
//---------------------------------------
//---------------------------------------
private void rem1() 
{
BufferedOutputStream bos = null;byte[] byteArray;Socket client = null;try{ client = new Socket(event1, 9991);//4500
bos = new BufferedOutputStream(client.getOutputStream()); byteArray = txt.getText().getBytes();bos.write(byteArray, 0, byteArray.length);
bos.flush();bos.close();client.close(); } catch (UnknownHostException e1) { e1.printStackTrace(); } catch (IOException e1)  {} finally  {} 
}
private void rem2() 
{
BufferedOutputStream bos = null;byte[] byteArray;Socket client = null;try{ client = new Socket(event1, 9992);//4500
bos = new BufferedOutputStream(client.getOutputStream()); byteArray = txt.getText().getBytes();bos.write(byteArray, 0, byteArray.length);
bos.flush();bos.close();client.close(); } catch (UnknownHostException e1) { e1.printStackTrace(); } catch (IOException e1)  {} finally  {} 
}
private void rem3() 
{
BufferedOutputStream bos = null;byte[] byteArray;Socket client = null;try{ client = new Socket(event1, 9993);//4500
bos = new BufferedOutputStream(client.getOutputStream()); byteArray = txt.getText().getBytes();bos.write(byteArray, 0, byteArray.length);
bos.flush();bos.close();client.close(); } catch (UnknownHostException e1) { e1.printStackTrace(); } catch (IOException e1)  {} finally  {} 
}

private void atk() 
{
BufferedOutputStream bos = null;byte[] byteArray;Socket client = null;try{ client = new Socket(event1, 2828);//4500
bos = new BufferedOutputStream(client.getOutputStream()); byteArray = tf1.getText().getBytes();bos.write(byteArray, 0, byteArray.length);
bos.flush();bos.close();client.close(); } catch (UnknownHostException e1) { e1.printStackTrace(); } catch (IOException e1)  {} finally  {} 
}
//---------------------------------------


	
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
		           java.util.logging.Logger.getLogger(Sender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		       } catch (InstantiationException ex) {
		           java.util.logging.Logger.getLogger(Sender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		       } catch (IllegalAccessException ex) {
		           java.util.logging.Logger.getLogger(Sender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		           java.util.logging.Logger.getLogger(Sender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		       }
			
			new Sender();
			
			
			
		}
	}
