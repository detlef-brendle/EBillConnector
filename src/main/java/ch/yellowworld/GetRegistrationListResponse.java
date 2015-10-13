
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
 *         &lt;element name="GetRegistrationListResult" type="{http://www.yellowworld.ch}ArrayOfProtocolReport" minOccurs="0"/>
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
    "getRegistrationListResult"
})
@XmlRootElement(name = "GetRegistrationListResponse")
public class GetRegistrationListResponse {

    @XmlElement(name = "GetRegistrationListResult")
    protected ArrayOfProtocolReport getRegistrationListResult;

    /**
     * Gets the value of the getRegistrationListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProtocolReport }
     *     
     */
    public ArrayOfProtocolReport getGetRegistrationListResult() {
        return getRegistrationListResult;
    }

    /**
     * Sets the value of the getRegistrationListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProtocolReport }
     *     
     */
    public void setGetRegistrationListResult(ArrayOfProtocolReport value) {
        this.getRegistrationListResult = value;
    }

}
