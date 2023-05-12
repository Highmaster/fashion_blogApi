package com.example.api.DTO;import com.example.api.Entity.User;import lombok.AllArgsConstructor;import lombok.Builder;import lombok.Data;import lombok.NoArgsConstructor;import java.time.LocalDateTime;@Data@Builder@AllArgsConstructor@NoArgsConstructorpublic class PostRequestDTO {    private String title;    private String content;    private User user;    private String author;    private Long AuthorID;    private boolean published;    private LocalDateTime publishedDate;}