package br.com.f5promotora.bot.sofia.data.v1.form;

import java.io.Serializable;
import java.time.LocalDateTime;
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
public class MessageForm implements Serializable {
  private static final long serialVersionUID = 1L;

  private String dialogId;
  private String id;
  private String body;
  private String type;
  private String senderName;
  private Boolean fromMe;
  private String author;
  private LocalDateTime time;
  private String chatId;
  private String messageNumber;
}
