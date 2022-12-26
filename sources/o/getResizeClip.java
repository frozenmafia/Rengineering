package o;

import android.content.DialogInterface;
import com.phonepe.intent.sdk.ui.OpenIntentTransactionActivity;
/* loaded from: classes7.dex */
public class getResizeClip implements DialogInterface.OnClickListener {
    public final /* synthetic */ OpenIntentTransactionActivity ag$a;

    public getResizeClip(OpenIntentTransactionActivity openIntentTransactionActivity) {
        this.ag$a = openIntentTransactionActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        OpenIntentTransactionActivity openIntentTransactionActivity = this.ag$a;
        openIntentTransactionActivity.jmjou.values(openIntentTransactionActivity.cqqlq, openIntentTransactionActivity.chmha, null, openIntentTransactionActivity);
        this.ag$a.wlgrx++;
        dialogInterface.dismiss();
    }
}
