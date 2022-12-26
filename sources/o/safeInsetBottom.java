package o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
/* loaded from: classes5.dex */
public interface safeInsetBottom extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    DisplayFeature timeout();

    void write(getMinSmallestWidth getminsmallestwidth, long j) throws IOException;
}
