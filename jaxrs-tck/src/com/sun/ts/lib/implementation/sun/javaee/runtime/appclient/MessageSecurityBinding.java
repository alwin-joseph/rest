//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0-M3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.15 at 01:27:15 PM UTC 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.appclient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageSecurity"
})
@XmlRootElement(name = "message-security-binding")
public class MessageSecurityBinding
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "auth-layer", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String authLayer;
    @XmlAttribute(name = "provider-id")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String providerId;
    @XmlElement(name = "message-security")
    protected List<MessageSecurity> messageSecurity;

    /**
     * Gets the value of the authLayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthLayer() {
        return authLayer;
    }

    /**
     * Sets the value of the authLayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthLayer(String value) {
        this.authLayer = value;
    }

    /**
     * Gets the value of the providerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderId(String value) {
        this.providerId = value;
    }

    /**
     * Gets the value of the messageSecurity property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the messageSecurity property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getMessageSecurity().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link MessageSecurity }
     * 
     * 
     */
    public List<MessageSecurity> getMessageSecurity() {
        if (messageSecurity == null) {
            messageSecurity = new ArrayList<MessageSecurity>();
        }
        return this.messageSecurity;
    }

}
