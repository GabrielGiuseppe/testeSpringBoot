package br.com.questdev.teste.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseDomain implements Serializable{

    private static final long serialVersionUID = -3503938546660658435L;
}
