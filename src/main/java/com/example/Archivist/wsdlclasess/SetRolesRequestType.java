//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.10 at 12:29:08 AM YEKT 
//


package com.example.Archivist.wsdlclasess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Запрос на присваивание пользователю списка ролей
 * 
 * <p>Java class for SetRolesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetRolesRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hostco.ru/reguser/types}UserIDType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoleList" type="{http://www.hostco.ru/reguser/types}RoleListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetRolesRequestType", propOrder = {
    "roleList"
})
public class SetRolesRequestType
    extends UserIDType
{

    @XmlElement(name = "RoleList", required = true)
    protected RoleListType roleList;

    /**
     * Gets the value of the roleList property.
     * 
     * @return
     *     possible object is
     *     {@link RoleListType }
     *     
     */
    public RoleListType getRoleList() {
        return roleList;
    }

    /**
     * Sets the value of the roleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleListType }
     *     
     */
    public void setRoleList(RoleListType value) {
        this.roleList = value;
    }

}
