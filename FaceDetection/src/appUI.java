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
	
	public void showUI() {
		JFrame appframe = new JFrame();
		//��������
		appframe.setTitle("Design By FP");
		appframe.setSize(1100, 600);
		appframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appframe.setLocationRelativeTo(null);

		
		
		//�߿򲼾�
		JPanel p = new JPanel();
		p.setBackground(Color.white);
		Dimension psize = new Dimension(300,600);
		p.setPreferredSize(psize);//panel���Ĵ�С����Ӧ����setPreferredSize
		appframe.add(p,BorderLayout.EAST);
		p.setLayout(new FlowLayout());
		appframe.add(this,BorderLayout.CENTER);
		this.setBackground(Color.white);
		
		
		//����������ʾ��
		JTextField numField = new JTextField(20);//20Ϊ�������
		Dimension inputsize = new Dimension(130, 50);// ��С��ֻ�ܹ涨�߶�
		numField.setPreferredSize(inputsize);
		numField.setEditable(false);
		numField.setText("");
		p.add(numField);
		appL.upThread.numField = numField;
		rThread.numField = numField;
		
		
		//������ʾ��
		JTextField ageField = new JTextField(20);//20Ϊ�������
		ageField.setPreferredSize(inputsize);
		ageField.setEditable(false);
		ageField.setText("");
		p.add(ageField);
		appL.upThread.ageField = ageField;
		rThread.ageField = ageField;
		
		
		rThread.start();
//		appListener appL = new appListener();
		appL.test2=test;
		appL.tipui=tipui;
		test.tipui=tipui;
		tipui.test=test;
		
		
		JMenuBar menuBar = new JMenuBar();//����һ���˵���
		JMenu fileMenu = new JMenu("�ļ�");//����һ���˵�
		
		menuBar.add(fileMenu);//��һ���˵���ӵ��˵���
		
		//"�ļ�"һ���˵����Ӳ˵�
		JMenuItem newMenuItem = new JMenuItem("��");
		fileMenu.add(newMenuItem);
		JMenuItem camMenuItem = new JMenuItem("��Ƶ");
		fileMenu.add(camMenuItem);
		
		newMenuItem.addActionListener(appL);
		camMenuItem.addActionListener(appL);
		
	    appframe.setJMenuBar(menuBar);
		//���ÿɼ�
		appframe.setVisible(true);
		//��ȡ����
		Graphics g = appframe.getGraphics();
		appL.setGraphics(g);
		System.out.println("appUI.g="+g);
		
	}
	
	
	public class RefreshThread extends Thread{
		
		JTextField numField;
		JTextField ageField;
//		String facenum = test.getface_num();
//		String agee = test.getAge();
		public void run() {
			while(true) {
				String facenum = test.getface_num();
				String agee = test.getAge();
				System.out.println("getfaceNum="+facenum);
				System.out.println("getAge="+agee);
				numField.setText("������Ŀ:"+facenum);
				ageField.setText("����:"+agee);
				if(appL.isOn == true) {
					 File file = new File("C:\\Users\\TANGNAN\\Desktop\\XdHackͼƬ\\"+appL.num+".png");
					 test.file = file;
					 test.method(file);
				}
			}
		}
	}
	
	  public static void main(String[] args) throws Exception {  
      		appUI appui = new appUI();
         	appui.showUI();
       } 
}
