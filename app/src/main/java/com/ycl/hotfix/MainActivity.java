package com.ycl.hotfix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.meituan.android.walle.WalleChannelReader;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String channel = WalleChannelReader.getChannel(this.getApplicationContext());

        Log.e(TAG,"channel=="+channel);

        findViewById(R.id.bt_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, Bug.getBugString(), Toast.LENGTH_SHORT).show();


            }
        });

    }

}


 class Bug{

      static String getBugString(){

//         String str=null;
//
//         Log.e("BugClass","get string length:"+str.length());

         return "This is a fix class";
     }

}








