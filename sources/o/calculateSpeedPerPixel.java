package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
/* loaded from: classes7.dex */
public final class calculateSpeedPerPixel {
    private static final calculateSpeedPerPixel toString = new calculateSpeedPerPixel();

    private calculateSpeedPerPixel() {
    }

    private static void toString(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : sharedPreferences.getAll().keySet()) {
            edit.remove(str);
        }
        edit.apply();
    }

    private static final SharedPreferences valueOf(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", str), 0);
    }

    public final void ah$a(Context context, String str, String str2, String str3, String str4) {
        synchronized (this) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
            SharedPreferences valueOf = valueOf(context, str);
            toString(valueOf);
            SharedPreferences.Editor edit = valueOf.edit();
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str4);
            edit.apply();
        }
    }

    public final void ah$a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        synchronized (this) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str7);
            SharedPreferences valueOf = valueOf(context, str);
            toString(valueOf);
            SharedPreferences.Editor edit = valueOf.edit();
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2), str3);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), str4);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2), str5);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str7);
            edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", str6);
            edit.apply();
        }
    }

    public final String toString(Context context, String str, String str2) {
        String string;
        boolean isEmpty;
        synchronized (this) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
            SharedPreferences valueOf = valueOf(context, str);
            String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
            String string2 = valueOf.getString(format, null);
            String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
            string = valueOf.getString(format2, null);
            SharedPreferences.Editor edit = valueOf.edit();
            edit.remove(format);
            edit.remove(format2);
            edit.apply();
            isEmpty = TextUtils.isEmpty(string2);
        }
        if (isEmpty) {
            return null;
        }
        return string;
    }

    public final calculateDyToMakeVisible valueOf(Context context, String str, String str2) {
        synchronized (this) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
            SharedPreferences valueOf = valueOf(context, str);
            String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2);
            String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
            String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2);
            String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
            String string = valueOf.getString(format, null);
            String string2 = valueOf.getString(format2, null);
            String string3 = valueOf.getString(format3, null);
            String string4 = valueOf.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
            String string5 = valueOf.getString(format4, null);
            SharedPreferences.Editor edit = valueOf.edit();
            edit.remove(format);
            edit.remove(format2);
            edit.remove(format3);
            edit.remove(format4);
            edit.apply();
            if (string == null || string2 == null || string3 == null) {
                return null;
            }
            return new calculateDyToMakeVisible(string, string2, string3, string4, string5);
        }
    }
}
