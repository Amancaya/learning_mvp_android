package negron.kaya.mvp_example_1.presenters;

import negron.kaya.mvp_example_1.MainActivity;
import negron.kaya.mvp_example_1.models.MainActivityModel;
import negron.kaya.mvp_example_1.views.MainActivityView;

public class MainActivityPresenter implements MainActivity.Presenter {
    private MainActivity.View view;
    private MainActivity.Model model;

    public MainActivityPresenter(MainActivityView view){
        this.view = view;
        model = new MainActivityModel(this);
    }

    @Override
    public void showResult(String result) {
        if (view != null){
            view.showResult(result);
        }
    }

    @Override
    public void addName(String name) {
        if (view != null){
            model.addName(name);
        }
    }
}
