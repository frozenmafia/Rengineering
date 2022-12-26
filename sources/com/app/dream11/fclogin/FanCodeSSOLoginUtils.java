package com.app.dream11.fclogin;

import o.isSideAnchor;
import o.runAnimators;
import o.setIdentityTransforms;
/* loaded from: classes.dex */
public final class FanCodeSSOLoginUtils {
    public static final FanCodeSSOLoginUtils$ag$a ag$a = new FanCodeSSOLoginUtils$ag$a(null);
    private static final setIdentityTransforms<isSideAnchor> values = runAnimators.ag$a(FanCodeSSOLoginUtils$Companion$homeController$2.INSTANCE, "initializer");

    /* loaded from: classes3.dex */
    public enum FCUserType {
        EXISTING("Existing"),
        NEW_PRE_OB("New_Pre_OB");
        
        private final String userType;

        FCUserType(String str) {
            this.userType = str;
        }

        public final String getUserType() {
            return this.userType;
        }
    }
}
