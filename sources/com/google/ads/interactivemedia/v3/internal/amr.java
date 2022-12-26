package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public final class amr extends amq {
    protected amr(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static amr j(String str, Context context, boolean z) {
        v(context, z);
        return new amr(context, str, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.ads.interactivemedia.v3.internal.amq
    public final List p(anl anlVar, Context context, age ageVar, afh afhVar) {
        if (anlVar.j() == null || !this.t) {
            return super.p(anlVar, context, ageVar, afhVar);
        }
        int a = anlVar.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.p(anlVar, context, ageVar, afhVar));
        arrayList.add(new aoc(anlVar, ageVar, a, null, null, null));
        return arrayList;
    }
}
