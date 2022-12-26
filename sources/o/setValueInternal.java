package o;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes5.dex */
class setValueInternal extends setOnDisplayPreferenceDialogListener {
    final TaskCompletionSource ag$a;
    final setPreferences toString;
    final /* synthetic */ getShowSeekBarValue valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setValueInternal(getShowSeekBarValue getshowseekbarvalue, setPreferences setpreferences, TaskCompletionSource taskCompletionSource) {
        this.valueOf = getshowseekbarvalue;
        this.toString = setpreferences;
        this.ag$a = taskCompletionSource;
    }

    public void ag$a(Bundle bundle) throws RemoteException {
        this.valueOf.toString.toString(this.ag$a);
        this.toString.values("onCompleteUpdate", new Object[0]);
    }

    public void ah$a(Bundle bundle) throws RemoteException {
        this.valueOf.toString.toString(this.ag$a);
        this.toString.values("onRequestInfo", new Object[0]);
    }
}
