
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomHistoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomHistoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="a_n_f_r"/>
 *     &lt;enumeration value="create_recovery_bill"/>
 *     &lt;enumeration value="DataChange"/>
 *     &lt;enumeration value="email"/>
 *     &lt;enumeration value="Export"/>
 *     &lt;enumeration value="e_w_n_r"/>
 *     &lt;enumeration value="catastrophe"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomHistoryType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum CustomHistoryType {

    @XmlEnumValue("a_n_f_r")
    A_N_F_R("a_n_f_r"),
    @XmlEnumValue("create_recovery_bill")
    CREATE_RECOVERY_BILL("create_recovery_bill"),
    @XmlEnumValue("DataChange")
    DATA_CHANGE("DataChange"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("Export")
    EXPORT("Export"),
    @XmlEnumValue("e_w_n_r")
    E_W_N_R("e_w_n_r"),
    @XmlEnumValue("catastrophe")
    CATASTROPHE("catastrophe");
    private final String value;

    CustomHistoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomHistoryType fromValue(String v) {
        for (CustomHistoryType c: CustomHistoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
