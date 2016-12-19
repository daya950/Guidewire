
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="iso"/>
 *     &lt;enumeration value="metro"/>
 *     &lt;enumeration value="diagram"/>
 *     &lt;enumeration value="email"/>
 *     &lt;enumeration value="email_sent"/>
 *     &lt;enumeration value="fnol"/>
 *     &lt;enumeration value="letter_received"/>
 *     &lt;enumeration value="letter_sent"/>
 *     &lt;enumeration value="policereport"/>
 *     &lt;enumeration value="repairestimate"/>
 *     &lt;enumeration value="statement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum DocumentType {

    @XmlEnumValue("iso")
    ISO("iso"),
    @XmlEnumValue("metro")
    METRO("metro"),
    @XmlEnumValue("diagram")
    DIAGRAM("diagram"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("email_sent")
    EMAIL_SENT("email_sent"),
    @XmlEnumValue("fnol")
    FNOL("fnol"),
    @XmlEnumValue("letter_received")
    LETTER_RECEIVED("letter_received"),
    @XmlEnumValue("letter_sent")
    LETTER_SENT("letter_sent"),
    @XmlEnumValue("policereport")
    POLICEREPORT("policereport"),
    @XmlEnumValue("repairestimate")
    REPAIRESTIMATE("repairestimate"),
    @XmlEnumValue("statement")
    STATEMENT("statement");
    private final String value;

    DocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentType fromValue(String v) {
        for (DocumentType c: DocumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
