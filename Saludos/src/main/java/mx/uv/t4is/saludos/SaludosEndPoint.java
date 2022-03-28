package mx.uv.t4is.saludos;

import java.util.ArrayList;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.saludos.BorrarSaludoRequest;
import https.t4is_uv_mx.saludos.BorrarSaludoResponse;
import https.t4is_uv_mx.saludos.BuscarSaludosResponse;
import https.t4is_uv_mx.saludos.ModificarSaludoRequest;
import https.t4is_uv_mx.saludos.ModificarSaludoResponse;
import https.t4is_uv_mx.saludos.SaludarRequest;
import https.t4is_uv_mx.saludos.SaludarResponse;
import https.t4is_uv_mx.saludos.BuscarSaludosResponse.Saludos;
//bryan duran cuellar
@Endpoint 
public class SaludosEndPoint {

	ArrayList<Saludos> lista = new ArrayList<>();
	private int i = 1;

	@PayloadRoot(namespace = "https://t4is.uv.mx/saludos",localPart = "SaludarRequest")
	@ResponsePayload
	public SaludarResponse saludar (@RequestPayload SaludarRequest nombre){
		SaludarResponse respuesta = new SaludarResponse();
		respuesta.setRespuesta("Hola "+nombre.getNombre());

		Saludos e = new Saludos();
		e.setId(i++);
		e.setNombre(nombre.getNombre());
		lista.add(e);

		return respuesta;
		//agregar un saludo a la lista
	}

	@PayloadRoot(namespace = "https://t4is.uv.mx/saludos", localPart = "BuscarSaludoRequest")
	@ResponsePayload
	public BuscarSaludosResponse buscar(){
		BuscarSaludosResponse respuesta = new BuscarSaludosResponse();
		for(Saludos s : lista){
			/*System.out.println(s);
			Saludos e = new Saludos();
			e.setNombre(s);*/
			respuesta.getSaludos().add(s);
		}
		return respuesta;
	}

	@PayloadRoot(namespace = "https://t4is.uv.mx/saludos", localPart = "BuscarSaludoRequest")
	@ResponsePayload
	public ModificarSaludoResponse modificar(@RequestPayload ModificarSaludoRequest peticion){
		ModificarSaludoResponse respuesta = new ModificarSaludoResponse();
		Saludos e = new Saludos();
		e.setNombre(peticion.getNombre());
		e.setId(peticion.getId()-1);
		lista.set(peticion.getId(), e);
		respuesta.setRespuesta(true);
		return respuesta;
	}
	@PayloadRoot(namespace = "https://t4is.uv.mx/saludos", localPart = "BorrarSaludoRequest")
	@ResponsePayload
	public BorrarSaludoResponse modificar(@RequestPayload BorrarSaludoRequest peticion){
		BorrarSaludoResponse respuesta = new BorrarSaludoResponse();
		Saludos e = new Saludos();

		e.setId(peticion.getId());
		lista.remove(peticion.getId()-1);
		respuesta.setRespuesta(true);
		
		return respuesta;
}
}