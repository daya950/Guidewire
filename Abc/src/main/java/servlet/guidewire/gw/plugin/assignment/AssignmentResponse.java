
package servlet.guidewire.gw.plugin.assignment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssignmentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignmentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssignmentCommand" type="{http://guidewire.com/gw/plugin/assignment}AssignmentCommand" minOccurs="0"/>
 *         &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReviewAssignment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReviewerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignmentResponse", propOrder = {
    "assignmentCommand",
    "groupID",
    "groupType",
    "queueID",
    "reviewAssignment",
    "reviewerId",
    "userID"
})
public class AssignmentResponse {

    @XmlElement(name = "AssignmentCommand")
    @XmlSchemaType(name = "string")
    protected AssignmentCommand assignmentCommand;
    @XmlElement(name = "GroupID")
    protected String groupID;
    @XmlElement(name = "GroupType")
    protected String groupType;
    @XmlElement(name = "QueueID")
    protected String queueID;
    @XmlElement(name = "ReviewAssignment")
    protected Boolean reviewAssignment;
    @XmlElement(name = "ReviewerId")
    protected String reviewerId;
    @XmlElement(name = "UserID")
    protected String userID;

    /**
     * Gets the value of the assignmentCommand property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentCommand }
     *     
     */
    public AssignmentCommand getAssignmentCommand() {
        return assignmentCommand;
    }

    /**
     * Sets the value of the assignmentCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentCommand }
     *     
     */
    public void setAssignmentCommand(AssignmentCommand value) {
        this.assignmentCommand = value;
    }

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

    /**
     * Gets the value of the queueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueID() {
        return queueID;
    }

    /**
     * Sets the value of the queueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueID(String value) {
        this.queueID = value;
    }

    /**
     * Gets the value of the reviewAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReviewAssignment() {
        return reviewAssignment;
    }

    /**
     * Sets the value of the reviewAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReviewAssignment(Boolean value) {
        this.reviewAssignment = value;
    }

    /**
     * Gets the value of the reviewerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewerId() {
        return reviewerId;
    }

    /**
     * Sets the value of the reviewerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewerId(String value) {
        this.reviewerId = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

}
