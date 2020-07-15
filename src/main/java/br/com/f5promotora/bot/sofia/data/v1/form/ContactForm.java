package br.com.f5promotora.bot.sofia.data.v1.form;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "set")
public class ContactForm implements Serializable {
  private static final long serialVersionUID = 1L;

  private String phone;
  private String partnerId;
}
