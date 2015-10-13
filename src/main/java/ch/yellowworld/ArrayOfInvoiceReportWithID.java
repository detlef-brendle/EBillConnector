
package ch.yellowworld;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInvoiceReportWithID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInvoiceReportWithID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceReportWithID" type="{http://www.yellowworld.ch}InvoiceReportWithID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInvoiceReportWithID", propOrder = {
    "invoiceReportWithID"
})
public class ArrayOfInvoiceReportWithID {

    @XmlElement(name = "InvoiceReportWithID")
    protected List<InvoiceReportWithID> invoiceReportWithID;

    /**
     * Gets the value of the invoiceReportWithID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceReportWithID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceReportWithID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceReportWithID }
     * 
     * 
     */
    public List<InvoiceReportWithID> getInvoiceReportWithID() {
        if (invoiceReportWithID == null) {
            invoiceReportWithID = new ArrayList<InvoiceReportWithID>();
        }
        return this.invoiceReportWithID;
    }

}
