package com.dream11.react;

import com.facebook.jni.HybridData;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.soloader.SoLoader;
import o.getTargetTypes;
/* loaded from: classes6.dex */
public final class D11ComponentsRegistry {
    public static final valueOf ag$a = new valueOf(null);
    private final HybridData mHybridData;

    private final native HybridData initHybrid(ComponentFactory componentFactory);

    /* loaded from: classes6.dex */
    public static final class valueOf {
        private valueOf() {
        }

        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }
    }

    static {
        SoLoader.values("fabricjni");
    }
}
