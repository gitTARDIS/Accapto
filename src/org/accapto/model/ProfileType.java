//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.02 at 03:13:18 PM CEST 
//


package org.accapto.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="profileType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="no restrictions"/&gt;
 *     &lt;enumeration value="high contrast"/&gt;
 *     &lt;enumeration value="blind"/&gt;
 *     &lt;enumeration value="easy read"/&gt;
 *     &lt;enumeration value="easy touch"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "profileType")
@XmlEnum
public enum ProfileType {

    @XmlEnumValue("no restrictions")
    NO_RESTRICTIONS("no restrictions"),
    @XmlEnumValue("high contrast")
    HIGH_CONTRAST("high contrast"),
    @XmlEnumValue("blind")
    BLIND("blind"),
    @XmlEnumValue("easy read")
    EASY_READ("easy read"),
    @XmlEnumValue("easy touch")
    EASY_TOUCH("easy touch");
    private final String value;

    ProfileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProfileType fromValue(String v) {
        for (ProfileType c: ProfileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
