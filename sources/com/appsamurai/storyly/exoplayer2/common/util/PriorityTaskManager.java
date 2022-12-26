package com.appsamurai.storyly.exoplayer2.common.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class PriorityTaskManager {
    private final Object valueOf = new Object();
    private final PriorityQueue<Integer> values = new PriorityQueue<>(10, Collections.reverseOrder());
    private int ag$a = Integer.MIN_VALUE;

    /* loaded from: classes6.dex */
    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i, int i2) {
            super("Priority too low [priority=" + i + ", highest=" + i2 + "]");
        }
    }

    public void values(int i) {
        synchronized (this.valueOf) {
            this.values.add(Integer.valueOf(i));
            this.ag$a = Math.max(this.ag$a, i);
        }
    }

    public void valueOf(int i) {
        synchronized (this.valueOf) {
            this.values.remove(Integer.valueOf(i));
            this.ag$a = this.values.isEmpty() ? Integer.MIN_VALUE : ((Integer) getElevationDegrees.ah$a(this.values.peek())).intValue();
            this.valueOf.notifyAll();
        }
    }
}
