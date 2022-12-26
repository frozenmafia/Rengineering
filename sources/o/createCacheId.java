package o;

import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
public abstract class createCacheId implements requestFontAsync {
    private long ag$a;
    private final long ah$a;
    private final long toString;

    public createCacheId(long j, long j2) {
        this.ah$a = j;
        this.toString = j2;
        HaptikSDK$b();
    }

    public boolean ah$a() {
        return this.ag$a > this.toString;
    }

    @Override // o.requestFontAsync
    public boolean valueOf() {
        this.ag$a++;
        return !ah$a();
    }

    public void HaptikSDK$b() {
        this.ag$a = this.ah$a - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ag$a() {
        long j = this.ag$a;
        if (j < this.ah$a || j > this.toString) {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long values() {
        return this.ag$a;
    }
}
