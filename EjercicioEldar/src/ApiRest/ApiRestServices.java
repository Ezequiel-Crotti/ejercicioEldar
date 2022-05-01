package ApiRest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import Tarjetas.Amex;
import Tarjetas.Nara;
import Tarjetas.Visa;
 

@Path("/tasa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ApiRestServices {

	@GET
	public Response consultaTasa(@PathParam("importe") int importe, @PathParam("marca") String marca) {
		double result = 0;
		switch (marca){
			case "Visa":
				Visa visa = new Visa();
				result = visa.calculoTasa(importe);
				//return Response.ok(resultVisa, MediaType.APPLICATION_JSON).build();
			case "Amex":
				Amex amex = new Amex();
				result = amex.calculoTasa(importe);
				//return Response.ok(resultAmex, MediaType.APPLICATION_JSON).build();
			case "Nara":
				Nara nara = new Nara();
				result = nara.calculoTasa(importe);
				//return Response.ok(resultNara, MediaType.APPLICATION_JSON).build();
		}
		return Response.ok(result, MediaType.APPLICATION_JSON).build();
	}
}
