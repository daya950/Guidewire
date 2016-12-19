
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.claimapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.documentdto.DocumentDTO;


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
 *         &lt;element name="dto" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/DocumentDTO}DocumentDTO" minOccurs="0"/>
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
    "dto"
})
@XmlRootElement(name = "createDocument")
public class CreateDocument {

    protected DocumentDTO dto;

    /**
     * Gets the value of the dto property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDTO }
     *     
     */
    public DocumentDTO getDto() {
        return dto;
    }

    /**
     * Sets the value of the dto property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDTO }
     *     
     */
    public void setDto(DocumentDTO value) {
        this.dto = value;
    }

}
