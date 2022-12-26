package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class apz implements aqg {
    final /* synthetic */ aqa a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public apz(aqa aqaVar) {
        this.a = aqaVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqg
    public final Boolean a(String str, boolean z) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.a.e;
            return Boolean.valueOf(sharedPreferences2.getBoolean(str, z));
        } catch (ClassCastException unused) {
            sharedPreferences = this.a.e;
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z)));
        }
    }
}
