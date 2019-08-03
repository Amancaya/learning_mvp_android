package negron.kaya.mvp_example_2.presenters;

import negron.kaya.mvp_example_2.interactors.MainActivityInteractorImpl;
import negron.kaya.mvp_example_2.interfaces.MainActivityInteractor;
import negron.kaya.mvp_example_2.interfaces.MainActivityPresenter;
import negron.kaya.mvp_example_2.interfaces.MainActivityView;

public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivityInteractor interactor;
    private MainActivityView view;

    public MainActivityPresenterImpl(MainActivityView view) {
        this.view = view;
        interactor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void showResult(String result) {
        if (view != null) {
            view.showResult(result);
        }
    }

    @Override
    public void addName(String name) {
        if (view != null) {
            interactor.addName(name);
        }
    }
}
