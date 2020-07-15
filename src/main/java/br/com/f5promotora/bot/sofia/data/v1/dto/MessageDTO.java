package br.com.f5promotora.bot.sofia.data.v1.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
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
public class MessageDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  private String id;
  private String idChatApi;
  private String body;
  private String type;
  private String senderName;
  private Boolean fromMe;
  private String author;
  private LocalDateTime time;
  private String chatId;
  private String messageNumber;
  @DateTimeFormat(iso = ISO.DATE_TIME)
  private LocalDateTime createdAt;
}
