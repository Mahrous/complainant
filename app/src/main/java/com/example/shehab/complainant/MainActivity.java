package com.example.shehab.complainant;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.ContentProviderOperation;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private FusedLocationProviderClient mFusedLocationClient;

    private static final String TAG = MainActivity.class.getSimpleName();

    private DatabaseReference UserRef;
    private FirebaseAuth mAuth;
    private String Current_user_id;
    private static final int REQUEST_PERMISSIONS_REQUEST_CODE = 34;
    private String mLatitudeLabel;
    private String mLongitudeLabel;
    private TextView name;
    private TextView phone;
    private TextView City;
    protected Location mLastLocation;
    private TextView location;
    private EditText the_message;
    private static final int picgallery = 101;
    private ImageView whats_image;
    private ImageView whats_text;
    private String receive_department;
    private ImageView facebook_account;
    private ImageView phone_number;
    private ImageView message_phone;
    private ProgressDialog progressDialog;
    private TextView number_gov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        receive_department = getIntent().getExtras().getString("message").toString();
        Current_user_id = mAuth.getCurrentUser().getUid();
        UserRef = FirebaseDatabase.getInstance().getReference().child("Users").child(Current_user_id);
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        location = (TextView) findViewById(R.id.text_location);
        name = (TextView) findViewById(R.id.text_name);
        phone = (TextView) findViewById(R.id.text_phone);
        City = (TextView) findViewById(R.id.text_contry);
        number_gov = (TextView) findViewById(R.id.text_number_gov);
        the_message = (EditText) findViewById(R.id.the_message);
        whats_image = (ImageView) findViewById(R.id.whats_image);
        whats_text = (ImageView) findViewById(R.id.whats_text);
        facebook_account = (ImageView) findViewById(R.id.facebook_message);

        phone_number  = (ImageView)findViewById(R.id.phone);
        message_phone = (ImageView)findViewById(R.id.message_phone);



        progressDialog = new ProgressDialog(this);

        phone_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (receive_department.equals("elct")) {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:"+"01094594388"));

                    startActivity(callIntent);
                }
                if (receive_department.equals("water")) {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:"+"01206665125"));

                    startActivity(callIntent);
                }
                if (receive_department.equals("rood")) {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:"+"24047657/02"));

                    startActivity(callIntent);
                }
                if (receive_department.equals("rubbish")) {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:"+"01555516528"));

                    startActivity(callIntent);
                }
                if (receive_department.equals("train")) {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:"+"01287692411"));

                    startActivity(callIntent);
                }
                if (receive_department.equals("gov")) {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:"+"16528"));

                    startActivity(callIntent);
                }

                if(receive_department.equals("gas"))
                {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:"+"19220"));

                    startActivity(callIntent);
                }
                if(receive_department.equals("education"))
                {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:"+"19126"));

                    startActivity(callIntent);
                }
                if(receive_department.equals("tanmor"))
                {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:"+"16000"));

                    startActivity(callIntent);
                }
                if(receive_department.equals("throsh"))
                {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:"+"01007525600"));

                    startActivity(callIntent);
                }
            }
        });
        message_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(the_message.getText().toString()))
                {

                    Toast.makeText(MainActivity.this, "من فضلك ادخل الرساله", Toast.LENGTH_SHORT).show();

                }else {
                    if (receive_department.equals("elct")) {
                        Uri uri = Uri.parse("smsto:" + "01094594388");
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", "Dear :" + the_message.getText().toString());
                        startActivity(intent);
                    }
                    if (receive_department.equals("water")) {
                        Uri uri = Uri.parse("smsto:" + "01206665125");
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", "Dear :" + the_message.getText().toString());
                        startActivity(intent);
                    }
                    if (receive_department.equals("rood")) {
                        Uri uri = Uri.parse("smsto:" + "24047657/02");
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", "Dear :" + the_message.getText().toString());
                        startActivity(intent);
                    }
                    if (receive_department.equals("rubbish")) {
                        Uri uri = Uri.parse("smsto:" + "01555516528");
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", "Dear :" + the_message.getText().toString());
                        startActivity(intent);
                    }
                    if (receive_department.equals("train")) {
                        Uri uri = Uri.parse("smsto:" + "01287692411");
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", "Dear :" + the_message.getText().toString());
                        startActivity(intent);
                    }
                    if (receive_department.equals("gov")) {
                        Uri uri = Uri.parse("smsto:" + "16528");
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", "Dear :" + the_message.getText().toString());
                        startActivity(intent);
                    }

                    if (receive_department.equals("gas")) {
                        Uri uri = Uri.parse("smsto:" + "19220");
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", "Dear :" + the_message.getText().toString());
                        startActivity(intent);
                    }
                    if (receive_department.equals("education")) {
                        Uri uri = Uri.parse("smsto:" + "19126");
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", "Dear :" + the_message.getText().toString());
                        startActivity(intent);
                    }
                    if (receive_department.equals("tanmor")) {
                        Uri uri = Uri.parse("smsto:" + "16000");
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", "Dear :" + the_message.getText().toString());
                        startActivity(intent);
                    }
                    if (receive_department.equals("throsh")) {
                        Uri uri = Uri.parse("smsto:" + "01007525600");
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", "Dear :" + the_message.getText().toString());
                        startActivity(intent);
                    }

                }

            }
        });



        /*
        facebook_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/messages/t/moee.gov.eg";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(Intent.createChooser(i, "hello"));
            }
        });*/








        facebook_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (receive_department.equals("elct")) {
                    Toast.makeText(MainActivity.this, "Electricity", Toast.LENGTH_SHORT).show();
                    String url = "https://www.facebook.com/moee.gov.eg/";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                if (receive_department.equals("water")) {
                    Toast.makeText(MainActivity.this, "water", Toast.LENGTH_SHORT).show();

                    String url = "https://www.facebook.com/mwrifb/";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                if (receive_department.equals("rood")) {
                    Toast.makeText(MainActivity.this, "roods", Toast.LENGTH_SHORT).show();

                    String url = "https://www.facebook.com/MinistryTransportation/";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                if (receive_department.equals("rubbish")) {
                    Toast.makeText(MainActivity.this, "rubbish", Toast.LENGTH_SHORT).show();

                    String url = "https://www.facebook.com/EGY.Environment/";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                if (receive_department.equals("train")) {
                    Toast.makeText(MainActivity.this, "train", Toast.LENGTH_SHORT).show();

                    String url = "https://www.facebook.com/presidency.Egyptian.Railway/";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                if (receive_department.equals("gov")) {
                    coustome_dialog coustome_dialog = new coustome_dialog();
                    coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم فيس بوك");
                }

                if(receive_department.equals("gas"))
                {
                    String url = "https://www.facebook.com/Zohr.Petrojet/";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                if(receive_department.equals("education"))
                {
                    String url = "https://www.facebook.com/egypt.moe/";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                if(receive_department.equals("tanmor"))
                {
                    coustome_dialog coustome_dialog = new coustome_dialog();
                    coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم فيس بوك");
                }
                if(receive_department.equals("throsh"))
                {
                    coustome_dialog coustome_dialog = new coustome_dialog();
                    coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم فيس بوك");
                }

            }
        });




        facebook_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (receive_department.equals("elct")) {
                    Toast.makeText(MainActivity.this, "Electricity", Toast.LENGTH_SHORT).show();
                    String url = "https://www.facebook.com/moee.gov.eg/";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                if (receive_department.equals("water")) {
                    Toast.makeText(MainActivity.this, "water", Toast.LENGTH_SHORT).show();

                    String url = "https://www.facebook.com/mwrifb/";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                if (receive_department.equals("rood")) {
                    Toast.makeText(MainActivity.this, "roods", Toast.LENGTH_SHORT).show();

                    String url = "https://www.facebook.com/MinistryTransportation/";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                if (receive_department.equals("rubbish")) {
                    Toast.makeText(MainActivity.this, "rubbish", Toast.LENGTH_SHORT).show();

                    String url = "https://www.facebook.com/EGY.Environment/";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                if (receive_department.equals("train")) {
                    Toast.makeText(MainActivity.this, "train", Toast.LENGTH_SHORT).show();

                    String url = "https://www.facebook.com/presidency.Egyptian.Railway/";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                if (receive_department.equals("gov")) {
                  coustome_dialog coustome_dialog = new coustome_dialog();
                  coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم فيس بوك");
                }

                if(receive_department.equals("gas"))
                {
                    String url = "https://www.facebook.com/Zohr.Petrojet/";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                if(receive_department.equals("education"))
                {
                    String url = "https://www.facebook.com/egypt.moe/";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                if(receive_department.equals("tanmor"))
                {
                    coustome_dialog coustome_dialog = new coustome_dialog();
                    coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم فيس بوك");
                }
                if(receive_department.equals("throsh"))
                {
                    coustome_dialog coustome_dialog = new coustome_dialog();
                    coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم فيس بوك");
                }

            }
        });
        /**/

        whats_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog.setTitle("انتظر يتم اعداد الرساله");
                progressDialog.setMessage("جاري اعداد الرساله");
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.show();
                if (!TextUtils.isEmpty(the_message.getText().toString())) {
                    if(receive_department.equals("education"))
                    {
                        progressDialog.dismiss();
                        coustome_dialog coustome_dialog = new coustome_dialog();
                        coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم فيس بوك");
                    }
                    if(receive_department.equals("gas"))
                    {                        progressDialog.dismiss();

                        coustome_dialog coustome_dialog = new coustome_dialog();
                        coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم فيس بوك");
                    }

                    if (receive_department.equals("elct")) {

                        String DisplayName = "كهرباء";
                        String MobileNumber = "01094594388";


                        ArrayList<ContentProviderOperation> ops = new ArrayList<ContentProviderOperation>();

                        ops.add(ContentProviderOperation.newInsert(
                                ContactsContract.RawContacts.CONTENT_URI)
                                .withValue(ContactsContract.RawContacts.ACCOUNT_TYPE, null)
                                .withValue(ContactsContract.RawContacts.ACCOUNT_NAME, null)
                                .build());

                        //------------------------------------------------------ Names
                        if (DisplayName != null) {
                            ops.add(ContentProviderOperation.newInsert(
                                    ContactsContract.Data.CONTENT_URI)
                                    .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                    .withValue(ContactsContract.Data.MIMETYPE,
                                            ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
                                    .withValue(
                                            ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME,
                                            DisplayName).build());
                        }

                        //------------------------------------------------------ Mobile Number
                        if (MobileNumber != null) {
                            ops.add(ContentProviderOperation.
                                    newInsert(ContactsContract.Data.CONTENT_URI)
                                    .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                    .withValue(ContactsContract.Data.MIMETYPE,
                                            ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                                    .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, MobileNumber)
                                    .withValue(ContactsContract.CommonDataKinds.Phone.TYPE,
                                            ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE)
                                    .build());
                        }

                        //------------------------------------------------------ Home Numbers

                        // Asking the Contact provider to create a new contact
                        try {
                            getContentResolver().applyBatch(ContactsContract.AUTHORITY, ops);
                        } catch (Exception e) {
                            e.printStackTrace();
                            Toast.makeText(MainActivity.this, "Exception: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                        } finally {
                            Thread thread = new Thread() {
                                @Override
                                public void run() {
                                    super.run();

                                    try {
                                        sleep(7000);
                                    } catch (Exception e) {
                                        e.getMessage();
                                    } finally {
                                        progressDialog.dismiss();
                                        PackageManager packageManager = getPackageManager();
                                        Intent i = new Intent(Intent.ACTION_VIEW);

                                        try {
                                            String url = "https://api.whatsapp.com/send?phone="+ "+201094594388" +"&text=" + URLEncoder.encode(name.getText().toString() + "\n" +
                                                    phone.getText().toString() + "\n" +
                                                    City.getText().toString()+"\n" +
                                                    "الشكوي :"+the_message.getText().toString()+"\n" +
                                                    number_gov.getText().toString()+"\n", "UTF-8");
                                            i.setPackage("com.whatsapp");
                                            i.setData(Uri.parse(url));
                                            if (i.resolveActivity(packageManager) != null) {
                                                startActivity(i);
                                            }
                                        } catch (Exception e){
                                            e.printStackTrace();
                                        }
                                    }
                                }

                            };
                            thread.start();


                        }
                    }
                    if (receive_department.equals("water")) {
                        Toast.makeText(MainActivity.this, "water", Toast.LENGTH_SHORT).show();


                        String  DisplayName = "مياه";
                        String MobileNumber = "01206665125";


                        ArrayList<ContentProviderOperation> ops = new ArrayList<ContentProviderOperation>();

                        ops.add(ContentProviderOperation.newInsert(
                                ContactsContract.RawContacts.CONTENT_URI)
                                .withValue(ContactsContract.RawContacts.ACCOUNT_TYPE, null)
                                .withValue(ContactsContract.RawContacts.ACCOUNT_NAME, null)
                                .build());

                        //------------------------------------------------------ Names
                        if (DisplayName != null) {
                            ops.add(ContentProviderOperation.newInsert(
                                    ContactsContract.Data.CONTENT_URI)
                                    .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                    .withValue(ContactsContract.Data.MIMETYPE,
                                            ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
                                    .withValue(
                                            ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME,
                                            DisplayName).build());
                        }

                        //------------------------------------------------------ Mobile Number
                        if (MobileNumber != null) {
                            ops.add(ContentProviderOperation.
                                    newInsert(ContactsContract.Data.CONTENT_URI)
                                    .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                    .withValue(ContactsContract.Data.MIMETYPE,
                                            ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                                    .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, MobileNumber)
                                    .withValue(ContactsContract.CommonDataKinds.Phone.TYPE,
                                            ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE)
                                    .build());
                        }

                        //------------------------------------------------------ Home Numbers

                        // Asking the Contact provider to create a new contact
                        try {
                            getContentResolver().applyBatch(ContactsContract.AUTHORITY, ops);
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            Thread thread = new Thread() {
                                @Override
                                public void run() {
                                    super.run();

                                    try {
                                        sleep(7000);
                                    } catch (Exception e) {
                                        e.getMessage();
                                    } finally {                        progressDialog.dismiss();

                                        PackageManager packageManager = getPackageManager();
                                        Intent i = new Intent(Intent.ACTION_VIEW);

                                        try {
                                            String url = "https://api.whatsapp.com/send?phone="+ "+201206665125" +"&text=" + URLEncoder.encode(name.getText().toString() + "\n" +
                                                    phone.getText().toString() + "\n" +
                                                    City.getText().toString()+"\n" +
                                                    "الشكوي :"+the_message.getText().toString()+"\n" +
                                                    number_gov.getText().toString()+"\n", "UTF-8");
                                            i.setPackage("com.whatsapp");
                                            i.setData(Uri.parse(url));
                                            if (i.resolveActivity(packageManager) != null) {
                                                startActivity(i);
                                            }
                                        } catch (Exception e){
                                            e.printStackTrace();
                                        }
                                    }
                                }

                            };
                            thread.start();


                        }

                    }
                    if (receive_department.equals("rood")) {
                        progressDialog.dismiss();

                        coustome_dialog coustome_dialog = new coustome_dialog();
                        coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم وتس اب ");
                    }
                    if (receive_department.equals("rubbish")) {
                        Toast.makeText(MainActivity.this, "rubbish", Toast.LENGTH_SHORT).show();

                        String  DisplayName = "شكاوي القمامه";
                        String MobileNumber = "01555516528";


                        ArrayList<ContentProviderOperation> ops = new ArrayList<ContentProviderOperation>();

                        ops.add(ContentProviderOperation.newInsert(
                                ContactsContract.RawContacts.CONTENT_URI)
                                .withValue(ContactsContract.RawContacts.ACCOUNT_TYPE, null)
                                .withValue(ContactsContract.RawContacts.ACCOUNT_NAME, null)
                                .build());

                        //------------------------------------------------------ Names
                        if (DisplayName != null) {
                            ops.add(ContentProviderOperation.newInsert(
                                    ContactsContract.Data.CONTENT_URI)
                                    .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                    .withValue(ContactsContract.Data.MIMETYPE,
                                            ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
                                    .withValue(
                                            ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME,
                                            DisplayName).build());
                        }

                        //------------------------------------------------------ Mobile Number
                        if (MobileNumber != null) {
                            ops.add(ContentProviderOperation.
                                    newInsert(ContactsContract.Data.CONTENT_URI)
                                    .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                    .withValue(ContactsContract.Data.MIMETYPE,
                                            ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                                    .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, MobileNumber)
                                    .withValue(ContactsContract.CommonDataKinds.Phone.TYPE,
                                            ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE)
                                    .build());
                        }

                        //------------------------------------------------------ Home Numbers

                        // Asking the Contact provider to create a new contact
                        try {
                            getContentResolver().applyBatch(ContactsContract.AUTHORITY, ops);
                        } catch (Exception e) {
                            e.printStackTrace();
                            Toast.makeText(MainActivity.this, "Exception: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                        } finally {
                            Thread thread = new Thread() {
                                @Override
                                public void run() {
                                    super.run();

                                    try {
                                        sleep(7000);
                                    } catch (Exception e) {
                                        e.getMessage();
                                    } finally {                        progressDialog.dismiss();

                                        PackageManager packageManager = getPackageManager();
                                        Intent i = new Intent(Intent.ACTION_VIEW);

                                        try {
                                            String url = "https://api.whatsapp.com/send?phone="+ "+201555516528" +"&text=" + URLEncoder.encode(name.getText().toString() + "\n" +
                                                    phone.getText().toString() + "\n" +
                                                    City.getText().toString()+"\n" +
                                                    "الشكوي :"+the_message.getText().toString()+"\n" +
                                                    number_gov.getText().toString()+"\n", "UTF-8");
                                            i.setPackage("com.whatsapp");
                                            i.setData(Uri.parse(url));
                                            if (i.resolveActivity(packageManager) != null) {
                                                startActivity(i);
                                            }
                                        } catch (Exception e){
                                            e.printStackTrace();
                                        }
                                    }
                                }

                            };
                            thread.start();


                        }
                    }
                    if (receive_department.equals("train")) {                        progressDialog.dismiss();

                        coustome_dialog coustome_dialog = new coustome_dialog();
                        coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم وتس اب ");
                    }
                    if (receive_department.equals("gov")) {                        progressDialog.dismiss();

                        coustome_dialog coustome_dialog = new coustome_dialog();
                        coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم وتس اب ");
                    }
                    if(receive_department.equals("throsh"))
                    {
                        String  DisplayName = "شكاوي التحرش";
                        String MobileNumber = "01007525600";


                        ArrayList<ContentProviderOperation> ops = new ArrayList<ContentProviderOperation>();

                        ops.add(ContentProviderOperation.newInsert(
                                ContactsContract.RawContacts.CONTENT_URI)
                                .withValue(ContactsContract.RawContacts.ACCOUNT_TYPE, null)
                                .withValue(ContactsContract.RawContacts.ACCOUNT_NAME, null)
                                .build());

                        //------------------------------------------------------ Names
                        if (DisplayName != null) {
                            ops.add(ContentProviderOperation.newInsert(
                                    ContactsContract.Data.CONTENT_URI)
                                    .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                    .withValue(ContactsContract.Data.MIMETYPE,
                                            ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
                                    .withValue(
                                            ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME,
                                            DisplayName).build());
                        }

                        //------------------------------------------------------ Mobile Number
                        if (MobileNumber != null) {
                            ops.add(ContentProviderOperation.
                                    newInsert(ContactsContract.Data.CONTENT_URI)
                                    .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                    .withValue(ContactsContract.Data.MIMETYPE,
                                            ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                                    .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, MobileNumber)
                                    .withValue(ContactsContract.CommonDataKinds.Phone.TYPE,
                                            ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE)
                                    .build());
                        }

                        //------------------------------------------------------ Home Numbers

                        // Asking the Contact provider to create a new contact
                        try {
                            getContentResolver().applyBatch(ContactsContract.AUTHORITY, ops);
                        } catch (Exception e) {
                            e.printStackTrace();
                            Toast.makeText(MainActivity.this, "Exception: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                        } finally {
                            Thread thread = new Thread() {
                                @Override
                                public void run() {
                                    super.run();

                                    try {
                                        sleep(7000);
                                    } catch (Exception e) {
                                        e.getMessage();
                                    } finally {                        progressDialog.dismiss();

                                        PackageManager packageManager = getPackageManager();
                                        Intent i = new Intent(Intent.ACTION_VIEW);

                                        try {
                                            String url = "https://api.whatsapp.com/send?phone="+ "+201007525600" +"&text=" + URLEncoder.encode(name.getText().toString() + "\n" +
                                                    phone.getText().toString() + "\n" +
                                                    City.getText().toString()+"\n" +
                                                    "الشكوي :"+the_message.getText().toString()+"\n" +
                                                    number_gov.getText().toString()+"\n", "UTF-8");
                                            i.setPackage("com.whatsapp");
                                            i.setData(Uri.parse(url));
                                            if (i.resolveActivity(packageManager) != null) {
                                                startActivity(i);
                                            }
                                        } catch (Exception e){
                                            e.printStackTrace();
                                        }
                                       /* Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                                        i.setType("text/plain");
                                        i.setPackage("com.whatsapp");
                                        i.putExtra("sms_body", name.getText().toString() + "\n" +
                                                phone.getText().toString() + "\n" +
                                                City.getText().toString()+"\n" +
                                                phone.getText().toString()+"\n"+
                                                the_message.getText().toString()+"\n" +
                                                number_gov.getText().toString()+"\n");
                                        i.putExtra("chat",true);

                                        startActivity(Intent.createChooser(i, "hello"));*/
                                    }
                                }

                            };
                            thread.start();


                        }
                    }
                    if (receive_department.equals("tanmor"))
                    {                        progressDialog.dismiss();

                        coustome_dialog coustome_dialog = new coustome_dialog();
                        coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم وتس اب ");
                    }
                } else {
                    progressDialog.dismiss();
                    Toast.makeText(MainActivity.this, "please enter your message", Toast.LENGTH_SHORT).show();
                }
            }

        });


        whats_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(the_message.getText().toString()))
                {
                    Toast.makeText(MainActivity.this, "please enter the message", Toast.LENGTH_SHORT).show();
                }else {
                    Intent galleryIntent = new Intent();
                    galleryIntent.setAction(Intent.ACTION_GET_CONTENT);
                    galleryIntent.setType("image/*");
                    startActivityForResult(galleryIntent, picgallery);
                    progressDialog.setTitle("انتظر يتم اعداد الرساله");
                    progressDialog.setMessage("جاري اعداد الرساله");
                    progressDialog.setCanceledOnTouchOutside(false);
                    progressDialog.show();
                }
            }
        });


        UserRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String _name = dataSnapshot.child("userName").getValue().toString();
                String _phone = dataSnapshot.child("phone").getValue().toString();
                String _city = dataSnapshot.child("country").getValue().toString();
                String _number = dataSnapshot.child("number_gov").getValue().toString();

                name.setText("الاسم هو: " + _name);
                phone.setText("الرقم هو: " + _phone);
                City.setText("المحافظه: " + _city);
                number_gov.setText("الرقم القومي: "+ _number);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {


            final Uri Imageuri = data.getData();
            if (requestCode == picgallery) {


                if (receive_department.equals("elct")) {

                    String DisplayName = "كهرباء";
                    String MobileNumber = "01094594388";


                    ArrayList<ContentProviderOperation> ops = new ArrayList<ContentProviderOperation>();

                    ops.add(ContentProviderOperation.newInsert(
                            ContactsContract.RawContacts.CONTENT_URI)
                            .withValue(ContactsContract.RawContacts.ACCOUNT_TYPE, null)
                            .withValue(ContactsContract.RawContacts.ACCOUNT_NAME, null)
                            .build());

                    //------------------------------------------------------ Names
                    if (DisplayName != null) {
                        ops.add(ContentProviderOperation.newInsert(
                                ContactsContract.Data.CONTENT_URI)
                                .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                .withValue(ContactsContract.Data.MIMETYPE,
                                        ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
                                .withValue(
                                        ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME,
                                        DisplayName).build());
                    }

                    //------------------------------------------------------ Mobile Number
                    if (MobileNumber != null) {
                        ops.add(ContentProviderOperation.
                                newInsert(ContactsContract.Data.CONTENT_URI)
                                .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                .withValue(ContactsContract.Data.MIMETYPE,
                                        ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                                .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, MobileNumber)
                                .withValue(ContactsContract.CommonDataKinds.Phone.TYPE,
                                        ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE)
                                .build());
                    }

                    //------------------------------------------------------ Home Numbers

                    // Asking the Contact provider to create a new contact
                    try {
                        getContentResolver().applyBatch(ContactsContract.AUTHORITY, ops);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(MainActivity.this, "Exception: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                    } finally {
                        Thread thread = new Thread() {
                            @Override
                            public void run() {
                                super.run();

                                try {
                                    sleep(7000);
                                } catch (Exception e) {
                                    e.getMessage();
                                } finally {
                                    progressDialog.dismiss();
                                    Intent sendIntent = new Intent("android.intent.action.MAIN");
                                    sendIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                    sendIntent.putExtra(Intent.EXTRA_STREAM, Imageuri);
                                    sendIntent.putExtra("jid", "2" + "01094594388" + "@s.whatsapp.net");
                                    sendIntent.putExtra(Intent.EXTRA_TEXT, "whatsapp image caption");
                                    sendIntent.setAction(Intent.ACTION_SEND);
                                    sendIntent.setPackage("com.whatsapp");
                                    sendIntent.setType("image/*");
                                    sendIntent.putExtra(Intent.EXTRA_TEXT,
                                            name.getText().toString() + "\n" +
                                                    phone.getText().toString() + "\n"
                                                    + City.getText().toString()+ "\n"+
                                                    phone.getText().toString()+"\n"+
                                                    "الشكوي:"+the_message.getText().toString()+"\n" +
                                                    number_gov.getText().toString()+"\n" );
                                    startActivity(Intent.createChooser(sendIntent, "Share Image"));
                                }
                            }

                        };
                        thread.start();


                    }
                }
                    if (receive_department.equals("water")) {


                        String  DisplayName = "مياه";
                        String MobileNumber = "01206665125";


                        ArrayList<ContentProviderOperation> ops = new ArrayList<ContentProviderOperation>();

                        ops.add(ContentProviderOperation.newInsert(
                                ContactsContract.RawContacts.CONTENT_URI)
                                .withValue(ContactsContract.RawContacts.ACCOUNT_TYPE, null)
                                .withValue(ContactsContract.RawContacts.ACCOUNT_NAME, null)
                                .build());

                        //------------------------------------------------------ Names
                        if (DisplayName != null) {
                            ops.add(ContentProviderOperation.newInsert(
                                    ContactsContract.Data.CONTENT_URI)
                                    .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                    .withValue(ContactsContract.Data.MIMETYPE,
                                            ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
                                    .withValue(
                                            ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME,
                                            DisplayName).build());
                        }

                        //------------------------------------------------------ Mobile Number
                        if (MobileNumber != null) {
                            ops.add(ContentProviderOperation.
                                    newInsert(ContactsContract.Data.CONTENT_URI)
                                    .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                    .withValue(ContactsContract.Data.MIMETYPE,
                                            ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                                    .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, MobileNumber)
                                    .withValue(ContactsContract.CommonDataKinds.Phone.TYPE,
                                            ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE)
                                    .build());
                        }

                        //------------------------------------------------------ Home Numbers

                        // Asking the Contact provider to create a new contact
                        try {
                            getContentResolver().applyBatch(ContactsContract.AUTHORITY, ops);
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            Thread thread = new Thread() {
                                @Override
                                public void run() {
                                    super.run();

                                    try {
                                        sleep(7000);
                                    } catch (Exception e) {
                                        e.getMessage();
                                    } finally {                                    progressDialog.dismiss();

                                        Intent sendIntent = new Intent("android.intent.action.MAIN");
                                        sendIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                        sendIntent.putExtra(Intent.EXTRA_STREAM, Imageuri);
                                        sendIntent.putExtra("jid", "2" + "01206665125" + "@s.whatsapp.net");
                                        sendIntent.putExtra(Intent.EXTRA_TEXT, "whatsapp image caption");
                                        sendIntent.setAction(Intent.ACTION_SEND);
                                        sendIntent.setPackage("com.whatsapp");
                                        sendIntent.setType("image/*");
                                        sendIntent.putExtra(Intent.EXTRA_TEXT,
                                                name.getText().toString() + "\n" +
                                                        phone.getText().toString() + "\n"
                                                        + City.getText().toString()+ "\n"+
                                                        phone.getText().toString()+"\n"+
                                                        "الشكوي:"+the_message.getText().toString()+"\n" +
                                                        number_gov.getText().toString()+"\n");
                                        startActivity(Intent.createChooser(sendIntent, "Share Image"));
                                    }
                                }

                            };
                            thread.start();


                        }

                    }
                    if (receive_department.equals("rood")) {
                        progressDialog.dismiss();

                        coustome_dialog coustome_dialog = new coustome_dialog();
                        coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم وتس اب ");
                    }
                    if (receive_department.equals("rubbish")) {
                        String  DisplayName = "شكاوي القمامه";
                        String MobileNumber = "01555516528";


                        ArrayList<ContentProviderOperation> ops = new ArrayList<ContentProviderOperation>();

                        ops.add(ContentProviderOperation.newInsert(
                                ContactsContract.RawContacts.CONTENT_URI)
                                .withValue(ContactsContract.RawContacts.ACCOUNT_TYPE, null)
                                .withValue(ContactsContract.RawContacts.ACCOUNT_NAME, null)
                                .build());

                        //------------------------------------------------------ Names
                        if (DisplayName != null) {
                            ops.add(ContentProviderOperation.newInsert(
                                    ContactsContract.Data.CONTENT_URI)
                                    .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                    .withValue(ContactsContract.Data.MIMETYPE,
                                            ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
                                    .withValue(
                                            ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME,
                                            DisplayName).build());
                        }

                        //------------------------------------------------------ Mobile Number
                        if (MobileNumber != null) {
                            ops.add(ContentProviderOperation.
                                    newInsert(ContactsContract.Data.CONTENT_URI)
                                    .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                    .withValue(ContactsContract.Data.MIMETYPE,
                                            ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                                    .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, MobileNumber)
                                    .withValue(ContactsContract.CommonDataKinds.Phone.TYPE,
                                            ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE)
                                    .build());
                        }

                        //------------------------------------------------------ Home Numbers

                        // Asking the Contact provider to create a new contact
                        try {
                            getContentResolver().applyBatch(ContactsContract.AUTHORITY, ops);
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            Thread thread = new Thread() {
                                @Override
                                public void run() {
                                    super.run();

                                    try {
                                        sleep(7000);
                                    } catch (Exception e) {
                                        e.getMessage();
                                    } finally {                                    progressDialog.dismiss();

                                        Intent sendIntent = new Intent("android.intent.action.MAIN");
                                        sendIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                        sendIntent.putExtra(Intent.EXTRA_STREAM, Imageuri);
                                        sendIntent.putExtra("jid", "2" + "01555516528" + "@s.whatsapp.net");
                                        sendIntent.putExtra(Intent.EXTRA_TEXT, "whatsapp image caption");
                                        sendIntent.setAction(Intent.ACTION_SEND);
                                        sendIntent.setPackage("com.whatsapp");
                                        sendIntent.setType("image/*");
                                        sendIntent.putExtra(Intent.EXTRA_TEXT,
                                                name.getText().toString() + "\n" +
                                                        phone.getText().toString() + "\n"
                                                        + City.getText().toString()+ "\n"+
                                                        phone.getText().toString()+"\n"+
                                                        "الشكوي:"+the_message.getText().toString()+"\n" +
                                                        number_gov.getText().toString()+"\n");
                                        startActivity(Intent.createChooser(sendIntent, "Share Image"));
                                    }
                                }

                            };
                            thread.start();


                        }
                    }
                    if (receive_department.equals("train"))
                    {                                    progressDialog.dismiss();

                        coustome_dialog coustome_dialog = new coustome_dialog();
                        coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم وتس اب ");
                    }

                    if (receive_department.equals("gov")) {                                    progressDialog.dismiss();

                        coustome_dialog coustome_dialog = new coustome_dialog();
                        coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم وتس اب ");
                    }
                if(receive_department.equals("throsh"))
                {
                    String  DisplayName = "شكاوي التحرش";
                    String MobileNumber = "01007525600";


                    ArrayList<ContentProviderOperation> ops = new ArrayList<ContentProviderOperation>();

                    ops.add(ContentProviderOperation.newInsert(
                            ContactsContract.RawContacts.CONTENT_URI)
                            .withValue(ContactsContract.RawContacts.ACCOUNT_TYPE, null)
                            .withValue(ContactsContract.RawContacts.ACCOUNT_NAME, null)
                            .build());

                    //------------------------------------------------------ Names
                    if (DisplayName != null) {
                        ops.add(ContentProviderOperation.newInsert(
                                ContactsContract.Data.CONTENT_URI)
                                .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                .withValue(ContactsContract.Data.MIMETYPE,
                                        ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
                                .withValue(
                                        ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME,
                                        DisplayName).build());
                    }

                    //------------------------------------------------------ Mobile Number
                    if (MobileNumber != null) {
                        ops.add(ContentProviderOperation.
                                newInsert(ContactsContract.Data.CONTENT_URI)
                                .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                                .withValue(ContactsContract.Data.MIMETYPE,
                                        ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                                .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, MobileNumber)
                                .withValue(ContactsContract.CommonDataKinds.Phone.TYPE,
                                        ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE)
                                .build());
                    }

                    //------------------------------------------------------ Home Numbers

                    // Asking the Contact provider to create a new contact
                    try {
                        getContentResolver().applyBatch(ContactsContract.AUTHORITY, ops);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        Thread thread = new Thread() {
                            @Override
                            public void run() {
                                super.run();

                                try {
                                    sleep(7000);
                                } catch (Exception e) {
                                    e.getMessage();
                                } finally {                                    progressDialog.dismiss();

                                    Intent sendIntent = new Intent("android.intent.action.MAIN");
                                    sendIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                    sendIntent.putExtra(Intent.EXTRA_STREAM, Imageuri);
                                    sendIntent.putExtra("jid", "2" + "01007525600" + "@s.whatsapp.net");
                                    sendIntent.putExtra(Intent.EXTRA_TEXT, "whatsapp image caption");
                                    sendIntent.setAction(Intent.ACTION_SEND);
                                    sendIntent.setPackage("com.whatsapp");
                                    sendIntent.setType("image/*");
                                    sendIntent.putExtra(Intent.EXTRA_TEXT,
                                            name.getText().toString() + "\n" +
                                                    phone.getText().toString() + "\n"
                                                    + City.getText().toString()+ "\n"+
                                            phone.getText().toString()+"\n"+
                                                    "الشكوي:"+the_message.getText().toString()+"\n" +
                                                    number_gov.getText().toString()+"\n");
                                    startActivity(Intent.createChooser(sendIntent, "Share Image"));
                                }
                            }

                        };
                        thread.start();


                    }
                }
                if(receive_department.equals("tanmor"))
                {                                    progressDialog.dismiss();

                    coustome_dialog coustome_dialog = new coustome_dialog();
                    coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم وتس اب ");
                }
                if(receive_department.equals("education") )
                {                                    progressDialog.dismiss();

                    coustome_dialog coustome_dialog = new coustome_dialog();
                    coustome_dialog.showDialog(MainActivity.this,"هذا القسم لا يدعم وتس اب ");
                }


                }

            }
        }



    @Override
    public void onStart() {
        super.onStart();

        if (!checkPermissions()) {
            requestPermissions();
        } else {
            getLastLocation();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        Log.i(TAG, "onRequestPermissionResult");
        if (requestCode == REQUEST_PERMISSIONS_REQUEST_CODE) {
            if (grantResults.length <= 0) {
                // If user interaction was interrupted, the permission request is cancelled and you
                // receive empty arrays.
                Log.i(TAG, "User interaction was cancelled.");
            } else if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted.
                getLastLocation();
            } else {
                // Permission denied.

                // Notify the user via a SnackBar that they have rejected a core permission for the
                // app, which makes the Activity useless. In a real app, core permissions would
                // typically be best requested during a welcome-screen flow.

                // Additionally, it is important to remember that a permission might have been
                // rejected without asking the user for permission (device policy or "Never ask
                // again" prompts). Therefore, a user interface affordance is typically implemented
                // when permissions are denied. Otherwise, your app could appear unresponsive to
                // touches or interactions which have required permissions.

            }
        }
    }


    private boolean checkPermissions() {
        int permissionState = ActivityCompat.checkSelfPermission(this,
                android.Manifest.permission.ACCESS_FINE_LOCATION);
        return permissionState == PackageManager.PERMISSION_GRANTED;
    }

    private void startLocationPermissionRequest() {
        ActivityCompat.requestPermissions(MainActivity.this,
                new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},
                REQUEST_PERMISSIONS_REQUEST_CODE);
    }

    private void requestPermissions() {
        boolean shouldProvideRationale =
                ActivityCompat.shouldShowRequestPermissionRationale(this,
                        Manifest.permission.ACCESS_FINE_LOCATION);

        // Provide an additional rationale to the user. This would happen if the user denied the
        // request previously, but didn't check the "Don't ask again" checkbox.
        if (shouldProvideRationale) {
            Log.i(TAG, "Displaying permission rationale to provide additional context.");


        } else {
            Log.i(TAG, "Requesting permission");
            // Request permission. It's possible this can be auto answered if device policy
            // sets the permission in a given state or the user denied the permission
            // previously and checked "Never ask again".
            startLocationPermissionRequest();
        }
    }

    private void getLastLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mFusedLocationClient.getLastLocation()
                .addOnCompleteListener(this, new OnCompleteListener<Location>() {
                    @Override
                    public void onComplete(@NonNull Task<Location> task) {
                        if (task.isSuccessful() && task.getResult() != null) {
                            mLastLocation = task.getResult();

                            location.setText(String.format(Locale.ENGLISH, "%s: %f",
                                    "موقعك هو",
                                    mLastLocation.getLatitude()) + String.format(Locale.ENGLISH, "%s,%f",
                                    "",
                                    mLastLocation.getLongitude()));

                        } else {
                            Log.w(TAG, "getLastLocation:exception", task.getException());

                        }
                    }
                });
    }

}
