package com.facebook.react.common.mapbuffer;

import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import java.util.Iterator;
import o.Transition;
/* loaded from: classes4.dex */
public final class ReadableMapBuffer$ag$a implements Iterator<MapBuffer.toString>, Transition.ArrayListManager {
    final /* synthetic */ ReadableMapBuffer ah$a;
    private int toString;
    private final int valueOf;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReadableMapBuffer$ag$a(ReadableMapBuffer readableMapBuffer) {
        this.ah$a = readableMapBuffer;
        this.valueOf = readableMapBuffer.ag$a() - 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.toString <= this.valueOf;
    }

    @Override // java.util.Iterator
    /* renamed from: valueOf */
    public MapBuffer.toString next() {
        int HaptikSDK$b;
        ReadableMapBuffer readableMapBuffer = this.ah$a;
        int i = this.toString;
        this.toString = i + 1;
        HaptikSDK$b = readableMapBuffer.HaptikSDK$b(i);
        return new ReadableMapBuffer.values(readableMapBuffer, HaptikSDK$b);
    }
}
