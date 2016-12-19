
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoteTopicType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NoteTopicType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="general"/>
 *     &lt;enumeration value="fnol"/>
 *     &lt;enumeration value="coverage"/>
 *     &lt;enumeration value="investigation"/>
 *     &lt;enumeration value="medical"/>
 *     &lt;enumeration value="evaluation"/>
 *     &lt;enumeration value="settlement"/>
 *     &lt;enumeration value="subrogation"/>
 *     &lt;enumeration value="salvage"/>
 *     &lt;enumeration value="litigation"/>
 *     &lt;enumeration value="denial"/>
 *     &lt;enumeration value="reinsurance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NoteTopicType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum NoteTopicType {

    @XmlEnumValue("general")
    GENERAL("general"),
    @XmlEnumValue("fnol")
    FNOL("fnol"),
    @XmlEnumValue("coverage")
    COVERAGE("coverage"),
    @XmlEnumValue("investigation")
    INVESTIGATION("investigation"),
    @XmlEnumValue("medical")
    MEDICAL("medical"),
    @XmlEnumValue("evaluation")
    EVALUATION("evaluation"),
    @XmlEnumValue("settlement")
    SETTLEMENT("settlement"),
    @XmlEnumValue("subrogation")
    SUBROGATION("subrogation"),
    @XmlEnumValue("salvage")
    SALVAGE("salvage"),
    @XmlEnumValue("litigation")
    LITIGATION("litigation"),
    @XmlEnumValue("denial")
    DENIAL("denial"),
    @XmlEnumValue("reinsurance")
    REINSURANCE("reinsurance");
    private final String value;

    NoteTopicType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NoteTopicType fromValue(String v) {
        for (NoteTopicType c: NoteTopicType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
