
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.claimapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.activitydto.ActivityDTO;


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
 *         &lt;element name="dto" type="{http://guidewire.com/cc/ws/gw/webservice/cc/cc801/dto/ActivityDTO}ActivityDTO" minOccurs="0"/>
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
@XmlRootElement(name = "createActivity")
public class CreateActivity {

    protected ActivityDTO dto;

    /**
     * Gets the value of the dto property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityDTO }
     *     
     */
    public ActivityDTO getDto() {
        return dto;
    }

    /**
     * Sets the value of the dto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityDTO }
     *     
     */
    public void setDto(ActivityDTO value) {
        this.dto = value;
    }

}
