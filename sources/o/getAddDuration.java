package o;

import o.RecyclerView;
/* loaded from: classes5.dex */
public class getAddDuration implements RecyclerView.ItemAnimator {
    public final long values;

    @Override // o.RecyclerView.ItemAnimator
    public float ag$a() {
        return 0.2f;
    }

    @Override // o.RecyclerView.ItemAnimator
    public long valueOf() {
        return 1000L;
    }

    @Override // o.RecyclerView.ItemAnimator
    public boolean values(long j) {
        return j > 1000;
    }

    public getAddDuration(long j) {
        this.values = j;
    }

    @Override // o.RecyclerView.ItemAnimator
    public boolean ah$a(long j, long j2) {
        return j > this.values || j2 > 1000;
    }
}
