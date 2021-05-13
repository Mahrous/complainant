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
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register_Activity extends AppCompatActivity {

    private Button cOnfirm_button;
    private EditText eMail,pAssword,cOnfirmPassword;
    private String Current_user_id;
    private ProgressDialog mprogress;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);
        mAuth = FirebaseAuth.getInstance();
        eMail = (EditText)findViewById(R.id.Email);
        pAssword = (EditText)findViewById(R.id.password);
        cOnfirmPassword = (EditText)findViewById(R.id.confirmPassword);
        cOnfirm_button = (Button)findViewById(R.id.createaccount);

        cOnfirm_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateNewAccount();
            }
        });
        mprogress=new ProgressDialog(this);

    }

  /*  @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currnetuser=mAuth.getCurrentUser();

        if(currnetuser!=null)
        {
            sendUsertomainActivity();
        }

    }*/

    private void sendUsertomainActivity() {
        Intent MainIntent=new Intent(Register_Activity.this,MainActivity.class);
        MainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(MainIntent);
        finish();
    }
    private void CreateNewAccount() {
        String Email=eMail.getText().toString();
        String password=pAssword.getText().toString();
        String confirmPassword=cOnfirmPassword.getText().toString();

        if(TextUtils.isEmpty(Email)){
            Toast.makeText(getApplicationContext(),"please enter you Email",Toast.LENGTH_LONG).show();

        }else if(TextUtils.isEmpty(password)){
            Toast.makeText(getApplicationContext(),"please enter your password", Toast.LENGTH_LONG).show();

        }else if(TextUtils.isEmpty(confirmPassword)){
            Toast.makeText(getApplicationContext(),"please confirm your password",Toast.LENGTH_LONG).show();

        }else if(!password.equals(confirmPassword)){
            Toast.makeText(getApplicationContext(),"the password don't match please write again",Toast.LENGTH_LONG).show();
        }else{
            mprogress.setTitle("Creating account");
            mprogress.setMessage("wait while Creating account");
            mprogress.show();
            mprogress.setCanceledOnTouchOutside(true);

            mAuth.createUserWithEmailAndPassword(Email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {


                            if(task.isSuccessful()){
                                sendusertosetupactivity();
                                Toast.makeText(Register_Activity.this, "this Authentication successfully ", Toast.LENGTH_SHORT).show();
                                mprogress.dismiss();
                            }else {
                                String message=task.toString();
                                Toast.makeText(getApplicationContext(),"Error occurred "+message,Toast.LENGTH_LONG).show();
                                mprogress.dismiss();
                            }
                        }
                    });
        }
    }

    private void sendusertosetupactivity() {
        Intent setupuserintent=new Intent(getApplicationContext(),Login_Activity.class);
        setupuserintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(setupuserintent);
    }
}
