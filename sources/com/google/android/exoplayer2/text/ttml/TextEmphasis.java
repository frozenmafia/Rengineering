package com.google.android.exoplayer2.text.ttml;

import android.text.TextUtils;
import com.google.common.collect.ImmutableSet;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;
import o.postponeAndUpdateViewHolders;
/* loaded from: classes5.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final ImmutableSet<String> SINGLE_STYLE_VALUES = ImmutableSet.of("auto", "none");
    private static final ImmutableSet<String> MARK_SHAPE_VALUES = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final ImmutableSet<String> MARK_FILL_VALUES = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
    private static final ImmutableSet<String> POSITION_VALUES = ImmutableSet.of(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Position {
    }

    private TextEmphasis(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
    }

    public static TextEmphasis parse(String str) {
        if (str == null) {
            return null;
        }
        String valueOf = postponeAndUpdateViewHolders.valueOf(str.trim());
        if (valueOf.isEmpty()) {
            return null;
        }
        return parseWords(ImmutableSet.copyOf(TextUtils.split(valueOf, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r9.equals("auto") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.text.ttml.TextEmphasis parseWords(com.google.common.collect.ImmutableSet<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TextEmphasis.parseWords(com.google.common.collect.ImmutableSet):com.google.android.exoplayer2.text.ttml.TextEmphasis");
    }
}
