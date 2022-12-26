package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o.TransitionPropagation;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SpannableStringKt {
    public static final Spannable toSpannable(CharSequence charSequence) {
        runAnimators.ag$a(charSequence, "<this>");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        runAnimators.ah$a(valueOf, "valueOf(this)");
        return valueOf;
    }

    public static final void clearSpans(Spannable spannable) {
        runAnimators.ag$a(spannable, "<this>");
        Spannable spannable2 = spannable;
        Object[] spans = spannable2.getSpans(0, spannable2.length(), Object.class);
        runAnimators.ah$a(spans, "getSpans(start, end, T::class.java)");
        for (Object obj : spans) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(Spannable spannable, int i, int i2, Object obj) {
        runAnimators.ag$a(spannable, "<this>");
        runAnimators.ag$a(obj, TtmlNode.TAG_SPAN);
        spannable.setSpan(obj, i, i2, 17);
    }

    public static final void set(Spannable spannable, TransitionPropagation transitionPropagation, Object obj) {
        runAnimators.ag$a(spannable, "<this>");
        runAnimators.ag$a(transitionPropagation, SessionDescription.ATTR_RANGE);
        runAnimators.ag$a(obj, TtmlNode.TAG_SPAN);
        spannable.setSpan(obj, transitionPropagation.getStart().intValue(), transitionPropagation.getEndInclusive().intValue(), 17);
    }
}
