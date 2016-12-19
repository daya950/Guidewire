
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimStrategy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaimStrategy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="auto_fast"/>
 *     &lt;enumeration value="auto_normal"/>
 *     &lt;enumeration value="contents_fast"/>
 *     &lt;enumeration value="contents_normal"/>
 *     &lt;enumeration value="injury_fast"/>
 *     &lt;enumeration value="injury_normal"/>
 *     &lt;enumeration value="liab_fast"/>
 *     &lt;enumeration value="liab_normal"/>
 *     &lt;enumeration value="prop_fast"/>
 *     &lt;enumeration value="prop_normal"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="wc_fast"/>
 *     &lt;enumeration value="wc_investigate"/>
 *     &lt;enumeration value="wc_normal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClaimStrategy", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum ClaimStrategy {

    @XmlEnumValue("auto_fast")
    AUTO_FAST("auto_fast"),
    @XmlEnumValue("auto_normal")
    AUTO_NORMAL("auto_normal"),
    @XmlEnumValue("contents_fast")
    CONTENTS_FAST("contents_fast"),
    @XmlEnumValue("contents_normal")
    CONTENTS_NORMAL("contents_normal"),
    @XmlEnumValue("injury_fast")
    INJURY_FAST("injury_fast"),
    @XmlEnumValue("injury_normal")
    INJURY_NORMAL("injury_normal"),
    @XmlEnumValue("liab_fast")
    LIAB_FAST("liab_fast"),
    @XmlEnumValue("liab_normal")
    LIAB_NORMAL("liab_normal"),
    @XmlEnumValue("prop_fast")
    PROP_FAST("prop_fast"),
    @XmlEnumValue("prop_normal")
    PROP_NORMAL("prop_normal"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("wc_fast")
    WC_FAST("wc_fast"),
    @XmlEnumValue("wc_investigate")
    WC_INVESTIGATE("wc_investigate"),
    @XmlEnumValue("wc_normal")
    WC_NORMAL("wc_normal");
    private final String value;

    ClaimStrategy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClaimStrategy fromValue(String v) {
        for (ClaimStrategy c: ClaimStrategy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
