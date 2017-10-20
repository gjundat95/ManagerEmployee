package com.jundat95.layoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText edtFullName, edtBirthday, edtDepartment;
    RadioButton rdbMale, rdbFemale;
    CheckBox cbOnce, cbTwo, cbThree;
    Button btnInputShow, btnReload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        event();
    }

    private void init() {

        btnReload = (Button) findViewById(R.id.btnReload);
        btnInputShow = (Button) findViewById(R.id.btnInputShow);

        edtFullName = (EditText) findViewById(R.id.edtFullName);
        edtBirthday = (EditText) findViewById(R.id.edtBirthday);
        edtDepartment = (EditText) findViewById(R.id.edtDepartment);

        rdbFemale = (RadioButton) findViewById(R.id.rdbFemale);
        rdbMale = (RadioButton) findViewById(R.id.rdbMale);

        cbOnce = (CheckBox) findViewById(R.id.cbOnce);
        cbTwo = (CheckBox) findViewById(R.id.cbTwo);
        cbThree = (CheckBox) findViewById(R.id.cbThree);

    }

    private void event() {
        // Bam nut reload
        // Gan toan bo ve ban dau

        btnReload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtFullName.setText("");
                edtBirthday.setText("");
                edtDepartment.setText("");
                rdbMale.setChecked(false);
                rdbFemale.setChecked(false);
                cbOnce.setChecked(false);
                cbTwo.setChecked(false);
                cbThree.setChecked(false);
            }
        });

        // Bam vao mot cai checkbox, thi bon con lai gan ve false
        cbOnce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbOnce.isChecked()){
                    cbTwo.setChecked(false);
                    cbThree.setChecked(false);
                }
            }
        });
        cbTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbTwo.isChecked()){
                    cbOnce.setChecked(false);
                    cbThree.setChecked(false);
                }
            }
        });
        cbThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbThree.isChecked()){
                    cbTwo.setChecked(false);
                    cbOnce.setChecked(false);
                }
            }
        });


    }

}
