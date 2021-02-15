//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0-M3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.15 at 01:27:15 PM UTC 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.ejb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "callerPropagation"
})
@XmlRootElement(name = "sas-context")
public class SasContext
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "caller-propagation", required = true)
    protected String callerPropagation;

    /**
     * Gets the value of the callerPropagation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerPropagation() {
        return callerPropagation;
    }

    /**
     * Sets the value of the callerPropagation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerPropagation(String value) {
        this.callerPropagation = value;
    }

}
