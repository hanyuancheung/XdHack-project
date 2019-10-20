import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.json.JSONArray;
import org.json.JSONObject;
import javax.swing.JComponent;

public class  Test2 extends JFrame{  
	     File file;
	 	 String string = null;
	 	 String beauty;
	 	 String age;
	 	 String face_num;
	 	 TipUI tipui;
	 	
	 	 public String getBeauty() {
	 		 return beauty;
	 	 }
	 	 
	 	 public String getAge() {
	 		 return age;
	 	 }
	 	 
	 	 public String getface_num() {
	 		 return face_num;
	 	 }
	 	 
	    public void method(File file) {
	    	
	   	 // 请求url
            String url = "https://aip.baidubce.com/rest/2.0/face/v3/detect";
            try {
                Map<String, Object> map = new HashMap<>();
                
                //获取文件输入流
            	FileInputStream in = new FileInputStream(file);

            	//获取文件长度
            	int length = in.available();
            	//创建字节数组
            	byte[] fileContent = new byte[length];
            	//读取文件
            	in.read(fileContent);
            	//关闭流
            	in.close();

                String imgstr = Base64Util.encode(fileContent);
                map.put("image", imgstr);
                map.put("face_field", "faceshape,facetype,beauty,age,eye_status");
                map.put("image_type", "BASE64");

                String param = GsonUtils.toJson(map);

                // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
                String accessToken = "24.673ec57889a7e0f856747cd2f6e969a2.2592000.1573384420.282335-16895093";

                String result = HttpUtil.post(url, accessToken, "application/json", param);
                System.out.println("11result="+result);
                JSONObject jsonObject = new JSONObject(result);
                String result1 = jsonObject.getString("result");
                System.out.println("result1="+result1);
                
                JSONObject json1 = new JSONObject(result1);
                String face_list1 = json1.getString("face_list");
                System.out.println("face_list1="+face_list1);
                
                
                face_num = json1.getString("face_num");
                System.out.println("face_num="+face_num);
                
                JSONArray json2 = new JSONArray(face_list1);
                int length1 = json2.length();
                for(int n=0;n<length1;n++) {
                	 string = json2.getString(n);
                	System.out.println("string="+string);
                }
                
                
                
                JSONObject json3 = new JSONObject(string);
//                String face_num = json3.getString("face_num");
//                System.out.println("face_num="+face_num);
                
                String face_type = json3.getString("face_type");
         //       System.out.println("face_type="+face_type);
                String location = json3.getString("location");
          //      System.out.println("location="+location);
                String angle = json3.getString("angle");
           //     System.out.println("angel="+angle);
                beauty = json3.getString("beauty");
            //    System.out.println("beauty="+beauty);
                 age = json3.getString("age");
            //    System.out.println("age="+age);
                String face_probability = json3.getString("face_probability");
            //    System.out.println("face_probability="+face_probability);   
                
                JSONObject json4 = new JSONObject(location);
                String top = json4.getString("top");//距离顶部的距离
                System.out.println("top="+top);
                String left = json4.getString("left");//距离左端的距离
                System.out.println("left="+left);
                String rotation = json4.getString("rotation");//顺时针倾斜的角度
             //   System.out.println("rotation="+rotation);
                String width = json4.getString("width");//宽度
             //   System.out.println("width="+width);
                String height = json4.getString("height");//高度
            //    System.out.println("height="+height);
             
                
//                JSONArray json5 = new JSONArray(location);
//                int length5 = json5.length();
//                for(int n=0;n<length5;n++) {
//                	 string = json5.getString(n);
//                	System.out.println("string="+string);
//                }
                
         
             //   tipui.setBeauty(beauty);
                
              
            } catch (Exception e) {
                e.printStackTrace();
            }
	    	
	    }
	
	    public void showUI() {
			JFrame tipframe = new JFrame();
			//设置属性
			tipframe.setTitle("Meitu Design By TangNan");
			tipframe.setSize(600, 400);
			tipframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tipframe.setLocationRelativeTo(null);
			
			FlowLayout flowl = new FlowLayout();//流式布局
			tipframe.setLayout(flowl);
		
			
		
			ImageIcon image =new ImageIcon(getClass().getResource("resources/月色真美.png"));
			
			int width = tipframe.getWidth();// 获取图片组件宽
			int height = tipframe.getHeight();
		
			
//			JLabel iconLabel = new JLabel(image);
//			tipframe.add(iconLabel);
			
			
			//生命提示框
			JTextField textField = new JTextField(20);//20为输入框宽度
			Dimension inputsize = new Dimension(150, 50);// 大小，只能规定高度
			textField.setPreferredSize(inputsize);
			textField.setEditable(false);
			textField.setText("");
			tipframe.add(textField);
			
			
			tipframe.setVisible(true);
		
			Graphics g = tipframe.getGraphics();
			System.out.println("Test2.g="+g);
			System.out.println("image="+image);
			System.out.println("width="+width);
		    g.drawImage(image.getImage(), 0, 0, width , height, null);
		}
	
	  
       
    }  