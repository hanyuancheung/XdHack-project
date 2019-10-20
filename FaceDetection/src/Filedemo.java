import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Filedemo {
	BufferedImage img;
	Graphics g;
	public File openFile(){
		//指定从桌面打开
		JFileChooser filechoose = new JFileChooser(new File("C:\\Users\\TANGNAN\\Desktop"));
		//文件过滤器
		FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg","png");
		filechoose.setFileFilter(filter);
		
		//获取返回值
		int returnVal = filechoose.showOpenDialog(null);//用于显示我们选择文件时弹出的框（文件导航窗）
	
		//获取选中对象
		if(returnVal == JFileChooser.APPROVE_OPTION){
			File file = filechoose.getSelectedFile();
			System.out.println(file.getAbsolutePath());
			return file;
			}
		return null;
		}
	
	


//	public void saveFile(){
//		
//		//指定从桌面打开
//		JFileChooser chooser = new JFileChooser(new File("C:\\Users\\TANGNAN\\Desktop"));
//		//文件过滤器
//		FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg","png");
//		chooser.setFileFilter(filter);
//	 int returnVal = chooser.showSaveDialog(null);
//		//获取选中对象
//		if(returnVal == JFileChooser.APPROVE_OPTION){
//			File file = chooser.getSelectedFile();
//			System.out.println(file.getAbsolutePath());
//			//BufferedImage img =  new BufferedImage(1000,700,BufferedImage.TYPE_INT_RGB);
//			
//			try {
//				ImageIO.write(te.buffer,"png",chooser.getSelectedFile());
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}	
//		}
//	}
	
}
