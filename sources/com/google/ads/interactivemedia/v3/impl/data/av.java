package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.ass;
import com.google.ads.interactivemedia.v3.internal.vf;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final /* synthetic */ class av {
    public static final boolean a(vf vfVar) {
        ass assVar = (ass) vfVar.d().getAnnotation(ass.class);
        return assVar != null && Arrays.asList(assVar.b()).contains(vfVar.e());
    }
}
