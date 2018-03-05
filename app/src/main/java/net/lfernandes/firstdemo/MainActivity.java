package net.lfernandes.firstdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
// How to add Bootstrap to your project:
// Follow these instructions: https://github.com/Bearded-Hen/Android-Bootstrap
// About bootstrap: https://getbootstrap.com/docs/4.0/components/alerts/

public class MainActivity extends AppCompatActivity {

    private Button btnNewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewActivity = findViewById(R.id.next);

        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}
