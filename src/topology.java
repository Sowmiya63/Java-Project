import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
import javax.swing.plaf.basic.BasicLookAndFeel;


public class topology implements ActionListener  {

	
	public JFrame jf;
	public Container c;
	public JLabel bf= new JLabel();
	public Font fs1 = new Font("RockWell" , Font.BOLD , 12);	
	public Font fs2 = new Font("RockWell", Font.ROMAN_BASELINE , 14);
	public Font fs3 = new Font("RockWell", Font.BOLD , 14);
	public Font fs4ta = new Font("Comic Sans Ms", Font.BOLD , 15);
	Thread t1;
	public JTextArea tfffB=new JTextArea();
	public JScrollPane scB=new JScrollPane();
	
	String val1,val2,val3,val4,val5,val6,val7,val8,val9,val10;
	String val11,val12,val13,val14,val15,val16,val17,val18,val19,val20;
	String val21,val22,val23,val24,val25,val26,val27,val28,val29,val30;
	
	BufferedOutputStream bos = null;
	Object senddata;
	String originaldataone;
	String strLine = null;
	String conn="";
	int length;
	String len;
	int t1len;
	String t1str;
	public static String Messages ;
	String event1="null";
	String event2="null";
	String event3="null";
	String event4="null";
	String event5="null";
	
	public JPanel jp = new JPanel();
	public JPanel jp1 = new JPanel();
	public JPanel jp2 = new JPanel();
	
	public JLabel normalMobile = new JLabel("");
	public JLabel normalMobile1 = new JLabel("");
	public JLabel searching = new JLabel("");
	public JLabel membership = new JLabel("");
	public JLabel reconfiguration = new JLabel("");
	public JLabel filetransfer = new JLabel("");
	public JLabel aggregators = new JLabel("");
	
	public JLabel attackers = new JLabel(""); 
	
	public JLabel normalMobileimg = new JLabel(""); 
	public JLabel normalMobile1img = new JLabel("");
	public JLabel searchingimg = new JLabel("");
	public JLabel membershipimg = new JLabel("");
	public JLabel reconfigurationimg = new JLabel("");
	public JLabel filetransferimg = new JLabel("");
	public JLabel aggregatorsimg = new JLabel("");
	
	public JLabel normalMobilelb = new JLabel("Transient Attack");
	public JLabel normalMobile1lb = new JLabel("Collisions Mobiles");
	public JLabel membershiplb = new JLabel("Neighbor Mobiles");
	public JLabel reconfigurationlb = new JLabel("Mobiles");
	public JLabel filetransferlb = new JLabel("");
	
	
	public JLabel label1 = new JLabel("Integrity monitor 1");
	public JLabel label2 = new JLabel("Integrity monitor 2");
	public JLabel label3 = new JLabel("Integrity monitor 3");
	
	public JLabel Mobile = new JLabel("");
	
	public JLabel attMobile = new JLabel("");
	
	public JLabel n1 = new JLabel("");
	public JLabel n2 = new JLabel("");
	public JLabel n3 = new JLabel("");
	
	
	
	
	public JLabel g1 = new JLabel("");
	public JLabel g2 = new JLabel("");
	public JLabel g3 = new JLabel("");
	public JLabel g4 = new JLabel("");
	public JLabel g5 = new JLabel(" ");
	public JLabel g6 = new JLabel("");
	public JLabel g7 = new JLabel("");
	public JLabel g8 = new JLabel("");
	public JLabel g9 = new JLabel("");
	public JLabel g10 = new JLabel("");
	public JLabel g11 = new JLabel("");
	public JLabel g12 = new JLabel(" ");
	public JLabel g13 = new JLabel("");
	public JLabel g14 = new JLabel("");
	public JLabel g15 = new JLabel("");
	public JLabel g16 = new JLabel("");
	public JLabel g17 = new JLabel("");
	public JLabel g18 = new JLabel("");
	public JLabel g19 = new JLabel(" ");
	public JLabel g20 = new JLabel("");
	public JLabel g21 = new JLabel("");
	public JLabel g22 = new JLabel("");
	public JLabel g23 = new JLabel("");
	public JLabel g24 = new JLabel("");
	public JLabel g25 = new JLabel("");
	public JLabel g26 = new JLabel(" ");
	public JLabel g27 = new JLabel("");
	public JLabel g28 = new JLabel("");
	public JLabel g29 = new JLabel("");
	public JLabel g30 = new JLabel(" ");
	//public JLabel g31 = new JLabel("");
	//public JLabel g32 = new JLabel("");
	
	public JLabel gy1 = new JLabel("");
	public JLabel gy2 = new JLabel("");
	public JLabel gy3 = new JLabel("");
	public JLabel gy4 = new JLabel("");
	public JLabel gy5 = new JLabel(" ");
	public JLabel gy6 = new JLabel("");
	public JLabel gy7 = new JLabel("");
	public JLabel gy8 = new JLabel("");
	public JLabel gy9 = new JLabel("");
	public JLabel gy10 = new JLabel("");
	public JLabel gy11 = new JLabel("");
	public JLabel gy12 = new JLabel(" ");
	public JLabel gy13 = new JLabel("");
	public JLabel gy14 = new JLabel("");
	public JLabel gy15 = new JLabel("");
	public JLabel gy16 = new JLabel("");
	public JLabel gy17 = new JLabel("");
	public JLabel gy18 = new JLabel("");
	public JLabel gy19 = new JLabel(" ");
	public JLabel gy20 = new JLabel("");
	public JLabel gy21 = new JLabel("");
	public JLabel gy22 = new JLabel("");
	public JLabel gy23 = new JLabel("");
	public JLabel gy24 = new JLabel("");
	public JLabel gy25 = new JLabel("");
	public JLabel gy26 = new JLabel(" ");
	public JLabel gy27 = new JLabel("");
	public JLabel gy28 = new JLabel("");
	public JLabel gy29 = new JLabel("");
	public JLabel gy30 = new JLabel(" ");
	//public JLabel gy31 = new JLabel("");
	//public JLabel gy32 = new JLabel("");
	
	public JLabel gb1 = new JLabel("");
	public JLabel gb2 = new JLabel("");
	public JLabel gb3 = new JLabel("");
	public JLabel gb4 = new JLabel("");
	public JLabel gb5 = new JLabel(" ");
	public JLabel gb6 = new JLabel("");
	public JLabel gb7 = new JLabel("");
	public JLabel gb8 = new JLabel("");
	public JLabel gb9 = new JLabel("");
	public JLabel gb10 = new JLabel("");
	public JLabel gb11 = new JLabel("");
	public JLabel gb12 = new JLabel(" ");
	public JLabel gb13 = new JLabel("");
	public JLabel gb14 = new JLabel("");
	public JLabel gb15 = new JLabel("");
	public JLabel gb16 = new JLabel("");
	public JLabel gb17 = new JLabel("");
	public JLabel gb18 = new JLabel("");
	public JLabel gb19 = new JLabel(" ");
	public JLabel gb20 = new JLabel("");
	public JLabel gb21 = new JLabel("");
	public JLabel gb22 = new JLabel("");
	public JLabel gb23 = new JLabel("");
	public JLabel gb24 = new JLabel("");
	public JLabel gb25 = new JLabel("");
	public JLabel gb26 = new JLabel(" ");
	public JLabel gb27 = new JLabel("");
	public JLabel gb28 = new JLabel("");
	public JLabel gb29 = new JLabel("");
	public JLabel gb30 = new JLabel(" ");
	//public JLabel gb31 = new JLabel("");
	//public JLabel gb32 = new JLabel("");
	
	
	
	
	
	public JLabel gw1 = new JLabel("");
	public JLabel gw2 = new JLabel("");
	public JLabel gw3 = new JLabel("");
	public JLabel gw4 = new JLabel("");
	public JLabel gw5 = new JLabel("");
	public JLabel gw6 = new JLabel("");
	
	
	
	public JLabel dummy1 = new JLabel("");
	public JLabel dummy2 = new JLabel("");
	
	
	
	public JLabel connectipaddr = new JLabel("");
	public static char[] message1 ;
	public static char[] message2 ;
	public static char[] message3 ;
	int  a11;
	
	public JButton b1 = new JButton("");
	
	public JButton ipconnect = new JButton("");
	public JLabel ipcon=new JLabel("CONNECT IP ADDRESS");
	public JLabel testclientip1 = new JLabel("Network 1");
	public JLabel testclientip2 = new JLabel("Network 2");
	public JLabel testclientip3 = new JLabel("Network 3");
	public JLabel testclientip4 = new JLabel("Receiver");
	public JTextField textip1 = new JTextField("127.0.0.1");
	public JTextField textip2 = new JTextField("127.0.0.1");
	public JTextField textip3 = new JTextField("127.0.0.1");
	public JTextField textip4 = new JTextField("127.0.0.1");
	
