//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.24 at 01:10:08 PM EST 
//


package com.litle.sdk.generate;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cardProductTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cardProductTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="COMMERCIAL"/>
 *     &lt;enumeration value="CONSUMER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cardProductTypeEnum")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-02-24T01:10:07-05:00", comments = "JAXB RI v2.2.5")
public enum CardProductTypeEnum {

    UNKNOWN,
    COMMERCIAL,
    CONSUMER;

    public String value() {
        return name();
    }

    public static CardProductTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}