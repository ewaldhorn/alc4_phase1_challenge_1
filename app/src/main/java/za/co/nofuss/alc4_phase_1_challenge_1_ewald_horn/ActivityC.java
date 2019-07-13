package za.co.nofuss.alc4_phase_1_challenge_1_ewald_horn;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        setupToolbarTitle();
    }

    private void setupToolbarTitle() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.button_two_text);
        toolbar.setNavigationContentDescription(R.string.text_back);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
