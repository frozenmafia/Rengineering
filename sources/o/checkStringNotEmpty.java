package o;

import android.text.Layout;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class checkStringNotEmpty {
    private String HaptikSDK$b;
    private boolean HaptikSDK$c;
    private Layout.Alignment HaptikSDK$e;
    private String ah$a;
    private boolean ah$b;
    private Preconditions ak;
    private Layout.Alignment isLogoutPending;
    private int toString;
    private float valueOf;
    private int values;
    private int getInitSettings = -1;
    private int a = -1;
    private int ag$a = -1;
    private int invoke = -1;
    private int HaptikSDK$a = -1;
    private int HaptikWebView = -1;
    private int HaptikSDK$d = -1;
    private int onXdkEvent = -1;
    private float getSignupData = Float.MAX_VALUE;

    public int HaptikSDK$d() {
        int i = this.ag$a;
        if (i == -1 && this.invoke == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.invoke == 1 ? 2 : 0);
    }

    public boolean isLogoutPending() {
        return this.getInitSettings == 1;
    }

    public checkStringNotEmpty valueOf(boolean z) {
        this.getInitSettings = z ? 1 : 0;
        return this;
    }

    public boolean onXdkEvent() {
        return this.a == 1;
    }

    public checkStringNotEmpty ag$a(boolean z) {
        this.a = z ? 1 : 0;
        return this;
    }

    public checkStringNotEmpty toString(boolean z) {
        this.ag$a = z ? 1 : 0;
        return this;
    }

    public checkStringNotEmpty ah$a(boolean z) {
        this.invoke = z ? 1 : 0;
        return this;
    }

    public String values() {
        return this.ah$a;
    }

    public checkStringNotEmpty toString(String str) {
        this.ah$a = str;
        return this;
    }

    public int ag$a() {
        if (!this.HaptikSDK$c) {
            throw new IllegalStateException("Font color has not been defined.");
        }
        return this.values;
    }

    public checkStringNotEmpty values(int i) {
        this.values = i;
        this.HaptikSDK$c = true;
        return this;
    }

    public boolean aj$a() {
        return this.HaptikSDK$c;
    }

    public int valueOf() {
        if (!this.ah$b) {
            throw new IllegalStateException("Background color has not been defined.");
        }
        return this.toString;
    }

    public checkStringNotEmpty valueOf(int i) {
        this.toString = i;
        this.ah$b = true;
        return this;
    }

    public boolean a() {
        return this.ah$b;
    }

    public checkStringNotEmpty values(float f) {
        this.getSignupData = f;
        return this;
    }

    public float HaptikWebView() {
        return this.getSignupData;
    }

    public checkStringNotEmpty ah$a(checkStringNotEmpty checkstringnotempty) {
        return ag$a(checkstringnotempty, true);
    }

    private checkStringNotEmpty ag$a(checkStringNotEmpty checkstringnotempty, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (checkstringnotempty != null) {
            if (!this.HaptikSDK$c && checkstringnotempty.HaptikSDK$c) {
                values(checkstringnotempty.values);
            }
            if (this.ag$a == -1) {
                this.ag$a = checkstringnotempty.ag$a;
            }
            if (this.invoke == -1) {
                this.invoke = checkstringnotempty.invoke;
            }
            if (this.ah$a == null && (str = checkstringnotempty.ah$a) != null) {
                this.ah$a = str;
            }
            if (this.getInitSettings == -1) {
                this.getInitSettings = checkstringnotempty.getInitSettings;
            }
            if (this.a == -1) {
                this.a = checkstringnotempty.a;
            }
            if (this.HaptikSDK$d == -1) {
                this.HaptikSDK$d = checkstringnotempty.HaptikSDK$d;
            }
            if (this.isLogoutPending == null && (alignment2 = checkstringnotempty.isLogoutPending) != null) {
                this.isLogoutPending = alignment2;
            }
            if (this.HaptikSDK$e == null && (alignment = checkstringnotempty.HaptikSDK$e) != null) {
                this.HaptikSDK$e = alignment;
            }
            if (this.onXdkEvent == -1) {
                this.onXdkEvent = checkstringnotempty.onXdkEvent;
            }
            if (this.HaptikSDK$a == -1) {
                this.HaptikSDK$a = checkstringnotempty.HaptikSDK$a;
                this.valueOf = checkstringnotempty.valueOf;
            }
            if (this.ak == null) {
                this.ak = checkstringnotempty.ak;
            }
            if (this.getSignupData == Float.MAX_VALUE) {
                this.getSignupData = checkstringnotempty.getSignupData;
            }
            if (z && !this.ah$b && checkstringnotempty.ah$b) {
                valueOf(checkstringnotempty.toString);
            }
            if (z && this.HaptikWebView == -1 && (i = checkstringnotempty.HaptikWebView) != -1) {
                this.HaptikWebView = i;
            }
        }
        return this;
    }

    public checkStringNotEmpty ag$a(String str) {
        this.HaptikSDK$b = str;
        return this;
    }

    public String HaptikSDK$a() {
        return this.HaptikSDK$b;
    }

    public checkStringNotEmpty ah$a(int i) {
        this.HaptikWebView = i;
        return this;
    }

    public int ah$b() {
        return this.HaptikWebView;
    }

    public checkStringNotEmpty toString(int i) {
        this.HaptikSDK$d = i;
        return this;
    }

    public int invoke() {
        return this.HaptikSDK$d;
    }

    public Layout.Alignment getSignupData() {
        return this.isLogoutPending;
    }

    public checkStringNotEmpty ah$a(Layout.Alignment alignment) {
        this.isLogoutPending = alignment;
        return this;
    }

    public Layout.Alignment HaptikSDK$b() {
        return this.HaptikSDK$e;
    }

    public checkStringNotEmpty toString(Layout.Alignment alignment) {
        this.HaptikSDK$e = alignment;
        return this;
    }

    public boolean HaptikSDK$e() {
        return this.onXdkEvent == 1;
    }

    public checkStringNotEmpty values(boolean z) {
        this.onXdkEvent = z ? 1 : 0;
        return this;
    }

    public Preconditions getInitSettings() {
        return this.ak;
    }

    public checkStringNotEmpty values(Preconditions preconditions) {
        this.ak = preconditions;
        return this;
    }

    public checkStringNotEmpty toString(float f) {
        this.valueOf = f;
        return this;
    }

    public checkStringNotEmpty ag$a(int i) {
        this.HaptikSDK$a = i;
        return this;
    }

    public int HaptikSDK$c() {
        return this.HaptikSDK$a;
    }

    public float ah$a() {
        return this.valueOf;
    }
}
