
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LossCause.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LossCause">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="abandonment"/>
 *     &lt;enumeration value="animal"/>
 *     &lt;enumeration value="animal_bite"/>
 *     &lt;enumeration value="assault"/>
 *     &lt;enumeration value="breach"/>
 *     &lt;enumeration value="broken_glass"/>
 *     &lt;enumeration value="burglary"/>
 *     &lt;enumeration value="burn_scald"/>
 *     &lt;enumeration value="cancellation"/>
 *     &lt;enumeration value="caught_in"/>
 *     &lt;enumeration value="leftcollision"/>
 *     &lt;enumeration value="bikecollision"/>
 *     &lt;enumeration value="fixedobjcoll"/>
 *     &lt;enumeration value="vehcollision"/>
 *     &lt;enumeration value="otherobjcoll"/>
 *     &lt;enumeration value="pedcollision"/>
 *     &lt;enumeration value="trainbuscoll"/>
 *     &lt;enumeration value="electrical_curr"/>
 *     &lt;enumeration value="air_crash"/>
 *     &lt;enumeration value="rail_crash"/>
 *     &lt;enumeration value="water_veh_crash"/>
 *     &lt;enumeration value="cut"/>
 *     &lt;enumeration value="loadingdamage"/>
 *     &lt;enumeration value="death"/>
 *     &lt;enumeration value="delay"/>
 *     &lt;enumeration value="documents"/>
 *     &lt;enumeration value="earthquake"/>
 *     &lt;enumeration value="errors"/>
 *     &lt;enumeration value="excess"/>
 *     &lt;enumeration value="explosion"/>
 *     &lt;enumeration value="fall"/>
 *     &lt;enumeration value="FallingObject"/>
 *     &lt;enumeration value="construction"/>
 *     &lt;enumeration value="fire"/>
 *     &lt;enumeration value="glassbreakage"/>
 *     &lt;enumeration value="hail"/>
 *     &lt;enumeration value="vandalism"/>
 *     &lt;enumeration value="official_duty"/>
 *     &lt;enumeration value="med_error"/>
 *     &lt;enumeration value="miscellaneous"/>
 *     &lt;enumeration value="missed_departure"/>
 *     &lt;enumeration value="mold"/>
 *     &lt;enumeration value="motorvehicle"/>
 *     &lt;enumeration value="personal_misconduct"/>
 *     &lt;enumeration value="preex_med_condition"/>
 *     &lt;enumeration value="product"/>
 *     &lt;enumeration value="professional_sports"/>
 *     &lt;enumeration value="rearend"/>
 *     &lt;enumeration value="riotandcivil"/>
 *     &lt;enumeration value="rollover"/>
 *     &lt;enumeration value="rubbed"/>
 *     &lt;enumeration value="snowice"/>
 *     &lt;enumeration value="strain"/>
 *     &lt;enumeration value="striking"/>
 *     &lt;enumeration value="struck"/>
 *     &lt;enumeration value="structfailure"/>
 *     &lt;enumeration value="terrorism_hijack"/>
 *     &lt;enumeration value="theftparts"/>
 *     &lt;enumeration value="theftentire"/>
 *     &lt;enumeration value="waterdamage"/>
 *     &lt;enumeration value="wind"/>
 *     &lt;enumeration value="animalcollision"/>
 *     &lt;enumeration value="firedamage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LossCause", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum LossCause {

    @XmlEnumValue("abandonment")
    ABANDONMENT("abandonment"),
    @XmlEnumValue("animal")
    ANIMAL("animal"),
    @XmlEnumValue("animal_bite")
    ANIMAL_BITE("animal_bite"),
    @XmlEnumValue("assault")
    ASSAULT("assault"),
    @XmlEnumValue("breach")
    BREACH("breach"),
    @XmlEnumValue("broken_glass")
    BROKEN_GLASS("broken_glass"),
    @XmlEnumValue("burglary")
    BURGLARY("burglary"),
    @XmlEnumValue("burn_scald")
    BURN_SCALD("burn_scald"),
    @XmlEnumValue("cancellation")
    CANCELLATION("cancellation"),
    @XmlEnumValue("caught_in")
    CAUGHT_IN("caught_in"),
    @XmlEnumValue("leftcollision")
    LEFTCOLLISION("leftcollision"),
    @XmlEnumValue("bikecollision")
    BIKECOLLISION("bikecollision"),
    @XmlEnumValue("fixedobjcoll")
    FIXEDOBJCOLL("fixedobjcoll"),
    @XmlEnumValue("vehcollision")
    VEHCOLLISION("vehcollision"),
    @XmlEnumValue("otherobjcoll")
    OTHEROBJCOLL("otherobjcoll"),
    @XmlEnumValue("pedcollision")
    PEDCOLLISION("pedcollision"),
    @XmlEnumValue("trainbuscoll")
    TRAINBUSCOLL("trainbuscoll"),
    @XmlEnumValue("electrical_curr")
    ELECTRICAL_CURR("electrical_curr"),
    @XmlEnumValue("air_crash")
    AIR_CRASH("air_crash"),
    @XmlEnumValue("rail_crash")
    RAIL_CRASH("rail_crash"),
    @XmlEnumValue("water_veh_crash")
    WATER_VEH_CRASH("water_veh_crash"),
    @XmlEnumValue("cut")
    CUT("cut"),
    @XmlEnumValue("loadingdamage")
    LOADINGDAMAGE("loadingdamage"),
    @XmlEnumValue("death")
    DEATH("death"),
    @XmlEnumValue("delay")
    DELAY("delay"),
    @XmlEnumValue("documents")
    DOCUMENTS("documents"),
    @XmlEnumValue("earthquake")
    EARTHQUAKE("earthquake"),
    @XmlEnumValue("errors")
    ERRORS("errors"),
    @XmlEnumValue("excess")
    EXCESS("excess"),
    @XmlEnumValue("explosion")
    EXPLOSION("explosion"),
    @XmlEnumValue("fall")
    FALL("fall"),
    @XmlEnumValue("FallingObject")
    FALLING_OBJECT("FallingObject"),
    @XmlEnumValue("construction")
    CONSTRUCTION("construction"),
    @XmlEnumValue("fire")
    FIRE("fire"),
    @XmlEnumValue("glassbreakage")
    GLASSBREAKAGE("glassbreakage"),
    @XmlEnumValue("hail")
    HAIL("hail"),
    @XmlEnumValue("vandalism")
    VANDALISM("vandalism"),
    @XmlEnumValue("official_duty")
    OFFICIAL_DUTY("official_duty"),
    @XmlEnumValue("med_error")
    MED_ERROR("med_error"),
    @XmlEnumValue("miscellaneous")
    MISCELLANEOUS("miscellaneous"),
    @XmlEnumValue("missed_departure")
    MISSED_DEPARTURE("missed_departure"),
    @XmlEnumValue("mold")
    MOLD("mold"),
    @XmlEnumValue("motorvehicle")
    MOTORVEHICLE("motorvehicle"),
    @XmlEnumValue("personal_misconduct")
    PERSONAL_MISCONDUCT("personal_misconduct"),
    @XmlEnumValue("preex_med_condition")
    PREEX_MED_CONDITION("preex_med_condition"),
    @XmlEnumValue("product")
    PRODUCT("product"),
    @XmlEnumValue("professional_sports")
    PROFESSIONAL_SPORTS("professional_sports"),
    @XmlEnumValue("rearend")
    REAREND("rearend"),
    @XmlEnumValue("riotandcivil")
    RIOTANDCIVIL("riotandcivil"),
    @XmlEnumValue("rollover")
    ROLLOVER("rollover"),
    @XmlEnumValue("rubbed")
    RUBBED("rubbed"),
    @XmlEnumValue("snowice")
    SNOWICE("snowice"),
    @XmlEnumValue("strain")
    STRAIN("strain"),
    @XmlEnumValue("striking")
    STRIKING("striking"),
    @XmlEnumValue("struck")
    STRUCK("struck"),
    @XmlEnumValue("structfailure")
    STRUCTFAILURE("structfailure"),
    @XmlEnumValue("terrorism_hijack")
    TERRORISM_HIJACK("terrorism_hijack"),
    @XmlEnumValue("theftparts")
    THEFTPARTS("theftparts"),
    @XmlEnumValue("theftentire")
    THEFTENTIRE("theftentire"),
    @XmlEnumValue("waterdamage")
    WATERDAMAGE("waterdamage"),
    @XmlEnumValue("wind")
    WIND("wind"),
    @XmlEnumValue("animalcollision")
    ANIMALCOLLISION("animalcollision"),
    @XmlEnumValue("firedamage")
    FIREDAMAGE("firedamage");
    private final String value;

    LossCause(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LossCause fromValue(String v) {
        for (LossCause c: LossCause.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
