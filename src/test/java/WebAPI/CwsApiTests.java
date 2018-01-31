package WebAPI;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.hamcrest.Matchers.*;
import com.jayway.restassured.path.json.*;
import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;
import com.jayway.restassured.specification.RequestSpecification;

/*import org.json.JSONArray;
import org.json.JSONException;*/
import org.apache.commons.httpclient.HttpClient;
import org.apache.http.client.ClientProtocolException;

public class CwsApiTests extends CwsApiHttpClient{

	String url="http://wof-extsvc-stg.corpstg1.jmfamily.com/ExternalServices/ExternalServices.svc";
			
	//@Test
	//public void 
	
	
}
