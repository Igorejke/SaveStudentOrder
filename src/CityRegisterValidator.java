public class CityRegisterValidator {

    String hostname;
    String login;
    String password;

    AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("City Register is running: "
                + hostname + "," + login + "," + password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
