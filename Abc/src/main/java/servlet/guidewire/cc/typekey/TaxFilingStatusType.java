
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxFilingStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxFilingStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="single"/>
 *     &lt;enumeration value="married-joint"/>
 *     &lt;enumeration value="married-separate"/>
 *     &lt;enumeration value="headofhousehold"/>
 *     &lt;enumeration value="widow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxFilingStatusType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum TaxFilingStatusType {

    @XmlEnumValue("single")
    SINGLE("single"),
    @XmlEnumValue("married-joint")
    MARRIED_JOINT("married-joint"),
    @XmlEnumValue("married-separate")
    MARRIED_SEPARATE("married-separate"),
    @XmlEnumValue("headofhousehold")
    HEADOFHOUSEHOLD("headofhousehold"),
    @XmlEnumValue("widow")
    WIDOW("widow");
    private final String value;

    TaxFilingStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxFilingStatusType fromValue(String v) {
        for (TaxFilingStatusType c: TaxFilingStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
