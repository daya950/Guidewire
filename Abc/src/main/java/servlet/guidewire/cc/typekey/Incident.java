
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Incident.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Incident">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PropertyIncident"/>
 *     &lt;enumeration value="MobilePropertyIncident"/>
 *     &lt;enumeration value="VehicleIncident"/>
 *     &lt;enumeration value="FixedPropertyIncident"/>
 *     &lt;enumeration value="InjuryIncident"/>
 *     &lt;enumeration value="BaggageIncident"/>
 *     &lt;enumeration value="DwellingIncident"/>
 *     &lt;enumeration value="Incident"/>
 *     &lt;enumeration value="LivingExpensesIncident"/>
 *     &lt;enumeration value="OtherStructureIncident"/>
 *     &lt;enumeration value="PropertyContentsIncident"/>
 *     &lt;enumeration value="TripIncident"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Incident", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum Incident {

    @XmlEnumValue("PropertyIncident")
    PROPERTY_INCIDENT("PropertyIncident"),
    @XmlEnumValue("MobilePropertyIncident")
    MOBILE_PROPERTY_INCIDENT("MobilePropertyIncident"),
    @XmlEnumValue("VehicleIncident")
    VEHICLE_INCIDENT("VehicleIncident"),
    @XmlEnumValue("FixedPropertyIncident")
    FIXED_PROPERTY_INCIDENT("FixedPropertyIncident"),
    @XmlEnumValue("InjuryIncident")
    INJURY_INCIDENT("InjuryIncident"),
    @XmlEnumValue("BaggageIncident")
    BAGGAGE_INCIDENT("BaggageIncident"),
    @XmlEnumValue("DwellingIncident")
    DWELLING_INCIDENT("DwellingIncident"),
    @XmlEnumValue("Incident")
    INCIDENT("Incident"),
    @XmlEnumValue("LivingExpensesIncident")
    LIVING_EXPENSES_INCIDENT("LivingExpensesIncident"),
    @XmlEnumValue("OtherStructureIncident")
    OTHER_STRUCTURE_INCIDENT("OtherStructureIncident"),
    @XmlEnumValue("PropertyContentsIncident")
    PROPERTY_CONTENTS_INCIDENT("PropertyContentsIncident"),
    @XmlEnumValue("TripIncident")
    TRIP_INCIDENT("TripIncident");
    private final String value;

    Incident(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Incident fromValue(String v) {
        for (Incident c: Incident.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
