
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedicalTreatmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicalTreatmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="acup"/>
 *     &lt;enumeration value="chir"/>
 *     &lt;enumeration value="emer_care"/>
 *     &lt;enumeration value="er"/>
 *     &lt;enumeration value="hospital"/>
 *     &lt;enumeration value="inject"/>
 *     &lt;enumeration value="major_surgery"/>
 *     &lt;enumeration value="minor_surgery"/>
 *     &lt;enumeration value="mri"/>
 *     &lt;enumeration value="mult_treatments"/>
 *     &lt;enumeration value="neuro"/>
 *     &lt;enumeration value="ortho"/>
 *     &lt;enumeration value="pt"/>
 *     &lt;enumeration value="pcp"/>
 *     &lt;enumeration value="counsel"/>
 *     &lt;enumeration value="rehab"/>
 *     &lt;enumeration value="xray"/>
 *     &lt;enumeration value="oth"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="one_doctor"/>
 *     &lt;enumeration value="mult_doctors"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicalTreatmentType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum MedicalTreatmentType {

    @XmlEnumValue("acup")
    ACUP("acup"),
    @XmlEnumValue("chir")
    CHIR("chir"),
    @XmlEnumValue("emer_care")
    EMER_CARE("emer_care"),
    @XmlEnumValue("er")
    ER("er"),
    @XmlEnumValue("hospital")
    HOSPITAL("hospital"),
    @XmlEnumValue("inject")
    INJECT("inject"),
    @XmlEnumValue("major_surgery")
    MAJOR_SURGERY("major_surgery"),
    @XmlEnumValue("minor_surgery")
    MINOR_SURGERY("minor_surgery"),
    @XmlEnumValue("mri")
    MRI("mri"),
    @XmlEnumValue("mult_treatments")
    MULT_TREATMENTS("mult_treatments"),
    @XmlEnumValue("neuro")
    NEURO("neuro"),
    @XmlEnumValue("ortho")
    ORTHO("ortho"),
    @XmlEnumValue("pt")
    PT("pt"),
    @XmlEnumValue("pcp")
    PCP("pcp"),
    @XmlEnumValue("counsel")
    COUNSEL("counsel"),
    @XmlEnumValue("rehab")
    REHAB("rehab"),
    @XmlEnumValue("xray")
    XRAY("xray"),
    @XmlEnumValue("oth")
    OTH("oth"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("one_doctor")
    ONE_DOCTOR("one_doctor"),
    @XmlEnumValue("mult_doctors")
    MULT_DOCTORS("mult_doctors");
    private final String value;

    MedicalTreatmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MedicalTreatmentType fromValue(String v) {
        for (MedicalTreatmentType c: MedicalTreatmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
