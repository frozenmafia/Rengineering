package o;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.StaggeredGridLayoutManager;
/* loaded from: classes5.dex */
public final class sizeForPosition extends StaggeredGridLayoutManager.Span {
    private final List<invalidateSpanAssignments> ag$a;
    private String valueOf;
    private invalidateSpanAssignments values;
    private static final Writer toString = new Writer() { // from class: o.sizeForPosition.2
        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }
    };
    private static final StaggeredGridLayoutManager.AnonymousClass1 ah$a = new StaggeredGridLayoutManager.AnonymousClass1("closed");

    @Override // o.StaggeredGridLayoutManager.Span, java.io.Flushable
    public void flush() throws IOException {
    }

    public sizeForPosition() {
        super(toString);
        this.ag$a = new ArrayList();
        this.values = setGapStrategy.values;
    }

    public invalidateSpanAssignments HaptikSDK$c() {
        if (!this.ag$a.isEmpty()) {
            throw new IllegalStateException("Expected one JSON element but was " + this.ag$a);
        }
        return this.values;
    }

    private invalidateSpanAssignments HaptikSDK$d() {
        List<invalidateSpanAssignments> list = this.ag$a;
        return list.get(list.size() - 1);
    }

    private void ah$a(invalidateSpanAssignments invalidatespanassignments) {
        if (this.valueOf != null) {
            if (!invalidatespanassignments.HaptikSDK$e() || invoke()) {
                ((prepareLayoutStateForDelta) HaptikSDK$d()).toString(this.valueOf, invalidatespanassignments);
            }
            this.valueOf = null;
        } else if (this.ag$a.isEmpty()) {
            this.values = invalidatespanassignments;
        } else {
            invalidateSpanAssignments HaptikSDK$d = HaptikSDK$d();
            if (HaptikSDK$d instanceof findLastVisibleItemPositions) {
                ((findLastVisibleItemPositions) HaptikSDK$d).valueOf(invalidatespanassignments);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // o.StaggeredGridLayoutManager.Span
    public StaggeredGridLayoutManager.Span valueOf() throws IOException {
        findLastVisibleItemPositions findlastvisibleitempositions = new findLastVisibleItemPositions();
        ah$a(findlastvisibleitempositions);
        this.ag$a.add(findlastvisibleitempositions);
        return this;
    }

    @Override // o.StaggeredGridLayoutManager.Span
    public StaggeredGridLayoutManager.Span ah$a() throws IOException {
        if (this.ag$a.isEmpty() || this.valueOf != null) {
            throw new IllegalStateException();
        }
        if (HaptikSDK$d() instanceof findLastVisibleItemPositions) {
            List<invalidateSpanAssignments> list = this.ag$a;
            list.remove(list.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // o.StaggeredGridLayoutManager.Span
    public StaggeredGridLayoutManager.Span values() throws IOException {
        prepareLayoutStateForDelta preparelayoutstatefordelta = new prepareLayoutStateForDelta();
        ah$a(preparelayoutstatefordelta);
        this.ag$a.add(preparelayoutstatefordelta);
        return this;
    }

    @Override // o.StaggeredGridLayoutManager.Span
    public StaggeredGridLayoutManager.Span ag$a() throws IOException {
        if (this.ag$a.isEmpty() || this.valueOf != null) {
            throw new IllegalStateException();
        }
        if (HaptikSDK$d() instanceof prepareLayoutStateForDelta) {
            List<invalidateSpanAssignments> list = this.ag$a;
            list.remove(list.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // o.StaggeredGridLayoutManager.Span
    public StaggeredGridLayoutManager.Span ah$a(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.ag$a.isEmpty() || this.valueOf != null) {
            throw new IllegalStateException();
        }
        if (HaptikSDK$d() instanceof prepareLayoutStateForDelta) {
            this.valueOf = str;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // o.StaggeredGridLayoutManager.Span
    public StaggeredGridLayoutManager.Span values(String str) throws IOException {
        if (str == null) {
            return HaptikSDK$b();
        }
        ah$a(new StaggeredGridLayoutManager.AnonymousClass1(str));
        return this;
    }

    @Override // o.StaggeredGridLayoutManager.Span
    public StaggeredGridLayoutManager.Span HaptikSDK$b() throws IOException {
        ah$a(setGapStrategy.values);
        return this;
    }

    @Override // o.StaggeredGridLayoutManager.Span
    public StaggeredGridLayoutManager.Span values(boolean z) throws IOException {
        ah$a(new StaggeredGridLayoutManager.AnonymousClass1(Boolean.valueOf(z)));
        return this;
    }

    @Override // o.StaggeredGridLayoutManager.Span
    public StaggeredGridLayoutManager.Span ag$a(Boolean bool) throws IOException {
        if (bool == null) {
            return HaptikSDK$b();
        }
        ah$a(new StaggeredGridLayoutManager.AnonymousClass1(bool));
        return this;
    }

    @Override // o.StaggeredGridLayoutManager.Span
    public StaggeredGridLayoutManager.Span toString(long j) throws IOException {
        ah$a(new StaggeredGridLayoutManager.AnonymousClass1(Long.valueOf(j)));
        return this;
    }

    @Override // o.StaggeredGridLayoutManager.Span
    public StaggeredGridLayoutManager.Span valueOf(Number number) throws IOException {
        if (number == null) {
            return HaptikSDK$b();
        }
        if (!ah$b()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        ah$a(new StaggeredGridLayoutManager.AnonymousClass1(number));
        return this;
    }

    @Override // o.StaggeredGridLayoutManager.Span, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.ag$a.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.ag$a.add(ah$a);
    }
}
