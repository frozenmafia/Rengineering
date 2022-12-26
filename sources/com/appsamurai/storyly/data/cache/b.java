package com.appsamurai.storyly.data.cache;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getUniqueKey;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class b extends Lambda implements Styleable.ChangeBounds<getUniqueKey, Boolean> {
    public final /* synthetic */ getUniqueKey a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(getUniqueKey getuniquekey) {
        super(1);
        this.a = getuniquekey;
    }

    @Override // o.Styleable.ChangeBounds
    public Boolean invoke(getUniqueKey getuniquekey) {
        getUniqueKey getuniquekey2 = getuniquekey;
        runAnimators.ag$a(getuniquekey2, "it");
        return Boolean.valueOf(runAnimators.values((Object) getuniquekey2.valueOf, (Object) this.a.valueOf));
    }
}
