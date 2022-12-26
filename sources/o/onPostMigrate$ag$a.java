package o;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.work.WorkRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class onPostMigrate$ag$a implements Runnable {
    final /* synthetic */ onPostMigrate ag$a;

    private onPostMigrate$ag$a(onPostMigrate onpostmigrate) {
        this.ag$a = onpostmigrate;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        Context context;
        Handler handler;
        Runnable runnable;
        z = this.ag$a.toString;
        if (z) {
            Intent intent = new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK");
            context = this.ag$a.ag$a;
            context.sendBroadcast(intent);
            handler = this.ag$a.ah$a;
            runnable = this.ag$a.values;
            handler.postDelayed(runnable, WorkRequest.MIN_BACKOFF_MILLIS);
        }
    }
}
