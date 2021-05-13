package com.example.shehab.complainant;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class First_departments extends AppCompatActivity {

    private ImageView metro,newsgov,Emoloyee_works,complaint,train_time,prices_coins,image_menu,emergencybtn,governmentsbtn,about_us;
    private FirebaseAuth mAuth;
    FirebaseUser Currentuserid;
    DatabaseReference UserRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_departments);

        UserRef = FirebaseDatabase.getInstance().getReference().child("Users");

        mAuth  = FirebaseAuth.getInstance();
        image_menu = (ImageView)findViewById(R.id.menu);
        metro = (ImageView)findViewById(R.id.merto);
        newsgov = (ImageView)findViewById(R.id.news);
        complaint = (ImageView)findViewById(R.id.complain);
        Emoloyee_works = (ImageView)findViewById(R.id.employees);
        train_time = (ImageView)findViewById(R.id.traintime);
        prices_coins = (ImageView)findViewById(R.id.coins);
        emergencybtn = (ImageView)findViewById(R.id.emergency) ;
        governmentsbtn = (ImageView)findViewById(R.id.governments);
        about_us = (ImageView)findViewById(R.id.about_us_final);

        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),About_us.class));

            }
        });

        governmentsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean connected = false;
                ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    connected = true;
                }
                else
                {
                    connected = false;

                }

                if(connected)
                {
                    startActivity(new Intent(getApplicationContext(),sites_government.class));

                }else
                {
                    coustome_dialog coustome_dialog = new coustome_dialog();
                    coustome_dialog.showDialog(First_departments.this,"الانتر نت غير متاح");
                }
            }
        });

        emergencybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Emergnce_call.class));
            }
        });
        prices_coins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean connected = false;
                ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    connected = true;
                }
                else
                {
                    connected = false;

                }

                if(connected)
                {
                    startActivity(new Intent(getApplicationContext(),Prices_coins.class));

                }else
                {
                    coustome_dialog coustome_dialog = new coustome_dialog();
                    coustome_dialog.showDialog(First_departments.this,"الانتر نت غير متاح");
                }

            }
        });
        train_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean connected = false;
                ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    connected = true;
                }
                else
                {
                    connected = false;

                }

                if(connected)
                {
                    startActivity(new Intent(getApplicationContext(),Train_activity.class));

                }else
                {
                    coustome_dialog coustome_dialog = new coustome_dialog();
                    coustome_dialog.showDialog(First_departments.this,"الانتر نت غير متاح");
                }
            }
        });
        metro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Metro_activity.class));
            }
        });

        complaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean connected = false;
                ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    connected = true;
                }
                else
                    {
                        connected = false;

                    }

                if(connected)
                {
                    startActivity(new Intent(getApplicationContext(),Department_Activity.class));

                }else
                    {
                        coustome_dialog coustome_dialog = new coustome_dialog();
                        coustome_dialog.showDialog(First_departments.this,"الانتر نت غير متاح");
                    }


            }
        });

        newsgov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean connected = false;
                ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    connected = true;
                }
                else
                {
                    connected = false;

                }

                if(connected)
                {
                    startActivity(new Intent(getApplicationContext(),gov_news.class));

                }else
                {
                    coustome_dialog coustome_dialog = new coustome_dialog();
                    coustome_dialog.showDialog(First_departments.this,"الانتر نت غير متاح");
                }
            }
        });
        Emoloyee_works.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean connected = false;
                ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                        connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                    //we are connected to a network
                    connected = true;
                }
                else
                {
                    connected = false;

                }

                if(connected)
                {
                    startActivity(new Intent(getApplicationContext(),employee_works.class));

                }else
                {
                    coustome_dialog coustome_dialog = new coustome_dialog();
                    coustome_dialog.showDialog(First_departments.this,"الانتر نت غير متاح");
                }
            }
        });
        final CharSequence option[]=new CharSequence[]{
                "تسجيل الخروج"

        };
       image_menu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               AlertDialog.Builder builder =new AlertDialog.Builder(First_departments.this);
               builder.setTitle("القائمه");
               builder.setItems(option, new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                       if(which == 0)
                       {

                           mAuth.signOut();
                           startActivity(new Intent(getApplicationContext(),Login_Activity.class));
                       }
                   }
               }); builder.show();
           }
       });
    }
    public void check_connction_inter_net(final Activity activity)
    {

    }
    @Override
    protected void onStart() {
        super.onStart();
        Currentuserid=mAuth.getCurrentUser();

        if (Currentuserid == null)
        {

            startActivity(new Intent(getApplicationContext(),Login_Activity.class));
        }
        else
        {
            CheckuserExsistnce();
        }
    }

    private void CheckuserExsistnce()
    {
        final String current_user_id=mAuth.getCurrentUser().getUid();


        UserRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (!dataSnapshot.hasChild(current_user_id)) {
                    startActivity(new Intent(getApplicationContext(),Setup_Activity.class));
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
