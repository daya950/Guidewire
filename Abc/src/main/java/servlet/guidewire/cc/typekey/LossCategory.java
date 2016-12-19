
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LossCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LossCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="default"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LossCategory", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum LossCategory {

    @XmlEnumValue("default")
    DEFAULT("default");
    private final String value;

    LossCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LossCategory fromValue(String v) {
        for (LossCategory c: LossCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
