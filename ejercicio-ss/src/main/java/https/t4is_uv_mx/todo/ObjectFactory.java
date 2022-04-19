


package https.t4is_uv_mx.todo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerToDosRequest_QNAME = new QName("https://t4is.uv.mx/todo", "ObtenerToDosRequest");

     
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarToDoRequest }
     * 
     */
    public AgregarToDoRequest createAgregarToDoRequest() {
        return new AgregarToDoRequest();
    }

    /**
     * Create an instance of {@link ObtenerToDosResponse }
     * 
     */
    public ObtenerToDosResponse createObtenerToDosResponse() {
        return new ObtenerToDosResponse();
    }

    /**
     * Create an instance of {@link AgregarToDoRequest.ToDo }
     * 
     */
    public AgregarToDoRequest.ToDo createAgregarToDoRequestToDo() {
        return new AgregarToDoRequest.ToDo();
    }

    /**
     * Create an instance of {@link AgregarToDoResponse }
     * 
     */
    public AgregarToDoResponse createAgregarToDoResponse() {
        return new AgregarToDoResponse();
    }

    /**
     * Create an instance of {@link ObtenerToDosResponse.ToDo }
     * 
     */
    public ObtenerToDosResponse.ToDo createObtenerToDosResponseToDo() {
        return new ObtenerToDosResponse.ToDo();
    }

    /**
     * Create an instance of {@link EliminarToDoRequest }
     * 
     */
    public EliminarToDoRequest createEliminarToDoRequest() {
        return new EliminarToDoRequest();
    }

    /**
     * Create an instance of {@link EliminarToDoResponse }
     * 
     */
    public EliminarToDoResponse createEliminarToDoResponse() {
        return new EliminarToDoResponse();
    }

    /**
     * Create an instance of {@link ModificarToDoRequest }
     * 
     */
    public ModificarToDoRequest createModificarToDoRequest() {
        return new ModificarToDoRequest();
    }

    /**
     * Create an instance of {@link ModificarToDoResponse }
     * 
     */
    public ModificarToDoResponse createModificarToDoResponse() {
        return new ModificarToDoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/todo", name = "ObtenerToDosRequest")
    public JAXBElement<Object> createObtenerToDosRequest(Object value) {
        return new JAXBElement<Object>(_ObtenerToDosRequest_QNAME, Object.class, null, value);
    }

}
