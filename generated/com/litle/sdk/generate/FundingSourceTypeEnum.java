//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.14 at 08:37:15 AM EDT 
//


package com.litle.sdk.generate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fundingSourceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fundingSourceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="PREPAID"/>
 *     &lt;enumeration value="FSA"/>
 *     &lt;enumeration value="CREDIT"/>
 *     &lt;enumeration value="DEBIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fundingSourceTypeEnum")
@XmlEnum
public enum FundingSourceTypeEnum {

    UNKNOWN,
    PREPAID,
    FSA,
    CREDIT,
    DEBIT;

    public String value() {
        return name();
    }

    public static FundingSourceTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
