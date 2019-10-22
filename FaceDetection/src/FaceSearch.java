

import java.io.FileInputStream;
import java.util.*;

import org.json.JSONArray;
import org.json.JSONObject;

/**
* ��������
*/
public class FaceSearch {
	
	static String string = null;

    /**
    * ��Ҫ��ʾ���������蹤����
    * FileUtil,Base64Util,HttpUtil,GsonUtils���
    * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
    * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
    * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
    * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
    * ����
    */
    public static String search() {
        // ����url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/search";
        try {
            Map<String, Object> map = new HashMap<>();
            
          //��ȡ�ļ�������
        	FileInputStream in = new FileInputStream("C:\\Users\\TANGNAN\\Desktop\\����\\002.png");
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
            map.put("group_id_list", "TEST");
            map.put("image_type", "BASE64");
            map.put("quality_control", "LOW");

            String param = GsonUtils.toJson(map);

            // ע�������Ϊ�˼򻯱���ÿһ������ȥ��ȡaccess_token�����ϻ���access_token�й���ʱ�䣬 �ͻ��˿����л��棬���ں����»�ȡ��
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
            String user_id = json3.getString("user_id");
            System.out.println("user_id="+user_id);

            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        FaceSearch.search();
    }
}