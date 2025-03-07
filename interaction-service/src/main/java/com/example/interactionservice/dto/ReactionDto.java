package com.example.interactionservice.dto;

import com.example.interactionservice.entity.enums.ReactionType;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReactionDto {

    private Long id;
    private Long postId;
    private Long userId;
    private ReactionType reactionType;
    private int countReactions;
    private int countLikes;
    private int countLoves;
    private int countSad;
    private int countAngry;
    private int countHahah;
    private int countWow;
    private LocalDateTime createdAt;
}
