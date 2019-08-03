package negron.kaya.mvp_example_2.interactors;

import negron.kaya.mvp_example_2.interfaces.MainActivityInteractor;
import negron.kaya.mvp_example_2.interfaces.MainActivityPresenter;
import negron.kaya.mvp_example_2.presenters.MainActivityPresenterImpl;

public class MainActivityInteractorImpl implements MainActivityInteractor {

    private MainActivityPresenter presenter;

    public MainActivityInteractorImpl(MainActivityPresenterImpl presenter){
        this.presenter = presenter;
    }

    @Override
    public void addName(String name) {
        presenter.showResult("Prueba 2 "+ name);
    }
}
