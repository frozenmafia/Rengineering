package o;

import android.content.res.TypedArray;
import com.facebook.react.uimanager.ViewProps;
/* loaded from: classes2.dex */
public final class getAnimatedVisibility {
    private Integer ah$a;
    private final String values = ViewProps.VISIBLE;
    private final String toString = "click_visible";
    private String ag$a = "";

    public final void ag$a(String str) {
        this.ag$a = str;
    }

    public final String valueOf() {
        return this.ag$a;
    }

    public final void values(Integer num) {
        this.ah$a = num;
    }

    public final void ah$a() {
        String str = this.ag$a;
        if (str == null) {
            str = "";
        }
        String str2 = this.values;
        Object obj = this.ah$a;
        String str3 = obj != null ? obj : "";
        isRequestPinShortcutSupported.valueOf(str + "_" + str2 + "_" + str3, System.currentTimeMillis());
    }

    public final void toString(TypedArray typedArray) {
        runAnimators.ag$a(typedArray, "typedArray");
        try {
            String string = typedArray.getString(1);
            if (string == null) {
                string = "";
            }
            this.ag$a = string;
            int i = typedArray.getInt(0, -1);
            if (i != -1) {
                this.ah$a = Integer.valueOf(i);
            }
        } finally {
            typedArray.recycle();
        }
    }
}
