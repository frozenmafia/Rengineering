package com.appsamurai.storyly.exoplayer2.core.source;

import android.net.Uri;
import com.appsamurai.storyly.exoplayer2.common.ParserException;
/* loaded from: classes3.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final Uri uri;

    public UnrecognizedInputFormatException(String str, Uri uri) {
        super(str, null, false, 1);
        this.uri = uri;
    }
}
