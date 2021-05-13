package com.example.shehab.complainant;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login_Activity extends AppCompatActivity {
private FirebaseAuth mAuth;
private EditText eMail,pAssword;
private Button signin;
private ProgressDialog Loginbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        mAuth = FirebaseAuth.getInstance();

        TextView link_text = (TextView)findViewById(R.id.text_link);
        eMail = (EditText)findViewById(R.id.edt_email);
        pAssword = (EditText)findViewById(R.id.edt_pass);
        signin = (Button)findViewById(R.id.btn_con);
        YoYo.with(Techniques.FadeInDown)
                .duration(2500)
                .playOn(findViewById(R.id.text_e));
        YoYo.with(Techniques.FadeInDown)
                .duration(4500)
                .playOn(findViewById(R.id.edt_email));
        YoYo.with(Techniques.FadeInDown)
                .duration(8500)
                .playOn(findViewById(R.id.edt_pass));
        YoYo.with(Techniques.FadeInDown)
                .duration(8500)
                .playOn(findViewById(R.id.btn_con));
        YoYo.with(Techniques.FadeInDown)
                .duration(8500)
                .playOn(findViewById(R.id.text_link));

        link_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Register_Activity.class));
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginuserAccount(eMail.getText().toString(),pAssword.getText().toString());
            }
        });
        Loginbar=new ProgressDialog(this);

    }
    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currnetuser=mAuth.getCurrentUser();

        if(currnetuser!=null)
        {
            startActivity(new Intent(getApplicationContext(),First_departments.class));
        }

    }

    public void LoginuserAccount(String email, String password)
    {

        if(TextUtils.isEmpty(email))
        {

            Toast.makeText(getBaseContext(),"enter your email", Toast.LENGTH_LONG).show();
        }
        if(TextUtils.isEmpty(password))
        {

            Toast.makeText(getBaseContext(),"enter your password", Toast.LENGTH_LONG).show();
        }else
        {
            Loginbar.setTitle("Login Account");
            Loginbar.setMessage("Now will done login the account ");
            Loginbar.show();
            mAuth.signInWithEmailAndPassword(email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>()
                    {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task)
                        {

                            if (task.isSuccessful())
                            {
                                Intent mainIntent=new Intent(getApplicationContext(),First_departments.class);
                                mainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                startActivity(mainIntent);
                                finish();
                            }
                            else
                            {
                                String messgae=task.toString();
                                Toast.makeText(getBaseContext(),"make sure the email or password is corrected"+messgae, Toast.LENGTH_LONG).show();
                            }
                            Loginbar.dismiss();
                        }
                    });

        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();

    }
}
