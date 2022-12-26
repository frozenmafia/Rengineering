package o;

import java.io.IOException;
/* loaded from: classes5.dex */
public abstract class buildClassName implements EmptyDecorator {
    private final EmptyDecorator delegate;

    public buildClassName(EmptyDecorator emptyDecorator) {
        runAnimators.ag$a(emptyDecorator, "delegate");
        this.delegate = emptyDecorator;
    }

    public final EmptyDecorator delegate() {
        return this.delegate;
    }

    @Override // o.EmptyDecorator
    public long read(getMinSmallestWidth getminsmallestwidth, long j) throws IOException {
        runAnimators.ag$a(getminsmallestwidth, "sink");
        return this.delegate.read(getminsmallestwidth, j);
    }

    @Override // o.EmptyDecorator
    public DisplayFeature timeout() {
        return this.delegate.timeout();
    }

    @Override // o.EmptyDecorator, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        this.delegate.close();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final EmptyDecorator m1249deprecated_delegate() {
        return this.delegate;
    }
}
