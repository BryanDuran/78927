


package https.t4is_uv_mx.todo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "respuesta"
})
@XmlRootElement(name = "EliminarToDoResponse")
public class EliminarToDoResponse {

    protected boolean respuesta;

    /**
     * Obtiene respesta
     * 
     */
    public boolean isRespuesta() {
        return respuesta;
    }

    /**
     * Define respuesta
     * 
     */
    public void setRespuesta(boolean value) {
        this.respuesta = value;
    }

}
