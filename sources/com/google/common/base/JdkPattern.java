package com.google.common.base;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.findPositionOffset;
import o.hasAnyUpdateTypes;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
public final class JdkPattern extends findPositionOffset implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern pattern;

    public JdkPattern(Pattern pattern) {
        this.pattern = (Pattern) markViewHoldersUpdated.toString(pattern);
    }

    @Override // o.findPositionOffset
    public hasAnyUpdateTypes matcher(CharSequence charSequence) {
        final Matcher matcher = this.pattern.matcher(charSequence);
        return new hasAnyUpdateTypes(matcher) { // from class: com.google.common.base.JdkPattern$ag$a
            final Matcher ag$a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.ag$a = (Matcher) markViewHoldersUpdated.toString(matcher);
            }

            @Override // o.hasAnyUpdateTypes
            public boolean ah$a() {
                return this.ag$a.find();
            }
        };
    }

    @Override // o.findPositionOffset
    public String pattern() {
        return this.pattern.pattern();
    }

    @Override // o.findPositionOffset
    public int flags() {
        return this.pattern.flags();
    }

    @Override // o.findPositionOffset
    public String toString() {
        return this.pattern.toString();
    }
}
