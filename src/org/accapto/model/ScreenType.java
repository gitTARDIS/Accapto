//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.02 at 03:13:18 PM CEST 
//


package org.accapto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for screenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="screenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="action" type="{org.accapto}actionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transition" type="{org.accapto}transitionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="input" type="{org.accapto}inputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="output" type="{org.accapto}outputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subscreen" type="{org.accapto}screenType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screenType", propOrder = {
    "content"
})
public class ScreenType {

    @XmlElementRefs({
        @XmlElementRef(name = "subscreen", namespace = "org.accapto", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "input", namespace = "org.accapto", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "output", namespace = "org.accapto", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "action", namespace = "org.accapto", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transition", namespace = "org.accapto", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "transition")
    protected String transition;
    
    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ScreenType }{@code >}
     * {@link JAXBElement }{@code <}{@link InputType }{@code >}
     * {@link JAXBElement }{@code <}{@link ActionType }{@code >}
     * {@link JAXBElement }{@code <}{@link OutputType }{@code >}
     * {@link JAXBElement }{@code <}{@link TransitionType }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }
    
    
    public String getTransition(){
    	return transition;
    }

}
