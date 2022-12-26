package com.appsamurai.storyly.exoplayer2.extractor.extractor.flv;

import com.appsamurai.storyly.exoplayer2.common.ParserException;
import o.C$default$setContentDescription;
import o.dirTypeForward;
/* loaded from: classes3.dex */
public abstract class TagPayloadReader {
    protected final dirTypeForward ah$a;

    protected abstract boolean ah$a(C$default$setContentDescription c$default$setContentDescription) throws ParserException;

    protected abstract boolean valueOf(C$default$setContentDescription c$default$setContentDescription, long j) throws ParserException;

    /* loaded from: classes3.dex */
    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(dirTypeForward dirtypeforward) {
        this.ah$a = dirtypeforward;
    }

    public final boolean ah$a(C$default$setContentDescription c$default$setContentDescription, long j) throws ParserException {
        return ah$a(c$default$setContentDescription) && valueOf(c$default$setContentDescription, j);
    }
}
