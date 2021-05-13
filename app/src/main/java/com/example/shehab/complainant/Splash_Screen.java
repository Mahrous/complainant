package com.example.shehab.complainant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Splash_Screen extends AppCompatActivity {

ImageView imageView;
Animation animation;
TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        textView2=(TextView) findViewById(R.id.text2);

        imageView=(ImageView)findViewById(R.id.imagemain);






        YoYo.with(Techniques.FadeInDown)
                .duration(4500)
                .playOn(findViewById(R.id.text2));

        Thread thread =new Thread(){
            @Override
            public void run() {
                super.run();
                try{

                    sleep(7000);

                }catch (Exception e){e.printStackTrace();}
                finally {
                    Intent intent =new Intent(getApplicationContext(),Login_Activity.class);
                    startActivity(intent);
                }
            }
        };thread.start();

    }

    /*
       String DisplayName = "صيانكو";
                String MobileNumber = "01000539455";
                String HomeNumber = "1111";
                String WorkNumber = "2222";
                String emailID = "email@nomail.com";
                String company = "bad";
                String jobTitle = "abcd";

                ArrayList < ContentProviderOperation > ops = new ArrayList < ContentProviderOperation > ();

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
                if (HomeNumber != null) {
                    ops.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                            .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                            .withValue(ContactsContract.Data.MIMETYPE,
                                    ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                            .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, HomeNumber)
                            .withValue(ContactsContract.CommonDataKinds.Phone.TYPE,
                                    ContactsContract.CommonDataKinds.Phone.TYPE_HOME)
                            .build());
                }

                //------------------------------------------------------ Work Numbers
                if (WorkNumber != null) {
                    ops.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                            .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                            .withValue(ContactsContract.Data.MIMETYPE,
                                    ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                            .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, WorkNumber)
                            .withValue(ContactsContract.CommonDataKinds.Phone.TYPE,
                                    ContactsContract.CommonDataKinds.Phone.TYPE_WORK)
                            .build());
                }

                //------------------------------------------------------ Email
                if (emailID != null) {
                    ops.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                            .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                            .withValue(ContactsContract.Data.MIMETYPE,
                                    ContactsContract.CommonDataKinds.Email.CONTENT_ITEM_TYPE)
                            .withValue(ContactsContract.CommonDataKinds.Email.DATA, emailID)
                            .withValue(ContactsContract.CommonDataKinds.Email.TYPE, ContactsContract.CommonDataKinds.Email.TYPE_WORK)
                            .build());
                }

                //------------------------------------------------------ Organization
                if (!company.equals("") && !jobTitle.equals("")) {
                    ops.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                            .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                            .withValue(ContactsContract.Data.MIMETYPE,
                                    ContactsContract.CommonDataKinds.Organization.CONTENT_ITEM_TYPE)
                            .withValue(ContactsContract.CommonDataKinds.Organization.COMPANY, company)
                            .withValue(ContactsContract.CommonDataKinds.Organization.TYPE, ContactsContract.CommonDataKinds.Organization.TYPE_WORK)
                            .withValue(ContactsContract.CommonDataKinds.Organization.TITLE, jobTitle)
                            .withValue(ContactsContract.CommonDataKinds.Organization.TYPE, ContactsContract.CommonDataKinds.Organization.TYPE_WORK)
                            .build());
                }

                // Asking the Contact provider to create a new contact
                try {
                    getContentResolver().applyBatch(ContactsContract.AUTHORITY, ops);
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(Send_problem.this, "Exception: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
    * */

    @Override
    protected void onPause() {
        super.onPause();
        finish();

    }
}
