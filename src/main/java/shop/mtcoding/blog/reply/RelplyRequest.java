package shop.mtcoding.blog.reply;

import lombok.Data;
import org.springframework.web.bind.annotation.PathVariable;
import shop.mtcoding.blog.board.Board;
import shop.mtcoding.blog.user.User;

public class RelplyRequest {
    @Data
    public static class SaveDTO {
        private Integer boardId;
        private String comment;

        public Reply toEntity(User sessionUser, Board board) {
            return Reply.builder()
                    .comment(comment)
                    .board(board)
                    .user(sessionUser)
                    .build();
        }
    }
}
