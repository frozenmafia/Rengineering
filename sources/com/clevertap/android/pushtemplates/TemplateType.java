package com.clevertap.android.pushtemplates;

import o.getTargetTypes;
/* loaded from: classes3.dex */
public enum TemplateType {
    BASIC("pt_basic"),
    AUTO_CAROUSEL("pt_carousel"),
    MANUAL_CAROUSEL("pt_manual_carousel"),
    RATING("pt_rating"),
    FIVE_ICONS("pt_five_icons"),
    PRODUCT_DISPLAY("pt_product_display"),
    ZERO_BEZEL("pt_zero_bezel"),
    TIMER("pt_timer"),
    INPUT_BOX("pt_input"),
    VIDEO("pt_video"),
    CANCEL("pt_cancel");
    
    public static final values Companion = new values(null);
    private final String templateType;

    public static final TemplateType fromString(String str) {
        return Companion.ah$a(str);
    }

    TemplateType(String str) {
        this.templateType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.templateType;
    }

    /* loaded from: classes3.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        public final TemplateType ah$a(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1726683778:
                        if (str.equals("pt_manual_carousel")) {
                            return TemplateType.MANUAL_CAROUSEL;
                        }
                        break;
                    case -1531478936:
                        if (str.equals("pt_five_icons")) {
                            return TemplateType.FIVE_ICONS;
                        }
                        break;
                    case -629497790:
                        if (str.equals("pt_zero_bezel")) {
                            return TemplateType.ZERO_BEZEL;
                        }
                        break;
                    case -622393029:
                        if (str.equals("pt_carousel")) {
                            return TemplateType.AUTO_CAROUSEL;
                        }
                        break;
                    case 310751795:
                        if (str.equals("pt_basic")) {
                            return TemplateType.BASIC;
                        }
                        break;
                    case 317601231:
                        if (str.equals("pt_input")) {
                            return TemplateType.INPUT_BOX;
                        }
                        break;
                    case 327607626:
                        if (str.equals("pt_timer")) {
                            return TemplateType.TIMER;
                        }
                        break;
                    case 329446016:
                        if (str.equals("pt_video")) {
                            return TemplateType.VIDEO;
                        }
                        break;
                    case 923207991:
                        if (str.equals("pt_product_display")) {
                            return TemplateType.PRODUCT_DISPLAY;
                        }
                        break;
                    case 1071845653:
                        if (str.equals("pt_cancel")) {
                            return TemplateType.CANCEL;
                        }
                        break;
                    case 1501467704:
                        if (str.equals("pt_rating")) {
                            return TemplateType.RATING;
                        }
                        break;
                }
            }
            return null;
        }
    }
}
