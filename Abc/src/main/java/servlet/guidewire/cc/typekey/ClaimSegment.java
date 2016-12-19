
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimSegment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaimSegment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="auto_glass"/>
 *     &lt;enumeration value="auto_high"/>
 *     &lt;enumeration value="auto_low"/>
 *     &lt;enumeration value="auto_mid"/>
 *     &lt;enumeration value="contents_high"/>
 *     &lt;enumeration value="contents_low"/>
 *     &lt;enumeration value="injury_high"/>
 *     &lt;enumeration value="injury_low"/>
 *     &lt;enumeration value="injury_mid"/>
 *     &lt;enumeration value="liab_high"/>
 *     &lt;enumeration value="liab_low"/>
 *     &lt;enumeration value="liab_mid"/>
 *     &lt;enumeration value="prop_high"/>
 *     &lt;enumeration value="prop_low"/>
 *     &lt;enumeration value="prop_mid"/>
 *     &lt;enumeration value="travel_high"/>
 *     &lt;enumeration value="travel_low"/>
 *     &lt;enumeration value="travel_mid"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="wc_liability"/>
 *     &lt;enumeration value="wc_lost_time"/>
 *     &lt;enumeration value="wc_med_only"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClaimSegment", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum ClaimSegment {

    @XmlEnumValue("auto_glass")
    AUTO_GLASS("auto_glass"),
    @XmlEnumValue("auto_high")
    AUTO_HIGH("auto_high"),
    @XmlEnumValue("auto_low")
    AUTO_LOW("auto_low"),
    @XmlEnumValue("auto_mid")
    AUTO_MID("auto_mid"),
    @XmlEnumValue("contents_high")
    CONTENTS_HIGH("contents_high"),
    @XmlEnumValue("contents_low")
    CONTENTS_LOW("contents_low"),
    @XmlEnumValue("injury_high")
    INJURY_HIGH("injury_high"),
    @XmlEnumValue("injury_low")
    INJURY_LOW("injury_low"),
    @XmlEnumValue("injury_mid")
    INJURY_MID("injury_mid"),
    @XmlEnumValue("liab_high")
    LIAB_HIGH("liab_high"),
    @XmlEnumValue("liab_low")
    LIAB_LOW("liab_low"),
    @XmlEnumValue("liab_mid")
    LIAB_MID("liab_mid"),
    @XmlEnumValue("prop_high")
    PROP_HIGH("prop_high"),
    @XmlEnumValue("prop_low")
    PROP_LOW("prop_low"),
    @XmlEnumValue("prop_mid")
    PROP_MID("prop_mid"),
    @XmlEnumValue("travel_high")
    TRAVEL_HIGH("travel_high"),
    @XmlEnumValue("travel_low")
    TRAVEL_LOW("travel_low"),
    @XmlEnumValue("travel_mid")
    TRAVEL_MID("travel_mid"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("wc_liability")
    WC_LIABILITY("wc_liability"),
    @XmlEnumValue("wc_lost_time")
    WC_LOST_TIME("wc_lost_time"),
    @XmlEnumValue("wc_med_only")
    WC_MED_ONLY("wc_med_only");
    private final String value;

    ClaimSegment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClaimSegment fromValue(String v) {
        for (ClaimSegment c: ClaimSegment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
