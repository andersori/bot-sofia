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
public class Message {
  @Id
  @Setter(AccessLevel.PRIVATE)
  private String _id;
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
  @Setter(AccessLevel.PRIVATE)
  @DateTimeFormat(iso = ISO.DATE_TIME)
  private LocalDateTime createdAt = LocalDateTime.now();

  @Builder(setterPrefix = "set")
  public Message(String dialogId, String id, String body, String type, String senderName,
      Boolean fromMe, String author, LocalDateTime time, String chatId, String messageNumber) {
    this.dialogId = dialogId;
    this.id = id;
    this.body = body;
    this.type = type;
    this.senderName = senderName;
    this.fromMe = fromMe;
    this.author = author;
    this.time = time;
    this.chatId = chatId;
    this.messageNumber = messageNumber;
  }

}
