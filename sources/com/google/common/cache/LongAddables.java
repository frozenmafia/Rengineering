package com.google.common.cache;

import java.util.concurrent.atomic.AtomicLong;
import o.AdapterListUpdateCallback;
import o.offsetPositionsForRemovingLaidOutOrNewView;
/* loaded from: classes7.dex */
public final class LongAddables {
    private static final offsetPositionsForRemovingLaidOutOrNewView<AdapterListUpdateCallback> ag$a;

    LongAddables() {
    }

    static {
        offsetPositionsForRemovingLaidOutOrNewView<AdapterListUpdateCallback> offsetpositionsforremovinglaidoutornewview;
        try {
            new LongAdder();
            offsetpositionsforremovinglaidoutornewview = new offsetPositionsForRemovingLaidOutOrNewView<AdapterListUpdateCallback>() { // from class: com.google.common.cache.LongAddables.2
                @Override // o.offsetPositionsForRemovingLaidOutOrNewView
                /* renamed from: ag$a */
                public AdapterListUpdateCallback get() {
                    return new LongAdder();
                }
            };
        } catch (Throwable unused) {
            offsetpositionsforremovinglaidoutornewview = new offsetPositionsForRemovingLaidOutOrNewView<AdapterListUpdateCallback>() { // from class: com.google.common.cache.LongAddables.1
                @Override // o.offsetPositionsForRemovingLaidOutOrNewView
                /* renamed from: valueOf */
                public AdapterListUpdateCallback get() {
                    return new PureJavaLongAddable();
                }
            };
        }
        ag$a = offsetpositionsforremovinglaidoutornewview;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class PureJavaLongAddable extends AtomicLong implements AdapterListUpdateCallback {
        private PureJavaLongAddable() {
        }

        @Override // o.AdapterListUpdateCallback
        public void increment() {
            getAndIncrement();
        }

        @Override // o.AdapterListUpdateCallback
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // o.AdapterListUpdateCallback
        public long sum() {
            return get();
        }
    }
}
