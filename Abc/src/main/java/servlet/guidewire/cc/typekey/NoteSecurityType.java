
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoteSecurityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NoteSecurityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="medical"/>
 *     &lt;enumeration value="private"/>
 *     &lt;enumeration value="public"/>
 *     &lt;enumeration value="sensitive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NoteSecurityType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum NoteSecurityType {

    @XmlEnumValue("medical")
    MEDICAL("medical"),
    @XmlEnumValue("private")
    PRIVATE("private"),
    @XmlEnumValue("public")
    PUBLIC("public"),
    @XmlEnumValue("sensitive")
    SENSITIVE("sensitive");
    private final String value;

    NoteSecurityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NoteSecurityType fromValue(String v) {
        for (NoteSecurityType c: NoteSecurityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
