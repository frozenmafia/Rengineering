package com.google.common.hash;

import java.util.concurrent.atomic.AtomicLong;
import o.getAdapters;
import o.offsetPositionsForRemovingLaidOutOrNewView;
/* loaded from: classes7.dex */
final class LongAddables {
    private static final offsetPositionsForRemovingLaidOutOrNewView<getAdapters> ag$a;

    LongAddables() {
    }

    static {
        offsetPositionsForRemovingLaidOutOrNewView<getAdapters> offsetpositionsforremovinglaidoutornewview;
        try {
            new LongAdder();
            offsetpositionsforremovinglaidoutornewview = new offsetPositionsForRemovingLaidOutOrNewView<getAdapters>() { // from class: com.google.common.hash.LongAddables.2
                @Override // o.offsetPositionsForRemovingLaidOutOrNewView
                /* renamed from: valueOf */
                public getAdapters get() {
                    return new LongAdder();
                }
            };
        } catch (Throwable unused) {
            offsetpositionsforremovinglaidoutornewview = new offsetPositionsForRemovingLaidOutOrNewView<getAdapters>() { // from class: com.google.common.hash.LongAddables.5
                @Override // o.offsetPositionsForRemovingLaidOutOrNewView
                /* renamed from: valueOf */
                public getAdapters get() {
                    return new PureJavaLongAddable();
                }
            };
        }
        ag$a = offsetpositionsforremovinglaidoutornewview;
    }

    public static getAdapters values() {
        return ag$a.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class PureJavaLongAddable extends AtomicLong implements getAdapters {
        private PureJavaLongAddable() {
        }

        @Override // o.getAdapters
        public void increment() {
            getAndIncrement();
        }

        @Override // o.getAdapters
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // o.getAdapters
        public long sum() {
            return get();
        }
    }
}
