
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VendorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VendorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="autoglass"/>
 *     &lt;enumeration value="autorental"/>
 *     &lt;enumeration value="autorepair"/>
 *     &lt;enumeration value="bldingcontractor"/>
 *     &lt;enumeration value="defenseatt"/>
 *     &lt;enumeration value="doctor"/>
 *     &lt;enumeration value="externaladjuster"/>
 *     &lt;enumeration value="fireinspector"/>
 *     &lt;enumeration value="government"/>
 *     &lt;enumeration value="hospital"/>
 *     &lt;enumeration value="indautoinspector"/>
 *     &lt;enumeration value="indpropinspector"/>
 *     &lt;enumeration value="insuranceagent"/>
 *     &lt;enumeration value="nurse"/>
 *     &lt;enumeration value="plaintiffatt"/>
 *     &lt;enumeration value="towingservice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VendorType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum VendorType {

    @XmlEnumValue("autoglass")
    AUTOGLASS("autoglass"),
    @XmlEnumValue("autorental")
    AUTORENTAL("autorental"),
    @XmlEnumValue("autorepair")
    AUTOREPAIR("autorepair"),
    @XmlEnumValue("bldingcontractor")
    BLDINGCONTRACTOR("bldingcontractor"),
    @XmlEnumValue("defenseatt")
    DEFENSEATT("defenseatt"),
    @XmlEnumValue("doctor")
    DOCTOR("doctor"),
    @XmlEnumValue("externaladjuster")
    EXTERNALADJUSTER("externaladjuster"),
    @XmlEnumValue("fireinspector")
    FIREINSPECTOR("fireinspector"),
    @XmlEnumValue("government")
    GOVERNMENT("government"),
    @XmlEnumValue("hospital")
    HOSPITAL("hospital"),
    @XmlEnumValue("indautoinspector")
    INDAUTOINSPECTOR("indautoinspector"),
    @XmlEnumValue("indpropinspector")
    INDPROPINSPECTOR("indpropinspector"),
    @XmlEnumValue("insuranceagent")
    INSURANCEAGENT("insuranceagent"),
    @XmlEnumValue("nurse")
    NURSE("nurse"),
    @XmlEnumValue("plaintiffatt")
    PLAINTIFFATT("plaintiffatt"),
    @XmlEnumValue("towingservice")
    TOWINGSERVICE("towingservice");
    private final String value;

    VendorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VendorType fromValue(String v) {
        for (VendorType c: VendorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
