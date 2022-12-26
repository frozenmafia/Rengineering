package com.dreampay.commons.storage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SharedPreferencesStorage$sharedPreferences$2 extends Lambda implements Styleable.ArcMotion<SharedPreferences> {
    final /* synthetic */ SharedPreferencesStorage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesStorage$sharedPreferences$2(SharedPreferencesStorage sharedPreferencesStorage) {
        super(0);
        this.this$0 = sharedPreferencesStorage;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final SharedPreferences invoke() {
        Context context;
        String generateFileName;
        context = this.this$0.context;
        generateFileName = this.this$0.generateFileName();
        return context.getSharedPreferences(generateFileName, 0);
    }
}
