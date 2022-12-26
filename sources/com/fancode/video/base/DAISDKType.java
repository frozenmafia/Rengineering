package com.fancode.video.base;

import android.text.TextUtils;
import o.getTargetTypes;
/* loaded from: classes.dex */
public enum DAISDKType {
    IMA_DAI_CORE,
    IMA_DAI_EXTENSION,
    PAL_SDK,
    NO_SDK;
    
    public static final valueOf Companion = new valueOf(null);

    /* loaded from: classes4.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }

        public final DAISDKType valueOf(String str) {
            DAISDKType dAISDKType = DAISDKType.NO_SDK;
            if (TextUtils.isEmpty(str) || str == null) {
                return dAISDKType;
            }
            switch (str.hashCode()) {
                case -1986023268:
                    return !str.equals("NO_SDK") ? dAISDKType : DAISDKType.NO_SDK;
                case -1901202700:
                    return !str.equals("IMA_DAI_CORE") ? dAISDKType : DAISDKType.IMA_DAI_CORE;
                case -80155050:
                    return !str.equals("PAL_SDK") ? dAISDKType : DAISDKType.PAL_SDK;
                case 1749659114:
                    return !str.equals("IMA_DAI_EXTENSION") ? dAISDKType : DAISDKType.IMA_DAI_EXTENSION;
                default:
                    return dAISDKType;
            }
        }
    }
}
