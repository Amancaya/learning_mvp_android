package negron.kaya.mvp_example_3.interfaces;

public interface LoginView {

    void onHideProgress();

    void onShowProgress();

    void onAccessDenied();

    void onAccessSucessfull();
}
