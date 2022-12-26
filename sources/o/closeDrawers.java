package o;

import android.app.ProgressDialog;
import android.content.Context;
import com.dream11.feature.downloader.DownloadProgressImpl$showProgress$1;
/* loaded from: classes4.dex */
public final class closeDrawers {
    private ProgressDialog ag$a;
    private final Context valueOf;
    private dispatchOnDrawerClosed values;

    public closeDrawers(Context context) {
        runAnimators.ag$a(context, "context");
        this.valueOf = context;
    }

    public final Context valueOf() {
        return this.valueOf;
    }

    public void toString(cancelChildViewTouch cancelchildviewtouch, dispatchOnDrawerClosed dispatchondrawerclosed) {
        runAnimators.ag$a(cancelchildviewtouch, "downloadRequest");
        runAnimators.ag$a(dispatchondrawerclosed, "listener");
        ah$a.toString(new DownloadProgressImpl$showProgress$1(this, dispatchondrawerclosed, cancelchildviewtouch));
    }

    public void ah$a(String str) {
        ProgressDialog progressDialog;
        runAnimators.ag$a(str, androidx.core.app.NotificationCompat.CATEGORY_PROGRESS);
        ProgressDialog progressDialog2 = this.ag$a;
        boolean z = true;
        if (!((progressDialog2 == null || !progressDialog2.isShowing()) ? false : false) || (progressDialog = this.ag$a) == null) {
            return;
        }
        progressDialog.setProgress(Integer.parseInt(str));
    }

    public void ah$a() {
        try {
            ProgressDialog progressDialog = this.ag$a;
            if (progressDialog == null) {
                return;
            }
            progressDialog.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProgressDialog toString(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setIndeterminate(false);
        progressDialog.setMax(100);
        progressDialog.setProgressStyle(1);
        progressDialog.setCancelable(false);
        return progressDialog;
    }
}
