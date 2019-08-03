package negron.kaya.mvp_example_1;

public interface MainActivity {

    interface View {
        void showResult(String result);
    }

    interface Presenter {
        void showResult(String result);
        void addName(String name);
    }

    interface Model {
        void addName(String name);
    }

}
