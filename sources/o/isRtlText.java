package o;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class isRtlText {
    public long HaptikSDK$b;
    public int HaptikSDK$c;
    public long ag$a;
    public italic ah$a;
    public boolean ah$b;
    public int aj$a;
    public SpannedStringKt getSignupData;
    public boolean invoke;
    public boolean toString;
    public long valueOf;
    public long values;
    public long[] onXdkEvent = new long[0];
    public int[] a = new int[0];
    public int[] HaptikSDK$e = new int[0];
    public long[] HaptikSDK$d = new long[0];
    public boolean[] HaptikWebView = new boolean[0];
    public boolean[] getInitSettings = new boolean[0];
    public final C$default$setContentDescription HaptikSDK$a = new C$default$setContentDescription();

    public void ah$a() {
        this.aj$a = 0;
        this.HaptikSDK$b = 0L;
        this.invoke = false;
        this.toString = false;
        this.ah$b = false;
        this.getSignupData = null;
    }

    public void ah$a(int i, int i2) {
        this.aj$a = i;
        this.HaptikSDK$c = i2;
        if (this.a.length < i) {
            this.onXdkEvent = new long[i];
            this.a = new int[i];
        }
        if (this.HaptikSDK$e.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.HaptikSDK$e = new int[i3];
            this.HaptikSDK$d = new long[i3];
            this.HaptikWebView = new boolean[i3];
            this.getInitSettings = new boolean[i3];
        }
    }

    public void valueOf(int i) {
        this.HaptikSDK$a.valueOf(i);
        this.toString = true;
        this.ah$b = true;
    }

    public void ah$a(getExitDir getexitdir) throws IOException {
        getexitdir.ah$a(this.HaptikSDK$a.ah$a(), 0, this.HaptikSDK$a.HaptikSDK$a());
        this.HaptikSDK$a.HaptikSDK$b(0);
        this.ah$b = false;
    }

    public void values(C$default$setContentDescription c$default$setContentDescription) {
        c$default$setContentDescription.valueOf(this.HaptikSDK$a.ah$a(), 0, this.HaptikSDK$a.HaptikSDK$a());
        this.HaptikSDK$a.HaptikSDK$b(0);
        this.ah$b = false;
    }

    public long toString(int i) {
        return this.HaptikSDK$d[i];
    }

    public boolean ah$a(int i) {
        return this.toString && this.getInitSettings[i];
    }
}
