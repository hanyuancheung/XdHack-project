import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class appUI extends JPanel {

	 TipUI tipui =new TipUI();
	 Test2 test = new Test2();
//	 JTextField numField;
//	 JTextField ageField;
	 appListener appL = new appListener();
	 RefreshThread rThread = new RefreshThread();
	 SearchTest search = new SearchTest();
	
	public void showUI() {
		JFrame appframe = new JFrame();
		//设置属性
		appframe.setTitle("Design By FP");
		appframe.setSize(1100, 600);
		appframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appframe.setLocationRelativeTo(null);

		
		
		//边框布局
		JPanel p = new JPanel();
		p.setBackground(Color.white);
		Dimension psize = new Dimension(300,600);
		p.setPreferredSize(psize);//panel面板的大小设置应该是setPreferredSize
		appframe.add(p,BorderLayout.EAST);
		p.setLayout(new FlowLayout());
		appframe.add(this,BorderLayout.CENTER);
		this.setBackground(Color.white);
		
		
		//人脸数量提示框
		JTextField numField = new JTextField(20);//20为输入框宽度
		Dimension inputsize = new Dimension(130, 50);// 大小，只能规定高度
		numField.setPreferredSize(inputsize);
		numField.setEditable(false);
		numField.setText("");
		p.add(numField);
		//appL.upThread.numField = numField;
		rThread.numField = numField;
		
		
		//年龄显示框
		JTextField ageField = new JTextField(20);//20为输入框宽度
		ageField.setPreferredSize(inputsize);
		ageField.setEditable(false);
		ageField.setText("");
		p.add(ageField);
		//appL.upThread.ageField = ageField;
		rThread.ageField = ageField;
		
		
		//是否为老客户显示框
		JTextField corField = new JTextField(20);//20为输入框宽度
		corField.setPreferredSize(inputsize);
		corField.setEditable(false);
		corField.setText("");
		p.add(corField);
		rThread.corField = corField;
		
		
		//可信度显示框
		JTextField belField = new JTextField(20);//20为输入框宽度
		belField.setPreferredSize(inputsize);
		belField.setEditable(false);
		belField.setText("");
		p.add(belField);
		rThread.belField = belField;
		
		
		JMenuBar menuBar = new JMenuBar();//创建一个菜单栏
		JMenu fileMenu = new JMenu("文件");//创建一级菜单
		
		menuBar.add(fileMenu);//把一级菜单添加到菜单栏
		
		//"文件"一级菜单的子菜单
		JMenuItem newMenuItem = new JMenuItem("打开");
		fileMenu.add(newMenuItem);
		JMenuItem camMenuItem = new JMenuItem("视频");
		fileMenu.add(camMenuItem);
		
		newMenuItem.addActionListener(appL);
		camMenuItem.addActionListener(appL);
		
	    appframe.setJMenuBar(menuBar);
		//设置可见
		appframe.setVisible(true);
		
		rThread.start();
		
		
		
//		appListener appL = new appListener();
		appL.test2=test;
		appL.tipui=tipui;
		test.tipui=tipui;
		tipui.test=test;
		
		

		
		
		
		
		//获取画布
		Graphics g = appframe.getGraphics();
		appL.setGraphics(g);
		System.out.println("appUI.g="+g);
		
	}
	
	
	public class RefreshThread extends Thread{
		
		JTextField numField;
		JTextField ageField;
		JTextField corField;
		JTextField belField;
//		String facenum = test.getface_num();
//		String agee = test.getAge();
		public void r