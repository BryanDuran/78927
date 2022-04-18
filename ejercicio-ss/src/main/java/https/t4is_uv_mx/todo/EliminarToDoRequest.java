package https.t4is_uv_mx.todo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id"
})
@XmlRootElement(name = "EliminarToDoRequest")
public class EliminarToDoRequest {

    protected int id;

    /**
     * Obtiene id
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define id
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
