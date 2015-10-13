
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
 *         &lt;element name="GetProcessProtocolResult" type="{http://www.yellowworld.ch}ArrayOfDownloadFile" minOccurs="0"/>
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
    "getProcessProtocolResult"
})
@XmlRootElement(name = "GetProcessProtocolResponse")
public class GetProcessProtocolResponse {

    @XmlElement(name = "GetProcessProtocolResult")
    protected ArrayOfDownloadFile getProcessProtocolResult;

    /**
     * Gets the value of the getProcessProtocolResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDownloadFile }
     *     
     */
    public ArrayOfDownloadFile getGetProcessProtocolResult() {
        return getProcessProtocolResult;
    }

    /**
     * Sets the value of the getProcessProtocolResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDownloadFile }
     *     
     */
    public void setGetProcessProtocolResult(ArrayOfDownloadFile value) {
        this.getProcessProtocolResult = value;
    }

}
