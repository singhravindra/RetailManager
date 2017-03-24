package RESTAPI.RetailManager.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import RESTAPI.RetailManager.model.ErrorMessage;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable exception) {
		// TODO Auto-generated method stub
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), 500);
		
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
	}

	
}