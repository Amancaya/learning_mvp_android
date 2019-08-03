package negron.kaya.mvp_example_3.interactors;


import android.os.Handler;

import negron.kaya.mvp_example_3.interfaces.LoginInteractor;
import negron.kaya.mvp_example_3.listeners.OnLoginFinishedListener;

public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void validateUser(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (username.length()> 0 && password.length() > 0) {
                    listener.onSuccess();
                } else {
                    listener.onError();
                }
            }
        }, 300);
    }
}
