package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import o.PreferenceGroup;
import o.areContentsTheSame;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class areContentsTheSame$ah$a extends areContentsTheSame.invoke {
    private final areContentsTheSame$ag$a ah$a;

    public areContentsTheSame$ah$a(areContentsTheSame$ag$a arecontentsthesame_ag_a) {
        this.ah$a = arecontentsthesame_ag_a;
    }

    @Override // o.areContentsTheSame.invoke
    public void ag$a(Matrix matrix, PreferenceGroup.OnExpandButtonClickListener onExpandButtonClickListener, int i, Canvas canvas) {
        float values;
        float HaptikSDK$c;
        float valueOf;
        float HaptikSDK$b;
        float ag$a;
        float ah$a;
        values = this.ah$a.values();
        HaptikSDK$c = this.ah$a.HaptikSDK$c();
        valueOf = this.ah$a.valueOf();
        HaptikSDK$b = this.ah$a.HaptikSDK$b();
        ag$a = this.ah$a.ag$a();
        ah$a = this.ah$a.ah$a();
        onExpandButtonClickListener.toString(canvas, matrix, new RectF(valueOf, HaptikSDK$b, ag$a, ah$a), i, values, HaptikSDK$c);
    }
}
