
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivityCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="approval"/>
 *     &lt;enumeration value="approvaldenied"/>
 *     &lt;enumeration value="assignmentreview"/>
 *     &lt;enumeration value="correspondence"/>
 *     &lt;enumeration value="filereview"/>
 *     &lt;enumeration value="general"/>
 *     &lt;enumeration value="handlinginstructions"/>
 *     &lt;enumeration value="interview"/>
 *     &lt;enumeration value="investigation"/>
 *     &lt;enumeration value="iso"/>
 *     &lt;enumeration value="litigation"/>
 *     &lt;enumeration value="newmail"/>
 *     &lt;enumeration value="notification"/>
 *     &lt;enumeration value="reminder"/>
 *     &lt;enumeration value="request"/>
 *     &lt;enumeration value="response"/>
 *     &lt;enumeration value="servicerequestnotification"/>
 *     &lt;enumeration value="tool"/>
 *     &lt;enumeration value="warning"/>
 *     &lt;enumeration value="fnol"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivityCategory", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum ActivityCategory {

    @XmlEnumValue("approval")
    APPROVAL("approval"),
    @XmlEnumValue("approvaldenied")
    APPROVALDENIED("approvaldenied"),
    @XmlEnumValue("assignmentreview")
    ASSIGNMENTREVIEW("assignmentreview"),
    @XmlEnumValue("correspondence")
    CORRESPONDENCE("correspondence"),
    @XmlEnumValue("filereview")
    FILEREVIEW("filereview"),
    @XmlEnumValue("general")
    GENERAL("general"),
    @XmlEnumValue("handlinginstructions")
    HANDLINGINSTRUCTIONS("handlinginstructions"),
    @XmlEnumValue("interview")
    INTERVIEW("interview"),
    @XmlEnumValue("investigation")
    INVESTIGATION("investigation"),
    @XmlEnumValue("iso")
    ISO("iso"),
    @XmlEnumValue("litigation")
    LITIGATION("litigation"),
    @XmlEnumValue("newmail")
    NEWMAIL("newmail"),
    @XmlEnumValue("notification")
    NOTIFICATION("notification"),
    @XmlEnumValue("reminder")
    REMINDER("reminder"),
    @XmlEnumValue("request")
    REQUEST("request"),
    @XmlEnumValue("response")
    RESPONSE("response"),
    @XmlEnumValue("servicerequestnotification")
    SERVICEREQUESTNOTIFICATION("servicerequestnotification"),
    @XmlEnumValue("tool")
    TOOL("tool"),
    @XmlEnumValue("warning")
    WARNING("warning"),
    @XmlEnumValue("fnol")
    FNOL("fnol");
    private final String value;

    ActivityCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivityCategory fromValue(String v) {
        for (ActivityCategory c: ActivityCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
