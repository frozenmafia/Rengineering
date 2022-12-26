package com.appsamurai.storyly.storylypresenter.storylyheader;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class d extends Lambda implements Styleable.ChangeBounds<Long, setAnimationMatrix> {
    public final /* synthetic */ e a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f125b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, long j) {
        super(1);
        this.a = eVar;
        this.f125b = j;
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Long l) {
        this.a.values().invoke(Long.valueOf(l.longValue()), Long.valueOf(this.f125b));
        return setAnimationMatrix.ag$a;
    }
}
