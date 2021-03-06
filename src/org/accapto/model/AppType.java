//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.02 at 03:13:18 PM CEST 
//


package org.accapto.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="profile" type="{org.accapto}profileType" maxOccurs="5"/&gt;
 *         &lt;element name="screen" type="{org.accapto}screenType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="appname" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="package" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appType", propOrder = {
		"profile",
		"screen"
})
public class AppType {

	@XmlElement(required = true)
	@XmlSchemaType(name = "string")
	protected List<ProfileType> profile;
	protected List<ScreenType> screen;
	@XmlAttribute(name = "appname")
	protected String appname;
	@XmlAttribute(name = "package", required = true)
	protected String _package;

	/**
	 * Gets the value of the profile property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the profile property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getProfile().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ProfileType }
	 * 
	 * 
	 */
	public List<ProfileType> getProfile() {
		if (profile == null) {
			profile = new ArrayList<ProfileType>();
		}
		return this.profile;
	}

	/**
	 * Gets the value of the screen property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the screen property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getScreen().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ScreenType }
	 * 
	 * 
	 */
	public List<ScreenType> getScreen() {
		if (screen == null) {
			screen = new ArrayList<ScreenType>();
		}
		return this.screen;
	}

	/**
	 * Gets the value of the appname property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getAppname() {
		return appname;
	}

	/**
	 * Sets the value of the appname property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setAppname(String value) {
		this.appname = value;
	}

	/**
	 * Gets the value of the package property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getPackage() {
		return _package;
	}

	/**
	 * Sets the value of the package property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setPackage(String value) {
		this._package = value;
	}

}
