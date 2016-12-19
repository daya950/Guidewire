
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentSecurityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentSecurityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="sensitive"/>
 *     &lt;enumeration value="unrestricted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentSecurityType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum DocumentSecurityType {

    @XmlEnumValue("sensitive")
    SENSITIVE("sensitive"),
    @XmlEnumValue("unrestricted")
    UNRESTRICTED("unrestricted");
    private final String value;

    DocumentSecurityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentSecurityType fromValue(String v) {
        for (DocumentSecurityType c: DocumentSecurityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
