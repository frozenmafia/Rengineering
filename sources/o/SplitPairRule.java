package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import o.SplitRule;
import o.getMinSmallestWidth;
import okio.ByteString;
/* loaded from: classes5.dex */
public final class SplitPairRule implements Closeable {
    private final SplitRule.LayoutDir HaptikSDK$a;
    private final boolean HaptikSDK$b;
    private final boolean HaptikSDK$c;
    private boolean HaptikSDK$e;
    private final getMinSmallestWidth HaptikWebView;
    private final byte[] ag$a;
    private final getMinSmallestWidth.toString ah$a;
    private final Random ah$b;
    private final long invoke;
    private final boolean toString;
    private final getMinSmallestWidth valueOf;
    private getSecondaryActivityIntentAction values;

    public SplitPairRule(boolean z, SplitRule.LayoutDir layoutDir, Random random, boolean z2, boolean z3, long j) {
        runAnimators.ag$a(layoutDir, "sink");
        runAnimators.ag$a(random, "random");
        this.toString = z;
        this.HaptikSDK$a = layoutDir;
        this.ah$b = random;
        this.HaptikSDK$b = z2;
        this.HaptikSDK$c = z3;
        this.invoke = j;
        this.valueOf = new getMinSmallestWidth();
        this.HaptikWebView = layoutDir.HaptikSDK$e();
        this.ag$a = z ? new byte[4] : null;
        this.ah$a = z ? new getMinSmallestWidth.toString() : null;
    }

    public final void ag$a(ByteString byteString) throws IOException {
        runAnimators.ag$a(byteString, "payload");
        valueOf(9, byteString);
    }

    public final void toString(ByteString byteString) throws IOException {
        runAnimators.ag$a(byteString, "payload");
        valueOf(10, byteString);
    }

    public final void ag$a(int i, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                getFinishPrimaryWithSecondary.ag$a.valueOf(i);
            }
            getMinSmallestWidth getminsmallestwidth = new getMinSmallestWidth();
            getminsmallestwidth.HaptikSDK$b(i);
            if (byteString != null) {
                getminsmallestwidth.toString(byteString);
            }
            byteString2 = getminsmallestwidth.aj$a();
        }
        try {
            valueOf(8, byteString2);
        } finally {
            this.HaptikSDK$e = true;
        }
    }

    private final void valueOf(int i, ByteString byteString) throws IOException {
        if (this.HaptikSDK$e) {
            throw new IOException("closed");
        }
        int size = byteString.size();
        if (!(((long) size) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.HaptikWebView.ah$a(i | 128);
        if (this.toString) {
            this.HaptikWebView.ah$a(size | 128);
            Random random = this.ah$b;
            byte[] bArr = this.ag$a;
            runAnimators.toString(bArr);
            random.nextBytes(bArr);
            this.HaptikWebView.toString(this.ag$a);
            if (size > 0) {
                long onPostMessage = this.HaptikWebView.onPostMessage();
                this.HaptikWebView.toString(byteString);
                getMinSmallestWidth getminsmallestwidth = this.HaptikWebView;
                getMinSmallestWidth.toString tostring = this.ah$a;
                runAnimators.toString(tostring);
                getminsmallestwidth.valueOf(tostring);
                this.ah$a.ag$a(onPostMessage);
                getFinishPrimaryWithSecondary.ag$a.values(this.ah$a, this.ag$a);
                this.ah$a.close();
            }
        } else {
            this.HaptikWebView.ah$a(size);
            this.HaptikWebView.toString(byteString);
        }
        this.HaptikSDK$a.flush();
    }

    public final void toString(int i, ByteString byteString) throws IOException {
        runAnimators.ag$a(byteString, "data");
        if (this.HaptikSDK$e) {
            throw new IOException("closed");
        }
        this.valueOf.toString(byteString);
        int i2 = i | 128;
        if (this.HaptikSDK$b && byteString.size() >= this.invoke) {
            getSecondaryActivityIntentAction getsecondaryactivityintentaction = this.values;
            if (getsecondaryactivityintentaction == null) {
                getsecondaryactivityintentaction = new getSecondaryActivityIntentAction(this.HaptikSDK$c);
                this.values = getsecondaryactivityintentaction;
            }
            getsecondaryactivityintentaction.ag$a(this.valueOf);
            i2 |= 64;
        }
        long onPostMessage = this.valueOf.onPostMessage();
        this.HaptikWebView.ah$a(i2);
        int i3 = this.toString ? 128 : 0;
        if (onPostMessage <= 125) {
            this.HaptikWebView.ah$a(((int) onPostMessage) | i3);
        } else if (onPostMessage <= 65535) {
            this.HaptikWebView.ah$a(i3 | 126);
            this.HaptikWebView.HaptikSDK$b((int) onPostMessage);
        } else {
            this.HaptikWebView.ah$a(i3 | 127);
            this.HaptikWebView.HaptikWebView(onPostMessage);
        }
        if (this.toString) {
            Random random = this.ah$b;
            byte[] bArr = this.ag$a;
            runAnimators.toString(bArr);
            random.nextBytes(bArr);
            this.HaptikWebView.toString(this.ag$a);
            if (onPostMessage > 0) {
                getMinSmallestWidth getminsmallestwidth = this.valueOf;
                getMinSmallestWidth.toString tostring = this.ah$a;
                runAnimators.toString(tostring);
                getminsmallestwidth.valueOf(tostring);
                this.ah$a.ag$a(0L);
                getFinishPrimaryWithSecondary.ag$a.values(this.ah$a, this.ag$a);
                this.ah$a.close();
            }
        }
        this.HaptikWebView.write(this.valueOf, onPostMessage);
        this.HaptikSDK$a.invoke();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        getSecondaryActivityIntentAction getsecondaryactivityintentaction = this.values;
        if (getsecondaryactivityintentaction != null) {
            getsecondaryactivityintentaction.close();
        }
    }
}
