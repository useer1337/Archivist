//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.10 at 12:29:08 AM YEKT 
//


package com.example.Archivist.wsdlclasess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Запрос на изменение атрибутов пользователя в единой базе данных пользователей здравоохранения ХМАО-Югры
 * 
 * <p>Java class for EditUserRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditUserRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hostco.ru/reguser/types}LoginType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mcode" type="{http://www.hostco.ru/reguser/types}MuCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.hostco.ru/reguser/types}token"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditUserRequestType", propOrder = {
    "mcode"
})
public class EditUserRequestType
    extends LoginType
{

    protected String mcode;
    @XmlAttribute(name = "token", namespace = "http://www.hostco.ru/reguser/types")
    protected String token;

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
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
