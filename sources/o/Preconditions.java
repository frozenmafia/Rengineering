package o;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.collect.ImmutableSet;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
final class Preconditions {
    public final int ag$a;
    public final int ah$a;
    public final int toString;
    private static final Pattern HaptikSDK$b = Pattern.compile("\\s+");
    private static final ImmutableSet<String> HaptikSDK$c = ImmutableSet.of("auto", "none");
    private static final ImmutableSet<String> values = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final ImmutableSet<String> valueOf = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
    private static final ImmutableSet<String> ah$b = ImmutableSet.of(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    private Preconditions(int i, int i2, int i3) {
        this.ah$a = i;
        this.toString = i2;
        this.ag$a = i3;
    }

    public static Preconditions toString(String str) {
        if (str == null) {
            return null;
        }
        String valueOf2 = postponeAndUpdateViewHolders.valueOf(str.trim());
        if (valueOf2.isEmpty()) {
            return null;
        }
        return ag$a(ImmutableSet.copyOf(TextUtils.split(valueOf2, HaptikSDK$b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r9.equals("auto") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static o.Preconditions ag$a(com.google.common.collect.ImmutableSet<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Preconditions.ag$a(com.google.common.collect.ImmutableSet):o.Preconditions");
    }
}
