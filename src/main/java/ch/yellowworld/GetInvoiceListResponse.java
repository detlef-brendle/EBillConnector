
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
 *         &lt;element name="GetInvoiceListResult" type="{http://www.yellowworld.ch}ArrayOfReport" minOccurs="0"/>
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
    "getInvoiceListResult"
})
@XmlRootElement(name = "GetInvoiceListResponse")
public class GetInvoiceListResponse {

    @XmlElement(name = "GetInvoiceListResult")
    protected ArrayOfReport getInvoiceListResult;

    /**
     * Gets the value of the getInvoiceListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReport }
     *     
     */
    public ArrayOfReport getGetInvoiceListResult() {
        return getInvoiceListResult;
    }

    /**
     * Sets the value of the getInvoiceListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReport }
     *     
     */
    public void setGetInvoiceListResult(ArrayOfReport value) {
        this.getInvoiceListResult = value;
    }

}
