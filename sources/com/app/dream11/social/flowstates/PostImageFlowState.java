package com.app.dream11.social.flowstates;

import android.graphics.Color;
import android.text.TextUtils;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.moveToFirst;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PostImageFlowState extends FlowState {
    private static char ag$a = 63211;
    private static char ah$a = 43712;
    private static int invoke = 1;
    private static char toString = 17605;
    private static int valueOf = 0;
    private static char values = 3344;
    private final String imageUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostImageFlowState(String str, String str2) {
        super(FlowStates.POST_IMAGE_TO_FEED, null, 2, null);
        runAnimators.ag$a(str, "imageUrl");
        runAnimators.ag$a(str2, valueOf(new char[]{37280, 30663, 31117, 37188, 46752, 54995}, Color.rgb(0, 0, 0) + 16777222).intern());
        putExtra("imageUrl", str);
        putExtra(valueOf(new char[]{37280, 30663, 31117, 37188, 46752, 54995}, 5 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), str2);
        this.imageUrl = getString("imageUrl");
    }

    public final String getImageUrl() {
        String str;
        int i = valueOf + 59;
        invoke = i % 128;
        Object[] objArr = null;
        if ((i % 2 == 0 ? '.' : 'S') != 'S') {
            str = this.imageUrl;
            int length = objArr.length;
        } else {
            try {
                str = this.imageUrl;
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = invoke + 23;
        valueOf = i2 % 128;
        if (!(i2 % 2 != 0)) {
            return str;
        }
        super.hashCode();
        return str;
    }

    private static String valueOf(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + toString)) ^ ((cArr3[0] >>> 5) + values)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + ah$a)) ^ ((cArr3[1] >>> 5) + ag$a)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
