
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="approved"/>
 *     &lt;enumeration value="approving"/>
 *     &lt;enumeration value="draft"/>
 *     &lt;enumeration value="final"/>
 *     &lt;enumeration value="filed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentStatusType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum DocumentStatusType {

    @XmlEnumValue("approved")
    APPROVED("approved"),
    @XmlEnumValue("approving")
    APPROVING("approving"),
    @XmlEnumValue("draft")
    DRAFT("draft"),
    @XmlEnumValue("final")
    FINAL("final"),
    @XmlEnumValue("filed")
    FILED("filed");
    private final String value;

    DocumentStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentStatusType fromValue(String v) {
        for (DocumentStatusType c: DocumentStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
