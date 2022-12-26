package o;

import android.content.Context;
import java.util.Objects;
import o.EditTextPreference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class onGetDefaultValue extends EditTextPreference.SavedState.AnonymousClass1 {
    private final String ag$a;
    private final setOnPreferenceChangeInternalListener toString;
    private final Context valueOf;
    private final setOnPreferenceChangeInternalListener values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public onGetDefaultValue(Context context, setOnPreferenceChangeInternalListener setonpreferencechangeinternallistener, setOnPreferenceChangeInternalListener setonpreferencechangeinternallistener2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.valueOf = context;
        Objects.requireNonNull(setonpreferencechangeinternallistener, "Null wallClock");
        this.values = setonpreferencechangeinternallistener;
        Objects.requireNonNull(setonpreferencechangeinternallistener2, "Null monotonicClock");
        this.toString = setonpreferencechangeinternallistener2;
        Objects.requireNonNull(str, "Null backendName");
        this.ag$a = str;
    }

    @Override // o.EditTextPreference.SavedState.AnonymousClass1
    public Context ag$a() {
        return this.valueOf;
    }

    @Override // o.EditTextPreference.SavedState.AnonymousClass1
    public setOnPreferenceChangeInternalListener values() {
        return this.values;
    }

    @Override // o.EditTextPreference.SavedState.AnonymousClass1
    public setOnPreferenceChangeInternalListener ah$a() {
        return this.toString;
    }

    @Override // o.EditTextPreference.SavedState.AnonymousClass1
    public String valueOf() {
        return this.ag$a;
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.valueOf + ", wallClock=" + this.values + ", monotonicClock=" + this.toString + ", backendName=" + this.ag$a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EditTextPreference.SavedState.AnonymousClass1) {
            EditTextPreference.SavedState.AnonymousClass1 anonymousClass1 = (EditTextPreference.SavedState.AnonymousClass1) obj;
            return this.valueOf.equals(anonymousClass1.ag$a()) && this.values.equals(anonymousClass1.values()) && this.toString.equals(anonymousClass1.ah$a()) && this.ag$a.equals(anonymousClass1.valueOf());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.valueOf.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ this.values.hashCode()) * 1000003) ^ this.toString.hashCode()) * 1000003) ^ this.ag$a.hashCode();
    }
}
