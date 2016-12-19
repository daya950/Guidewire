
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganizationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="city"/>
 *     &lt;enumeration value="corporation"/>
 *     &lt;enumeration value="county"/>
 *     &lt;enumeration value="federal"/>
 *     &lt;enumeration value="partnership"/>
 *     &lt;enumeration value="solepropship"/>
 *     &lt;enumeration value="state"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganizationType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum OrganizationType {

    @XmlEnumValue("city")
    CITY("city"),
    @XmlEnumValue("corporation")
    CORPORATION("corporation"),
    @XmlEnumValue("county")
    COUNTY("county"),
    @XmlEnumValue("federal")
    FEDERAL("federal"),
    @XmlEnumValue("partnership")
    PARTNERSHIP("partnership"),
    @XmlEnumValue("solepropship")
    SOLEPROPSHIP("solepropship"),
    @XmlEnumValue("state")
    STATE("state");
    private final String value;

    OrganizationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganizationType fromValue(String v) {
        for (OrganizationType c: OrganizationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
