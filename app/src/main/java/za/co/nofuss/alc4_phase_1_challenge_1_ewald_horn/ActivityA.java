package za.co.nofuss.alc4_phase_1_challenge_1_ewald_horn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setupButtons();
    }

    private void setupButtons() {
        findViewById(R.id.button_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleButtonOneClicked();
            }
        });

        findViewById(R.id.button_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleButtonTwoClicked();
            }
        });
    }

    private void handleButtonOneClicked() {
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }

    private void handleButtonTwoClicked() {
        Intent intent = new Intent(this, ActivityC.class);
        startActivity(intent);
    }

}
