

package https.t4is_uv_mx.todo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "toDo"
})
@XmlRootElement(name = "BuToDosResponse")
public class BuToDosResponse {

    @XmlElement(required = true)
    protected List<BuToDosResponse.ToDo> toDo;

    /
    public List<BuToDosResponse.ToDo> getToDo() {
        if (toDo == null) {
            toDo = new ArrayList<BuToDosResponse.ToDo>();
        }
        return this.toDo;
    }


    /
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "tarea",
        "status"
    })
    public static class ToDo {

        protected int id;
        @XmlElement(required = true)
        protected String tarea;
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
         * Obtiene trea
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
