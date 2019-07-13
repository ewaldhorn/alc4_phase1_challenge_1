package za.co.nofuss.alc4_phase_1_challenge_1_ewald_horn;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ActivityB extends AppCompatActivity {

    private static final String DESTINATION_URL = "https://andela.com/alc/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        setupToolbarTitle();
        setupWebView();
    }

    private void setupToolbarTitle() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.button_one_text);
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

    private void setupWebView() {
        WebView wv = findViewById(R.id.webview_one);
        wv.setWebViewClient(new ChallengeWebViewClient(this));
        wv.loadUrl(DESTINATION_URL);
    }
}
