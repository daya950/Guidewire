
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameSuffix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NameSuffix">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="jr"/>
 *     &lt;enumeration value="sr"/>
 *     &lt;enumeration value="c_Ir"/>
 *     &lt;enumeration value="c_II"/>
 *     &lt;enumeration value="c_III"/>
 *     &lt;enumeration value="c_IV"/>
 *     &lt;enumeration value="c_md"/>
 *     &lt;enumeration value="c_phd"/>
 *     &lt;enumeration value="c_do"/>
 *     &lt;enumeration value="esq"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameSuffix", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum NameSuffix {

    @XmlEnumValue("jr")
    JR("jr"),
    @XmlEnumValue("sr")
    SR("sr"),
    @XmlEnumValue("c_Ir")
    C_IR("c_Ir"),
    @XmlEnumValue("c_II")
    C_II("c_II"),
    @XmlEnumValue("c_III")
    C_III("c_III"),
    @XmlEnumValue("c_IV")
    C_IV("c_IV"),
    @XmlEnumValue("c_md")
    C_MD("c_md"),
    @XmlEnumValue("c_phd")
    C_PHD("c_phd"),
    @XmlEnumValue("c_do")
    C_DO("c_do"),
    @XmlEnumValue("esq")
    ESQ("esq");
    private final String value;

    NameSuffix(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameSuffix fromValue(String v) {
        for (NameSuffix c: NameSuffix.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
