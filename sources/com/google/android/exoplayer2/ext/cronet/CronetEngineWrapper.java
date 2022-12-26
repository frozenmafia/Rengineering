package com.google.android.exoplayer2.ext.cronet;

import android.content.Context;
import org.chromium.net.CronetEngine;
@Deprecated
/* loaded from: classes7.dex */
public final class CronetEngineWrapper {
    private final CronetEngine cronetEngine;

    public CronetEngineWrapper(Context context) {
        this(context, null, false);
    }

    public CronetEngineWrapper(Context context, String str, boolean z) {
        this.cronetEngine = CronetUtil.buildCronetEngine(context, str, z);
    }

    public CronetEngineWrapper(CronetEngine cronetEngine) {
        this.cronetEngine = cronetEngine;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CronetEngine getCronetEngine() {
        return this.cronetEngine;
    }
}
