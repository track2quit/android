package com.t2q.mdb.t2q;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;


public class IntroActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
    }

    /**
     * Goes to the bluetooth connect activity
     *
     * @param v
     */
    public void onStartClick(View v){
        Intent myIntent = new Intent(v.getContext(), BluetoothConnectActivity.class);
        startActivityForResult(myIntent, 0);
    }

}
