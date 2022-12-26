package com.facebook.imagepipeline.common;

import java.util.regex.Pattern;
import o.Fragment;
import o.getNextAnim;
/* loaded from: classes4.dex */
public class BytesRange {
    public static final int TO_END_OF_CONTENT = Integer.MAX_VALUE;
    private static Pattern sHeaderParsingRegEx;
    public final int from;
    public final int to;

    public BytesRange(int i, int i2) {
        this.from = i;
        this.to = i2;
    }

    public String toHttpRangeHeaderValue() {
        return String.format(null, "bytes=%s-%s", valueOrEmpty(this.from), valueOrEmpty(this.to));
    }

    public boolean contains(BytesRange bytesRange) {
        return bytesRange != null && this.from <= bytesRange.from && this.to >= bytesRange.to;
    }

    public String toString() {
        return String.format(null, "%s-%s", valueOrEmpty(this.from), valueOrEmpty(this.to));
    }

    private static String valueOrEmpty(int i) {
        return i == Integer.MAX_VALUE ? "" : Integer.toString(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BytesRange) {
            BytesRange bytesRange = (BytesRange) obj;
            return this.from == bytesRange.from && this.to == bytesRange.to;
        }
        return false;
    }

    public int hashCode() {
        return getNextAnim.ah$a(this.from, this.to);
    }

    public static BytesRange from(int i) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i >= 0));
        return new BytesRange(i, Integer.MAX_VALUE);
    }

    public static BytesRange toMax(int i) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i > 0));
        return new BytesRange(0, i);
    }

    public static BytesRange fromContentRangeHeader(String str) throws IllegalArgumentException {
        if (str == null) {
            return null;
        }
        if (sHeaderParsingRegEx == null) {
            sHeaderParsingRegEx = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = sHeaderParsingRegEx.split(str);
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(split.length == 4));
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(split[0].equals("bytes")));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(parseInt2 > parseInt));
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(parseInt3 > parseInt2));
            if (parseInt2 < parseInt3 - 1) {
                return new BytesRange(parseInt, parseInt2);
            }
            return new BytesRange(parseInt, Integer.MAX_VALUE);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", str), e);
        }
    }
}
