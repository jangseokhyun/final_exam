package com.example.igx.problem1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity /* implements Something1, Something2 */ {

    public static int xx=100, yy=40, zir=123, distance=20, tem=21, light=80;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_getLocation = (Button) findViewById(R.id.btn_getLocation);
        Button btn_getSensors = (Button) findViewById(R.id.btn_getSensors);
        Button btn_sendMessage = (Button) findViewById(R.id.btn_sendMessage);

        final TextView text_selectedData = (TextView) findViewById(R.id.text_selectedData);
        final TextView text_selectedType = (TextView) findViewById(R.id.text_selectedType);
        final EditText edit_phoneNumber = (EditText) findViewById(R.id.edit_phoneNumber);


        btn_getLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_selectedData.setText("위도 : " + xx + "\n경도 : " + yy);
                text_selectedType.setText("LOCATION");
            }

        });

        btn_getSensors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_selectedType.setText("SENSORS");
                text_selectedData.setText("자이로 : " + zir + "\n근접 : " + distance + "\n온도 : " + tem + "\n밝기 : " + light);
            }
        });

        btn_sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}
