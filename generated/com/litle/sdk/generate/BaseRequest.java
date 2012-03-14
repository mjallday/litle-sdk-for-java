//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.14 at 08:37:15 AM EDT 
//


package com.litle.sdk.generate;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.litle.com/schema}authentication"/>
 *         &lt;element ref="{http://www.litle.com/schema}transaction"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.litle.com/schema}versionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseRequest", propOrder = {
    "authentication",
    "transaction"
})
@XmlSeeAlso({
    LitleOnlineRequest.class
})
public class BaseRequest {

    @XmlElement(required = true)
    protected Authentication authentication;
    @XmlElementRef(name = "transaction", namespace = "http://www.litle.com/schema", type = JAXBElement.class)
    protected JAXBElement<? extends TransactionType> transaction;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication }
     *     
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication }
     *     
     */
    public void setAuthentication(Authentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegisterTokenRequestType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckVoid }{@code >}
     *     {@link JAXBElement }{@code <}{@link Credit }{@code >}
     *     {@link JAXBElement }{@code <}{@link CaptureGivenAuth }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link Capture }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthReversal }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckSale }{@code >}
     *     {@link JAXBElement }{@code <}{@link Sale }{@code >}
     *     {@link JAXBElement }{@code <}{@link Void }{@code >}
     *     {@link JAXBElement }{@code <}{@link ForceCapture }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckVerification }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckRedeposit }{@code >}
     *     {@link JAXBElement }{@code <}{@link Authorization }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransactionType }{@code >}
     *     
     */
    public JAXBElement<? extends TransactionType> getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegisterTokenRequestType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckVoid }{@code >}
     *     {@link JAXBElement }{@code <}{@link Credit }{@code >}
     *     {@link JAXBElement }{@code <}{@link CaptureGivenAuth }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link Capture }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthReversal }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckSale }{@code >}
     *     {@link JAXBElement }{@code <}{@link Sale }{@code >}
     *     {@link JAXBElement }{@code <}{@link Void }{@code >}
     *     {@link JAXBElement }{@code <}{@link ForceCapture }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckVerification }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckRedeposit }{@code >}
     *     {@link JAXBElement }{@code <}{@link Authorization }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransactionType }{@code >}
     *     
     */
    public void setTransaction(JAXBElement<? extends TransactionType> value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
