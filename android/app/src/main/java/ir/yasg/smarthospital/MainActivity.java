package ir.yasg.smarthospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText userName;
    EditText password;

    String user;
    String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = userName.getText().toString();
                pass = password.getText().toString();
                Intent intent = new Intent(MainActivity.this , nurseDashboard.class);
                //startActivity(intent);
                if (user.equals("doctor") && pass.equals("123456")){
                    //Intent intent = new Intent(MainActivity.this , nurseDashboard.class);
                    startActivity(intent);

                }else {
                    if (userName.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "نام کاربری را وارد نمایید", Toast.LENGTH_LONG).show();
                    }
                    if(password.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this, "کلمه عبور را وارد نمایید", Toast.LENGTH_LONG).show();
                    }else {
                        Toast.makeText(MainActivity.this, "اطلاعات وارد شده صحیح نمی باشد!!!", Toast.LENGTH_LONG).show();
                    }
                }

            }
        });



    }
    public void initialization(){
        btnLogin = findViewById(R.id.btn_login);
        userName = findViewById(R.id.et_user_name);
        password = findViewById(R.id.et_password);

    }
    public void isValidet(){

    }

}
