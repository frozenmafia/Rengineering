package o;

import android.util.Log;
/* loaded from: classes4.dex */
public class withStateAtLeast implements withStarted$$forInline {
    private boolean toString = false;
    private int ah$a = 2;

    public boolean ah$a(String str, int i) {
        return this.ah$a <= i && this.toString;
    }

    public void values(String str, String str2, Throwable th) {
        if (ah$a(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    @Override // o.withStarted$$forInline
    public void toString(String str, String str2, Throwable th) {
        if (ah$a(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    @Override // o.withStarted$$forInline
    public void valueOf(String str, String str2) {
        values(str, str2, null);
    }

    @Override // o.withStarted$$forInline
    public void toString(Boolean bool) {
        this.toString = bool.booleanValue();
    }

    @Override // o.withStarted$$forInline
    public void toString(int i, String str, String str2) {
        ah$a(i, str, str2, false);
    }

    public void ah$a(int i, String str, String str2, boolean z) {
        if (z || ah$a(str, i)) {
            Log.println(i, str, str2);
        }
    }
}
