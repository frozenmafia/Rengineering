package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import o.move;
/* loaded from: classes5.dex */
public final class zzt {
    private static long ag$a = 0;
    private static char[] ah$a = null;
    private static int toString = 1;
    private static int values;
    private static final Uri zza;
    private static final Uri zzb;

    static {
        values();
        Uri parse = Uri.parse("https://plus.google.com/");
        zza = parse;
        zzb = parse.buildUpon().appendPath("circles").appendPath("find").build();
        int i = toString + 3;
        values = i % 128;
        if ((i % 2 != 0 ? (char) 24 : 'C') != 'C') {
            Object obj = null;
            super.hashCode();
        }
    }

    static void values() {
        ag$a = -3465438354922672745L;
        ah$a = new char[]{'i', 60915};
    }

    public static Intent zza() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        try {
            intent.setPackage("com.google.android.wearable.app");
            int i = toString + 9;
            values = i % 128;
            if (!(i % 2 == 0)) {
                Object obj = null;
                super.hashCode();
                return intent;
            }
            return intent;
        } catch (Exception e) {
            throw e;
        }
    }

    public static Intent zzb(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(toString((ViewConfiguration.getKeyRepeatDelay() >> 16) + 2, (-1) - Process.getGidForName(""), (char) (ViewConfiguration.getTapTimeout() >> 16)).intern(), "com.google.android.gms");
        if ((!TextUtils.isEmpty(str2) ? 'M' : 'N') != 'N') {
            int i = toString + 51;
            values = i % 128;
            int i2 = i % 2;
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
            int i3 = values + 59;
            toString = i3 % 128;
            int i4 = i3 % 2;
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    public static Intent zzc(String str) {
        try {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            int i = values + 79;
            toString = i % 128;
            int i2 = i % 2;
            return intent;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String toString(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((ah$a[move.values + i2] ^ (move.values * ag$a)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
