package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import androidx.databinding.library.baseAdapters.BR;
import com.google.android.exoplayer2.util.UriUtil;
/* loaded from: classes5.dex */
public final class RangedUri {
    private int hashCode;
    public final long length;
    private final String referenceUri;
    public final long start;

    public RangedUri(String str, long j, long j2) {
        this.referenceUri = str == null ? "" : str;
        this.start = j;
        this.length = j2;
    }

    public Uri resolveUri(String str) {
        return UriUtil.resolveToUri(str, this.referenceUri);
    }

    public String resolveUriString(String str) {
        return UriUtil.resolve(str, this.referenceUri);
    }

    public RangedUri attemptMerge(RangedUri rangedUri, String str) {
        String resolveUriString = resolveUriString(str);
        if (rangedUri == null || !resolveUriString.equals(rangedUri.resolveUriString(str))) {
            return null;
        }
        long j = this.length;
        int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        if (i != 0) {
            long j2 = this.start;
            if (j2 + j == rangedUri.start) {
                long j3 = rangedUri.length;
                return new RangedUri(resolveUriString, j2, j3 == -1 ? -1L : j + j3);
            }
        }
        long j4 = rangedUri.length;
        if (j4 != -1) {
            long j5 = rangedUri.start;
            if (j5 + j4 == this.start) {
                return new RangedUri(resolveUriString, j5, i == 0 ? -1L : j4 + j);
            }
            return null;
        }
        return null;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            int i = (int) this.start;
            int i2 = (int) this.length;
            this.hashCode = ((((i + BR.userTeamVM) * 31) + i2) * 31) + this.referenceUri.hashCode();
        }
        return this.hashCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RangedUri rangedUri = (RangedUri) obj;
        return this.start == rangedUri.start && this.length == rangedUri.length && this.referenceUri.equals(rangedUri.referenceUri);
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.referenceUri + ", start=" + this.start + ", length=" + this.length + ")";
    }
}
