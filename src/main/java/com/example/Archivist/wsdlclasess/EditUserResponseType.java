//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.10 at 12:29:08 AM YEKT 
//


package com.example.Archivist.wsdlclasess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Ответ на запрос на редактиорвание пользователя
 * 
 * <p>Java class for EditUserResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditUserResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hostco.ru/reguser/types}StandartResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mcode" type="{http://www.hostco.ru/reguser/types}MuCodeType" minOccurs="0"/&gt;
 *         &lt;element name="warnings" type="{http://www.hostco.ru/reguser/types}WarningListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditUserResponseType", propOrder = {
    "mcode",
    "warnings"
})
public class EditUserResponseType
    extends StandartResponseType
{

    protected String mcode;
    protected WarningListType warnings;

    /**
     * Gets the value of the mcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcode() {
        return mcode;
    }

    /**
     * Sets the value of the mcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcode(String value) {
        this.mcode = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link WarningListType }
     *     
     */
    public WarningListType getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningListType }
     *     
     */
    public void setWarnings(WarningListType value) {
        this.warnings = value;
    }

}
