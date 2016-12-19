
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimAccessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaimAccessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="edit"/>
 *     &lt;enumeration value="view"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClaimAccessType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum ClaimAccessType {

    @XmlEnumValue("edit")
    EDIT("edit"),
    @XmlEnumValue("view")
    VIEW("view");
    private final String value;

    ClaimAccessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClaimAccessType fromValue(String v) {
        for (ClaimAccessType c: ClaimAccessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
