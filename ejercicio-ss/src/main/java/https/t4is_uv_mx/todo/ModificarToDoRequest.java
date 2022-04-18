package https.t4is_uv_mx.todo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "status"
})
@XmlRootElement(name = "ModificarToDoRequest")
public class ModificarToDoRequest {

    protected int id;
    @XmlElement(required = true)
    protected String status;

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

    /**
     * Obtiene status
     * 
     * @return
     *     possible object id
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define stats
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