	topology()
	{
		jf = new JFrame("Topology");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(815, 730);
		bf.setIcon(new javax.swing.ImageIcon("P1NW05.png"));
		bf.setBounds(0, 0, 799, 699);

		 ipconnect.setBounds(350,410,130,40);
		 ipconnect.setIcon(new javax.swing.ImageIcon("connect.png"));
		 
		 testclientip1.setBounds(280,250,200,30);
		 testclientip1.setForeground(Color.black);
		 testclientip1.setFont(fs3);
		 
		 testclientip2.setBounds(280,290,200,30);
		 testclientip2.setForeground(Color.black);
		 testclientip2.setFont(fs3);
		 
		 testclientip3.setBounds(280,330,200,30);
		 testclientip3.setForeground(Color.black);
		 testclientip3.setFont(fs3);
		 
		 testclientip4.setBounds(280,370,200,30);
		 testclientip4.setForeground(Color.black);
		 testclientip4.setFont(fs3);
		 
		    tfffB.setRows(8);
			tfffB.setColumns(10);
			tfffB.setForeground(new Color(120,0,0));
			scB.setViewportView(tfffB);
			scB.setBounds(350,580,320,40);
		 
		 textip1.setBounds(420,250,120,30);
		 textip2.setBounds(420,290,120,30);
		 textip3.setBounds(420,330,120,30);
		 textip4.setBounds(420,370,120,30);
		 textip1.setFont(fs3);
		 textip2.setFont(fs3);
		 textip3.setFont(fs3);
		 textip4.setFont(fs3);
		 textip1.setForeground(Color.blue);
		 textip2.setForeground(Color.blue);
		 textip3.setForeground(Color.blue);
		 textip4.setForeground(Color.blue);
		 
		 ipcon.setBounds(330,210,300,30);
		 ipcon.setFont(fs3);
		 ipcon.setForeground(Color.black);
		
		ImageIcon button=new ImageIcon(this.getClass().getResource("darkgrey.png"));
		b1.setIcon(button);
		b1.setBounds(350, 220, 30, 30);
		
		normalMobile.setIcon(new javax.swing.ImageIcon("vg.png"));
		normalMobile.setBounds(110,365,250,150);
		
		
		normalMobile1.setIcon(new javax.swing.ImageIcon("vg.png"));
		normalMobile1.setBounds(460,365,250,150);
		
		searching.setIcon(new javax.swing.ImageIcon("vg.png"));
		searching.setBounds(110,365,250,150);
		
		
		membership.setIcon(new javax.swing.ImageIcon("vg.png"));
		membership.setBounds(110,365,250,150);
		
		aggregators.setIcon(new javax.swing.ImageIcon("vg.png"));
		aggregators.setBounds(110,365,250,150);
		
		filetransfer.setIcon(new javax.swing.ImageIcon("vg.png"));
		filetransfer.setBounds(460,365,250,150);
		
		reconfiguration.setIcon(new javax.swing.ImageIcon("vg.png"));
		reconfiguration.setBounds(460,365,250,150);
		
		Mobile.setBounds(460,510,250,150);
		
		attMobile.setBounds(560,510,250,150);
	//---------------------------------------	
		
		n1.setIcon(new javax.swing.ImageIcon("nt1.png"));
		n1.setBounds(50,260,220,220);
		n2.setIcon(new javax.swing.ImageIcon("nt2.png"));
		n2.setBounds(290,340,220,220);
		n3.setIcon(new javax.swing.ImageIcon("nt3.png"));
		n3.setBounds(530,260,220,220);
		
		
		reconfigurationimg.setIcon(new javax.swing.ImageIcon("gy.png"));
		reconfigurationimg.setBounds(50,210,30,30);
		membershipimg.setIcon(new javax.swing.ImageIcon("g.png"));
		membershipimg.setBounds(210,210,30,30);
		aggregatorsimg.setIcon(new javax.swing.ImageIcon("r.png"));
		aggregatorsimg.setBounds(420,210,30,30);
		normalMobile1img.setIcon(new javax.swing.ImageIcon("attacker.png"));
		normalMobile1img.setBounds(600,210,30,30);
		
		attackers.setIcon(new javax.swing.ImageIcon("attacker.png"));
		//attackers.setBounds(600,210,30,30);
		
		normalMobilelb.setBounds(640,210,300,30);
		normalMobilelb.setFont(fs1);
		
		normalMobile1lb.setBounds(460,210,150,30);
		normalMobile1lb.setFont(fs1);
		
		
		
		membershiplb.setBounds(250,210,150,30);
		membershiplb.setFont(fs1);
		
	
		
		reconfigurationlb.setBounds(90,210,100,30);
		reconfigurationlb.setFont(fs1);
		
		label1.setBounds(130,230,200,30);
		label1.setFont(fs2);
		label1.setForeground(Color.blue);
		
		label2.setBounds(380,310,200,30);
		label2.setFont(fs2);
		label2.setForeground(Color.blue);
		
		label3.setBounds(610,480,200,30);
		label3.setFont(fs2);
		label3.setForeground(Color.blue);
		
		
		searching.setVisible(false);
		membership.setVisible(false);
		aggregators.setVisible(false);
		filetransfer.setVisible(false);
		reconfiguration.setVisible(false);
		Mobile.setVisible(false);
		 
		
		
		ImageIcon yellow=new ImageIcon(this.getClass().getResource("yellow.png"));
		gw1.setIcon(yellow);
		gw2.setIcon(yellow);
		gw3.setIcon(yellow);
		gw4.setIcon(yellow);
		gw5.setIcon(yellow);
		gw6.setIcon(yellow);
		
		gw1.setBounds(343, 366, 30, 30);
		gw2.setBounds(312, 507, 30, 30);
		gw3.setBounds(65, 422, 30, 30);
		
		gw4.setBounds(343, 464, 30, 30);
		gw5.setBounds(150, 534, 30, 30);
		gw6.setBounds(75, 370, 30, 30);
		
		
	
		
		//*****gray
		gy1.setIcon(new javax.swing.ImageIcon("gy1.png"));
		gy2.setIcon(new javax.swing.ImageIcon("gy2.png"));
		gy3.setIcon(new javax.swing.ImageIcon("gy3.png"));
		gy4.setIcon(new javax.swing.ImageIcon("gy4.png"));
		gy5.setIcon(new javax.swing.ImageIcon("gy5.png"));
		gy6.setIcon(new javax.swing.ImageIcon("gy6.png"));
		gy7.setIcon(new javax.swing.ImageIcon("gy7.png"));
		gy8.setIcon(new javax.swing.ImageIcon("gy8.png"));
		gy9.setIcon(new javax.swing.ImageIcon("gy9.png"));
		gy10.setIcon(new javax.swing.ImageIcon("gy10.png"));
		
		
		gy11.setIcon(new javax.swing.ImageIcon("gy11.png"));
		gy12.setIcon(new javax.swing.ImageIcon("gy12.png"));
		gy13.setIcon(new javax.swing.ImageIcon("gy13.png"));
		gy14.setIcon(new javax.swing.ImageIcon("gy14.png"));
		gy15.setIcon(new javax.swing.ImageIcon("gy15.png"));
		gy16.setIcon(new javax.swing.ImageIcon("gy16.png"));
		gy17.setIcon(new javax.swing.ImageIcon("gy17.png"));
		gy18.setIcon(new javax.swing.ImageIcon("gy18.png"));
		gy19.setIcon(new javax.swing.ImageIcon("gy19.png"));
		gy20.setIcon(new javax.swing.ImageIcon("gy20.png"));
		
		
		gy21.setIcon(new javax.swing.ImageIcon("gy21.png"));
		gy22.setIcon(new javax.swing.ImageIcon("gy22.png"));
		gy23.setIcon(new javax.swing.ImageIcon("gy23.png"));
		gy24.setIcon(new javax.swing.ImageIcon("gy24.png"));
		gy25.setIcon(new javax.swing.ImageIcon("gy25.png"));
		gy26.setIcon(new javax.swing.ImageIcon("gy26.png"));
		gy27.setIcon(new javax.swing.ImageIcon("gy27.png"));
		gy28.setIcon(new javax.swing.ImageIcon("gy28.png"));
		gy29.setIcon(new javax.swing.ImageIcon("gy29.png"));
		gy30.setIcon(new javax.swing.ImageIcon("gy30.png"));
		
//*******green
		
		g1.setIcon(new javax.swing.ImageIcon("g1.png"));
		g2.setIcon(new javax.swing.ImageIcon("g2.png"));
		g3.setIcon(new javax.swing.ImageIcon("g3.png"));
		g4.setIcon(new javax.swing.ImageIcon("g4.png"));
		g5.setIcon(new javax.swing.ImageIcon("g5.png"));
		g6.setIcon(new javax.swing.ImageIcon("g6.png"));
		g7.setIcon(new javax.swing.ImageIcon("g7.png"));
		g8.setIcon(new javax.swing.ImageIcon("g8.png"));
		g9.setIcon(new javax.swing.ImageIcon("g9.png"));
		g10.setIcon(new javax.swing.ImageIcon("g10.png"));
		
		
		g11.setIcon(new javax.swing.ImageIcon("g11.png"));
		g12.setIcon(new javax.swing.ImageIcon("g12.png"));
		g13.setIcon(new javax.swing.ImageIcon("g13.png"));
		g14.setIcon(new javax.swing.ImageIcon("g14.png"));
		g15.setIcon(new javax.swing.ImageIcon("g15.png"));
		g16.setIcon(new javax.swing.ImageIcon("g16.png"));
		g17.setIcon(new javax.swing.ImageIcon("g17.png"));
		g18.setIcon(new javax.swing.ImageIcon("g18.png"));
		g19.setIcon(new javax.swing.ImageIcon("g19.png"));
		g20.setIcon(new javax.swing.ImageIcon("g20.png"));
	
		
		g21.setIcon(new javax.swing.ImageIcon("g21.png"));
		g22.setIcon(new javax.swing.ImageIcon("g22.png"));
		g23.setIcon(new javax.swing.ImageIcon("g23.png"));
		g24.setIcon(new javax.swing.ImageIcon("g24.png"));
		g25.setIcon(new javax.swing.ImageIcon("g25.png"));
		g26.setIcon(new javax.swing.ImageIcon("g26.png"));
		g27.setIcon(new javax.swing.ImageIcon("g27.png"));
		g28.setIcon(new javax.swing.ImageIcon("g28.png"));
		g29.setIcon(new javax.swing.ImageIcon("g29.png"));
		g30.setIcon(new javax.swing.ImageIcon("g30.png"));
		
		//*******red
		
		gb1.setIcon(new javax.swing.ImageIcon("r1.png"));
		gb2.setIcon(new javax.swing.ImageIcon("r2.png"));
		gb3.setIcon(new javax.swing.ImageIcon("r3.png"));
		gb4.setIcon(new javax.swing.ImageIcon("r4.png"));
		gb5.setIcon(new javax.swing.ImageIcon("r5.png"));
		gb6.setIcon(new javax.swing.ImageIcon("r6.png"));
		gb7.setIcon(new javax.swing.ImageIcon("r7.png"));
		gb8.setIcon(new javax.swing.ImageIcon("r8.png"));
		gb9.setIcon(new javax.swing.ImageIcon("r9.png"));
		gb10.setIcon(new javax.swing.ImageIcon("r10.png"));
		
		
		gb11.setIcon(new javax.swing.ImageIcon("r11.png"));
		gb12.setIcon(new javax.swing.ImageIcon("r12.png"));
		gb13.setIcon(new javax.swing.ImageIcon("r13.png"));
		gb14.setIcon(new javax.swing.ImageIcon("r14.png"));
		gb15.setIcon(new javax.swing.ImageIcon("r15.png"));
		gb16.setIcon(new javax.swing.ImageIcon("r16.png"));
		gb17.setIcon(new javax.swing.ImageIcon("r17.png"));
		gb18.setIcon(new javax.swing.ImageIcon("r18.png"));
		gb19.setIcon(new javax.swing.ImageIcon("r19.png"));
		gb20.setIcon(new javax.swing.ImageIcon("r20.png"));
	
		
		gb21.setIcon(new javax.swing.ImageIcon("r21.png"));
		gb22.setIcon(new javax.swing.ImageIcon("r22.png"));
		gb23.setIcon(new javax.swing.ImageIcon("r23.png"));
		gb24.setIcon(new javax.swing.ImageIcon("r24.png"));
		gb25.setIcon(new javax.swing.ImageIcon("r25.png"));
		gb26.setIcon(new javax.swing.ImageIcon("r26.png"));
		gb27.setIcon(new javax.swing.ImageIcon("r27.png"));
		gb28.setIcon(new javax.swing.ImageIcon("r28.png"));
		gb29.setIcon(new javax.swing.ImageIcon("r29.png"));
		gb30.setIcon(new javax.swing.ImageIcon("r30.png"));
		
		
		
		
		
		
		
		
		
		gy1.setBounds(210, 320, 30, 30);
		gy2.setBounds(150, 305, 30, 30);
		gy3.setBounds(82, 330, 30, 30);
		gy4.setBounds(130, 386, 30, 30);
		gy5.setBounds(196, 415, 30, 30);
		gy6.setBounds(163, 444, 30, 30);
		gy7.setBounds(202, 367, 30, 30);
		gy8.setBounds(100, 423, 30, 30);
		gy9.setBounds(60, 370, 30, 30);
		gy10.setBounds(150, 344, 30, 30);
		
		gy11.setBounds(415, 410, 30, 30);
		gy12.setBounds(330, 470, 30, 30);
		gy13.setBounds(470, 422, 30, 30);
		gy14.setBounds(390, 450, 30, 30);
		gy15.setBounds(350, 415, 30, 30);
		gy16.setBounds(350, 360, 30, 30);
		gy17.setBounds(415, 492, 30, 30);
		gy18.setBounds(415, 360, 30, 30);
		gy19.setBounds(350, 504, 30, 30);
		gy20.setBounds(310, 436, 30, 30);
		
		gy21.setBounds(560, 300, 30, 30);
		gy22.setBounds(660, 423, 30, 30);		
		gy23.setBounds(680, 355, 30, 30);
		gy24.setBounds(570, 415, 30, 30);  
		gy25.setBounds(650, 295, 30, 30);
		gy26.setBounds(590, 377, 30, 30);
		gy27.setBounds(550, 350, 30, 30);
		gy28.setBounds(610, 435, 30, 30);
		gy29.setBounds(600, 320, 30, 30);
		gy30.setBounds(630, 366, 30, 30);
		
		gb1.setBounds(210, 320, 30, 30);
		gb2.setBounds(150, 305, 30, 30);
		gb3.setBounds(82, 330, 30, 30);
		gb4.setBounds(130, 386, 30, 30);
		gb5.setBounds(196, 415, 30, 30);
		gb6.setBounds(163, 444, 30, 30);
		gb7.setBounds(202, 367, 30, 30);
		gb8.setBounds(100, 423, 30, 30);
		gb9.setBounds(60, 370, 30, 30);
		gb10.setBounds(150, 344, 30, 30);
		
		gb11.setBounds(415, 410, 30, 30);
		gb12.setBounds(330, 470, 30, 30);
		gb13.setBounds(470, 422, 30, 30);
		gb14.setBounds(390, 450, 30, 30);
		gb15.setBounds(350, 415, 30, 30);
		gb16.setBounds(350, 360, 30, 30);
		gb17.setBounds(415, 492, 30, 30);
		gb18.setBounds(415, 360, 30, 30);
		gb19.setBounds(350, 504, 30, 30);
		gb20.setBounds(310, 436, 30, 30);
	
		gb21.setBounds(560, 300, 30, 30);
		gb22.setBounds(660, 423, 30, 30);		
		gb23.setBounds(680, 355, 30, 30);
		gb24.setBounds(570, 415, 30, 30);
		gb25.setBounds(650, 295, 30, 30);
		gb26.setBounds(590, 377, 30, 30);
		gb27.setBounds(550, 350, 30, 30);
		gb28.setBounds(610, 435, 30, 30);
		gb29.setBounds(600, 320, 30, 30);
		gb30.setBounds(630, 366, 30, 30);
		
		g1.setBounds(210, 320, 30, 30);
		g2.setBounds(150, 305, 30, 30);
		g3.setBounds(82, 330, 30, 30);
		g4.setBounds(130, 386, 30, 30);
		g5.setBounds(196, 415, 30, 30);
		g6.setBounds(163, 444, 30, 30);
		g7.setBounds(202, 367, 30, 30);
		g8.setBounds(100, 423, 30, 30);
		g9.setBounds(60, 370, 30, 30);
		g10.setBounds(150, 344, 30, 30);
		
		g11.setBounds(415, 410, 30, 30);
		g12.setBounds(330, 470, 30, 30);
		g13.setBounds(470, 422, 30, 30);
		g14.setBounds(390, 450, 30, 30);
		g15.setBounds(350, 415, 30, 30);
		g16.setBounds(350, 360, 30, 30);
		g17.setBounds(415, 492, 30, 30);
		g18.setBounds(415, 360, 30, 30);
		g19.setBounds(350, 504, 30, 30);
		g20.setBounds(310, 436, 30, 30);
		
		g21.setBounds(560, 300, 30, 30);
		g22.setBounds(660, 423, 30, 30);		
		g23.setBounds(680, 355, 30, 30);
		g24.setBounds(570, 415, 30, 30);
		g25.setBounds(650, 295, 30, 30);
		g26.setBounds(590, 377, 30, 30);
		g27.setBounds(550, 350, 30, 30);
		g28.setBounds(610, 435, 30, 30);
		g29.setBounds(600, 320, 30, 30);
		g30.setBounds(630, 366, 30, 30);
		
		
		
		
	
	
		
		
		
		
		
		
		
			
		
		
		
		
	
		
		
		
		
		
		dummy1.setIcon(new javax.swing.ImageIcon("whiteround.png"));
		dummy1.setBounds(50, 260, 350, 350);
		dummy2.setIcon(new javax.swing.ImageIcon("roundimg.png"));
		dummy2.setBounds(400, 260, 350, 350);
		
		
		
		
		jf.setResizable(false);  
		 
		
		
		 
		
		
		 jp2.setBounds(30,200,740,280);
		 jp2.setBackground(new Color(204,204,204));
		 
		 jp.setBounds(30,200,740,440);
		 jp.setBackground(new Color(0,102,102));
		 
		 jp1.setBounds(30,200,740,440);
		 jp1.setBackground(new Color(204,204,204));
		 
		 
		 connectipaddr.setBounds(330,210,200,30);
		 connectipaddr.setForeground(Color.BLACK);
		 connectipaddr.setFont(fs1);
		 
		 attackers.setVisible(false);
		 
		 n1.setVisible(false);
		 n2.setVisible(false);
		 n3.setVisible(false);
		
		 jp.setVisible(false);
		 
		 gw1.setVisible(false);
		 gw2.setVisible(false);
		 gw3.setVisible(false);
		 gw4.setVisible(false);
		 gw5.setVisible(false);
		 gw6.setVisible(false);
		
		 
		 g1.setVisible(false);
		 g2.setVisible(false);
		 g3.setVisible(false);
		 g4.setVisible(false);
		 g5.setVisible(false);
		 g6.setVisible(false);
		 g7.setVisible(false);
		 g8.setVisible(false);
		 g9.setVisible(false);
		 g10.setVisible(false);
		 g11.setVisible(false);
		 g12.setVisible(false);
		 g13.setVisible(false);
		 g14.setVisible(false);
		 g15.setVisible(false);
		 g16.setVisible(false);
		 
		 g17.setVisible(false);
		 g18.setVisible(false);
		 g19.setVisible(false);
		 g20.setVisible(false);
		 g21.setVisible(false);
		 g22.setVisible(false);
		 g23.setVisible(false);
		 g24.setVisible(false);
		 g25.setVisible(false);
		 g26.setVisible(false);
		 g27.setVisible(false);
		 g28.setVisible(false);
		 g29.setVisible(false);
		 g30.setVisible(false);
		 
		 
		 gb1.setVisible(false);
		 gb2.setVisible(false);
		 gb3.setVisible(false);
		 gb4.setVisible(false);
		 gb5.setVisible(false);
		 gb6.setVisible(false);
		 gb7.setVisible(false);
		 gb8.setVisible(false);
		 gb9.setVisible(false);
		 gb10.setVisible(false);
		 gb11.setVisible(false);
		 gb12.setVisible(false);
		 gb13.setVisible(false);
		 gb14.setVisible(false);
		 gb15.setVisible(false);
		 gb16.setVisible(false);
		 
		 gb17.setVisible(false);
		 gb18.setVisible(false);
		 gb19.setVisible(false);
		 gb20.setVisible(false);
		 gb21.setVisible(false);
		 gb22.setVisible(false);
		 gb23.setVisible(false);
		 gb24.setVisible(false);
		 gb25.setVisible(false);
		 gb26.setVisible(false);
		 gb27.setVisible(false);
		 gb28.setVisible(false);
		 gb29.setVisible(false);
		 gb30.setVisible(false);
		
		 
		
		 
		 
		 	normalMobileimg.setVisible(false);
			normalMobile1img.setVisible(false);
			membershipimg.setVisible(false);
			searchingimg.setVisible(false);
			reconfigurationimg.setVisible(false);
			filetransferimg.setVisible(false);
			aggregatorsimg.setVisible(false);
			normalMobilelb.setVisible(false);
			normalMobile1lb.setVisible(false);
			
			membershiplb.setVisible(false);
			reconfigurationlb.setVisible(false);
			filetransferlb.setVisible(false);
			
			label1.setVisible(false);
			label2.setVisible(false);
			label3.setVisible(false);
			normalMobile.setVisible(false);
			normalMobile1.setVisible(false);
			jp1.setVisible(false);
			
			 attMobile.setVisible(false);
			
			 gy1.setVisible(false);
			 gy2.setVisible(false);
			 gy3.setVisible(false);
			 gy4.setVisible(false);
			 gy5.setVisible(false);
			 gy6.setVisible(false);
			 gy7.setVisible(false);
			 gy8.setVisible(false);
			 gy9.setVisible(false);
			 gy10.setVisible(false);
			 gy11.setVisible(false);
			 gy12.setVisible(false);
			 gy13.setVisible(false);
			 gy14.setVisible(false);
			 gy15.setVisible(false);
			 gy16.setVisible(false);
			 
			 gy17.setVisible(false);
			 gy18.setVisible(false);
			 gy19.setVisible(false);
			 gy20.setVisible(false);
			 gy21.setVisible(false);
			 gy22.setVisible(false);
			 gy23.setVisible(false);
			 gy24.setVisible(false);
			 gy25.setVisible(false);
			 gy26.setVisible(false);
			 gy27.setVisible(false);
			 gy28.setVisible(false);
			 gy29.setVisible(false);
			 gy30.setVisible(false);
			// gy31.setVisible(false);
			// gy32.setVisible(false);
			
			
			 tfffB.setVisible(false);
			 scB.setVisible(false);
		 
		 
		// c.add(b1);
			 c.add(attackers);
		 
		 c.add(ipconnect);
		 c.add(testclientip1);
		 c.add(testclientip2);
		 c.add(testclientip3);
		 c.add(testclientip4);
		 c.add(ipcon);
		 c.add(textip1); 
		 c.add(textip2);
		 c.add(textip3);
		 c.add(textip4);
		 
		 c.add(normalMobile);
		 c.add(normalMobile1);
		 c.add(searching);
		 c.add(membership);
		 c.add(filetransfer);
		 c.add(aggregators);
		 c.add(reconfiguration);
		 
		 c.add(normalMobileimg);
		 c.add(normalMobile1img);
		 c.add(searchingimg);
		 c.add(membershipimg);
		 c.add(aggregatorsimg);
		 c.add(reconfigurationimg);
		 
		 c.add(normalMobilelb);
		 c.add(normalMobile1lb);
		 
		 c.add(membershiplb);
		
		 c.add(reconfigurationlb);
		 
		 
		 
		 c.add(gw1);
		 c.add(gw2);
		 c.add(gw3);
		 c.add(gw4);
		 c.add(gw5);
		 c.add(gw6);
		 
		 c.add(label1);
		 c.add(label2);
		 c.add(label3);
		 
		 c.add(g1);
		 c.add(g2);
		 c.add(g3);
		 c.add(g4);
		 c.add(g5);
		 c.add(g6);
		 c.add(g7);
		 c.add(g8);
		 c.add(g9);
		 c.add(g10);
		 c.add(g11);
		 c.add(g12);
		 c.add(g13);
		 c.add(g14);
		 c.add(g15);
		 c.add(g16);
		 c.add(g17);
		 c.add(g18);
		 c.add(g19);
		 c.add(g20);
		 c.add(g21);
		 c.add(g22);
		 c.add(g23);
		 c.add(g24);
		 c.add(g25);
		 c.add(g26);
		 c.add(g27);
		 c.add(g28);
		 c.add(g29);
		 c.add(g30);
		 
		 
		 c.add(gy1);
		 c.add(gy2);
		 c.add(gy3);
		 c.add(gy4);
		 c.add(gy5);
		 c.add(gy6);
		 c.add(gy7);
		 c.add(gy8);
		 c.add(gy9);
		 c.add(gy10);
		 c.add(gy11);
		 c.add(gy12);
		 c.add(gy13);
		 c.add(gy14);
		 c.add(gy15);
		 c.add(gy16);
		 c.add(gy17);
		 c.add(gy18);
		 c.add(gy19);
		 c.add(gy20);
		 c.add(gy21);
		 c.add(gy22);
		 c.add(gy23);
		 c.add(gy24);
		 c.add(gy25);
		 c.add(gy26);
		 c.add(gy27);
		 c.add(gy28);
		 c.add(gy29);
		 c.add(gy30); 
		
		
		 
		 c.add(gb1);
		 c.add(gb2);
		 c.add(gb3);
		 c.add(gb4);
		 c.add(gb5);
		 c.add(gb6);
		 c.add(gb7);
		 c.add(gb8);
		 c.add(gb9);
		 c.add(gb10);
		 c.add(gb11);
		 c.add(gb12);
		 c.add(gb13);
		 c.add(gb14);
		 c.add(gb15);
		 c.add(gb16);
		 c.add(gb17);
		 c.add(gb18);
		 c.add(gb19);
		 c.add(gb20);
		 c.add(gb21);
		 c.add(gb22);
		 c.add(gb23);
		 c.add(gb24);
		 c.add(gb25);
		 c.add(gb26);
		 c.add(gb27);
		 c.add(gb28);
		 c.add(gb29);
		 c.add(gb30);
		
		 
		
		 
		//c.add(dummy1);
		 //c.add(dummy2);
		 
		// c.add(table111);
		
		 
		// c.add(connectipaddr);
		 c.add(n1);
		 c.add(n2);
		 c.add(n3);
		 c.add(jp2);
		 c.add(jp1);
		 c.add(jp);
		 c.add(Mobile);
		 c.add(attMobile);
		 c.add(scB);
		 c.add(bf);
		 
		b1.addActionListener(this);
		ipconnect.addActionListener(this);
		 
		 jf.show();
	       jf.addWindowListener(new WindowAdapter()
	         {
				public void windowClosing(WindowEvent win)
				{
				//	System.exit(0);
				}});
	       
	       int[] ports = new int[] {2828,4500,4501,4502,4503,4504,4505,4506,4507,4508,4509,4510,7701,7702,7703,7704,7705,7706,7707,7708,7709,7710,7711,7712,7713,7714,7715,7716,7717,7718,7719,7720,7721,7722,7723,7724,7725,7726,7727,7728,7729,7730};

			for (int i = 0; i < 42; i++) {
				Thread t = new Thread(new PortListener(ports[i]));
				t.setName("Listener-" + ports[i]);
				t.start();

			}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	               if ("Nimbus".equals(info.getName())) {
	                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                   break;
	               }
	           }
	       } catch (ClassNotFoundException ex) {
	           java.util.logging.Logger.getLogger(topology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	       } catch (InstantiationException ex) {
	           java.util.logging.Logger.getLogger(topology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	       } catch (IllegalAccessException ex) {
	           java.util.logging.Logger.getLogger(topology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	           java.util.logging.Logger.getLogger(topology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	       }
		new topology();
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
try {
				server = new ServerSocket(port);
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
					 if (this.port == 2828) 
					 {
						 tfffB.setText(temp);
						
					 }
					 if (this.port == 7701) 
					 {
						 Thread.sleep(500);
						 	 attackers.setVisible(true);
							 attackers.setBounds(210, 320, 30, 30);
							 attMobile.setVisible(true);
							 attMobile.setText("Mobile 1");
							 refa();
							 atta();
						
					 }
					 if (this.port == 7702) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	attackers.setBounds(150, 305, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 2");
						 	refa();
						 	atta();
					 }
					 if (this.port == 7703) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	 attackers.setBounds(82, 330, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 3");
						 	refa();
						 	atta();
					 }
					 if (this.port == 7704) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	 attackers.setBounds(130, 386, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 4");
						 	refa();
						 	atta();
					 }
					 if (this.port == 7705) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	 attackers.setBounds(196, 415, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 5");
						 	refa();
						 	atta();
					 }
					 if (this.port == 7706) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	 attackers.setBounds(163, 444, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 6");
						 	refa();
						 	atta();
					 }
					 if (this.port == 7707) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	attackers.setBounds(202, 367, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 7");
						 	refa();
						 	atta();
					 }
					 if (this.port == 7708) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	 attackers.setBounds(100, 423, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 8");
						 	refa();
						 	atta();
					 }
					 if (this.port == 7709) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	attackers.setBounds(60, 370, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 9");
						 	refa();
						 	atta();
					 }
					 if (this.port == 7710) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	 attackers.setBounds(150, 344, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 10");
						 	refa();
						 	atta();
					 }
				
					 if (this.port == 7711) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	 attackers.setBounds(415, 410, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 11");
						 	refb();
						 	atta();
					 }
					 if (this.port == 7712) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	attackers.setBounds(330, 470, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 12");
						 	refb();
						 	atta();
					 }
					 if (this.port == 7713) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	 attackers.setBounds(470, 422, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 13");
						 	refb();
						 	atta();
					 }
					 if (this.port == 7714) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	attackers.setBounds(390, 450, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 14");
						 	refb();
						 	atta();
					 }
					 if (this.port == 7715) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	 attackers.setBounds(350, 415, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 15");
						 	refb();
						 	atta();
					 }
					 if (this.port == 7716) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
							 attackers.setBounds(350, 360, 30, 30);
							 attMobile.setVisible(true);
							 attMobile.setText("Mobile 16");
							 refb();
							 atta();
					 }
					 if (this.port == 7717) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	attackers.setBounds(415, 492, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 17");
						 	refb();
						 	atta();
					 }
					 if (this.port == 7718) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	 attackers.setBounds(415, 360, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 18");
						 	refb();
						 	atta();
					 }
					 if (this.port == 7719) 
					 { Thread.sleep(500);
						  	 attackers.setVisible(true);
						 	attackers.setBounds(350, 504, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 19");
						 	refb();
						 	atta();
					 }
					 if (this.port == 7720) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	 attackers.setBounds(310, 436, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 20");
						 	refb();
						 	atta();
					 }
					 
					
					
					 
					 
					 
					
					
					 
					 
					 
					 if (this.port == 7721) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	 attackers.setBounds(560, 300, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 21");
						 	refc();
						 	atta();
					 }
					 if (this.port == 7722) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	 attackers.setBounds(660, 423, 30, 30);		
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 22");
						 	refc();
						 	atta();
					 }
					 if (this.port == 7723) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	attackers.setBounds(680, 355, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 23");
							refc();
							atta();
					 }
					 if (this.port == 7724) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	attackers.setBounds(570, 415, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 24");
							refc();
							atta();
					 }
					 
					
						
					 
					
					
					 if (this.port == 7725) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	attackers.setBounds(650, 295, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 25");
							refc();
							atta();
					 }
					 if (this.port == 7726) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	attackers.setBounds(590, 377, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 26");
							refc();
							atta();
					 }
					 if (this.port == 7727) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	attackers.setBounds(550, 350, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 27");
							refc();
							atta();
						
					 }
					 if (this.port == 7728) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	attackers.setBounds(610, 435, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 28");
							refc();
							atta();
					 }
					 if (this.port == 7729) 
					 { Thread.sleep(500);
						 	 attackers.setVisible(true);
						 	 attackers.setBounds(600, 320, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 29");
							refc();
							atta();
					 }
					 if (this.port == 7730) 
					 { Thread.sleep(500);
						 
						 	 attackers.setVisible(true);
						 	attackers.setBounds(630, 366, 30, 30);
						 	attMobile.setVisible(true);
						 	attMobile.setText("Mobile 30");
							refc();
							atta();
					 }
					
					
						 if (this.port == 4500) 
						 {
							 try {
								 g1.setVisible(false);
								 g2.setVisible(false);
								 g3.setVisible(false);
								 g4.setVisible(false);
								 g5.setVisible(false);
								 g6.setVisible(false);
								 g7.setVisible(false);
								 g8.setVisible(false);
								 g9.setVisible(false);
								 g10.setVisible(false);
								 
								 g11.setVisible(false);
								 g12.setVisible(false);
								 g13.setVisible(false);
								 g14.setVisible(false);
								 g15.setVisible(false);
								 g16.setVisible(false);
								 g17.setVisible(false);
								 g18.setVisible(false);
								 g19.setVisible(false);
								 g20.setVisible(false);
								 
								 g21.setVisible(false);
								 g22.setVisible(false);
								 g23.setVisible(false);
								 g24.setVisible(false);
								 g25.setVisible(false);
								 g26.setVisible(false);
								 g27.setVisible(false);
								 g28.setVisible(false);
								 g29.setVisible(false);
								 g30.setVisible(false);
								 
								 
								 gb1.setVisible(false);
								 gb2.setVisible(false);
								 gb3.setVisible(false);
								 gb4.setVisible(false);
								 gb5.setVisible(false);
								 gb6.setVisible(false);
								 gb7.setVisible(false);
								 gb8.setVisible(false);
								 gb9.setVisible(false);
								 gb10.setVisible(false);
								 
								 gb11.setVisible(false);
								 gb12.setVisible(false);
								 gb13.setVisible(false);
								 gb14.setVisible(false);
								 gb15.setVisible(false);
								 gb16.setVisible(false);
								 gb17.setVisible(false);
								 gb18.setVisible(false);
								 gb19.setVisible(false);
								 gb20.setVisible(false);
								 
								 gb21.setVisible(false);
								 gb22.setVisible(false);
								 gb23.setVisible(false);
								 gb24.setVisible(false);
								 gb25.setVisible(false);
								 gb26.setVisible(false);
								 gb27.setVisible(false);
								 gb28.setVisible(false);
								 gb29.setVisible(false);
								 gb30.setVisible(false);
								 
								 
								
								 
									
									
									 g1.setVisible(true);
									  val1="Mobile 1";
									  Mobile.setText(val1);
//									  originaldataone=Mobile.getText().trim();
//									  senddata=originaldataone;
									  recong1();
									  
									 Thread.sleep(500);
									 g2.setVisible(true);
									  val2="Mobile 2";
									  Mobile.setText(val2);
									  recong1();
									  
									 Thread.sleep(500);
									 g3.setVisible(true);
									  val3="Mobile 3";
									  Mobile.setText(val3);
									  recong1();
									  
									 Thread.sleep(500);
									 g4.setVisible(true);
									  val4="Mobile 4";
									  Mobile.setText(val4);
									  recong1();
									  
									 Thread.sleep(500);
									 g5.setVisible(true);
									  val5="Mobile 5";
									  Mobile.setText(val5);
									  recong1();
									  
									 Thread.sleep(500);
									 g6.setVisible(true);
									  val6="Mobile 6";
									  Mobile.setText(val6);
									  recong1();
									  
									 Thread.sleep(500);
									 g7.setVisible(true);
									  val7="Mobile 7";
									  Mobile.setText(val7);
									  recong1();
									  
									 Thread.sleep(500);
									 g8.setVisible(true);
									  val8="Mobile 8";
									  Mobile.setText(val8);
									  recong1();
									  
									 Thread.sleep(500);
									 g9.setVisible(true);
									  val9="Mobile 9";
									  Mobile.setText(val9);
									  recong1();
									  
									 Thread.sleep(500);
									 g10.setVisible(true);
									  val10="Mobile 10";
									  Mobile.setText(val10);
									  recong1();
									  
									 Thread.sleep(500);
									 g11.setVisible(true);
									  val11="Mobile 11";
									  Mobile.setText(val11);
									  recong2();
									  
									 Thread.sleep(500);
									 g12.setVisible(true);
									  val12="Mobile 12";
									  Mobile.setText(val12);
									  recong2();
									  
									 Thread.sleep(500);
									 g13.setVisible(true);
									  val13="Mobile 13";
									  Mobile.setText(val13);
									  recong2();
									  
									 Thread.sleep(500);
									 g14.setVisible(true);
									  val14="Mobile 14";
									  Mobile.setText(val14);
									  recong2();
									  
									 Thread.sleep(500);
									 g15.setVisible(true);
									  val15="Mobile 15";
									  Mobile.setText(val15);
									  recong2();
									  
									 Thread.sleep(500);
									 g16.setVisible(true);
									  val16="Mobile 16";
									  Mobile.setText(val16);
									  recong2();
									  
									 Thread.sleep(500);
									 g17.setVisible(true);
									  val17="Mobile 17";
									  Mobile.setText(val17);
									  recong2();
									  
									 Thread.sleep(500);
									 g18.setVisible(true);
									  val18="Mobile 18";
									  Mobile.setText(val18);
									  recong2();
									  
									 Thread.sleep(500);
									 g19.setVisible(true);
									  val19="Mobile 19";
									  Mobile.setText(val19);
									  recong2();
									  
									 Thread.sleep(500);
									 g20.setVisible(true);
									  val20="Mobile 20";
									  Mobile.setText(val20);
									  recong2();
									  
									 Thread.sleep(500);
									 g21.setVisible(true);
									  val21="Mobile 21";
									  Mobile.setText(val21);
									  recong3();
									  
									 Thread.sleep(500);
									 g22.setVisible(true);
									  val22="Mobile 22";
									  Mobile.setText(val22);
									  recong3();
									  
									 Thread.sleep(500);
									 g23.setVisible(true);
									  val23="Mobile 23";
									  Mobile.setText(val23);
									  recong3();
									  
									 Thread.sleep(500);
									 g24.setVisible(true);
									  val24="Mobile 24";
									  Mobile.setText(val24);
									  recong3();
									  
									 Thread.sleep(500);
									 g25.setVisible(true);
									  val25="Mobile 25";
									  Mobile.setText(val25);
									  recong3();
									  
									 Thread.sleep(500);
									 g26.setVisible(true);
									  val26="Mobile 26";
									  Mobile.setText(val26);
									  recong3();
									  
									 Thread.sleep(500);
									 g27.setVisible(true);
									  val27="Mobile 27";
									  Mobile.setText(val27);
									  recong3();
									  
									 Thread.sleep(500);
									 g28.setVisible(true);
									  val28="Mobile 28";
									  Mobile.setText(val28);
									  recong3();
									  
									 Thread.sleep(500);
									 g29.setVisible(true);
									  val29="Mobile 29";
									  Mobile.setText(val29);
									  recong3();
									  
									 Thread.sleep(500);
									 g30.setVisible(true);
									  val30="Mobile 30";
									  Mobile.setText(val30);
									  recong3();
									 
								
									
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							
						 }
						 
						 if (this.port == 4501) 
						 {
							 try {
							
								 
									
									 Thread.sleep(500);
									 g1.setVisible(true);
									  val1="Mobile 1";
									  Mobile.setText(val1);
//									  originaldataone=Mobile.getText().trim();
//									  senddata=originaldataone;
									  recong1();
									  
									 Thread.sleep(500);
									 g2.setVisible(true);
									  val2="Mobile 2";
									  Mobile.setText(val2);
									  recong1();
									  
									 Thread.sleep(500);
									 g3.setVisible(true);
									  val3="Mobile 3";
									  Mobile.setText(val3);
									  recong1();
									  
									 Thread.sleep(500);
									 g4.setVisible(true);
									  val4="Mobile 4";
									  Mobile.setText(val4);
									  recong1();
									  
									 Thread.sleep(500);
									 g5.setVisible(true);
									  val5="Mobile 5";
									  Mobile.setText(val5);
									  recong1();
									  
									 Thread.sleep(500);
									 g6.setVisible(true);
									  val6="Mobile 6";
									  Mobile.setText(val6);
									  recong1();
									  
									 Thread.sleep(500);
									 g7.setVisible(true);
									  val7="Mobile 7";
									  Mobile.setText(val7);
									  recong1();
									  
									 Thread.sleep(500);
									 g8.setVisible(true);
									  val8="Mobile 8";
									  Mobile.setText(val8);
									  recong1();
									  
									 Thread.sleep(500);
									 g9.setVisible(true);
									  val9="Mobile 9";
									  Mobile.setText(val9);
									  recong1();
									  
									 Thread.sleep(500);
									 g10.setVisible(true);
									  val10="Mobile 10";
									  Mobile.setText(val10);
									  recong1();
									  
									 Thread.sleep(500);
									 g11.setVisible(true);
									  val11="Mobile 11";
									  Mobile.setText(val11);
									  recong2();
									  
									 Thread.sleep(500);
									 g12.setVisible(true);
									  val12="Mobile 12";
									  Mobile.setText(val12);
									  recong2();
									  
									 Thread.sleep(500);
									 g13.setVisible(true);
									  val13="Mobile 13";
									  Mobile.setText(val13);
									  recong2();
									  
									 Thread.sleep(500);
									 g14.setVisible(true);
									  val14="Mobile 14";
									  Mobile.setText(val14);
									  recong2();
									  
									 Thread.sleep(500);
									 g15.setVisible(true);
									  val15="Mobile 15";
									  Mobile.setText(val15);
									  recong2();
									  
									 Thread.sleep(500);
									 g16.setVisible(true);
									  val16="Mobile 16";
									  Mobile.setText(val16);
									  recong2();
									  
									 Thread.sleep(500);
									 g17.setVisible(true);
									  val17="Mobile 17";
									  Mobile.setText(val17);
									  recong2();
									  
									 Thread.sleep(500);
									 g18.setVisible(true);
									  val18="Mobile 18";
									  Mobile.setText(val18);
									  recong2();
									  
									 Thread.sleep(500);
									 g19.setVisible(true);
									  val19="Mobile 19";
									  Mobile.setText(val19);
									  recong2();
									  
									 Thread.sleep(500);
									 g20.setVisible(true);
									  val20="Mobile 20";
									  Mobile.setText(val20);
									  recong2();
									  
									 Thread.sleep(500);
									 g21.setVisible(true);
									  val21="Mobile 21";
									  Mobile.setText(val21);
									  recong3();
									  
									 Thread.sleep(500);
									 g22.setVisible(true);
									  val22="Mobile 22";
									  Mobile.setText(val22);
									  recong3();
									  
									 Thread.sleep(500);
									 g23.setVisible(true);
									  val23="Mobile 23";
									  Mobile.setText(val23);
									  recong3();
									  
									 Thread.sleep(500);
									 g24.setVisible(true);
									  val24="Mobile 24";
									  Mobile.setText(val24);
									  recong3();
									  
									 Thread.sleep(500);
									 g25.setVisible(true);
									  val25="Mobile 25";
									  Mobile.setText(val25);
									  recong3();
									  
									 Thread.sleep(500);
									 g26.setVisible(true);
									  val26="Mobile 26";
									  Mobile.setText(val26);
									  recong3();
									  
									 Thread.sleep(500);
									 g27.setVisible(true);
									  val27="Mobile 27";
									  Mobile.setText(val27);
									  recong3();
									  
									 Thread.sleep(500);
									 g28.setVisible(true);
									  val28="Mobile 28";
									  Mobile.setText(val28);
									  recong3();
									  
									 Thread.sleep(500);
									 g29.setVisible(true);
									  val29="Mobile 29";
									  Mobile.setText(val29);
									  recong3();
									  
									 Thread.sleep(500);
									 g30.setVisible(true);
									  val30="Mobile 30";
									  Mobile.setText(val30);
									  recong3();
									 
								
									
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							
						 }
						 
						 if (this.port == 4502) 
						 {
							 try {
									 Thread.sleep(500);
									 g1.setVisible(true);
									  val1="Mobile 1";
									  Mobile.setText(val1);
									  recong1();
									  
									 Thread.sleep(500);
									 g2.setVisible(false);
									 gy2.setVisible(false);
									 gb2.setVisible(true);
									  val2="Mobile 2";
									  Mobile.setText(val2);
									  recong1a();
									  
									 Thread.sleep(500);
									 g3.setVisible(true);
									  val3="Mobile 3";
									  Mobile.setText(val3);
									  recong1();
									  
									 Thread.sleep(500);
									 g4.setVisible(true);
									  val4="Mobile 4";
									  Mobile.setText(val4);
									  recong1();
									  
									 Thread.sleep(500);
									 g5.setVisible(false);
									 gy5.setVisible(false);
									 gb5.setVisible(true);
									  val5="Mobile 5";
									  Mobile.setText(val5);
									  recong1a();
									  
									 Thread.sleep(500);
									 g6.setVisible(true);
									  val6="Mobile 6";
									  Mobile.setText(val6);
									  recong1();
									  
									 Thread.sleep(500);
									 g7.setVisible(true);
									  val7="Mobile 7";
									  Mobile.setText(val7);
									  recong1();
									  
									 Thread.sleep(500);
									 g8.setVisible(false);
									 gy8.setVisible(false);
									 gb8.setVisible(true);
									  val8="Mobile 8";
									  Mobile.setText(val8);
									  recong1a();
									  
									 Thread.sleep(500);
									 g9.setVisible(true);
									  val9="Mobile 9";
									  Mobile.setText(val9);
									  recong1();
									  
									 Thread.sleep(500);
									 g10.setVisible(true);
									  val10="Mobile 10";
									  Mobile.setText(val10);
									  recong1();
									  
									 Thread.sleep(500);
									 g11.setVisible(true);
									  val11="Mobile 11";
									  Mobile.setText(val11);
									  recong2();
									  
									 Thread.sleep(500);
									 g12.setVisible(false);
									 gy12.setVisible(false);
									 gb12.setVisible(true);
									  val12="Mobile 12";
									  Mobile.setText(val12);
									  recong2a();
									  
									 Thread.sleep(500);
									 g13.setVisible(true);
									  val13="Mobile 13";
									  Mobile.setText(val13);
									  recong2();
									  
									 Thread.sleep(500);
									 g14.setVisible(true);
									  val14="Mobile 14";
									  Mobile.setText(val14);
									  recong2();
									  
									 Thread.sleep(500);
									 g15.setVisible(false);
									 gy15.setVisible(false);
									 gb15.setVisible(true);
									  val15="Mobile 15";
									  Mobile.setText(val15);
									  recong2a();
									  
									 Thread.sleep(500);
									 g16.setVisible(true);
									  val16="Mobile 16";
									  Mobile.setText(val16);
									  recong2();
									  
									 Thread.sleep(500);
									 g17.setVisible(false);
									 gy17.setVisible(false);
									 gb17.setVisible(true);
									  val17="Mobile 17";
									  Mobile.setText(val17);
									  recong2a();
									  
									 Thread.sleep(500);
									 g18.setVisible(true);
									  val18="Mobile 18";
									  Mobile.setText(val18);
									  recong2();
									  
									 Thread.sleep(500);
									 g19.setVisible(true);
									  val19="Mobile 19";
									  Mobile.setText(val19);
									  recong2();
									  
									 Thread.sleep(500);
									 g20.setVisible(false);
									 gy20.setVisible(false);
									 gb20.setVisible(true);
									  val20="Mobile 20";
									  Mobile.setText(val20);
									  recong2a();
									  
									 Thread.sleep(500);
									 g21.setVisible(true);
									  val21="Mobile 21";
									  Mobile.setText(val21);
									  recong3();
									  
									 Thread.sleep(500);
									 g22.setVisible(false);
									 gy22.setVisible(false);
									 gb22.setVisible(true);
									  val22="Mobile 22";
									  Mobile.setText(val22);
									  recong3a();
									  
									 Thread.sleep(500);
									 g23.setVisible(true);
									  val23="Mobile 23";
									  Mobile.setText(val23);
									  recong3();
									  
									 Thread.sleep(500);
									 g24.setVisible(true);
									  val24="Mobile 24";
									  Mobile.setText(val24);
									  recong3();
									  
									 Thread.sleep(500);
									 g25.setVisible(false);
									 gy25.setVisible(false);
									 gb25.setVisible(true);
									  val25="Mobile 25";
									  Mobile.setText(val25);
									  recong3a();
									  
									 Thread.sleep(500);
									 g26.setVisible(true);
									  val26="Mobile 26";
									  Mobile.setText(val26);
									  recong3();
									  
									 Thread.sleep(500);
									 g27.setVisible(true);
									  val27="Mobile 27";
									  Mobile.setText(val27);
									  recong3();
									  
									 Thread.sleep(500);
									 g28.setVisible(false);
									 gy28.setVisible(false);
									 gb28.setVisible(true);
									  val28="Mobile 28";
									  Mobile.setText(val28);
									  recong3a();
									  
									 Thread.sleep(500);
									 g29.setVisible(true);
									  val29="Mobile 29";
									  Mobile.setText(val29);
									  recong3();
									  
									 Thread.sleep(500);
									 g30.setVisible(true);
									  val30="Mobile 30";
									  Mobile.setText(val30);
									  recong3();
									 
								
									
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							
						 }
						 
						 if (this.port == 4503) 
						 {
							 try {
									 Thread.sleep(500);
									 g1.setVisible(true);
									  val1="Mobile 1";
									  Mobile.setText(val1);
									  recong1();
									  
									 Thread.sleep(500);
								
									 g2.setVisible(true);
									  val2="Mobile 2";
									  Mobile.setText(val2);
									  recong1();
									  
									 Thread.sleep(500);
									 g3.setVisible(true);
									  val3="Mobile 3";
									  Mobile.setText(val3);
									  recong1();
									  
									 Thread.sleep(500);
									 gy4.setVisible(false);
									 g4.setVisible(false);
									 gb4.setVisible(true);
									  val4="Mobile 4";
									  Mobile.setText(val4);
									  recong1a();
									  
									 Thread.sleep(500);
									
									 g5.setVisible(true);
									  val5="Mobile 5";
									  Mobile.setText(val5);
									  recong1();
									  
									 Thread.sleep(500);
									 g6.setVisible(true);
									  val6="Mobile 6";
									  Mobile.setText(val6);
									  recong1();
									  
									 Thread.sleep(500);
									 g7.setVisible(true);
									  val7="Mobile 7";
									  Mobile.setText(val7);
									  recong1();
									  
									 Thread.sleep(500);
									
									 g8.setVisible(true);
									  val8="Mobile 8";
									  Mobile.setText(val8);
									  recong1();
									  
									 Thread.sleep(500);
									 gy9.setVisible(false);
									 g9.setVisible(false);
									 gb9.setVisible(true);
									  val9="Mobile 9";
									  Mobile.setText(val9);
									  recong1a();
									  
									 Thread.sleep(500);
									 g10.setVisible(true);
									  val10="Mobile 10";
									  Mobile.setText(val10);
									  recong1();
									  
									 Thread.sleep(500);
									 g11.setVisible(true);
									  val11="Mobile 11";
									  Mobile.setText(val11);
									  recong2();
									  
									 Thread.sleep(500);
									
									 g12.setVisible(true);
									  val12="Mobile 12";
									  Mobile.setText(val12);
									  recong2();
									  
									 Thread.sleep(500);
									 gy13.setVisible(false);
									 g13.setVisible(false);
									 gb13.setVisible(true);
									  val13="Mobile 13";
									  Mobile.setText(val13);
									  recong2a();
									  
									 Thread.sleep(500);
									 g14.setVisible(true);
									  val14="Mobile 14";
									  Mobile.setText(val14);
									  recong2();
									  
									 Thread.sleep(500);
									
									 g15.setVisible(true);
									  val15="Mobile 15";
									  Mobile.setText(val15);
									  recong2();
									  
									 Thread.sleep(500);
									 gy16.setVisible(false);
									 g16.setVisible(false);
									 gb16.setVisible(true);
									  val16="Mobile 16";
									  Mobile.setText(val16);
									  recong2a();
									  
									 Thread.sleep(500);
									 
									 g17.setVisible(true);
									  val17="Mobile 17";
									  Mobile.setText(val17);
									  recong2();
									  
									 Thread.sleep(500);
									 g18.setVisible(true);
									  val18="Mobile 18";
									  Mobile.setText(val18);
									  recong2();
									  
									 Thread.sleep(500);
									 g19.setVisible(true);
									  val19="Mobile 19";
									  Mobile.setText(val19);
									  recong2();
									  
									 Thread.sleep(500);
									
									 g20.setVisible(true);
									  val20="Mobile 20";
									  Mobile.setText(val20);
									  recong2();
									  
									 Thread.sleep(500);
									 g21.setVisible(true);
									  val21="Mobile 21";
									  Mobile.setText(val21);
									  recong3();
									  
									 Thread.sleep(500);
									 
									 g22.setVisible(true);
									  val22="Mobile 22";
									  Mobile.setText(val22);
									  recong3();
									  
									 Thread.sleep(500);
									 gy23.setVisible(false);
									 g23.setVisible(false);
									 gb23.setVisible(true);
									  val23="Mobile 23";
									  Mobile.setText(val23);
									  recong3a();
									  
									 Thread.sleep(500);
									 g24.setVisible(true);
									  val24="Mobile 24";
									  Mobile.setText(val24);
									  recong3();
									  
									 Thread.sleep(500);
									 
									 g25.setVisible(true);
									  val25="Mobile 25";
									  Mobile.setText(val25);
									  recong3();
									  
									 Thread.sleep(500);
									 g26.setVisible(true);
									  val26="Mobile 26";
									  Mobile.setText(val26);
									  recong3();
									  
									 Thread.sleep(500);
									 gy27.setVisible(false);
									 g27.setVisible(false);
									 gb27.setVisible(true);
									  val27="Mobile 27";
									  Mobile.setText(val27);
									  recong3a();
									  
									 Thread.sleep(500);
									 
									 g28.setVisible(true);
									  val28="Mobile 28";
									  Mobile.setText(val28);
									  recong3();
									  
									 Thread.sleep(500);
									 g29.setVisible(true);
									  val29="Mobile 29";
									  Mobile.setText(val29);
									  recong3();
									  
									 Thread.sleep(500);
									 g30.setVisible(true);
									  val30="Mobile 30";
									  Mobile.setText(val30);
									  recong3();
									 
								
									
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							
						 }
						 
						 if (this.port == 4504) 
						 {
							 try {
									 Thread.sleep(500);
									 g1.setVisible(true);
									  val1="Mobile 1";
									  Mobile.setText(val1);
									  recong1();
									  
									 Thread.sleep(500);
								
									 g2.setVisible(true);
									  val2="Mobile 2";
									  Mobile.setText(val2);
									  recong1();
									  
									 Thread.sleep(500);
									 gy3.setVisible(false);
									 g3.setVisible(false);
									 gb3.setVisible(true);
									  val3="Mobile 3";
									  Mobile.setText(val3);
									  recong1a();
									  
									 Thread.sleep(500);
									 gy4.setVisible(false);
									 g4.setVisible(false);
									 gb4.setVisible(true);
									  val4="Mobile 4";
									  Mobile.setText(val4);
									  recong1a();
									  
									 Thread.sleep(500);
									
									 g5.setVisible(true);
									  val5="Mobile 5";
									  Mobile.setText(val5);
									  recong1();
									  
									 Thread.sleep(500);
									 g6.setVisible(true);
									  val6="Mobile 6";
									  Mobile.setText(val6);
									  recong1();
									  
									 Thread.sleep(500);
									 gy7.setVisible(false);
									 g7.setVisible(false);
									 gb7.setVisible(true);
									 
									  val7="Mobile 7";
									  Mobile.setText(val7);
									  recong1a();
									  
									 Thread.sleep(500);
									
									 g8.setVisible(true);
									  val8="Mobile 8";
									  Mobile.setText(val8);
									  recong1();
									  
									 Thread.sleep(500);
									
									 g9.setVisible(true);
									  val9="Mobile 9";
									  Mobile.setText(val9);
									  recong1();
									  
									 Thread.sleep(500);
									 g10.setVisible(true);
									  val10="Mobile 10";
									  Mobile.setText(val10);
									  recong1();
									  
									 Thread.sleep(500);
									 g11.setVisible(true);
									  val11="Mobile 11";
									  Mobile.setText(val11);
									  recong2();
									  
									 Thread.sleep(500);
									
									 g12.setVisible(true);
									  val12="Mobile 12";
									  Mobile.setText(val12);
									  recong2();
									  
									 Thread.sleep(500);
									 
									 g13.setVisible(true);
									  val13="Mobile 13";
									  Mobile.setText(val13);
									  recong2();
									  
									 Thread.sleep(500);
									 gy14.setVisible(false);
									 g14.setVisible(false);
									 gb14.setVisible(true);
									  val14="Mobile 14";
									  Mobile.setText(val14);
									  recong2a();
									  
									 Thread.sleep(500);
									
									 g15.setVisible(true);
									  val15="Mobile 15";
									  Mobile.setText(val15);
									  recong2();
									  
									 Thread.sleep(500);
									 
									 g16.setVisible(true);
									  val16="Mobile 16";
									  Mobile.setText(val16);
									  recong2();
									  
									 Thread.sleep(500);
									 
									 g17.setVisible(true);
									  val17="Mobile 17";
									  Mobile.setText(val17);
									  recong2();
									  
									 Thread.sleep(500);
									 gy18.setVisible(false);
									 g18.setVisible(false);
									 gb18.setVisible(true);
									  val18="Mobile 18";
									  Mobile.setText(val18);
									  recong2a();
									  
									 Thread.sleep(500);
									 g19.setVisible(true);
									  val19="Mobile 19";
									  Mobile.setText(val19);
									  recong2();
									  
									 Thread.sleep(500);
									
									 g20.setVisible(true);
									  val20="Mobile 20";
									  Mobile.setText(val20);
									  recong2();
									  
									 Thread.sleep(500);
									 g21.setVisible(true);
									  val21="Mobile 21";
									  Mobile.setText(val21);
									  recong3();
									  
									 Thread.sleep(500);
									 gy22.setVisible(false);
									 g22.setVisible(false);
									 gb22.setVisible(true);
									  val22="Mobile 22";
									  Mobile.setText(val22);
									  recong3a();
									  
									 Thread.sleep(500);
									 
									 g23.setVisible(true);
									  val23="Mobile 23";
									  Mobile.setText(val23);
									  recong3();
									  
									 Thread.sleep(500);
									 g24.setVisible(true);
									  val24="Mobile 24";
									  Mobile.setText(val24);
									  recong3();
									  
									 Thread.sleep(500);
									 
									 g25.setVisible(true);
									  val25="Mobile 25";
									  Mobile.setText(val25);
									  recong3();
									  
									 Thread.sleep(500);
									 gy26.setVisible(false);
									 g26.setVisible(false);
									 gb26.setVisible(true);
									  val26="Mobile 26";
									  Mobile.setText(val26);
									  recong3a();
									  
									 Thread.sleep(500);
									
									 g27.setVisible(true);
									  val27="Mobile 27";
									  Mobile.setText(val27);
									  recong3();
									  
									 Thread.sleep(500);
									 
									 g28.setVisible(true);
									  val28="Mobile 28";
									  Mobile.setText(val28);
									  recong3();
									  
									 Thread.sleep(500);
									 gy29.setVisible(false);
									 g29.setVisible(false);
									 gb29.setVisible(true);
									  val29="Mobile 29";
									  Mobile.setText(val29);
									  recong3a();
									  
									 Thread.sleep(500);
									 g30.setVisible(true);
									 g30.setVisible(true);
									  val30="Mobile 30";
									  Mobile.setText(val30);
									  recong3();
									 
								
									
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							
						 }
							
						br.close();
						connection.close();
						
					}	//while
			}//first try
			catch (IOException e) {} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			finally {}
			}//run
		}//last
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stubBufferedOutputStream bos = null;
		//BufferedOutputStream bos = null;
		byte[] byteArray;// =str.getBytes();
		String strLine = null;
		
			//-------------------------------------------------CONNECT BUTTON ---------------------------------------------//
		if(evt.getSource()== ipconnect)
		 {
			conn="Connect";
			 if(textip1.getText().equals("") && textip2.getText().equals("") && textip3.getText().equals("") && textip4.getText().equals(""))
			 {
				 JOptionPane.showMessageDialog(null,
							"please, Give valid IPAddress!", "Message Box", 1);
			 }
			 	 else
			 {
			 		 JOptionPane.showMessageDialog(null,"Connecting IP Address!!", "Message Box", 1);
			 		event1=textip1.getText().toString().trim();
			 		event2=textip2.getText().toString().trim();
			 		event3=textip3.getText().toString().trim();
			 		event4=textip4.getText().toString().trim();
			 		ipcon.setVisible(false);
			 		ipconnect.setVisible(false);
			 		textip1.setVisible(false);
			 		textip2.setVisible(false);
			 		textip3.setVisible(false);
			 		textip4.setVisible(false);
			 		testclientip1.setVisible(false);
			 		testclientip2.setVisible(false);
			 		testclientip3.setVisible(false);
			 		testclientip4.setVisible(false);
			 		jp2.setVisible(false);
			 		
			 		 connectipaddr.setVisible(true);
					 jp1.setVisible(true);
					 
					 	normalMobileimg.setVisible(true);
						normalMobile1img.setVisible(true);
						membershipimg.setVisible(true);
						searchingimg.setVisible(true);
						reconfigurationimg.setVisible(true);
						filetransferimg.setVisible(true);
						aggregatorsimg.setVisible(true);
						normalMobilelb.setVisible(true);
						normalMobile1lb.setVisible(true);
						
						membershiplb.setVisible(true);
						reconfigurationlb.setVisible(true);
						filetransferlb.setVisible(true);
						Mobile.setVisible(false);
						attMobile.setVisible(true);
						label1.setVisible(true);
						label2.setVisible(true);
						label3.setVisible(true);
						normalMobile.setVisible(true);
						normalMobile1.setVisible(true);
						jp1.setVisible(true);
						tfffB.setVisible(false);
						scB.setVisible(false);
						
						 n1.setVisible(true);
						 n2.setVisible(true);
						 n3.setVisible(true);
						
						 gy1.setVisible(true);
						 gy2.setVisible(true);
						 gy3.setVisible(true);
						 gy4.setVisible(true);
						 gy5.setVisible(true);
						 gy6.setVisible(true);
						 gy7.setVisible(true);
						 gy8.setVisible(true);
						 gy9.setVisible(true);
						 gy10.setVisible(true);
						 
						 gy11.setVisible(true);
						 gy12.setVisible(true);
						 gy13.setVisible(true);
						 gy14.setVisible(true);
						 gy15.setVisible(true);
						 gy16.setVisible(true);
						 gy17.setVisible(true);
						 gy18.setVisible(true);
						 gy19.setVisible(true);
						 gy20.setVisible(true);
						 
						 gy21.setVisible(true);
						 gy22.setVisible(true);
						 gy23.setVisible(true);
						 gy24.setVisible(true);
						 gy25.setVisible(true);
						 gy26.setVisible(true);
						 gy27.setVisible(true);
						 gy28.setVisible(true);
						 gy29.setVisible(true);
						 gy30.setVisible(true);
						 
					/*	 gb1.setVisible(true);
						 gb2.setVisible(true);
						 gb3.setVisible(true);
						 gb4.setVisible(true);
						 gb5.setVisible(true);
						 gb6.setVisible(true);
						 gb7.setVisible(true);
						 gb8.setVisible(true);
						 gb9.setVisible(true);
						 gb10.setVisible(true);
						 
						 gb11.setVisible(true);
						 gb12.setVisible(true);
						 gb13.setVisible(true);
						 gb14.setVisible(true);
						 gb15.setVisible(true);
						 gb16.setVisible(true);
						 gb17.setVisible(true);
						 gb18.setVisible(true);
						 gb19.setVisible(true);
						 gb20.setVisible(true);
						 
						 gb21.setVisible(true);
						 gb22.setVisible(true);
						 gb23.setVisible(true);
						 gb24.setVisible(true);
						 gb25.setVisible(true);
						 gb26.setVisible(true);
						 gb27.setVisible(true);
						 gb28.setVisible(true);
						 gb29.setVisible(true);
						 gb30.setVisible(true);
						 
						 g1.setVisible(true);
						 g2.setVisible(true);
						 g3.setVisible(true);
						 g4.setVisible(true);
						 g5.setVisible(true);
						 g6.setVisible(true);
						 g7.setVisible(true);
						 g8.setVisible(true);
						 g9.setVisible(true);
						 g10.setVisible(true);
						 
						 g11.setVisible(true);
						 g12.setVisible(true);
						 g13.setVisible(true);
						 g14.setVisible(true);
						 g15.setVisible(true);
						 g16.setVisible(true);
						 g17.setVisible(true);
						 g18.setVisible(true);
						 g19.setVisible(true);
						 g20.setVisible(true);

						 g21.setVisible(true);
						 g22.setVisible(true);
						 g23.setVisible(true);
						 g24.setVisible(true);
						 g25.setVisible(true);
						 g26.setVisible(true);
						 g27.setVisible(true);
						 g28.setVisible(true);
						 g29.setVisible(true);
						 g30.setVisible(true);*/
						
					 
			 		
			 }
		}
	
	
	 }
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	void recong1()
	{
				byte[] byteArray;			 
				Socket client = null;
				try     { 
	
				//	/********SERVER IP Adddress********************
	
					client = new Socket(event1,4545);//8000
				
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
	
	void recong2()
	{
				byte[] byteArray;			 
				Socket client = null;
				try     { 
	
				//	/********SERVER IP Adddress********************
	
					client = new Socket(event1,4546);//8000
				
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
	
	void recong3()
	{
				byte[] byteArray;			 
				Socket client = null;
				try     { 
	
				//	/********SERVER IP Adddress********************
	
					client = new Socket(event1,4547);//8000
				
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
	void recong1a()
	{
				byte[] byteArray;			 
				Socket client = null;
				try     { 
	
				//	/********SERVER IP Adddress********************
	
					client = new Socket(event1,4401);//8000
				
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
	void recong2a()
	{
				byte[] byteArray;			 
				Socket client = null;
				try     { 
	
				//	/********SERVER IP Adddress********************
	
					client = new Socket(event1,4402);//8000
				
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
	void recong3a()
	{
				byte[] byteArray;			 
				Socket client = null;
				try     { 
	
				//	/********SERVER IP Adddress********************
	
					client = new Socket(event1,4403);//8000
				
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
	void atta()
	{
				byte[] byteArray;			 
				Socket client = null;
				try     { 
	
				//	/********SERVER IP Adddress********************
	
					client = new Socket(event1,3939);//8000
				
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
	
	void refa()
	{
				byte[] byteArray;			 
				Socket client = null;
				try     { 
	
				//	/********SERVER IP Adddress********************
	
					client = new Socket(event1,6666);//8000
				
					bos = new BufferedOutputStream(client.getOutputStream()); 
	
					byteArray = attMobile.getText().getBytes();
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
	void refb()
	{
				byte[] byteArray;			 
				Socket client = null;
				try     { 
	
				//	/********SERVER IP Adddress********************
	
					client = new Socket(event1,6667);//8000
				
					bos = new BufferedOutputStream(client.getOutputStream()); 
	
					byteArray = attMobile.getText().getBytes();
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
	void refc()
	{
				byte[] byteArray;			 
				Socket client = null;
				try     { 
	
				//	/********SERVER IP Adddress********************
	
					client = new Socket(event1,6668);//8000
				
					bos = new BufferedOutputStream(client.getOutputStream()); 
	
					byteArray = attMobile.getText().getBytes();
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
	
	/*void recong1(Object arg0)
	{
				byte[] byteArray;
				Socket client = null;
				BufferedOutputStream bos = null;
				Object clientdata=arg0;
				try {
		       /*******************Client IP Address******************
					client = new Socket(Mobile.getText().toString().trim(),4545);
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
	}*/
	
		
	}     
