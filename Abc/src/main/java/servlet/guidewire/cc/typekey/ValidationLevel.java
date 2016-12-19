
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidationLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="payment"/>
 *     &lt;enumeration value="external"/>
 *     &lt;enumeration value="iso"/>
 *     &lt;enumeration value="newloss"/>
 *     &lt;enumeration value="loadsave"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValidationLevel", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum ValidationLevel {

    @XmlEnumValue("payment")
    PAYMENT("payment"),
    @XmlEnumValue("external")
    EXTERNAL("external"),
    @XmlEnumValue("iso")
    ISO("iso"),
    @XmlEnumValue("newloss")
    NEWLOSS("newloss"),
    @XmlEnumValue("loadsave")
    LOADSAVE("loadsave");
    private final String value;

    ValidationLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValidationLevel fromValue(String v) {
        for (ValidationLevel c: ValidationLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
