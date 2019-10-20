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
	ImageIcon image =new ImageIcon(getClass().getResource("resources/月色真美.png"));
	int width;
	int height;

	public void setBeauty(String beauty) {
		this.beauty=beauty;
	}
	
	public void showUI() {
		TipUI tipframe = new TipUI();
		//设置属性
		tipframe.setTitle("Meitu Design By TangNan");
		tipframe.setSize(600, 400);
		tipframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tipframe.setLocationRelativeTo(null);
		
		FlowLayout flowl = new FlowLayout();//流式布局
		tipframe.setLayout(flowl);
		
		
		
		 width = tipframe.getWidth();// 获取图片组件宽
		 System.out.println("tip.width="+width);
		 height = tipframe.getHeight();
	
		
		
//		JLabel iconLabel = new JLabel(image);
//		tipframe.add(iconLabel);
		
		
		//生命提示框
		JTextField textField = new JTextField(30);//20为输入框宽度
		Dimension inputsize = new Dimension(150, 50);// 大小，只能规定高度
		textField.setPreferredSize(inputsize);
		textField.setEditable(false);
		textField.setText("");
		tipframe.add(textField);
		beauty=test.getBeauty();
		textField.setText("颜值:"+beauty);	
		
		JTextField textField2 = new JTextField(30);//20为输入框宽度
		textField2.setPreferredSize(inputsize);
		textField2.setEditable(false);
		textField2.setText("");
		tipframe.add(textField2);
		age=test.getAge();
		textField2.setText("年龄:"+age);	
		
		
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
