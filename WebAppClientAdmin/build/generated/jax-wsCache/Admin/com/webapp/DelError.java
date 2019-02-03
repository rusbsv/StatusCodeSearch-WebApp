
package com.webapp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nametable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errcode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delError", propOrder = {
    "nametable",
    "errcode"
})
public class DelError {

    protected String nametable;
    protected int errcode;

    /**
     * Gets the value of the nametable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNametable() {
        return nametable;
    }

    /**
     * Sets the value of the nametable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNametable(String value) {
        this.nametable = value;
    }

    /**
     * Gets the value of the errcode property.
     * 
     */
    public int getErrcode() {
        return errcode;
    }

    /**
     * Sets the value of the errcode property.
     * 
     */
    public void setErrcode(int value) {
        this.errcode = value;
    }

}
