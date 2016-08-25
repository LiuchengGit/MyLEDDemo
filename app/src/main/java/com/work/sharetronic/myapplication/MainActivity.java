package com.work.sharetronic.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mbtn_ledall = null;
    private Boolean isledon = false;
    private CheckBox cb_led1 = null;
    private CheckBox cb_led2 = null;
    private CheckBox cb_led3 = null;
    private CheckBox cb_led4 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtn_ledall = (Button) findViewById(R.id.btn_ledall);

        cb_led1 = (CheckBox) findViewById(R.id.cb_led1);
        cb_led2 = (CheckBox) findViewById(R.id.cb_led2);
        cb_led3 = (CheckBox) findViewById(R.id.cb_led3);
        cb_led4 = (CheckBox) findViewById(R.id.cb_led4);

        mbtn_ledall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isledon = !isledon;
                if (isledon) {
                    mbtn_ledall.setText("ALL ON");
                    cb_led1.setChecked(true);
                    cb_led2.setChecked(true);
                    cb_led3.setChecked(true);
                    cb_led4.setChecked(true);
                } else {
                    mbtn_ledall.setText("ALL OFF");
                    cb_led1.setChecked(false);
                    cb_led2.setChecked(false);
                    cb_led3.setChecked(false);
                    cb_led4.setChecked(false);
                }
            }
        });
    }

    void showToast(String mes) {
        Toast.makeText(this, mes, 0).show();
    }

    public void oncheckbox(View v) {
        if (v instanceof CheckBox) {
            boolean checked = ((CheckBox) v).isChecked();
            switch (v.getId()) {
                case R.id.cb_led1:
                    if (checked) {
                        showToast("cb_led1 on");
                    } else {
                        showToast("cb_led1 off");
                    }
                    break;

                case R.id.cb_led2:
                    if (checked) {
                        showToast("cb_led2 on 12 ");
                    } else {
                        showToast("cb_led2 off");
                    }
                    break;

                case R.id.cb_led3:
                    if (checked) {
                        showToast("cb_led3 on");
                    } else {
                        showToast("cb_led3 off");
                    }
                    break;

                case R.id.cb_led4:
                    if (checked) {
                        showToast("cb_led4 on");
                    } else {
                        showToast("cb_led4 off");
                    }
                    break;

                default:
                    break;

            }


        }
    }
}
