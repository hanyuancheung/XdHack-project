import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

public class appListener implements ActionListener {

	int[][] data;
	JPanel appui;
    String shapeText;
	BufferedImage buffer= new BufferedImage(1000,800,BufferedImage.TYPE_INT_ARGB);
	Graphics bg = buffer.getGraphics();//������ڴ�
	private Graphics g;
	Test2 test2;
	TipUI tipui;
	int num = 1;//��Ƭ��Ŀ
	//��ȡ����ͷ
	Webcam cam = Webcam.getDefault();
	UploadThread upThread = new UploadThread();
	 public boolean isOn = false;//�Ƿ��Ѿ�������ͷ 
	
	
    
    public void setGraphics(Graphics g) {
    	this.g = g; 
    }
    
    public void load(File file) {
    	try {
    			//����ͼƬ
    			BufferedImage buffer = ImageIO.read(file);
    		    data = new int[buffer.getHeight()][buffer.getWidth()];
    			//��ȡͼƬ����
    		  //  appui.buffer=buffer;
    			for(int i=0;i<buffer.getHeight();i++) {
    				for(int j=0;j<buffer.getWidth();j++) {
    					data[i][j]=buffer.getRGB(j, i);
    				}
    			}
    			
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	
    	for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
			//	int value=data[i][j];
				Color color = new Color(data[i][j]);
				bg.setColor(color);
				bg.drawLine(j+80, i+80, j+80, i+80);
			}			
		}
		g.drawImage(buffer, 0, 0, null);
    	
    	}
	
    
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		shapeText = action;
		if("��".equals(action)) {
			File file = new Filedemo().openFile();
			test2.file=file;
			if(file==null) {
				return;
			}
			test2.method(file);
			load(file);
     //		test.showUI();
			tipui.showUI();
		}
		if("��Ƶ".equals(action)) {
			System.out.println("��Ƶ��");
			//upThread.start();
			isOn = true;
			cam(g);
			
		}
	}
	
	//����
		public void cam(Graphics g) {
			  
			  //��������ͷ�Ĵ�С
			  cam.setViewSize(WebcamResolution.VGA.getSize());
			  //������ͷ
			  cam.open();
			  
			  //��ȡͼ��
			  long start = System.currentTimeMillis();

//			  int num = 1;
			  for(int i=0;i<80;i++) {
				  
				  BufferedImage buffer = cam.getImage();
				ImgToArr(buffer);
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
						yuantu(g);
						
						
						//System.out.println(System.currentTimeMillis()-start);
				  if((System.currentTimeMillis()-start)/1000 == 4 ) {
					  BufferedImage img=cam.getImage();
					  System.out.println("��ɵ�һ��");
					  try {
						  ImageIO.write(img, "PNG", new File("C:\\Users\\TANGNAN\\Desktop\\XdHackͼƬ\\"+num+".png"));
						  System.out.print("��ɽ�ͼ");
//						  File file = new File("C:\\Users\\TANGNAN\\Desktop\\XdHackͼƬ\\"+num+".png");
//						  test2.file = file;
//						  test2.method(file);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					num += 1;
					start = System.currentTimeMillis();
				  }
			  }
			
			  //�ر�����ͷ
			  cam.close(); 
			
		}
		
		//ͼƬת����
		public void ImgToArr(BufferedImage img) {
			data = new int[img.getHeight()][img.getWidth()];
		    for(int i=0;i<img.getHeight();i++) {
		    	for(int j=0;j<img.getWidth();j++) {
		    		data[i][j]=img.getRGB(j, i);
		    	}
		    }
		}
		
		//ԭͼ
		public void yuantu(Graphics g) {
		
			
			//System.out.println("xx11");
			for(int i=0;i<data.length;i++) {
				for(int j=0;j<data[i].length;j++) {
					int value=data[i][j];
					Color color = new Color(data[i][j]);
					bg.setColor(color);
					bg.drawLine(j+120, i+80, j+120, i+80);
				
				}			
			}
			//���ƻ��浽������
			g.drawImage(buffer, 0, 0, null);
			//System.out.println(buffer+"buffeer");
			
		}
		
		public class UploadThread extends Thread{
			
			JTextField numField;
			JTextField ageField;
			
			public void run() {
				while(true) {
					// System.out.println("�߳��ѿ�");
					 File file = new File("C:\\Users\\TANGNAN\\Desktop\\XdHackͼƬ\\"+num+".png");
					 test2.file = file;
					 test2.method(file);
					
				}
			}
		