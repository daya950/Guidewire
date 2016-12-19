
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialtyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialtyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allergy"/>
 *     &lt;enumeration value="anesthesiology"/>
 *     &lt;enumeration value="cardiology"/>
 *     &lt;enumeration value="dermatology"/>
 *     &lt;enumeration value="emergencymed"/>
 *     &lt;enumeration value="endocrinology"/>
 *     &lt;enumeration value="ent"/>
 *     &lt;enumeration value="familypractice"/>
 *     &lt;enumeration value="gastroenterology"/>
 *     &lt;enumeration value="hematologyonc"/>
 *     &lt;enumeration value="hospitalist"/>
 *     &lt;enumeration value="infectiousdis"/>
 *     &lt;enumeration value="internalmed"/>
 *     &lt;enumeration value="medpeds"/>
 *     &lt;enumeration value="nephrology"/>
 *     &lt;enumeration value="neurology"/>
 *     &lt;enumeration value="obgyn"/>
 *     &lt;enumeration value="occupationalmed"/>
 *     &lt;enumeration value="opthalmology"/>
 *     &lt;enumeration value="pathology"/>
 *     &lt;enumeration value="physmedrehab"/>
 *     &lt;enumeration value="plasticsurgery"/>
 *     &lt;enumeration value="psychiatry"/>
 *     &lt;enumeration value="pulmcritcare"/>
 *     &lt;enumeration value="surgery"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialtyType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum SpecialtyType {

    @XmlEnumValue("allergy")
    ALLERGY("allergy"),
    @XmlEnumValue("anesthesiology")
    ANESTHESIOLOGY("anesthesiology"),
    @XmlEnumValue("cardiology")
    CARDIOLOGY("cardiology"),
    @XmlEnumValue("dermatology")
    DERMATOLOGY("dermatology"),
    @XmlEnumValue("emergencymed")
    EMERGENCYMED("emergencymed"),
    @XmlEnumValue("endocrinology")
    ENDOCRINOLOGY("endocrinology"),
    @XmlEnumValue("ent")
    ENT("ent"),
    @XmlEnumValue("familypractice")
    FAMILYPRACTICE("familypractice"),
    @XmlEnumValue("gastroenterology")
    GASTROENTEROLOGY("gastroenterology"),
    @XmlEnumValue("hematologyonc")
    HEMATOLOGYONC("hematologyonc"),
    @XmlEnumValue("hospitalist")
    HOSPITALIST("hospitalist"),
    @XmlEnumValue("infectiousdis")
    INFECTIOUSDIS("infectiousdis"),
    @XmlEnumValue("internalmed")
    INTERNALMED("internalmed"),
    @XmlEnumValue("medpeds")
    MEDPEDS("medpeds"),
    @XmlEnumValue("nephrology")
    NEPHROLOGY("nephrology"),
    @XmlEnumValue("neurology")
    NEUROLOGY("neurology"),
    @XmlEnumValue("obgyn")
    OBGYN("obgyn"),
    @XmlEnumValue("occupationalmed")
    OCCUPATIONALMED("occupationalmed"),
    @XmlEnumValue("opthalmology")
    OPTHALMOLOGY("opthalmology"),
    @XmlEnumValue("pathology")
    PATHOLOGY("pathology"),
    @XmlEnumValue("physmedrehab")
    PHYSMEDREHAB("physmedrehab"),
    @XmlEnumValue("plasticsurgery")
    PLASTICSURGERY("plasticsurgery"),
    @XmlEnumValue("psychiatry")
    PSYCHIATRY("psychiatry"),
    @XmlEnumValue("pulmcritcare")
    PULMCRITCARE("pulmcritcare"),
    @XmlEnumValue("surgery")
    SURGERY("surgery");
    private final String value;

    SpecialtyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialtyType fromValue(String v) {
        for (SpecialtyType c: SpecialtyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
