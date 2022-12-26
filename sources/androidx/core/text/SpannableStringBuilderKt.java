package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class SpannableStringBuilderKt {
    public static final SpannedString buildSpannedString(Styleable.ChangeBounds<? super SpannableStringBuilder, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(changeBounds, "builderAction");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        changeBounds.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder spannableStringBuilder, Object[] objArr, Styleable.ChangeBounds<? super SpannableStringBuilder, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(spannableStringBuilder, "<this>");
        runAnimators.ag$a(objArr, "spans");
        runAnimators.ag$a(changeBounds, "builderAction");
        int length = spannableStringBuilder.length();
        changeBounds.invoke(spannableStringBuilder);
        int length2 = objArr.length;
        int i = 0;
        while (i < length2) {
            Object obj = objArr[i];
            i++;
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder spannableStringBuilder, Object obj, Styleable.ChangeBounds<? super SpannableStringBuilder, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(spannableStringBuilder, "<this>");
        runAnimators.ag$a(obj, TtmlNode.TAG_SPAN);
        runAnimators.ag$a(changeBounds, "builderAction");
        int length = spannableStringBuilder.length();
        changeBounds.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder bold(SpannableStringBuilder spannableStringBuilder, Styleable.ChangeBounds<? super SpannableStringBuilder, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(spannableStringBuilder, "<this>");
        runAnimators.ag$a(changeBounds, "builderAction");
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        changeBounds.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder italic(SpannableStringBuilder spannableStringBuilder, Styleable.ChangeBounds<? super SpannableStringBuilder, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(spannableStringBuilder, "<this>");
        runAnimators.ag$a(changeBounds, "builderAction");
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        changeBounds.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder underline(SpannableStringBuilder spannableStringBuilder, Styleable.ChangeBounds<? super SpannableStringBuilder, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(spannableStringBuilder, "<this>");
        runAnimators.ag$a(changeBounds, "builderAction");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        changeBounds.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder color(SpannableStringBuilder spannableStringBuilder, int i, Styleable.ChangeBounds<? super SpannableStringBuilder, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(spannableStringBuilder, "<this>");
        runAnimators.ag$a(changeBounds, "builderAction");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length = spannableStringBuilder.length();
        changeBounds.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder backgroundColor(SpannableStringBuilder spannableStringBuilder, int i, Styleable.ChangeBounds<? super SpannableStringBuilder, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(spannableStringBuilder, "<this>");
        runAnimators.ag$a(changeBounds, "builderAction");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i);
        int length = spannableStringBuilder.length();
        changeBounds.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder strikeThrough(SpannableStringBuilder spannableStringBuilder, Styleable.ChangeBounds<? super SpannableStringBuilder, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(spannableStringBuilder, "<this>");
        runAnimators.ag$a(changeBounds, "builderAction");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        changeBounds.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder scale(SpannableStringBuilder spannableStringBuilder, float f, Styleable.ChangeBounds<? super SpannableStringBuilder, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(spannableStringBuilder, "<this>");
        runAnimators.ag$a(changeBounds, "builderAction");
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f);
        int length = spannableStringBuilder.length();
        changeBounds.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder superscript(SpannableStringBuilder spannableStringBuilder, Styleable.ChangeBounds<? super SpannableStringBuilder, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(spannableStringBuilder, "<this>");
        runAnimators.ag$a(changeBounds, "builderAction");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        changeBounds.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder subscript(SpannableStringBuilder spannableStringBuilder, Styleable.ChangeBounds<? super SpannableStringBuilder, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(spannableStringBuilder, "<this>");
        runAnimators.ag$a(changeBounds, "builderAction");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        changeBounds.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
