package o;

import android.app.PendingIntent;
import b.c;
/* loaded from: classes5.dex */
public class isDimmed extends androidx.lifecycle.ViewModel {
    public c ag$a;
    public String ah$a;
    public String toString;
    public PendingIntent valueOf;
    public PendingIntent values;
    public boolean invoke = false;
    public boolean HaptikSDK$a = false;

    public boolean HaptikSDK$a() {
        return this.HaptikSDK$a;
    }

    public boolean HaptikSDK$b() {
        return this.invoke;
    }

    public c ag$a() {
        return this.ag$a;
    }

    public String ah$b() {
        return this.ah$a;
    }

    public void toString(String str) {
        this.toString = str;
    }

    public String valueOf() {
        return this.toString;
    }

    public PendingIntent values() {
        return this.valueOf;
    }

    public PendingIntent ah$a() {
        return this.values;
    }

    public void valueOf(String str) {
        this.ah$a = str;
    }

    public void toString(PendingIntent pendingIntent) {
        this.values = pendingIntent;
    }

    public void values(PendingIntent pendingIntent) {
        this.valueOf = pendingIntent;
    }

    public void ag$a(boolean z) {
        this.HaptikSDK$a = z;
    }

    public void toString(boolean z) {
        this.invoke = z;
    }

    public void values(c cVar) {
        this.ag$a = cVar;
    }
}
