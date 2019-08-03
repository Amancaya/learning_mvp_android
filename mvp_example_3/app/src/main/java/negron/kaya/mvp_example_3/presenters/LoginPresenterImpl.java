package negron.kaya.mvp_example_3.presenters;

import negron.kaya.mvp_example_3.interactors.LoginInteractorImpl;
import negron.kaya.mvp_example_3.interfaces.LoginInteractor;
import negron.kaya.mvp_example_3.interfaces.LoginPresenter;
import negron.kaya.mvp_example_3.interfaces.LoginView;
import negron.kaya.mvp_example_3.listeners.OnLoginFinishedListener;

public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishedListener {

    private LoginView view;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView view){
        this.interactor = new LoginInteractorImpl();
        this.view = view;
    }

    @Override
    public void validateUser(String username, String password) {

    }

    @Override
    public void attemptLogin(String name, String password) {
        if (view != null) {
            view.onShowProgress();
            interactor.validateUser(name, password, this);
        }
    }

    @Override
    public void onSuccess() {
        if (view != null) {
            view.onHideProgress();
            view.onAccessSucessfull();
        }
    }

    @Override
    public void onError() {
        if (view != null) {
            view.onHideProgress();
            view.onAccessDenied();
        }
    }
}
