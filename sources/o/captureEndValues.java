package o;

import android.content.DialogInterface;
import android.content.Intent;
import com.phonepe.intent.sdk.ui.OpenIntentTransactionActivity;
/* loaded from: classes7.dex */
public class captureEndValues implements DialogInterface.OnClickListener {
    public final /* synthetic */ OpenIntentTransactionActivity valueOf;

    public captureEndValues(OpenIntentTransactionActivity openIntentTransactionActivity) {
        this.valueOf = openIntentTransactionActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.valueOf.irjuc(new Intent(), this.valueOf.f1406irjuc.valueOf("FAILED"));
        dialogInterface.dismiss();
    }
}
