package com.appsamurai.storyly.exoplayer2.core.upstream;

import com.appsamurai.storyly.exoplayer2.core.upstream.Loader;
import com.appsamurai.storyly.exoplayer2.core.upstream.Loader.values;
import java.io.IOException;
/* loaded from: classes3.dex */
public interface Loader$ag$a<T extends Loader.values> {
    void ah$a(T t, long j, long j2, boolean z);

    void valueOf(T t, long j, long j2);

    Loader.valueOf values(T t, long j, long j2, IOException iOException, int i);
}
