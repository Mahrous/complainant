package com.example.shehab.complainant;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Department_Activity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;
    private DatabaseReference Userref;
    private FirebaseAuth mAuth;
    private FirebaseUser Currentuserid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_);
        mAuth = FirebaseAuth.getInstance();
        Userref= FirebaseDatabase.getInstance().getReference().child("Users");
        int[] data = {R.drawable.electrity,R.drawable.water,R.drawable.rubbish,R.drawable.roods,
        R.drawable.government,R.drawable.train_sation,R.drawable.gas,R.drawable.education,R.drawable.tamor,R.drawable.throsh};
        // set up the RecyclerView
        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.recycler_department);
        int numberOfColumns = 2;
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        adapter = new MyRecyclerViewAdapter(this, data);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        //Log.i("TAG", "You clicked number " + adapter.getItem(position) + ", which is at cell position " + position);

        if(position == 0)
        {
            String elct="elct";
         Intent to_mainActivity = new Intent(getApplicationContext(),MainActivity.class);
         to_mainActivity.putExtra("message",elct);
         startActivity(to_mainActivity);
        }

        if(position == 1)
        {
            String elct="water";
            Intent to_mainActivity = new Intent(getApplicationContext(),MainActivity.class);
            to_mainActivity.putExtra("message",elct);
            startActivity(to_mainActivity);
        }
        if(position == 2)
        {
            String elct="rubbish";
            Intent to_mainActivity = new Intent(getApplicationContext(),MainActivity.class);
            to_mainActivity.putExtra("message",elct);
            startActivity(to_mainActivity);
        }  if(position == 3)
        {
            String elct="rood";
            Intent to_mainActivity = new Intent(getApplicationContext(),MainActivity.class);
            to_mainActivity.putExtra("message",elct);
            startActivity(to_mainActivity);
        }  if(position == 4)
        {
            String elct="gov";
            Intent to_mainActivity = new Intent(getApplicationContext(),MainActivity.class);
            to_mainActivity.putExtra("message",elct);
            startActivity(to_mainActivity);
        }if(position == 5)
        {
            String elct="train";
            Intent to_mainActivity = new Intent(getApplicationContext(),MainActivity.class);
            to_mainActivity.putExtra("message",elct);
            startActivity(to_mainActivity);
        }

        if(position == 6)
        {
            String elct="gas";
            Intent to_mainActivity = new Intent(getApplicationContext(),MainActivity.class);
            to_mainActivity.putExtra("message",elct);
            startActivity(to_mainActivity);
        }  if(position == 7)
        {
            String elct="education";
            Intent to_mainActivity = new Intent(getApplicationContext(),MainActivity.class);
            to_mainActivity.putExtra("message",elct);
            startActivity(to_mainActivity);
        }  if(position == 8)
        {
            String elct="tanmor";
            Intent to_mainActivity = new Intent(getApplicationContext(),MainActivity.class);
            to_mainActivity.putExtra("message",elct);
            startActivity(to_mainActivity);
        }
        if(position == 9)
        {
            String elct="throsh";
            Intent to_mainActivity = new Intent(getApplicationContext(),MainActivity.class);
            to_mainActivity.putExtra("message",elct);
            startActivity(to_mainActivity);
        }
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


        Userref.addValueEventListener(new ValueEventListener() {
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

}