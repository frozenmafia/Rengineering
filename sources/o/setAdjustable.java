package o;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.install.InstallException;
/* loaded from: classes5.dex */
final class setAdjustable extends setValueInternal {
    private final String ah$a;
    final /* synthetic */ getShowSeekBarValue values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setAdjustable(getShowSeekBarValue getshowseekbarvalue, TaskCompletionSource taskCompletionSource, String str) {
        super(getshowseekbarvalue, new setPreferences("OnRequestInstallCallback"), taskCompletionSource);
        this.values = getshowseekbarvalue;
        this.ah$a = str;
    }

    @Override // o.setValueInternal, o.isStorageDefault
    public final void ah$a(Bundle bundle) throws RemoteException {
        int i;
        skipCurrentTag valueOf;
        int i2;
        super.ah$a(bundle);
        i = bundle.getInt("error.code", -2);
        if (i != 0) {
            TaskCompletionSource taskCompletionSource = this.ag$a;
            i2 = bundle.getInt("error.code", -2);
            taskCompletionSource.trySetException(new InstallException(i2));
            return;
        }
        TaskCompletionSource taskCompletionSource2 = this.ag$a;
        valueOf = skipCurrentTag.valueOf(this.ah$a, bundle.getInt("version.code", -1), bundle.getInt("update.availability"), bundle.getInt("install.status", 0), r22.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness")), bundle.getInt("in.app.update.priority", 0), bundle.getLong("bytes.downloaded"), bundle.getLong("total.bytes.to.download"), bundle.getLong("additional.size.required"), this.values.invoke.valueOf(), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent"));
        taskCompletionSource2.trySetResult(valueOf);
    }
}
