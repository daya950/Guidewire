
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentSection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentSection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bills"/>
 *     &lt;enumeration value="correspondence"/>
 *     &lt;enumeration value="indemnity"/>
 *     &lt;enumeration value="legal"/>
 *     &lt;enumeration value="medical"/>
 *     &lt;enumeration value="misc"/>
 *     &lt;enumeration value="rehab"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentSection", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum DocumentSection {

    @XmlEnumValue("bills")
    BILLS("bills"),
    @XmlEnumValue("correspondence")
    CORRESPONDENCE("correspondence"),
    @XmlEnumValue("indemnity")
    INDEMNITY("indemnity"),
    @XmlEnumValue("legal")
    LEGAL("legal"),
    @XmlEnumValue("medical")
    MEDICAL("medical"),
    @XmlEnumValue("misc")
    MISC("misc"),
    @XmlEnumValue("rehab")
    REHAB("rehab");
    private final String value;

    DocumentSection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentSection fromValue(String v) {
        for (DocumentSection c: DocumentSection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
