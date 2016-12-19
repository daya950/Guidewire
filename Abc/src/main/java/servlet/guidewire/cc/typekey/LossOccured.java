
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LossOccured.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LossOccured">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AtPremisses"/>
 *     &lt;enumeration value="InTransit"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LossOccured", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum LossOccured {

    @XmlEnumValue("AtPremisses")
    AT_PREMISSES("AtPremisses"),
    @XmlEnumValue("InTransit")
    IN_TRANSIT("InTransit"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LossOccured(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LossOccured fromValue(String v) {
        for (LossOccured c: LossOccured.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
