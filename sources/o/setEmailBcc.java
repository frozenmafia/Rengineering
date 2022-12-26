package o;

import android.view.View;
import com.google.android.gms.analytics.ecommerce.Promotion;
/* loaded from: classes3.dex */
public final class setEmailBcc {
    private createFilesDir ag$a;
    private final int ah$a;
    private View ah$b;
    private final int toString;
    private final String valueOf;
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setEmailBcc) {
            setEmailBcc setemailbcc = (setEmailBcc) obj;
            return runAnimators.values(this.ah$b, setemailbcc.ah$b) && runAnimators.values(this.ag$a, setemailbcc.ag$a) && this.toString == setemailbcc.toString && this.values == setemailbcc.values && this.ah$a == setemailbcc.ah$a && runAnimators.values((Object) this.valueOf, (Object) setemailbcc.valueOf);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.ah$b.hashCode() * 31) + this.ag$a.hashCode()) * 31) + this.toString) * 31) + this.values) * 31) + this.ah$a) * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        View view = this.ah$b;
        createFilesDir createfilesdir = this.ag$a;
        int i = this.toString;
        int i2 = this.values;
        int i3 = this.ah$a;
        String str = this.valueOf;
        return "LongClickData(view=" + view + ", player=" + createfilesdir + ", matchId=" + i + ", tourId=" + i2 + ", teamId=" + i3 + ", selectedTabText=" + str + ")";
    }

    public setEmailBcc(View view, createFilesDir createfilesdir, int i, int i2, int i3, String str) {
        runAnimators.ag$a(view, Promotion.ACTION_VIEW);
        runAnimators.ag$a(createfilesdir, "player");
        runAnimators.ag$a(str, "selectedTabText");
        this.ah$b = view;
        this.ag$a = createfilesdir;
        this.toString = i;
        this.values = i2;
        this.ah$a = i3;
        this.valueOf = str;
    }

    public final View HaptikSDK$b() {
        return this.ah$b;
    }

    public final createFilesDir ag$a() {
        return this.ag$a;
    }

    public final int values() {
        return this.toString;
    }

    public final int HaptikSDK$a() {
        return this.values;
    }

    public final int valueOf() {
        return this.ah$a;
    }

    public final String ah$a() {
        return this.valueOf;
    }
}
