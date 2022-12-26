package com.google.common.util.concurrent;

import com.google.common.util.concurrent.Striped;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import o.DefaultItemAnimator;
import o.getTotalCount;
/* loaded from: classes7.dex */
final class Striped$ag$a extends DefaultItemAnimator {
    private final Striped.toString valueOf;
    private final Lock values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Striped$ag$a(Lock lock, Striped.toString tostring) {
        this.values = lock;
        this.valueOf = tostring;
    }

    @Override // o.DefaultItemAnimator
    public Lock ag$a() {
        return this.values;
    }

    @Override // o.DefaultItemAnimator, java.util.concurrent.locks.Lock
    public Condition newCondition() {
        final Condition newCondition = this.values.newCondition();
        final Striped.toString tostring = this.valueOf;
        return new getTotalCount(newCondition, tostring) { // from class: com.google.common.util.concurrent.Striped$ah$a
            private final Striped.toString toString;
            private final Condition values;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.values = newCondition;
                this.toString = tostring;
            }

            @Override // o.getTotalCount
            public Condition values() {
                return this.values;
            }
        };
    }
}
