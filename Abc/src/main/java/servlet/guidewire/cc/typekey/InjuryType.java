
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InjuryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InjuryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="specific"/>
 *     &lt;enumeration value="occupational"/>
 *     &lt;enumeration value="multiple"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InjuryType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum InjuryType {

    @XmlEnumValue("specific")
    SPECIFIC("specific"),
    @XmlEnumValue("occupational")
    OCCUPATIONAL("occupational"),
    @XmlEnumValue("multiple")
    MULTIPLE("multiple");
    private final String value;

    InjuryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InjuryType fromValue(String v) {
        for (InjuryType c: InjuryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
