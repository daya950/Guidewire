
package com.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.guidewire.pc.ccintegration.CCPCFilteringCriteria;
import com.guidewire.pc.ccintegration.CCPCSearchCriteria;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteria" type="{http://guidewire.com/pc/ccintegration}CCPCSearchCriteria" minOccurs="0"/>
 *         &lt;element name="filter" type="{http://guidewire.com/pc/ccintegration}CCPCFilteringCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "criteria",
    "filter"
})
@XmlRootElement(name = "searchForPolicies")
public class SearchForPolicies {

    protected CCPCSearchCriteria criteria;
    protected CCPCFilteringCriteria filter;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link CCPCSearchCriteria }
     *     
     */
    public CCPCSearchCriteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCPCSearchCriteria }
     *     
     */
    public void setCriteria(CCPCSearchCriteria value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link CCPCFilteringCriteria }
     *     
     */
    public CCPCFilteringCriteria getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCPCFilteringCriteria }
     *     
     */
    public void setFilter(CCPCFilteringCriteria value) {
        this.filter = value;
    }

}
