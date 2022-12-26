package kotlin.text;

import o.ViewUtilsApi22;
import o.getTargetTypes;
/* loaded from: classes7.dex */
public enum RegexOption implements ViewUtilsApi22 {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    CANON_EQ(128, 0, 2, null);
    
    private final int mask;
    private final int value;

    RegexOption(int i, int i2) {
        this.value = i;
        this.mask = i2;
    }

    /* synthetic */ RegexOption(int i, int i2, int i3, getTargetTypes gettargettypes) {
        this(i, (i3 & 2) != 0 ? i : i2);
    }

    @Override // o.ViewUtilsApi22
    public int getMask() {
        return this.mask;
    }

    @Override // o.ViewUtilsApi22
    public int getValue() {
        return this.value;
    }
}
