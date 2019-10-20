import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TipUI extends JFrame {
	String beauty;
	String age;
	Test2 test =new Test2();
	ImageIcon image =new ImageIcon(getClass().getResource("resources/��ɫ����.png"));
	int width;
	int height;

	public void setBeauty(String beauty) {
		this.beauty=beauty;
	}
	
	public void showUI() {
		TipUI tipframe = new TipUI();
		//��������
		tipframe.setTitle("Meitu Design By TangNan");
		tipframe.setSize(600, 400);
		tipframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tipframe.setLocationRelativeTo(null);
		
		FlowLayout flowl = new FlowLayout();//��ʽ����
		tipframe.setLayout(flowl);
		
		
		
		 width = tipframe.getWidth();// ��ȡͼƬ�����
		 System.out.println("tip.width="+width);
		 height = tipframe.getHeight();
	
		
		
//		JLabel iconLabel = new JLabel(image);
//		tipframe.add(iconLabel);
		
		
		//������ʾ��
		JTextField textField = new JTextField(30);//20Ϊ�������
		Dimension inputsize = new Dimension(150, 50);// ��С��ֻ�ܹ涨�߶�
		textField.setPreferredSize(inputsize);
		textField.setEditable(false);
		textField.setText("");
		tipframe.add(textField);
		beauty=test.getBeauty();
		textField.setText("��ֵ:"+beauty);	
		
		JTextField textField2 = new JTextField(30);//20Ϊ�������
		textField2.setPreferredSize(inputsize);
		textField2.setEditable(false);
		textField2.setText("");
		tipframe.add(textField2);
		age=test.getAge();
		textField2.setText("����:"+age);	
		
		
		tipframe.setVisible(true);
		
		Graphics g = tipframe.getGraphics();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	    g.drawImage(image.getImage(), 0, 0, width , height, this);
	
		
	}
	

	
	public void paint(Graphics g) {
		 super.paint(g);
	     width=getWidth();
		 height=getHeight();
		// g.drawImage(image.getImage(), 0, 0, width , height, this);
		 
	}
	
}
