
package ch.yellowworld;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNotProcessedInvoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNotProcessedInvoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotProcessedInvoice" type="{http://www.yellowworld.ch}NotProcessedInvoice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNotProcessedInvoice", propOrder = {
    "notProcessedInvoice"
})
public class ArrayOfNotProcessedInvoice {

    @XmlElement(name = "NotProcessedInvoice")
    protected List<NotProcessedInvoice> notProcessedInvoice;

    /**
     * Gets the value of the notProcessedInvoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notProcessedInvoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotProcessedInvoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotProcessedInvoice }
     * 
     * 
     */
    public List<NotProcessedInvoice> getNotProcessedInvoice() {
        if (notProcessedInvoice == null) {
            notProcessedInvoice = new ArrayList<NotProcessedInvoice>();
        }
        return this.notProcessedInvoice;
    }

}
