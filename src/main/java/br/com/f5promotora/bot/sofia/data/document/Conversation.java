package br.com.f5promotora.bot.sofia.data.document;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Document
@NoArgsConstructor
public class Conversation {
  @Id
  @Setter(AccessLevel.PRIVATE)
  private String _id;
  private Boolean active;
  private String contactId;
  @Setter(AccessLevel.PRIVATE)
  @DateTimeFormat(iso = ISO.DATE_TIME)
  private LocalDateTime createdAt = LocalDateTime.now();

  @Builder(setterPrefix = "set")
  public Conversation(Boolean active, String contactId) {
    this.active = active;
    this.contactId = contactId;
  }
}
