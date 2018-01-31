package WebAPI;

import static com.jayway.restassured.RestAssured.given;

import java.io.IOException;
import org.apache.http.client.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.*;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;

import com.jayway.restassured.response.Response;

public class CwsApiHttpClient {
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void get(String url) throws ClientProtocolException, IOException{
		
		HttpClient client=new DefaultHttpClient();
		;
		HttpGet request=new HttpGet(url);
		HttpResponse response=client.execute(request);
		int responseCode=response.getStatusLine().getStatusCode();
		System.out.println("Response Code: " + responseCode);
		
		String responseString = EntityUtils.toString(response.getEntity(), "UTF-8");
		JSONObject responseJson = new JSONObject(responseString);
	}
	@Test
	public void retail() {
		response = 
				given().
				param("tem:webId", "894082").
				param("tem:accountNumber", "001999999999999981").
				when().
				get("http://wof-extsvc-stg.corpstg1.jmfamily.com/ExternalServices/ExternalServices.svc").
				then().statusCode(200).log().all();
	}
}