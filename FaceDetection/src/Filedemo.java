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
		//ָ���������
		JFileChooser filechoose = new JFileChooser(new File("C:\\Users\\TANGNAN\\Desktop"));
		//�ļ�������
		FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg","png");
		filechoose.setFileFilter(filter);
		
		//��ȡ����ֵ
		int returnVal = filechoose.showOpenDialog(null);//������ʾ����ѡ���ļ�ʱ�����Ŀ��ļ���������
	
		//��ȡѡ�ж���
		if(returnVal == JFileChooser.APPROVE_OPTION){
			File file = filechoose.getSelectedFile();
			System.out.println(file.getAbsolutePath());
			return file;
			}
		return null;
		}
	
	


//	public void saveFile(){
//		
//		//ָ���������
//		JFileChooser chooser = new JFileChooser(new File("C:\\Users\\TANGNAN\\Desktop"));
//		//�ļ�������
//		FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg","png");
//		chooser.setFileFilter(filter);
//	 int returnVal = chooser.showSaveDialog(null);
//		//��ȡѡ�ж���
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
