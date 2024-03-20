package shop.mtcoding.blog.user;

public class UserResponse {
    public static class DTO{
        private int id;
        private String username;
        private String email;

        public DTO(User user) {
            this.id = user.getId();
            this.username = user.getUsername();
            this.email = user.getEmail();
        }
    }
}
