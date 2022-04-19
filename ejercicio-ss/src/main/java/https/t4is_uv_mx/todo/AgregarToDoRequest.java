package https.t4is_uv_mx.todo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


//bryanduran
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "toDo"
})
@XmlRootElement(name = "AgregarToDoRequest")
public class AgregarToDoRequest {

    @XmlElement(required = true)
    protected List<AgregarToDoRequest.ToDo> toDo;

    
    public List<AgregarToDoRequest.ToDo> getToDo() {
        if (toDo == null) {
            toDo = new ArrayList<AgregarToDoRequest.ToDo>();
        }
        return this.toDo;
    }


    /
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tarea",
        "status"
    })
    public static class ToDo {

        @XmlElement(required = true)
        protected String tarea;
        @XmlElement(required = true)
        protected String status;

        /**
         * Obtiene taea
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarea() {
            return tarea;
        }

        /**
         * Define tarea
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarea(String value) {
            this.tarea = value;
        }

        /**
         * Obtiene status
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Define status
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

}
