package com.pxx;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class RSA {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JTextField textField_1;
	private JButton button_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JTextField textField_2;
	private JButton button_2;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_3;
	private JButton btnNewButton_2;
	private JTextField textField_4;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RSA window = new RSA();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
;

		
	

	/**
	 * Create the application.
	 */
	public RSA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 573);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblL = new JLabel("\u516C\u94A5");
		lblL.setFont(new Font("宋体", Font.PLAIN, 20));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton button = new JButton("\u9009\u62E9\u8DEF\u5F84");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button){ 
					JFileChooser jfc=new JFileChooser();  
			        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );  
			        jfc.showDialog(new JLabel(), "选择");  
			        File file=jfc.getSelectedFile();  
			        if(file.isDirectory()){  
			            System.out.println("文件夹:"+file.getAbsolutePath());  
			        }else if(file.isFile()){  
			            System.out.println("文件:"+file.getAbsolutePath());  
			        }  
			        textField.setText( jfc.getSelectedFile().getName());  
			          
			    
				}
			        
			    	                    
			}
		});
		
		lblNewLabel = new JLabel("\u79C1\u94A5");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		button_1 = new JButton("\u9009\u62E9\u8DEF\u5F84");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_1){ 
					JFileChooser jfc=new JFileChooser();  
			        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );  
			        jfc.showDialog(new JLabel(), "选择");  
			        File file=jfc.getSelectedFile();  
			        if(file.isDirectory()){  
			            file.getAbsolutePath();  
			        }else if(file.isFile()){  
			           file.getAbsolutePath();  
			        }  
			        textField_1.setText( jfc.getSelectedFile().getName());  
				         }
			}
		});
		
		btnNewButton = new JButton("\u751F\u6210\u516C\u79C1\u94A5");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
						KeyPairGenerator k=KeyPairGenerator.getInstance("RSA");
						k.initialize(1024);
						KeyPair kp=k.genKeyPair();
						PublicKey pbkey=kp.getPublic();
						PrivateKey prkey=kp.getPrivate();
						FileOutputStream f1=new FileOutputStream(textField.getText());
						ObjectOutputStream b1=new ObjectOutputStream(f1);
						b1.writeObject(pbkey);
						FileOutputStream f2=new FileOutputStream(textField_1.getText());
						ObjectOutputStream b2=new ObjectOutputStream(f2);
						b2.writeObject(prkey);
					} catch (NoSuchAlgorithmException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblNewLabel_1 = new JLabel("\u83B7\u53D6\u516C\u94A5\u52A0\u5BC6");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 15));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		button_2 = new JButton("\u9009\u62E9\u8DEF\u5F84");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button_2){ 
					JFileChooser jfc=new JFileChooser();  
			        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );  
			        jfc.showDialog(new JLabel(), "选择");  
			        File file=jfc.getSelectedFile();  
			        if(file.isDirectory()){  
			            file.getAbsolutePath();  
			        }else if(file.isFile()){  
			           file.getAbsolutePath();  
			        }  
			        textField_2.setText( jfc.getSelectedFile().getName());}
			}
		});
		
		btnNewButton_1 = new JButton("\u52A0\u5BC6");
		btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String s=textField_4.getText();
				try {
					FileInputStream f=new FileInputStream(textField.getText());
					ObjectInputStream b=new ObjectInputStream(f);
					RSAPublicKey pbk=(RSAPublicKey) b.readObject();
					BigInteger e1=pbk.getPublicExponent();
					BigInteger n=pbk.getModulus();
					//System.out.println("e="+e);
					//System.out.println("n="+n);
					byte[] ptext=s.getBytes();
					BigInteger m=new BigInteger(ptext);
					BigInteger c=m.modPow(e1, n);
					//System.out.println("c="+c);
					String cs=c.toString();
					BufferedWriter out=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(textField_2.getText())));
					out.write(cs, 0, cs.length());
					out.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		lblNewLabel_2 = new JLabel("\u83B7\u53D6\u79C1\u94A5\u89E3\u5BC6");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		btnNewButton_2 = new JButton("\u89E3\u5BC6");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BufferedReader in=new BufferedReader(new InputStreamReader(new FileInputStream("Enc.dat")));
					String ctext=in.readLine();
					BigInteger c=new BigInteger(ctext);
					FileInputStream f=new FileInputStream("Skey-priv.dat");
					ObjectInputStream a=new ObjectInputStream(f);
					RSAPrivateKey prk=(RSAPrivateKey) a.readObject();
					BigInteger d=prk.getPrivateExponent();
					BigInteger n=prk.getModulus();
					System.out.println("d="+d);
					System.out.println("n="+n);
					BigInteger m=c.modPow(d, n);
					System.out.println("m="+m);
					byte[] mt=m.toByteArray();
					String str="";
					for(int i=0;i<mt.length;i++)
					{
				      str+=((char)mt[i]);
					}
					textField_3.setText(str);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		lblNewLabel_3 = new JLabel("\u8F93\u5165\u660E\u6587");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblNewLabel_4 = new JLabel("\u5F97\u5230\u660E\u6587");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(59)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblL, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
									.addComponent(lblNewLabel, Alignment.LEADING)
									.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
								.addComponent(lblNewLabel_2))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_3)
							.addGap(35)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(textField_2)
									.addComponent(textField_1)
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
							.addGap(44)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(button)
										.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
									.addGap(35)
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addGap(48)
									.addComponent(btnNewButton_1)))
							.addGap(117))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(btnNewButton_2)
							.addContainerGap())))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(76)
					.addComponent(lblNewLabel_4)
					.addGap(18)
					.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
					.addGap(396))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(101)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblL)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(button))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(41)
									.addComponent(lblNewLabel))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(28)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_1)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(120)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)))
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_2)
							.addComponent(btnNewButton_1))
						.addComponent(lblNewLabel_1))
					.addGap(56)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(btnNewButton_2))
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addContainerGap(84, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
