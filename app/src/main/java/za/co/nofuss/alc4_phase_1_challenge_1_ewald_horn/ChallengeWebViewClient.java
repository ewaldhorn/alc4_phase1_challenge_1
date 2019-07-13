package za.co.nofuss.alc4_phase_1_challenge_1_ewald_horn;

import android.content.Context;
import android.content.DialogInterface;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AlertDialog;

/**
 * Class required to deal with SSL security issues encountered on the ALC website.
 */

class ChallengeWebViewClient extends WebViewClient {

    private final Context context;

    public ChallengeWebViewClient(Context context) {
        this.context = context;
    }

    @Override
    public void onReceivedSslError(WebView view, final SslErrorHandler handler, SslError error) {
        // for SSLErrorHandler
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(R.string.error_ssl_certificate_invalid);
        builder.setPositiveButton(context.getString(R.string.text_continue), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                handler.proceed();
            }
        });
        builder.setNegativeButton(context.getString(R.string.text_cancel), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                handler.cancel();
            }
        });
        final AlertDialog dialog = builder.create();
        dialog.show();
    }
}
