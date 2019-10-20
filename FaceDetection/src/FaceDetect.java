

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;


/**
* ������������Է���
*/
public class FaceDetect {
	

	  static String result;

    /**
    * ��Ҫ��ʾ���������蹤����
    * FileUtil,Base64Util,HttpUtil,GsonUtils���
    * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
    * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
    * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
    * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
    * ����
    */
    public static String detect() {
        // ����url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/detect";
        try {
            Map<String, Object> map = new HashMap<>();
            
          //��ȡ�ļ�������
        	FileInputStream in = new FileInputStream("C:\\Users\\TANGNAN\\Desktop\\7.png");
        	//��ȡ�ļ�����
        	int length = in.available();
        	//�����ֽ�����
        	byte[] fileContent = new byte[length];
        	//��ȡ�ļ�
        	in.read(fileContent);
        	//�ر���
        	in.close();

            String imgstr = Base64Util.encode(fileContent);
            map.put("image", imgstr);
            map.put("face_field", "faceshape,facetype,beauty,age");
            map.put("image_type", "BASE64");

            String param = GsonUtils.toJson(map);

            // ע�������Ϊ�˼򻯱���ÿһ������ȥ��ȡaccess_token�����ϻ���access_token�й���ʱ�䣬 �ͻ��˿����л��棬���ں����»�ȡ��
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