package o;

import android.graphics.Shader;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o.setFragmentResult;
/* loaded from: classes4.dex */
public class hasSimpleTarget {
    public static setFragmentResult.valueOf ah$a(String str) {
        if ("contain".equals(str)) {
            return setFragmentResult.valueOf.values;
        }
        if ("cover".equals(str)) {
            return setFragmentResult.valueOf.toString;
        }
        if ("stretch".equals(str)) {
            return setFragmentResult.valueOf.HaptikSDK$a;
        }
        if (TtmlNode.CENTER.equals(str)) {
            return setFragmentResult.valueOf.ah$a;
        }
        if ("repeat".equals(str)) {
            return canHandle.HaptikSDK$d;
        }
        if (str == null) {
            return valueOf();
        }
        throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
    }

    public static Shader.TileMode ag$a(String str) {
        if ("contain".equals(str) || "cover".equals(str) || "stretch".equals(str) || TtmlNode.CENTER.equals(str)) {
            return Shader.TileMode.CLAMP;
        }
        if ("repeat".equals(str)) {
            return Shader.TileMode.REPEAT;
        }
        if (str != null) {
            throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
        }
        return Shader.TileMode.CLAMP;
    }

    public static setFragmentResult.valueOf valueOf() {
        return setFragmentResult.valueOf.toString;
    }
}
