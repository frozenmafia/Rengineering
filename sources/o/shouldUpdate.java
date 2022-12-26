package o;

import android.content.Context;
import android.content.SharedPreferences;
import o.ViewCompat;
/* loaded from: classes3.dex */
public final class shouldUpdate implements isScreenReaderFocusable {
    public static final valueOf ah$a = new valueOf(null);
    private final SharedPreferences values;

    public shouldUpdate(Context context) {
        runAnimators.valueOf(context, "context");
        this.values = context.getSharedPreferences("com.bugsnag.android", 0);
    }

    @Override // o.isScreenReaderFocusable
    public String values(boolean z) {
        return this.values.getString("install.iud", null);
    }

    public final ViewCompat.Api18Impl ag$a(String str) {
        return new ViewCompat.Api18Impl(this.values.getString("user.id", str), this.values.getString("user.email", null), this.values.getString("user.name", null));
    }

    public final boolean ah$a() {
        return this.values.contains("install.iud");
    }

    public final void ag$a() {
        if (ah$a()) {
            this.values.edit().clear().commit();
        }
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        private valueOf() {
        }

        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }
    }
}
