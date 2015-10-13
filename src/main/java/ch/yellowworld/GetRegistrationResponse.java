
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
 *         &lt;element name="GetRegistrationResult" type="{http://www.yellowworld.ch}ArrayOfDownloadFile" minOccurs="0"/>
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
    "getRegistrationResult"
})
@XmlRootElement(name = "GetRegistrationResponse")
public class GetRegistrationResponse {

    @XmlElement(name = "GetRegistrationResult")
    protected ArrayOfDownloadFile getRegistrationResult;

    /**
     * Gets the value of the getRegistrationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDownloadFile }
     *     
     */
    public ArrayOfDownloadFile getGetRegistrationResult() {
        return getRegistrationResult;
    }

    /**
     * Sets the value of the getRegistrationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDownloadFile }
     *     
     */
    public void setGetRegistrationResult(ArrayOfDownloadFile value) {
        this.getRegistrationResult = value;
    }

}
