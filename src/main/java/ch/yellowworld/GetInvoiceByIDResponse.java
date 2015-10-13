
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
 *         &lt;element name="GetInvoiceByIDResult" type="{http://www.yellowworld.ch}DownloadFile"/>
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
    "getInvoiceByIDResult"
})
@XmlRootElement(name = "GetInvoiceByIDResponse")
public class GetInvoiceByIDResponse {

    @XmlElement(name = "GetInvoiceByIDResult", required = true)
    protected DownloadFile getInvoiceByIDResult;

    /**
     * Gets the value of the getInvoiceByIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link DownloadFile }
     *     
     */
    public DownloadFile getGetInvoiceByIDResult() {
        return getInvoiceByIDResult;
    }

    /**
     * Sets the value of the getInvoiceByIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DownloadFile }
     *     
     */
    public void setGetInvoiceByIDResult(DownloadFile value) {
        this.getInvoiceByIDResult = value;
    }

}
