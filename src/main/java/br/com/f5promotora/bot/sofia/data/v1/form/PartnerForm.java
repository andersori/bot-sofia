package br.com.f5promotora.bot.sofia.data.v1.form;

import java.io.Serializable;
import java.util.Set;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "set")
public class PartnerForm implements Serializable {
  private static final long serialVersionUID = 1L;

  private String name;
  private String city;
  private Boolean sub;
  private Set<ContactForm> contacts;
}
