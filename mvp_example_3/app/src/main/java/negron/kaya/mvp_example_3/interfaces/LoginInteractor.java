package negron.kaya.mvp_example_3.interfaces;

import negron.kaya.mvp_example_3.listeners.OnLoginFinishedListener;

public interface LoginInteractor {

    void validateUser(String username, String password, OnLoginFinishedListener listener);
}
