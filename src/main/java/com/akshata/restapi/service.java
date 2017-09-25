package com.akshata.restapi;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.google.gson.Gson;
import com.akshata.restapi.ProductDAOimpl;

@Path("/Product")
public class service 
{
	@GET
	@Path("/productdetails")
	@Produces("application/json")
	public String getProductDetails()
	{
		String ProductDetails=null;
		List productList=null;
		
		ProductDAOimpl productdaoimpl=new ProductDAOimpl();
		productList=productdaoimpl.getProductDetails();
		Gson gson=new Gson();
		ProductDetails=gson.toJson(productList);
		return ProductDetails;
	}
}
