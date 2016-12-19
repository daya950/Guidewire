
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LossType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LossType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTO"/>
 *     &lt;enumeration value="GL"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="TRAV"/>
 *     &lt;enumeration value="WC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LossType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum LossType {

    AUTO,
    GL,
    PR,
    TRAV,
    WC;

    public String value() {
        return name();
    }

    public static LossType fromValue(String v) {
        return valueOf(v);
    }

}
