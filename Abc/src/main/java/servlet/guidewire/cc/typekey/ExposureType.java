
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExposureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Baggage"/>
 *     &lt;enumeration value="BodilyInjuryDamage"/>
 *     &lt;enumeration value="Content"/>
 *     &lt;enumeration value="Dwelling"/>
 *     &lt;enumeration value="EmployerLiability"/>
 *     &lt;enumeration value="GeneralDamage"/>
 *     &lt;enumeration value="LivingExpenses"/>
 *     &lt;enumeration value="LossOfUseDamage"/>
 *     &lt;enumeration value="MedPay"/>
 *     &lt;enumeration value="WCInjuryDamage"/>
 *     &lt;enumeration value="OtherStructure"/>
 *     &lt;enumeration value="PersonalPropertyDamage"/>
 *     &lt;enumeration value="PIPDamages"/>
 *     &lt;enumeration value="PropertyDamage"/>
 *     &lt;enumeration value="LostWages"/>
 *     &lt;enumeration value="TowOnly"/>
 *     &lt;enumeration value="TripCancellationDelay"/>
 *     &lt;enumeration value="VehicleDamage"/>
 *     &lt;enumeration value="Theft"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExposureType", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum ExposureType {

    @XmlEnumValue("Baggage")
    BAGGAGE("Baggage"),
    @XmlEnumValue("BodilyInjuryDamage")
    BODILY_INJURY_DAMAGE("BodilyInjuryDamage"),
    @XmlEnumValue("Content")
    CONTENT("Content"),
    @XmlEnumValue("Dwelling")
    DWELLING("Dwelling"),
    @XmlEnumValue("EmployerLiability")
    EMPLOYER_LIABILITY("EmployerLiability"),
    @XmlEnumValue("GeneralDamage")
    GENERAL_DAMAGE("GeneralDamage"),
    @XmlEnumValue("LivingExpenses")
    LIVING_EXPENSES("LivingExpenses"),
    @XmlEnumValue("LossOfUseDamage")
    LOSS_OF_USE_DAMAGE("LossOfUseDamage"),
    @XmlEnumValue("MedPay")
    MED_PAY("MedPay"),
    @XmlEnumValue("WCInjuryDamage")
    WC_INJURY_DAMAGE("WCInjuryDamage"),
    @XmlEnumValue("OtherStructure")
    OTHER_STRUCTURE("OtherStructure"),
    @XmlEnumValue("PersonalPropertyDamage")
    PERSONAL_PROPERTY_DAMAGE("PersonalPropertyDamage"),
    @XmlEnumValue("PIPDamages")
    PIP_DAMAGES("PIPDamages"),
    @XmlEnumValue("PropertyDamage")
    PROPERTY_DAMAGE("PropertyDamage"),
    @XmlEnumValue("LostWages")
    LOST_WAGES("LostWages"),
    @XmlEnumValue("TowOnly")
    TOW_ONLY("TowOnly"),
    @XmlEnumValue("TripCancellationDelay")
    TRIP_CANCELLATION_DELAY("TripCancellationDelay"),
    @XmlEnumValue("VehicleDamage")
    VEHICLE_DAMAGE("VehicleDamage"),
    @XmlEnumValue("Theft")
    THEFT("Theft");
    private final String value;

    ExposureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExposureType fromValue(String v) {
        for (ExposureType c: ExposureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
