package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import o.AnimatorUtils;
/* loaded from: classes5.dex */
public class setMinimumHorizontalAngle implements handleException {
    public Executor ag$a;
    public jmjou ah$a;

    public void ag$a(String str, Map<String, String> map, String str2, getMinimumHorizontalAngle getminimumhorizontalangle, boolean z) {
        new AnimatorUtils.AnimatorPauseListenerCompat(this, str, true, z, map, str2, getminimumhorizontalangle).executeOnExecutor(this.ag$a, new Void[0]);
    }

    @Override // o.handleException
    public void init(jmjou jmjouVar, jmjou.chmha chmhaVar) {
        this.ah$a = jmjouVar;
        this.ag$a = ((setBottomRight) jmjouVar.values(setBottomRight.class)).valueOf;
    }

    @Override // o.handleException
    public boolean isCachingAllowed() {
        return true;
    }

    public final getMinimumVerticalAngle valueOf(String str, boolean z, boolean z2, boolean z3, Map<String, String> map, String str2, jmjou jmjouVar) {
        if (map == null) {
            jmjouVar.getClass();
            map = new HashMap<>();
        }
        jmjou.chmha chmhaVar = (jmjou.chmha) jmjouVar.values(jmjou.chmha.class);
        chmhaVar.put("url", str);
        chmhaVar.put("isPost", Boolean.valueOf(z));
        chmhaVar.put("useCache", Boolean.valueOf(z2));
        chmhaVar.put("defaultCache", Boolean.valueOf(z3));
        chmhaVar.put("headers", map);
        chmhaVar.put(TtmlNode.TAG_BODY, str2);
        return (getMinimumVerticalAngle) jmjouVar.toString(getMinimumVerticalAngle.class, chmhaVar);
    }
}
