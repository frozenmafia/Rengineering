package o;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public class getChroma implements getAttributeValue {
    ProgressDialog toString;
    private final Runnable ah$a = new Runnable() { // from class: o.getChroma.2
        @Override // java.lang.Runnable
        public void run() {
            try {
                getChroma.this.toString.show();
            } catch (Exception e) {
                new getStateDrawableIndex(getChroma.this).valueOf(e);
            }
        }
    };
    private final Runnable valueOf = new Runnable() { // from class: o.getChroma.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (getChroma.this.toString.isShowing()) {
                    getChroma.this.toString.dismiss();
                }
            } catch (Exception e) {
                new getStateDrawableIndex(getChroma.this).valueOf(e);
            }
        }
    };
    private final Handler ag$a = new Handler(Looper.getMainLooper());

    public getChroma(Context context) {
        if (context != null) {
            ProgressDialog progressDialog = new ProgressDialog(context);
            this.toString = progressDialog;
            progressDialog.setMessage(context.getString(com.app.dream11Pro.R.string.res_0x7f12089b));
        }
    }

    public void toString(String str) {
        this.toString.setMessage(str);
    }

    @Override // o.getAttributeValue
    public void values() {
        try {
            this.ag$a.post(this.ah$a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // o.getAttributeValue
    public void valueOf() {
        try {
            this.ag$a.post(new Runnable() { // from class: o.getChroma.4
                @Override // java.lang.Runnable
                public void run() {
                    if (getChroma.this.toString.isShowing()) {
                        getChroma.this.ag$a.post(getChroma.this.valueOf);
                    }
                }
            });
        } catch (Exception e) {
            getStateDrawableIndex.toString.valueOf(e);
        }
    }

    @Override // o.getAttributeValue
    public void ag$a(boolean z) {
        ProgressDialog progressDialog = this.toString;
        if (progressDialog != null) {
            progressDialog.setCancelable(z);
        }
    }
}
