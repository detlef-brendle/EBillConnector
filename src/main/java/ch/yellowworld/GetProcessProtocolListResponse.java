
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
 *         &lt;element name="GetProcessProtocolListResult" type="{http://www.yellowworld.ch}ArrayOfProtocolReport" minOccurs="0"/>
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
    "getProcessProtocolListResult"
})
@XmlRootElement(name = "GetProcessProtocolListResponse")
public class GetProcessProtocolListResponse {

    @XmlElement(name = "GetProcessProtocolListResult")
    protected ArrayOfProtocolReport getProcessProtocolListResult;

    /**
     * Gets the value of the getProcessProtocolListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProtocolReport }
     *     
     */
    public ArrayOfProtocolReport getGetProcessProtocolListResult() {
        return getProcessProtocolListResult;
    }

    /**
     * Sets the value of the getProcessProtocolListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProtocolReport }
     *     
     */
    public void setGetProcessProtocolListResult(ArrayOfProtocolReport value) {
        this.getProcessProtocolListResult = value;
    }

}
