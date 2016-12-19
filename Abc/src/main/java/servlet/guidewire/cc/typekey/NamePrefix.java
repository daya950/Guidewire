
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamePrefix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NamePrefix">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mr"/>
 *     &lt;enumeration value="mrs"/>
 *     &lt;enumeration value="ms"/>
 *     &lt;enumeration value="dr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NamePrefix", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum NamePrefix {

    @XmlEnumValue("mr")
    MR("mr"),
    @XmlEnumValue("mrs")
    MRS("mrs"),
    @XmlEnumValue("ms")
    MS("ms"),
    @XmlEnumValue("dr")
    DR("dr");
    private final String value;

    NamePrefix(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NamePrefix fromValue(String v) {
        for (NamePrefix c: NamePrefix.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
