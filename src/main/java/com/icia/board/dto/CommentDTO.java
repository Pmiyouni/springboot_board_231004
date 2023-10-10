package com.icia.board.dto;

import com.icia.board.entity.CommentEntity;
import com.icia.board.util.UtilClass;
import lombok.*;

@Getter
@Setter
@ToString
public class CommentDTO {
    private Long id;
    private String commentWriter;
    private String commentContents;
    private Long boardId;
    private String createdAt;
    private String updatedAt;

    public static CommentDTO toDTO(CommentEntity commentEntity) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setId(commentEntity.getId());
        commentDTO.setCommentWriter(commentEntity.getCommentWriter());
        commentDTO.setCommentContents(commentEntity.getCommentContents());
        commentDTO.setBoardId(commentEntity.getBoardEntity().getId());
        commentDTO.setCreatedAt(UtilClass.dateTimeFormat(commentEntity.getCreatedAt()));
        commentDTO.setUpdatedAt(UtilClass.dateTimeFormat(commentEntity.getUpdatedAt()));
        return commentDTO;
    }
}