package com.app.dream11.chat.chatflowstates;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import o.getTargetTypes;
import o.runAnimators;
import org.apache.http.cookie.ClientCookie;
/* loaded from: classes.dex */
public final class CropShareImageFlowState extends FlowState {
    public static final Companion Companion = new Companion(null);
    public static final String IMAGE_PATH = "image_path";
    public static final String MESSAGE = "message";
    public static final String SCREEN_TITLE = "screen_title";

    public CropShareImageFlowState() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ CropShareImageFlowState(String str, String str2, String str3, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropShareImageFlowState(String str, String str2, String str3) {
        super(FlowStates.CHAT_SHARE_CROP_IMAGE, null, 2, null);
        runAnimators.ag$a(str, ClientCookie.PATH_ATTR);
        runAnimators.ag$a(str2, "message");
        putExtra("image_path", str);
        putExtra("message", str2);
        putExtra(SCREEN_TITLE, str3);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }
    }

    public final String getScreenTitle() {
        Serializable extra = getExtra(SCREEN_TITLE);
        if (extra instanceof String) {
            return (String) extra;
        }
        return null;
    }

    public final String getImagePath() {
        Serializable extra = getExtra("image_path");
        if (extra instanceof String) {
            return (String) extra;
        }
        return null;
    }

    public final String getMessage() {
        Serializable extra = getExtra("message");
        if (extra instanceof String) {
            return (String) extra;
        }
        return null;
    }
}
