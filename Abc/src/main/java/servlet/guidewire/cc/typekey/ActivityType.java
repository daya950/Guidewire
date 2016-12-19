
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="approval"/>
 *     &lt;enumeration value="approvaldenied"/>
 *     &lt;enumeration value="assignmentreview"/>
 *     &lt;enumeration value="general"/>
 *     &lt;enumeration value="litigation"/>
 *     &lt;enumeration value="fnol"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivityType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum ActivityType {

    @XmlEnumValue("approval")
    APPROVAL("approval"),
    @XmlEnumValue("approvaldenied")
    APPROVALDENIED("approvaldenied"),
    @XmlEnumValue("assignmentreview")
    ASSIGNMENTREVIEW("assignmentreview"),
    @XmlEnumValue("general")
    GENERAL("general"),
    @XmlEnumValue("litigation")
    LITIGATION("litigation"),
    @XmlEnumValue("fnol")
    FNOL("fnol");
    private final String value;

    ActivityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivityType fromValue(String v) {
        for (ActivityType c: ActivityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
