import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class SearchTest {
	
	String string = null;
	String user_id;
	String score;
	
	 public String getUserId() {
 		 return user_id;
 	 }

	 public String getScore() {
		 return score;
	 }
	 
	public void method(File file) {
    	
		String url = "https://aip.baidubce.com/rest/2.0/face/v3/search";
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
            map.put("group_id_list", "TEST");
            map.put("image_type", "BASE64");
            map.put("quality_control", "LOW");

            String param = GsonUtils.toJson(map);

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = "24.673ec57889a7e0f856747cd2f6e969a2.2592000.1573384420.282335-16895093";

            String result = HttpUtil.post(url, accessToken, "application/json", param);
            System.out.println(result);
          
            //return result;
            System.out.println("11result="+result);
            JSONObject jsonObject = new JSONObject(result);
            String result1 = jsonObject.getString("result");
            System.out.println("result1="+result1);
            String error_msg = jsonObject.getString("error_msg");
            System.out.println("error="+error_msg);
            
            JSONObject json1 = new JSONObject(result1);
            String user_list = json1.getString("user_list");
            System.out.println("user_list="+user_list);
            
            JSONArray json2 = new JSONArray(user_list);
            int length1 = json2.length();
            for(int n=0;n<length1;n++) {
            	 string = json2.getString(n);
            	System.out.println("string="+string);
            }
            
            JSONObject json3 = new JSONObject(string);
            user_id = json3.getString("user_id");
            System.out.println("user_id="+user_id);
            
            
            score = json3.getString("score");
            System.out.println("score="+score);
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
	    	
	    }
	
	
	
	
}
