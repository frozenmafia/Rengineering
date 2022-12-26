package o;

import android.util.Log;
/* renamed from: o.$default$onDestroy  reason: invalid class name */
/* loaded from: classes4.dex */
public class C$default$onDestroy {
    private int ah$a = 2;

    public boolean toString(String str, int i) {
        return this.ah$a <= i;
    }

    public void toString(int i, String str, String str2) {
        toString(i, str, str2, false);
    }

    public void toString(int i, String str, String str2, boolean z) {
        if (z || toString(str, i)) {
            Log.println(i, str, str2);
        }
    }
}
