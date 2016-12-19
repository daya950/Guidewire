
package servlet.guidewire.gw.plugin.assignment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssignmentCommand.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssignmentCommand">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSIGN_VERBATIM"/>
 *     &lt;enumeration value="ASSIGN_ISSUE_OWNER"/>
 *     &lt;enumeration value="ASSIGN_ROUND_ROBIN_USER"/>
 *     &lt;enumeration value="ASSIGN_ROUND_ROBIN_WITHIN_GROUPS"/>
 *     &lt;enumeration value="ASSIGN_PRIOR_INVOLVEMENT"/>
 *     &lt;enumeration value="ASSIGN_USE_DEFAULT"/>
 *     &lt;enumeration value="ASSIGN_MANUALLY"/>
 *     &lt;enumeration value="ASSIGN_NOT_FOUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssignmentCommand")
@XmlEnum
public enum AssignmentCommand {

    ASSIGN_VERBATIM,
    ASSIGN_ISSUE_OWNER,
    ASSIGN_ROUND_ROBIN_USER,
    ASSIGN_ROUND_ROBIN_WITHIN_GROUPS,
    ASSIGN_PRIOR_INVOLVEMENT,
    ASSIGN_USE_DEFAULT,
    ASSIGN_MANUALLY,
    ASSIGN_NOT_FOUND;

    public String value() {
        return name();
    }

    public static AssignmentCommand fromValue(String v) {
        return valueOf(v);
    }

}
