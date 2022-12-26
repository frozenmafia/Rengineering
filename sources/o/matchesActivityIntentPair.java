package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
/* loaded from: classes5.dex */
public final class matchesActivityIntentPair implements Closeable {
    private final boolean ag$a;
    private final Inflater ah$a;
    private final getMinSmallestWidth valueOf;
    private final parseSplitPairRule values;

    public matchesActivityIntentPair(boolean z) {
        this.ag$a = z;
        getMinSmallestWidth getminsmallestwidth = new getMinSmallestWidth();
        this.valueOf = getminsmallestwidth;
        Inflater inflater = new Inflater(true);
        this.ah$a = inflater;
        this.values = new parseSplitPairRule((EmptyDecorator) getminsmallestwidth, inflater);
    }

    public final void values(getMinSmallestWidth getminsmallestwidth) throws IOException {
        runAnimators.ag$a(getminsmallestwidth, "buffer");
        if (!(this.valueOf.onPostMessage() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.ag$a) {
            this.ah$a.reset();
        }
        this.valueOf.values(getminsmallestwidth);
        this.valueOf.valueOf(65535);
        long bytesRead = this.ah$a.getBytesRead();
        long onPostMessage = this.valueOf.onPostMessage();
        do {
            this.values.ag$a(getminsmallestwidth, Long.MAX_VALUE);
        } while (this.ah$a.getBytesRead() < bytesRead + onPostMessage);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.values.close();
    }
}
