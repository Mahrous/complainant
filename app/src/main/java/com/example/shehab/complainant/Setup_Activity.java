package com.example.shehab.complainant;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Setup_Activity extends AppCompatActivity {

    private ProgressDialog lodingbar;
    private EditText userName,phone_number,city,gov_number;
    private Button saveInformationButoon;
    private DatabaseReference UserRef;
    private FirebaseAuth mAuth;
    private String current_user_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_);
        mAuth= FirebaseAuth.getInstance();
        current_user_id=mAuth.getCurrentUser().getUid();
        UserRef = FirebaseDatabase.getInstance().getReference().child("Users").child(current_user_id);
        userName = (EditText)findViewById(R.id.setup_userName);
        phone_number = (EditText)findViewById(R.id.setup_fullName);
        city = (EditText)findViewById(R.id.setup_countryName);
        gov_number = (EditText)findViewById(R.id.setup_number_gov);
        saveInformationButoon = (Button)findViewById(R.id.setup_information_button);

        saveInformationButoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveaccountsetupInformation();
            }
        });
        lodingbar=new ProgressDialog(this);

    }

    private void SaveaccountsetupInformation()
    {
        String name=userName.getText().toString();
        String fullName=phone_number.getText().toString();
        String country=city.getText().toString();
        String number = gov_number.getText().toString();


        if(TextUtils.isEmpty(name))
        {
            Toast.makeText(this, "please enter your name", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(fullName))
        {
            Toast.makeText(this,"please enter the full name ",Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(country))
        {
            Toast.makeText(this,"please enter your country",Toast.LENGTH_LONG).show();
        } else if(TextUtils.isEmpty(number))
        {
            Toast.makeText(this,"please enter your country",Toast.LENGTH_LONG).show();
        }
        else
        {
            lodingbar.setTitle("register your information");
            lodingbar.setMessage("wait while creating your account ....");
            lodingbar.show();
            lodingbar.setCanceledOnTouchOutside(true);
            HashMap userMap=new HashMap();
            userMap.put("userName",name);
            userMap.put("phone",fullName);
            userMap.put("country",country);
            userMap.put("number_gov",number);
            userMap.put("gender","none");
            userMap.put("dob","none");
            userMap.put("relationship","none");


            UserRef.updateChildren(userMap).addOnCompleteListener(new OnCompleteListener() {
                @Override
                public void onComplete(@NonNull Task task)
                {

                    if(task.isSuccessful())
                    {
                        senduserToMainActivity();
                        Toast.makeText(getBaseContext(), "the register is successfully", Toast.LENGTH_LONG).show();
                        lodingbar.dismiss();
                    }
                    else
                    {
                        String message=task.toString();
                        Toast.makeText(Setup_Activity.this, "error occurred"+message, Toast.LENGTH_SHORT).show();
                        lodingbar.dismiss();
                    }
                }
            });
        }

    }

    private void senduserToMainActivity()
    {
        Intent MainIntent=new Intent(Setup_Activity.this,Department_Activity.class);
        MainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(MainIntent);

    }
}
