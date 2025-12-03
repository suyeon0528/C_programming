package java_13week;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {


    public static Map<String, String> initializeUserDB() {
        Map<String, String> userDB = new HashMap<>();

        userDB.put("myId", "myPass");
        userDB.put("myId2", "myPass2");
        userDB.put("myId3", "myPass3");

        return userDB;
    }

    public static void main(String[] args) {
        Map<String, String> userDB = initializeUserDB();

        Scanner scanner = new Scanner(System.in);

        boolean loginSuccess = false;


        while (!loginSuccess) {
            System.out.println("id와 password를 입력해주세요.");

            System.out.print("id : ");

            String inputId = scanner.nextLine().trim();

            if (!userDB.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }


            System.out.print("password : ");

            String inputPassword = scanner.nextLine().trim();


            String storedPassword = userDB.get(inputId);

            if (storedPassword.equals(inputPassword)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                loginSuccess = true;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }

        scanner.close();
    }
}