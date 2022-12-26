package com.appsamurai.storyly.data.managers;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes3.dex */
public final class h$a extends Lambda implements Styleable.ArcMotion<SharedPreferences> {
    public final /* synthetic */ Context a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f96b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h$a(Context context, String str, int i) {
        super(0);
        this.a = context;
        this.f96b = str;
        this.c = i;
    }

    @Override // o.Styleable.ArcMotion
    public SharedPreferences invoke() {
        return this.a.getSharedPreferences(this.f96b, this.c);
    }
}
