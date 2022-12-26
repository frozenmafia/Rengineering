package com.appsamurai.storyly.storylypresenter.storylylayer;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TypefaceCompat;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class t$b extends Lambda implements Styleable.ChangeBounds<Map<String, f1>, setAnimationMatrix> {
    public final /* synthetic */ TypefaceCompat a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f1 f151b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t$b(TypefaceCompat typefaceCompat, f1 f1Var) {
        super(1);
        this.a = typefaceCompat;
        this.f151b = f1Var;
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(Map<String, f1> map) {
        Map<String, f1> map2 = map;
        runAnimators.ag$a(map2, "it");
        map2.put(this.a.ah$a, this.f151b);
        return setAnimationMatrix.ag$a;
    }
}
