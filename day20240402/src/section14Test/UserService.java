package section14Test;

import java.util.ArrayList;
import java.util.List;

class UserService {
    private List<UserVO> userList; //

    public UserService() {
        this.userList = new ArrayList<>();
    }

    public boolean checkDuplicateId(String id) {
        for (UserVO user : userList) {
            if (user.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void signUp(String id, String password, String name, int age) {
        if (!checkDuplicateId(id)) {
            UserVO newUser = new UserVO(id, password, name, age);
            userList.add(newUser);
            System.out.println("회원가입이 완료되었습니다.");
        } else {
            System.out.println("이미 사용 중인 아이디입니다. 다른 아이디를 입력해주세요.");
        }
    }

    public UserVO login(String id, String password) {
        for (UserVO user : userList) {
            if (user.getId().equals(id) && user.getPassword().equals(password)) {
                System.out.println("로그인 되었습니다.");
                return user;
            }
        }
        System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
        return null;
    }
}