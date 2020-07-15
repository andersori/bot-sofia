package br.com.f5promotora.bot.sofia.data.v1.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
public class PartnerDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  private String id;
  private String name;
  private String city;
  private Boolean sub;
  private Set<ContactDTO> contacts;
  @DateTimeFormat(iso = ISO.DATE_TIME)
  private LocalDateTime createdAt;
}
