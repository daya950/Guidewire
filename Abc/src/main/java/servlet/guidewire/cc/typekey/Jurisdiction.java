
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Jurisdiction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Jurisdiction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AU_ACT"/>
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="AK"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="AZ"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="DE_BW"/>
 *     &lt;enumeration value="DE_BY"/>
 *     &lt;enumeration value="DE_BE"/>
 *     &lt;enumeration value="DE_BB"/>
 *     &lt;enumeration value="DE_HB"/>
 *     &lt;enumeration value="BC"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="DC"/>
 *     &lt;enumeration value="FM"/>
 *     &lt;enumeration value="FL"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GU"/>
 *     &lt;enumeration value="DE_HH"/>
 *     &lt;enumeration value="HI"/>
 *     &lt;enumeration value="DE_HE"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="IA"/>
 *     &lt;enumeration value="JP"/>
 *     &lt;enumeration value="KS"/>
 *     &lt;enumeration value="KY"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="DE_NI"/>
 *     &lt;enumeration value="ME"/>
 *     &lt;enumeration value="MB"/>
 *     &lt;enumeration value="MH"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="DE_MV"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="NV"/>
 *     &lt;enumeration value="NB"/>
 *     &lt;enumeration value="NH"/>
 *     &lt;enumeration value="NJ"/>
 *     &lt;enumeration value="NM"/>
 *     &lt;enumeration value="AU_NSW"/>
 *     &lt;enumeration value="NY"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="NC"/>
 *     &lt;enumeration value="ND"/>
 *     &lt;enumeration value="DE_NW"/>
 *     &lt;enumeration value="MP"/>
 *     &lt;enumeration value="AU_NT"/>
 *     &lt;enumeration value="NT"/>
 *     &lt;enumeration value="NS"/>
 *     &lt;enumeration value="NU"/>
 *     &lt;enumeration value="OH"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="ON"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="QC"/>
 *     &lt;enumeration value="AU_QLD"/>
 *     &lt;enumeration value="DE_RP"/>
 *     &lt;enumeration value="RI"/>
 *     &lt;enumeration value="DE_SL"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="DE_SN"/>
 *     &lt;enumeration value="DE_ST"/>
 *     &lt;enumeration value="DE_SH"/>
 *     &lt;enumeration value="AU_SA"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="AU_TAS"/>
 *     &lt;enumeration value="TN"/>
 *     &lt;enumeration value="TX"/>
 *     &lt;enumeration value="DE_TH"/>
 *     &lt;enumeration value="GB"/>
 *     &lt;enumeration value="UT"/>
 *     &lt;enumeration value="VT"/>
 *     &lt;enumeration value="AU_VIC"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="WA"/>
 *     &lt;enumeration value="WV"/>
 *     &lt;enumeration value="AU_WA"/>
 *     &lt;enumeration value="WI"/>
 *     &lt;enumeration value="WY"/>
 *     &lt;enumeration value="YT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Jurisdiction", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum Jurisdiction {

    AU_ACT,
    AL,
    AK,
    AB,
    AZ,
    AR,
    DE_BW,
    DE_BY,
    DE_BE,
    DE_BB,
    DE_HB,
    BC,
    CA,
    CO,
    CT,
    DE,
    DC,
    FM,
    FL,
    FR,
    GA,
    GU,
    DE_HH,
    HI,
    DE_HE,
    ID,
    IL,
    IN,
    IA,
    JP,
    KS,
    KY,
    LA,
    DE_NI,
    ME,
    MB,
    MH,
    MD,
    MA,
    DE_MV,
    MI,
    MN,
    MS,
    MO,
    MT,
    NE,
    NV,
    NB,
    NH,
    NJ,
    NM,
    AU_NSW,
    NY,
    NL,
    NC,
    ND,
    DE_NW,
    MP,
    AU_NT,
    NT,
    NS,
    NU,
    OH,
    OK,
    ON,
    OR,
    PA,
    PE,
    PR,
    QC,
    AU_QLD,
    DE_RP,
    RI,
    DE_SL,
    SK,
    DE_SN,
    DE_ST,
    DE_SH,
    AU_SA,
    SC,
    SD,
    AU_TAS,
    TN,
    TX,
    DE_TH,
    GB,
    UT,
    VT,
    AU_VIC,
    VI,
    VA,
    WA,
    WV,
    AU_WA,
    WI,
    WY,
    YT;

    public String value() {
        return name();
    }

    public static Jurisdiction fromValue(String v) {
        return valueOf(v);
    }

}
