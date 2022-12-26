package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.webvtt.WebvttCueParser;
import java.util.Comparator;
/* loaded from: classes5.dex */
public final /* synthetic */ class WebvttCueParser$Element$$ExternalSyntheticLambda0 implements Comparator {
    public static final /* synthetic */ WebvttCueParser$Element$$ExternalSyntheticLambda0 INSTANCE = new WebvttCueParser$Element$$ExternalSyntheticLambda0();

    private /* synthetic */ WebvttCueParser$Element$$ExternalSyntheticLambda0() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        compare = Integer.compare(((WebvttCueParser.Element) obj).startTag.position, ((WebvttCueParser.Element) obj2).startTag.position);
        return compare;
    }
}
