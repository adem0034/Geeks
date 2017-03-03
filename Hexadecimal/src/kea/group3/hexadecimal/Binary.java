package kea.group3.hexadecimal;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;


@Path("/binary")
public class Binary {
	 @GET
	  @Produces("application/json")
	  public Response convertFtoC() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		
		
		
//		jsonObject.put("result", value)
		
		String result = "@Produces(\"application/json\") Output: \n\nF Output in binary: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
	  @Path("{f}")
	  @GET
	  @Produces("application/json")
	  public Response convertFtoCfromInput(@PathParam("f") int number) throws JSONException {
		  		 
		JSONObject jsonObject = new JSONObject();
		
		
		
		List<Integer> binaryArray = new ArrayList<Integer>();						              		
		
		System.out.println("Im here");
		
		int i = 0;
		while(number > 0 )
		{
			binaryArray.add(number % 2);			
						
			System.out.println("Im here 51");
			
			number = number / 2; 
			i++;
		}		
		String resultString = "";
		for(int j = i - 1;j >= 0;j--)
		{					
			resultString += binaryArray.get(j);//			
		}
		

		jsonObject.put("result", resultString);
		String resulttxt = "@Produces(\"application/json\") Output: \n\nF Output in binary: \n\n" + jsonObject;
		return Response.status(200).entity(resulttxt).build();
	  }
}
