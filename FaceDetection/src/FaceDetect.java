

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;


/**
* 人脸检测与属性分析
*/
public class FaceDetect {
	

	  static String result;

    /**
    * 重要提示代码中所需工具类
    * FileUtil,Base64Util,HttpUtil,GsonUtils请从
    * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
    * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
    * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
    * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
    * 下载
    */
    public static String detect() {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/detect";
        try {
            Map<String, Object> map = new HashMap<>();
            
          //获取文件输入流
        	FileInputStream in = new FileInputStream("C:\\Users\\TANGNAN\\Desktop\\7.png");
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
            map.put("face_field", "faceshape,facetype,beauty,age");
            map.put("image_type", "BASE64");

            String param = GsonUtils.toJson(map);

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = "24.673ec57889a7e0f856747cd2f6e969a2.2592000.1573384420.282335-16895093";

            String result = HttpUtil.post(url, accessToken, "application/json", param);
            System.out.println(result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

   /* public static void main(String[] args) throws Exception{
        detect();
     
        System.out.println("result="+result);
        JSONObject json = new JSONObject(result);
        String beauty = json.getString("beauty");
	    System.out.println(beauty); 
    }*/
}





/*      JSONObject jObj1;
try {
	 JSONObject jObj = new JSONObject(result);
        Result res=new Result();
        String beauty=jObj.getString("beauty");
        res.setBeauty(beauty);
        Location location = new Location();
	jObj1 = jObj.getJSONObject("location");
	 String left = jObj1.getString("left");
	 location.setLeft(left);
	 
	 String top = jObj1.getString("top");
	 location.setTop(top);
	 
	 String width = jObj1.getString("width");
	 location.setWidth(width);
	 
	 String height = jObj1.getString("height");
	 location.setHeight(height);
	 
	 res.setLocation(location);
	 System.out.println(res);
	 
} catch (JSONException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}        */