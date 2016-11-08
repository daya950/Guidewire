
package main.java.servlet.guidewire.pc.ccintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCRUCoverage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCRUCoverage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://guidewire.com/pc/ccintegration}CCCoverage">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCRUCoverage")
@XmlSeeAlso({
    CCPropertyCoverage.class,
    CCVehicleCoverage.class
})
public class CCRUCoverage
    extends CCCoverage
{


}
