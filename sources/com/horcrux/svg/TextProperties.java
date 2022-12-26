package com.horcrux.svg;

import com.facebook.react.uimanager.ViewProps;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
class TextProperties {

    /* loaded from: classes7.dex */
    enum Direction {
        ltr,
        rtl
    }

    /* loaded from: classes5.dex */
    public enum FontStyle {
        normal,
        italic,
        oblique
    }

    /* loaded from: classes5.dex */
    public enum FontVariantLigatures {
        normal,
        none
    }

    /* loaded from: classes5.dex */
    public enum TextAnchor {
        start,
        middle,
        end
    }

    /* loaded from: classes5.dex */
    public enum TextLengthAdjust {
        spacing,
        spacingAndGlyphs
    }

    /* loaded from: classes5.dex */
    public enum TextPathMethod {
        align,
        stretch
    }

    /* loaded from: classes5.dex */
    public enum TextPathMidLine {
        sharp,
        smooth
    }

    /* loaded from: classes5.dex */
    public enum TextPathSide {
        left,
        right
    }

    /* loaded from: classes5.dex */
    public enum TextPathSpacing {
        auto,
        exact
    }

    TextProperties() {
    }

    /* loaded from: classes5.dex */
    public enum AlignmentBaseline {
        baseline("baseline"),
        textBottom("text-bottom"),
        alphabetic("alphabetic"),
        ideographic("ideographic"),
        middle("middle"),
        central("central"),
        mathematical("mathematical"),
        textTop("text-top"),
        bottom(ViewProps.BOTTOM),
        center(TtmlNode.CENTER),
        top(ViewProps.TOP),
        textBeforeEdge("text-before-edge"),
        textAfterEdge("text-after-edge"),
        beforeEdge("before-edge"),
        afterEdge("after-edge"),
        hanging("hanging");
        
        private static final Map<String, AlignmentBaseline> alignmentToEnum = new HashMap();
        private final String alignment;

        static {
            AlignmentBaseline[] values;
            for (AlignmentBaseline alignmentBaseline : values()) {
                alignmentToEnum.put(alignmentBaseline.alignment, alignmentBaseline);
            }
        }

        AlignmentBaseline(String str) {
            this.alignment = str;
        }

        public static AlignmentBaseline getEnum(String str) {
            Map<String, AlignmentBaseline> map = alignmentToEnum;
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException("Unknown String Value: " + str);
            }
            return map.get(str);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.alignment;
        }
    }

    /* loaded from: classes5.dex */
    public enum FontWeight {
        Normal("normal"),
        Bold(TtmlNode.BOLD),
        w100("100"),
        w200("200"),
        w300("300"),
        w400("400"),
        w500("500"),
        w600("600"),
        w700("700"),
        w800("800"),
        w900("900"),
        Bolder("bolder"),
        Lighter("lighter");
        
        private static final Map<String, FontWeight> weightToEnum = new HashMap();
        private final String weight;

        static {
            FontWeight[] values;
            for (FontWeight fontWeight : values()) {
                weightToEnum.put(fontWeight.weight, fontWeight);
            }
        }

        FontWeight(String str) {
            this.weight = str;
        }

        public static boolean hasEnum(String str) {
            return weightToEnum.containsKey(str);
        }

        public static FontWeight get(String str) {
            return weightToEnum.get(str);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.weight;
        }
    }

    /* loaded from: classes5.dex */
    public enum TextDecoration {
        None("none"),
        Underline(TtmlNode.UNDERLINE),
        Overline("overline"),
        LineThrough("line-through"),
        Blink("blink");
        
        private static final Map<String, TextDecoration> decorationToEnum = new HashMap();
        private final String decoration;

        static {
            TextDecoration[] values;
            for (TextDecoration textDecoration : values()) {
                decorationToEnum.put(textDecoration.decoration, textDecoration);
            }
        }

        TextDecoration(String str) {
            this.decoration = str;
        }

        public static TextDecoration getEnum(String str) {
            Map<String, TextDecoration> map = decorationToEnum;
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException("Unknown String Value: " + str);
            }
            return map.get(str);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.decoration;
        }
    }
}
