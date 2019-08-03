package negron.kaya.mvp_example_3.interfaces;

public interface LoginPresenter {

    void validateUser(String username, String password);

    void attemptLogin(String name, String password);
}
