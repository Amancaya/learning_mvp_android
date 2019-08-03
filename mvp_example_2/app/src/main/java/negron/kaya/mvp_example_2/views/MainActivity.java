package negron.kaya.mvp_example_2.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import negron.kaya.mvp_example_2.R;
import negron.kaya.mvp_example_2.interfaces.MainActivityPresenter;
import negron.kaya.mvp_example_2.interfaces.MainActivityView;
import negron.kaya.mvp_example_2.presenters.MainActivityPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    private TextView textView;
    private EditText editText;
    private MainActivityPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        editText = findViewById(R.id.edit_text);

        presenter = new MainActivityPresenterImpl(this);
    }

    public void send(View view){
        presenter.addName(editText.getText().toString());
    }

    @Override
    public void showResult(String result) {
        textView.setText(result);
    }
}
