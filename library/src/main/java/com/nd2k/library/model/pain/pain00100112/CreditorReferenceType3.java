package com.nd2k.library.model.pain.pain00100112;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorReferenceType3", propOrder = {
        "cdOrPrtry",
        "issr"
})
public class CreditorReferenceType3 {

    @XmlElement(name = "CdOrPrtry", required = true)
    protected CreditorReferenceType2Choice cdOrPrtry;
    @XmlElement(name = "Issr")
    protected String issr;
}
