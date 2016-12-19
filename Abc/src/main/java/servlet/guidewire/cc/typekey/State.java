
package servlet.guidewire.cc.typekey;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for State.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="State">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hokkaido"/>
 *     &lt;enumeration value="Aomori"/>
 *     &lt;enumeration value="Iwate"/>
 *     &lt;enumeration value="Miyagi"/>
 *     &lt;enumeration value="Akita"/>
 *     &lt;enumeration value="Yamagata"/>
 *     &lt;enumeration value="Fukushima"/>
 *     &lt;enumeration value="Ibaraki"/>
 *     &lt;enumeration value="AU_JBT"/>
 *     &lt;enumeration value="Tochigi"/>
 *     &lt;enumeration value="Gumma"/>
 *     &lt;enumeration value="Saitama"/>
 *     &lt;enumeration value="Chiba"/>
 *     &lt;enumeration value="Tokyo"/>
 *     &lt;enumeration value="Kanagawa"/>
 *     &lt;enumeration value="Niigata"/>
 *     &lt;enumeration value="Toyama"/>
 *     &lt;enumeration value="Ishikawa"/>
 *     &lt;enumeration value="Fukui"/>
 *     &lt;enumeration value="Yamanashi"/>
 *     &lt;enumeration value="Nagano"/>
 *     &lt;enumeration value="Gifu"/>
 *     &lt;enumeration value="Shizuoka"/>
 *     &lt;enumeration value="Aichi"/>
 *     &lt;enumeration value="Mie"/>
 *     &lt;enumeration value="Shiga"/>
 *     &lt;enumeration value="Kyoto"/>
 *     &lt;enumeration value="Osaka"/>
 *     &lt;enumeration value="Hyogo"/>
 *     &lt;enumeration value="Nara"/>
 *     &lt;enumeration value="Wakayama"/>
 *     &lt;enumeration value="Tottori"/>
 *     &lt;enumeration value="Shimane"/>
 *     &lt;enumeration value="Okayama"/>
 *     &lt;enumeration value="Hiroshima"/>
 *     &lt;enumeration value="Yamaguchi"/>
 *     &lt;enumeration value="Tokushima"/>
 *     &lt;enumeration value="Kagawa"/>
 *     &lt;enumeration value="Ehime"/>
 *     &lt;enumeration value="Kochi"/>
 *     &lt;enumeration value="Fukuoka"/>
 *     &lt;enumeration value="Saga"/>
 *     &lt;enumeration value="Nagasaki"/>
 *     &lt;enumeration value="Kumamoto"/>
 *     &lt;enumeration value="Oita"/>
 *     &lt;enumeration value="Miyazaki"/>
 *     &lt;enumeration value="Kagoshima"/>
 *     &lt;enumeration value="Okinawa"/>
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
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GU"/>
 *     &lt;enumeration value="DE_HH"/>
 *     &lt;enumeration value="HI"/>
 *     &lt;enumeration value="DE_HE"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="IA"/>
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
@XmlType(name = "State", namespace = "http://guidewire.com/cc/typekey")
@XmlEnum
public enum State {

