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
public class Dialog {
  @Id
  @Setter(AccessLevel.PRIVATE)
  private String _id;
  private String conversationId;
  @Setter(AccessLevel.PRIVATE)
  @DateTimeFormat(iso = ISO.DATE_TIME)
  private LocalDateTime createdAt = LocalDateTime.now();

  @Builder(setterPrefix = "set")
  public Dialog(String conversationId) {
    this.conversationId = conversationId;
  }
}
