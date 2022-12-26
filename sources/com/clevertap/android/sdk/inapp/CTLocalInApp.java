package com.clevertap.android.sdk.inapp;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class CTLocalInApp {
    public static final valueOf valueOf = new valueOf(null);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ALERT uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes6.dex */
    public static final class InAppType {
        private static final /* synthetic */ InAppType[] $VALUES;
        public static final InAppType ALERT;
        public static final InAppType HALF_INTERSTITIAL;
        private final String type;

        private static final /* synthetic */ InAppType[] $values() {
            return new InAppType[]{ALERT, HALF_INTERSTITIAL};
        }

        public static InAppType valueOf(String str) {
            return (InAppType) Enum.valueOf(InAppType.class, str);
        }

        public static InAppType[] values() {
            return (InAppType[]) $VALUES.clone();
        }

        private InAppType(String str, int i, String str2) {
            this.type = str2;
        }

        public final String getType() {
            return this.type;
        }

        static {
            String cTInAppType = CTInAppType.CTInAppTypeAlert.toString();
            runAnimators.ah$a(cTInAppType, "CTInAppTypeAlert.toString()");
            ALERT = new InAppType("ALERT", 0, cTInAppType);
            String cTInAppType2 = CTInAppType.CTInAppTypeHalfInterstitial.toString();
            runAnimators.ah$a(cTInAppType2, "CTInAppTypeHalfInterstitial.toString()");
            HALF_INTERSTITIAL = new InAppType("HALF_INTERSTITIAL", 1, cTInAppType2);
            $VALUES = $values();
        }
    }

    /* loaded from: classes6.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }
}
