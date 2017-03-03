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


@Path("/hex")
public class Hex {

	 @GET
	  @Produces("application/json")
	  public Response convertFtoC() throws JSONException {

		JSONObject jsonObject = new JSONObject();

		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
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
			binaryArray.add(number % 16);													
			number = number / 16; 
			i++;
		}
		
		String resultString = "";
		for(int j = i - 1;j >= 0;j--)
		{
			System.out.println(binaryArray.get(j));
			if(binaryArray.get(j) == 10)
			{
				resultString += "A";	
			}
			else if(binaryArray.get(j) == 11)
			{
				resultString += "B";
			}
			else if(binaryArray.get(j) == 12)
			{
				resultString += "C";
			}
			else if(binaryArray.get(j) == 13)
			{
				resultString += "D";
			}
			else if(binaryArray.get(j) == 14)
			{
				resultString += "E";
			}
			else if(binaryArray.get(j) == 15)
			{
				resultString += "F";
			}
			else {
				resultString += String.valueOf(binaryArray.get(j));
			}
						
		}

		
		jsonObject.put("result", resultString);
		String resulttxt = "@Produces(\"application/json\") Output: \n\nF Output in hex: \n\n" + jsonObject;
		return Response.status(200).entity(resulttxt).build();
	  }
}
