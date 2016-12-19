
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaritalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaritalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="single"/>
 *     &lt;enumeration value="married"/>
 *     &lt;enumeration value="divorced"/>
 *     &lt;enumeration value="widowed"/>
 *     &lt;enumeration value="common"/>
 *     &lt;enumeration value="separated"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaritalStatus", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum MaritalStatus {

    @XmlEnumValue("single")
    SINGLE("single"),
    @XmlEnumValue("married")
    MARRIED("married"),
    @XmlEnumValue("divorced")
    DIVORCED("divorced"),
    @XmlEnumValue("widowed")
    WIDOWED("widowed"),
    @XmlEnumValue("common")
    COMMON("common"),
    @XmlEnumValue("separated")
    SEPARATED("separated"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    MaritalStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaritalStatus fromValue(String v) {
        for (MaritalStatus c: MaritalStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
