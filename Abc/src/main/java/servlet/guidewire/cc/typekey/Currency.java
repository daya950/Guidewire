
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Currency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Currency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="usd"/>
 *     &lt;enumeration value="eur"/>
 *     &lt;enumeration value="gbp"/>
 *     &lt;enumeration value="cad"/>
 *     &lt;enumeration value="aud"/>
 *     &lt;enumeration value="rub"/>
 *     &lt;enumeration value="jpy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Currency", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum Currency {

    @XmlEnumValue("usd")
    USD("usd"),
    @XmlEnumValue("eur")
    EUR("eur"),
    @XmlEnumValue("gbp")
    GBP("gbp"),
    @XmlEnumValue("cad")
    CAD("cad"),
    @XmlEnumValue("aud")
    AUD("aud"),
    @XmlEnumValue("rub")
    RUB("rub"),
    @XmlEnumValue("jpy")
    JPY("jpy");
    private final String value;

    Currency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Currency fromValue(String v) {
        for (Currency c: Currency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
