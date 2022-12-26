package o;

import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes5.dex */
public interface EmptyDecorator extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    void close() throws IOException;

    long read(getMinSmallestWidth getminsmallestwidth, long j) throws IOException;

    DisplayFeature timeout();
}
