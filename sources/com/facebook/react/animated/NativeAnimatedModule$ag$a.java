package com.facebook.react.animated;

import com.facebook.react.animated.NativeAnimatedModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import o.getSnapshot;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class NativeAnimatedModule$ag$a {
    private final Queue<NativeAnimatedModule.valueOf> ag$a;
    private NativeAnimatedModule.valueOf ah$a;
    private boolean toString;
    final /* synthetic */ NativeAnimatedModule values;

    private NativeAnimatedModule$ag$a(NativeAnimatedModule nativeAnimatedModule) {
        this.values = nativeAnimatedModule;
        this.ag$a = new ConcurrentLinkedQueue();
        this.ah$a = null;
        this.toString = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean valueOf() {
        return this.ag$a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf(boolean z) {
        this.toString = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(NativeAnimatedModule.valueOf valueof) {
        if (this.toString) {
            synchronized (this) {
                this.ag$a.add(valueof);
            }
            return;
        }
        this.ag$a.add(valueof);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(long j, getSnapshot getsnapshot) {
        List<NativeAnimatedModule.valueOf> ag$a;
        if (this.toString) {
            synchronized (this) {
                ag$a = ag$a(j);
            }
        } else {
            ag$a = ag$a(j);
        }
        for (NativeAnimatedModule.valueOf valueof : ag$a) {
            valueof.toString(getsnapshot);
        }
    }

    private List<NativeAnimatedModule.valueOf> ag$a(long j) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            NativeAnimatedModule.valueOf valueof = this.ah$a;
            if (valueof != null) {
                if (valueof.values() > j) {
                    break;
                }
                arrayList.add(this.ah$a);
                this.ah$a = null;
            }
            NativeAnimatedModule.valueOf poll = this.ag$a.poll();
            if (poll == null) {
                break;
            } else if (poll.values() > j) {
                this.ah$a = poll;
                break;
            } else {
                arrayList.add(poll);
            }
        }
        return arrayList;
    }
}
