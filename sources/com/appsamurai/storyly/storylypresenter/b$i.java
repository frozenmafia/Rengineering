package com.appsamurai.storyly.storylypresenter;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import o.ContentInfoCompat;
import o.NestedScrollingParentHelper;
import o.OnReceiveContentViewBehavior;
import o.Styleable;
import o.createFromFontInfo;
/* loaded from: classes3.dex */
public final class b$i extends Lambda implements Styleable.ArcMotion<e> {
    public final /* synthetic */ Context a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OnReceiveContentViewBehavior f111b;
    public final /* synthetic */ NestedScrollingParentHelper c;
    public final /* synthetic */ createFromFontInfo d;
    public final /* synthetic */ ContentInfoCompat.Source e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b$i(Context context, OnReceiveContentViewBehavior onReceiveContentViewBehavior, NestedScrollingParentHelper nestedScrollingParentHelper, createFromFontInfo createfromfontinfo, ContentInfoCompat.Source source) {
        super(0);
        this.a = context;
        this.f111b = onReceiveContentViewBehavior;
        this.c = nestedScrollingParentHelper;
        this.d = createfromfontinfo;
        this.e = source;
    }

    @Override // o.Styleable.ArcMotion
    public e invoke() {
        e eVar = new e(this.a, this.f111b, this.c, this.d);
        eVar.setOnPagingThresholdPassed$storyly_release(new c(this.e));
        return eVar;
    }
}
