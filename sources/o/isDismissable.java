package o;

import android.content.Context;
/* loaded from: classes3.dex */
public final class isDismissable {
    private String[] ah$a;
    private final Context valueOf;

    public isDismissable(Context context, int... iArr) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(iArr, "sRID");
        this.valueOf = context;
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String string = this.valueOf.getString(iArr[i]);
            runAnimators.ah$a(string, "context.getString(sRID[it])");
            strArr[i] = string;
        }
        this.ah$a = strArr;
    }

    public final String valueOf() {
        return (String) getStartAlpha.values(this.ah$a, 0);
    }

    public final String ah$a() {
        return (String) getStartAlpha.values(this.ah$a, 1);
    }

    public final String values() {
        return (String) getStartAlpha.values(this.ah$a, 2);
    }

    public final String ag$a() {
        return (String) getStartAlpha.values(this.ah$a, 3);
    }
}
