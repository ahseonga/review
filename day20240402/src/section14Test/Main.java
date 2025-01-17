package section14Test;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // 회원가입
        userService.signUp("user1", "password1", "John", 25);
        userService.signUp("user2", "password2", "Alice", 30);
        userService.signUp("ahseonga", "1234", "송아성", 33);

        // 중복 아이디로 회원가입 시도
        userService.signUp("ahseonga", "password3", "Bob", 28);

        // 로그인
        userService.login("user1", "password1");
        userService.login("user2", "password2");
        userService.login("user3", "password3"); // 존재하지 않는 아이디
        userService.login("user2", "wrongPassword"); // 잘못된 비밀번호
    }
}