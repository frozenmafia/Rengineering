package kotlin.text;

import java.util.Map;
import o.getTargetTypes;
import o.runAnimators;
import o.setIdentityTransforms;
/* loaded from: classes7.dex */
public enum CharDirectionality {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);
    
    private final int value;
    public static final valueOf Companion = new valueOf(null);
    private static final setIdentityTransforms<Map<Integer, CharDirectionality>> directionalityMap$delegate = runAnimators.ag$a(CharDirectionality$Companion$directionalityMap$2.INSTANCE, "initializer");

    CharDirectionality(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* loaded from: classes7.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }
}
