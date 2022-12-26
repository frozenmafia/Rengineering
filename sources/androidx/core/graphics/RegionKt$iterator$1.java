package androidx.core.graphics;

import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;
import o.Transition;
/* loaded from: classes6.dex */
public final class RegionKt$iterator$1 implements Iterator<Rect>, Transition.ArrayListManager {
    final /* synthetic */ Region $this_iterator;
    private boolean hasMore;
    private final RegionIterator iterator;
    private final Rect rect;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RegionKt$iterator$1(Region region) {
        this.$this_iterator = region;
        RegionIterator regionIterator = new RegionIterator(region);
        this.iterator = regionIterator;
        Rect rect = new Rect();
        this.rect = rect;
        this.hasMore = regionIterator.next(rect);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasMore;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Rect next() {
        if (this.hasMore) {
            Rect rect = new Rect(this.rect);
            this.hasMore = this.iterator.next(this.rect);
            return rect;
        }
        throw new IndexOutOfBoundsException();
    }
}
