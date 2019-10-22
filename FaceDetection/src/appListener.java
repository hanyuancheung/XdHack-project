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
	Graphics bg = buffer.getGraphics();//缓存进内存
	private Graphics g;
	Test2 test2;
	TipUI tipui;
	int num = 1;//相片数目
	//获取摄像头
	Webcam cam = Webcam.getDefault();
	UploadThread upThread = new UploadThread();
	 public boolean isOn = false;//是否已经打开摄像头 
	
	
    
    public void setGraphics(Graphics g) {
    	this.g = g; 
    }
    
    public void load(File file) {
    	try {
    			//加载图片
    			BufferedImage buffer = ImageIO.read(file);
    		    data = new int[buffer.getHeight()][buffer.getWidth()];
    			//获取图片数据
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
		if("打开".equals(action)) {
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
		if("视频".equals(action)) {
			System.out.println("视频打开");
			//upThread.start();
			isOn = true;
			cam(g);
			
		}
	}
	
	//摄像
		public void cam(Graphics g) {
			  
			  //设置摄像头的大小
			  cam.setViewSize(WebcamResolution.VGA.getSize());
			  //打开摄像头
			  cam.open();
			  
			  //获取图像
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
					  System.out.println("完成第一步");
					  try {
						  ImageIO.write(img, "PNG", new File("C:\\Users\\TANGNAN\\Desktop\\XdHack图片\\"+num+".png"));
						  System.out.print("完成截图");
//						  File file = new File("C:\\Users\\TANGNAN\\Desktop\\XdHack图片\\"+num+".png");
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
			
			  //关闭摄像头
			  cam.close(); 
			
		}
		
		//图片转数组
		public void ImgToArr(BufferedImage img) {
			data = new int[img.getHeight()][img.getWidth()];
		    for(int i=0;i<img.getHeight();i++) {
		    	for(int j=0;j<img.getWidth();j++) {
		    		data[i][j]=img.getRGB(j, i);
		    	}
		    }
		}
		
		//原图
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
			//绘制缓存到窗体上
			g.drawImage(buffer, 0, 0, null);
			//System.out.println(buffer+"buffeer");
			
		}
		
		public class UploadThread extends Thread{
			
			JTextField numField;
			JTextField ageField;
			
			public void run() {
				while(true) {
					// System.out.println("线程已开");
					 File file = new File("C:\\Users\\TANGNAN\\Desktop\\XdHack图片\\"+num+".png");
					 test2.file = file;
					 test2.method(file);
					
				}
			}
		