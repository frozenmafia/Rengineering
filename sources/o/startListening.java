package o;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import o.Fragment;
/* loaded from: classes4.dex */
public class startListening implements Fragment.SavedState.AnonymousClass1 {
    public static final startListening toString = new startListening();
    private String ah$a = "unknown";
    private int ag$a = 5;

    public static startListening ah$a() {
        return toString;
    }

    private startListening() {
    }

    @Override // o.Fragment.SavedState.AnonymousClass1
    public boolean toString(int i) {
        return this.ag$a <= i;
    }

    @Override // o.Fragment.SavedState.AnonymousClass1
    public void ag$a(String str, String str2) {
        valueOf(2, str, str2);
    }

    @Override // o.Fragment.SavedState.AnonymousClass1
    public void ah$a(String str, String str2) {
        valueOf(3, str, str2);
    }

    @Override // o.Fragment.SavedState.AnonymousClass1
    public void values(String str, String str2, Throwable th) {
        ah$a(3, str, str2, th);
    }

    @Override // o.Fragment.SavedState.AnonymousClass1
    public void values(String str, String str2) {
        valueOf(4, str, str2);
    }

    @Override // o.Fragment.SavedState.AnonymousClass1
    public void valueOf(String str, String str2) {
        valueOf(5, str, str2);
    }

    @Override // o.Fragment.SavedState.AnonymousClass1
    public void ah$a(String str, String str2, Throwable th) {
        ah$a(5, str, str2, th);
    }

    @Override // o.Fragment.SavedState.AnonymousClass1
    public void toString(String str, String str2) {
        valueOf(6, str, str2);
    }

    @Override // o.Fragment.SavedState.AnonymousClass1
    public void toString(String str, String str2, Throwable th) {
        ah$a(6, str, str2, th);
    }

    @Override // o.Fragment.SavedState.AnonymousClass1
    public void invoke(String str, String str2) {
        valueOf(6, str, str2);
    }

    @Override // o.Fragment.SavedState.AnonymousClass1
    public void ag$a(String str, String str2, Throwable th) {
        ah$a(6, str, str2, th);
    }

    private void valueOf(int i, String str, String str2) {
        Log.println(i, ag$a(str), str2);
    }

    private void ah$a(int i, String str, String str2, Throwable th) {
        Log.println(i, ag$a(str), ah$a(str2, th));
    }

    private String ag$a(String str) {
        if (this.ah$a != null) {
            return this.ah$a + ":" + str;
        }
        return str;
    }

    private static String ah$a(String str, Throwable th) {
        return str + '\n' + toString(th);
    }

    private static String toString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
