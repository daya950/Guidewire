
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivityClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="event"/>
 *     &lt;enumeration value="task"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivityClass", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum ActivityClass {

    @XmlEnumValue("event")
    EVENT("event"),
    @XmlEnumValue("task")
    TASK("task");
    private final String value;

    ActivityClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivityClass fromValue(String v) {
        for (ActivityClass c: ActivityClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
