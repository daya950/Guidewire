
package com.guidewire.pc.ccintegration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCCompany">
 *   &lt;complexContent>
 *     &lt;extension base="{http://guidewire.com/pc/ccintegration}CCContact">
 *       &lt;sequence>
 *         &lt;element name="Case" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Employees" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Thirdpartyinsured" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCCompany", propOrder = {
    "_case",
    "employees",
    "thirdpartyinsured"
})
@XmlSeeAlso({
    CCCompanyVendor.class
})
public class CCCompany
    extends CCContact
{

    @XmlElementRef(name = "Case", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> _case;
    @XmlElementRef(name = "Employees", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> employees;
    @XmlElementRef(name = "Thirdpartyinsured", namespace = "http://guidewire.com/pc/ccintegration", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> thirdpartyinsured;

    /**
     * Gets the value of the case property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the case property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getCase() {
        if (_case == null) {
            _case = new ArrayList<JAXBElement<Object>>();
        }
        return this._case;
    }

    /**
     * Gets the value of the employees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getEmployees() {
        if (employees == null) {
            employees = new ArrayList<JAXBElement<Object>>();
        }
        return this.employees;
    }

    /**
     * Gets the value of the thirdpartyinsured property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirdpartyinsured property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThirdpartyinsured().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getThirdpartyinsured() {
        if (thirdpartyinsured == null) {
            thirdpartyinsured = new ArrayList<JAXBElement<Object>>();
        }
        return this.thirdpartyinsured;
    }

}
