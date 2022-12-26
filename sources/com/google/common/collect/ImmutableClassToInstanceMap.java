package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;
import o.AsyncListDiffer;
import o.isRequestedGeneration;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
public final class ImmutableClassToInstanceMap<B> extends isRequestedGeneration<Class<? extends B>, B> implements AsyncListDiffer.MainThreadExecutor<B>, Serializable {
    private static final ImmutableClassToInstanceMap<Object> EMPTY = new ImmutableClassToInstanceMap<>(ImmutableMap.of());
    private final ImmutableMap<Class<? extends B>, B> delegate;

    public static <B> ImmutableClassToInstanceMap<B> of() {
        return (ImmutableClassToInstanceMap<B>) EMPTY;
    }

    public static <B, T extends B> ImmutableClassToInstanceMap<B> of(Class<T> cls, T t) {
        return new ImmutableClassToInstanceMap<>(ImmutableMap.of(cls, t));
    }

    public static <B> ImmutableClassToInstanceMap$ag$a<B> builder() {
        return new ImmutableClassToInstanceMap$ag$a<>();
    }

    public static <B, S extends B> ImmutableClassToInstanceMap<B> copyOf(Map<? extends Class<? extends S>, ? extends S> map) {
        if (map instanceof ImmutableClassToInstanceMap) {
            return (ImmutableClassToInstanceMap) map;
        }
        return new ImmutableClassToInstanceMap$ag$a().toString(map).valueOf();
    }

    private ImmutableClassToInstanceMap(ImmutableMap<Class<? extends B>, B> immutableMap) {
        this.delegate = immutableMap;
    }

    @Override // o.isRequestedGeneration, o.removeTile
    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T extends B, java.lang.Object] */
    public <T extends B> T getInstance(Class<T> cls) {
        return this.delegate.get(markViewHoldersUpdated.toString(cls));
    }

    @Deprecated
    public <T extends B> T putInstance(Class<T> cls, T t) {
        throw new UnsupportedOperationException();
    }

    Object readResolve() {
        return isEmpty() ? of() : this;
    }
}
