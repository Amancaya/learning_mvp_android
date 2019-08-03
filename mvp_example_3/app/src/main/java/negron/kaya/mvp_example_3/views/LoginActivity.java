package negron.kaya.mvp_example_3.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ViewUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import negron.kaya.mvp_example_3.R;
import negron.kaya.mvp_example_3.interfaces.LoginPresenter;
import negron.kaya.mvp_example_3.interfaces.LoginView;
import negron.kaya.mvp_example_3.presenters.LoginPresenterImpl;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private EditText editUsername;
    private EditText editPassword;
    private ProgressBar progressBar;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPassword = findViewById(R.id.edit_password);
        editUsername = findViewById(R.id.edit_username);
        progressBar = findViewById(R.id.progress);

        loginPresenter = new LoginPresenterImpl(this);
    }

    public void send(View view){
        loginPresenter.attemptLogin(editUsername.getText().toString(), editPassword.getText().toString());
    }

    @Override
    public void onHideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onShowProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void onAccessDenied() {
        Toast.makeText(this, "Error!!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAccessSucessfull() {
        Toast.makeText(this, "Correcto!!!", Toast.LENGTH_SHORT).show();
    }
}
