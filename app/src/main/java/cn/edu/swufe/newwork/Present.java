package cn.edu.swufe.newwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Present extends AppCompatActivity {
    EditText editPresent;
    float newPresent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.present);

        editPresent = (EditText) findViewById(R.id.edit_present);
    }

    public void savePresent(View btn) {
        newPresent = Float.parseFloat(editPresent.getText().toString());

        Intent intent1 = getIntent();
        Bundle bdlPresent = new Bundle();
        bdlPresent.putFloat("newPresent_key", newPresent);
        intent1.putExtras(bdlPresent);
        setResult(4, intent1);
        finish();
    }
}
