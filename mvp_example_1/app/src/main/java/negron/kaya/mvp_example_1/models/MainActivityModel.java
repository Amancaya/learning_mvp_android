package negron.kaya.mvp_example_1.models;

import negron.kaya.mvp_example_1.MainActivity;

public class MainActivityModel implements MainActivity.Model {

    private MainActivity.Presenter presenter;

    public MainActivityModel(MainActivity.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void addName(String name) {
        presenter.showResult("prueba "+ name);
    }
}
