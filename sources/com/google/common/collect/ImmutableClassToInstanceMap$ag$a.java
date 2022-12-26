package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import o.ConcatAdapter;
/* loaded from: classes7.dex */
public final class ImmutableClassToInstanceMap$ag$a<B> {
    private final ImmutableMap.valueOf<Class<? extends B>, B> valueOf = ImmutableMap.builder();

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends B> ImmutableClassToInstanceMap$ag$a<B> toString(Map<? extends Class<? extends T>, ? extends T> map) {
        for (Map.Entry<? extends Class<? extends T>, ? extends T> entry : map.entrySet()) {
            Class<? extends T> key = entry.getKey();
            this.valueOf.toString(key, ag$a(key, entry.getValue()));
        }
        return this;
    }

    private static <B, T extends B> T ag$a(Class<T> cls, B b2) {
        return (T) ConcatAdapter.Config.StableIdMode.valueOf(cls).cast(b2);
    }

    public ImmutableClassToInstanceMap<B> valueOf() {
        ImmutableMap<Class<? extends B>, B> ag$a = this.valueOf.ag$a();
        if (ag$a.isEmpty()) {
            return ImmutableClassToInstanceMap.of();
        }
        return new ImmutableClassToInstanceMap<>(ag$a);
    }
}
