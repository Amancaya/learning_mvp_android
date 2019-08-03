package negron.kaya.mvp_example_1.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import negron.kaya.mvp_example_1.MainActivity;
import negron.kaya.mvp_example_1.R;
import negron.kaya.mvp_example_1.presenters.MainActivityPresenter;

public class MainActivityView extends AppCompatActivity implements MainActivity.View {

    private MainActivity.Presenter presenter;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txt_message);
        editText = findViewById(R.id.edit_text);

        presenter = new MainActivityPresenter(this);

    }

    public void onClick(View view){
        presenter.addName(editText.getText().toString());
    }

    @Override
    public void showResult(String result) {
        textView.setText(result);
    }
}
