public class User {
    private PersonalInfo personalInfo;
    private Account account;

    public User(PersonalInfo personalInfo, Account account) {
        this.personalInfo = personalInfo;
        this.account = account;
    }

    public void displayPersonalInfo() {
        personalInfo.display();
    }

    public boolean login(String username, String password) {
        return account.login(username, password);
    }
}