    @XmlEnumValue("Hokkaido")
    HOKKAIDO("Hokkaido"),
    @XmlEnumValue("Aomori")
    AOMORI("Aomori"),
    @XmlEnumValue("Iwate")
    IWATE("Iwate"),
    @XmlEnumValue("Miyagi")
    MIYAGI("Miyagi"),
    @XmlEnumValue("Akita")
    AKITA("Akita"),
    @XmlEnumValue("Yamagata")
    YAMAGATA("Yamagata"),
    @XmlEnumValue("Fukushima")
    FUKUSHIMA("Fukushima"),
    @XmlEnumValue("Ibaraki")
    IBARAKI("Ibaraki"),
    AU_JBT("AU_JBT"),
    @XmlEnumValue("Tochigi")
    TOCHIGI("Tochigi"),
    @XmlEnumValue("Gumma")
    GUMMA("Gumma"),
    @XmlEnumValue("Saitama")
    SAITAMA("Saitama"),
    @XmlEnumValue("Chiba")
    CHIBA("Chiba"),
    @XmlEnumValue("Tokyo")
    TOKYO("Tokyo"),
    @XmlEnumValue("Kanagawa")
    KANAGAWA("Kanagawa"),
    @XmlEnumValue("Niigata")
    NIIGATA("Niigata"),
    @XmlEnumValue("Toyama")
    TOYAMA("Toyama"),
    @XmlEnumValue("Ishikawa")
    ISHIKAWA("Ishikawa"),
    @XmlEnumValue("Fukui")
    FUKUI("Fukui"),
    @XmlEnumValue("Yamanashi")
    YAMANASHI("Yamanashi"),
    @XmlEnumValue("Nagano")
    NAGANO("Nagano"),
    @XmlEnumValue("Gifu")
    GIFU("Gifu"),
    @XmlEnumValue("Shizuoka")
    SHIZUOKA("Shizuoka"),
    @XmlEnumValue("Aichi")
    AICHI("Aichi"),
    @XmlEnumValue("Mie")
    MIE("Mie"),
    @XmlEnumValue("Shiga")
    SHIGA("Shiga"),
    @XmlEnumValue("Kyoto")
    KYOTO("Kyoto"),
    @XmlEnumValue("Osaka")
    OSAKA("Osaka"),
    @XmlEnumValue("Hyogo")
    HYOGO("Hyogo"),
    @XmlEnumValue("Nara")
    NARA("Nara"),
    @XmlEnumValue("Wakayama")
    WAKAYAMA("Wakayama"),
    @XmlEnumValue("Tottori")
    TOTTORI("Tottori"),
    @XmlEnumValue("Shimane")
    SHIMANE("Shimane"),
    @XmlEnumValue("Okayama")
    OKAYAMA("Okayama"),
    @XmlEnumValue("Hiroshima")
    HIROSHIMA("Hiroshima"),
    @XmlEnumValue("Yamaguchi")
    YAMAGUCHI("Yamaguchi"),
    @XmlEnumValue("Tokushima")
    TOKUSHIMA("Tokushima"),
    @XmlEnumValue("Kagawa")
    KAGAWA("Kagawa"),
    @XmlEnumValue("Ehime")
    EHIME("Ehime"),
    @XmlEnumValue("Kochi")
    KOCHI("Kochi"),
    @XmlEnumValue("Fukuoka")
    FUKUOKA("Fukuoka"),
    @XmlEnumValue("Saga")
    SAGA("Saga"),
    @XmlEnumValue("Nagasaki")
    NAGASAKI("Nagasaki"),
    @XmlEnumValue("Kumamoto")
    KUMAMOTO("Kumamoto"),
    @XmlEnumValue("Oita")
    OITA("Oita"),
    @XmlEnumValue("Miyazaki")
    MIYAZAKI("Miyazaki"),
    @XmlEnumValue("Kagoshima")
    KAGOSHIMA("Kagoshima"),
    @XmlEnumValue("Okinawa")
    OKINAWA("Okinawa"),
    AU_ACT("AU_ACT"),
    AL("AL"),
    AK("AK"),
    AB("AB"),
    AZ("AZ"),
    AR("AR"),
    DE_BW("DE_BW"),
    DE_BY("DE_BY"),
    DE_BE("DE_BE"),
    DE_BB("DE_BB"),
    DE_HB("DE_HB"),
    BC("BC"),
    CA("CA"),
    CO("CO"),
    CT("CT"),
    DE("DE"),
    DC("DC"),
    FM("FM"),
    FL("FL"),
    GA("GA"),
    GU("GU"),
    DE_HH("DE_HH"),
    HI("HI"),
    DE_HE("DE_HE"),
    ID("ID"),
    IL("IL"),
    IN("IN"),
    IA("IA"),
    KS("KS"),
    KY("KY"),
    LA("LA"),
    DE_NI("DE_NI"),
    ME("ME"),
    MB("MB"),
    MH("MH"),
    MD("MD"),
    MA("MA"),
    DE_MV("DE_MV"),
    MI("MI"),
    MN("MN"),
    MS("MS"),
    MO("MO"),
    MT("MT"),
    NE("NE"),
    NV("NV"),
    NB("NB"),
    NH("NH"),
    NJ("NJ"),
    NM("NM"),
    AU_NSW("AU_NSW"),
    NY("NY"),
    NL("NL"),
    NC("NC"),
    ND("ND"),
    DE_NW("DE_NW"),
    MP("MP"),
    AU_NT("AU_NT"),
    NT("NT"),
    NS("NS"),
    NU("NU"),
    OH("OH"),
    OK("OK"),
    ON("ON"),
    OR("OR"),
    PA("PA"),
    PE("PE"),
    PR("PR"),
    QC("QC"),
    AU_QLD("AU_QLD"),
    DE_RP("DE_RP"),
    RI("RI"),
    DE_SL("DE_SL"),
    SK("SK"),
    DE_SN("DE_SN"),
    DE_ST("DE_ST"),
    DE_SH("DE_SH"),
    AU_SA("AU_SA"),
    SC("SC"),
    SD("SD"),
    AU_TAS("AU_TAS"),
    TN("TN"),
    TX("TX"),
    DE_TH("DE_TH"),
    UT("UT"),
    VT("VT"),
    AU_VIC("AU_VIC"),
    VI("VI"),
    VA("VA"),
    WA("WA"),
    WV("WV"),
    AU_WA("AU_WA"),
    WI("WI"),
    WY("WY"),
    YT("YT");
    private final String value;

    State(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static State fromValue(String v) {
        for (State c: State.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
