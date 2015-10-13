
package ch.yellowworld;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetInvoiceListWithIDsResult" type="{http://www.yellowworld.ch}ArrayOfInvoiceReportWithID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getInvoiceListWithIDsResult"
})
@XmlRootElement(name = "GetInvoiceListWithIDsResponse")
public class GetInvoiceListWithIDsResponse {

    @XmlElement(name = "GetInvoiceListWithIDsResult")
    protected ArrayOfInvoiceReportWithID getInvoiceListWithIDsResult;

    /**
     * Gets the value of the getInvoiceListWithIDsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvoiceReportWithID }
     *     
     */
    public ArrayOfInvoiceReportWithID getGetInvoiceListWithIDsResult() {
        return getInvoiceListWithIDsResult;
    }

    /**
     * Sets the value of the getInvoiceListWithIDsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvoiceReportWithID }
     *     
     */
    public void setGetInvoiceListWithIDsResult(ArrayOfInvoiceReportWithID value) {
        this.getInvoiceListWithIDsResult = value;
    }

}
