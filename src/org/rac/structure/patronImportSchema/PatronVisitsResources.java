//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.12 at 10:00:45 AM EST 
//


package org.rac.structure.patronImportSchema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for patronVisitsResources complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patronVisitsResources">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourceTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patronVisitsResources", propOrder = {
    "resourceIdentifier",
    "resourceTitle"
})
public class PatronVisitsResources {

    @XmlElement(required = true)
    protected String resourceIdentifier;
    @XmlElement(required = true)
    protected String resourceTitle;

    /**
     * Gets the value of the resourceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceIdentifier() {
        return resourceIdentifier;
    }

    /**
     * Sets the value of the resourceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceIdentifier(String value) {
        this.resourceIdentifier = value;
    }

    /**
     * Gets the value of the resourceTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceTitle() {
        return resourceTitle;
    }

    /**
     * Sets the value of the resourceTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceTitle(String value) {
        this.resourceTitle = value;
    }

}