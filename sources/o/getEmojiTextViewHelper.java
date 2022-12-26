package o;

import android.app.ProgressDialog;
import android.content.Context;
import o.C0368entity;
@Deprecated
/* loaded from: classes4.dex */
public class getEmojiTextViewHelper {
    ProgressDialog toString;

    public getEmojiTextViewHelper(Context context) {
        if (context != null) {
            ProgressDialog progressDialog = new ProgressDialog(context);
            this.toString = progressDialog;
            progressDialog.setMessage(context.getString(C0368entity.invoke.dpay_network_call));
        }
    }

    public void values() {
        try {
            this.toString.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ag$a() {
        try {
            if (this.toString.isShowing()) {
                this.toString.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public void ah$a(boolean z) {
        ProgressDialog progressDialog = this.toString;
        if (progressDialog != null) {
            progressDialog.setCancelable(z);
        }
    }
}
