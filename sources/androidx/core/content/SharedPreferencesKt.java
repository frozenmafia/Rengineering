package androidx.core.content;

import android.content.SharedPreferences;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes5.dex */
public final class SharedPreferencesKt {
    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z, Styleable.ChangeBounds changeBounds, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        runAnimators.ag$a(sharedPreferences, "<this>");
        runAnimators.ag$a(changeBounds, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        runAnimators.ah$a(edit, "editor");
        changeBounds.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static final void edit(SharedPreferences sharedPreferences, boolean z, Styleable.ChangeBounds<? super SharedPreferences.Editor, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(sharedPreferences, "<this>");
        runAnimators.ag$a(changeBounds, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        runAnimators.ah$a(edit, "editor");
        changeBounds.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
