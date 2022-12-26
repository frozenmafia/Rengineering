package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
public class bpt extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private boolean a;

    public bpt(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bps a() {
        return new bps();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bpt b() {
        return new bpt("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bpt c() {
        return new bpt("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bpt d() {
        return new bpt("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bpt e() {
        return new bpt("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bpt f() {
        return new bpt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bpt g() {
        return new bpt("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bpt h() {
        return new bpt("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bpt i() {
        return new bpt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        this.a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        return this.a;
    }

    public bpt(String str) {
        super(str);
    }
}
