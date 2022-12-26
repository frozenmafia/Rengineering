package o;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.install.InstallException;
/* loaded from: classes5.dex */
final class getUpdatesContinuously extends setValueInternal {
    /* JADX INFO: Access modifiers changed from: package-private */
    public getUpdatesContinuously(getShowSeekBarValue getshowseekbarvalue, TaskCompletionSource taskCompletionSource) {
        super(getshowseekbarvalue, new setPreferences("OnCompleteUpdateCallback"), taskCompletionSource);
    }

    @Override // o.setValueInternal, o.isStorageDefault
    public final void ag$a(Bundle bundle) throws RemoteException {
        int i;
        int i2;
        super.ag$a(bundle);
        i = bundle.getInt("error.code", -2);
        if (i != 0) {
            TaskCompletionSource taskCompletionSource = this.ag$a;
            i2 = bundle.getInt("error.code", -2);
            taskCompletionSource.trySetException(new InstallException(i2));
            return;
        }
        this.ag$a.trySetResult(null);
    }
}
