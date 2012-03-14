//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.14 at 08:37:15 AM EDT 
//


package com.litle.sdk.generate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="capability" type="{http://www.litle.com/schema}posCapabilityTypeEnum"/>
 *         &lt;element name="entryMode" type="{http://www.litle.com/schema}posEntryModeTypeEnum"/>
 *         &lt;element name="cardholderId" type="{http://www.litle.com/schema}posCardholderIdTypeEnum"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "pos")
public class Pos {

    @XmlElement(required = true)
    protected PosCapabilityTypeEnum capability;
    @XmlElement(required = true)
    protected PosEntryModeTypeEnum entryMode;
    @XmlElement(required = true)
    protected PosCardholderIdTypeEnum cardholderId;

    /**
     * Gets the value of the capability property.
     * 
     * @return
     *     possible object is
     *     {@link PosCapabilityTypeEnum }
     *     
     */
    public PosCapabilityTypeEnum getCapability() {
        return capability;
    }

    /**
     * Sets the value of the capability property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosCapabilityTypeEnum }
     *     
     */
    public void setCapability(PosCapabilityTypeEnum value) {
        this.capability = value;
    }

    /**
     * Gets the value of the entryMode property.
     * 
     * @return
     *     possible object is
     *     {@link PosEntryModeTypeEnum }
     *     
     */
    public PosEntryModeTypeEnum getEntryMode() {
        return entryMode;
    }

    /**
     * Sets the value of the entryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosEntryModeTypeEnum }
     *     
     */
    public void setEntryMode(PosEntryModeTypeEnum value) {
        this.entryMode = value;
    }

    /**
     * Gets the value of the cardholderId property.
     * 
     * @return
     *     possible object is
     *     {@link PosCardholderIdTypeEnum }
     *     
     */
    public PosCardholderIdTypeEnum getCardholderId() {
        return cardholderId;
    }

    /**
     * Sets the value of the cardholderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosCardholderIdTypeEnum }
     *     
     */
    public void setCardholderId(PosCardholderIdTypeEnum value) {
        this.cardholderId = value;
    }

}
