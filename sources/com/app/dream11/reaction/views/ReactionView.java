package com.app.dream11.reaction.views;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AlarmManagerCompat;
import o.createPopup;
import o.runAnimators;
import o.setAlarmClock;
/* loaded from: classes3.dex */
public class ReactionView extends AppCompatImageView {
    public Map<Integer, View> _$_findViewCache;
    private final Point location;
    private final setAlarmClock reaction;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            if (findViewById == null) {
                return null;
            }
            map.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    public final setAlarmClock getReaction() {
        return this.reaction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionView(Context context, setAlarmClock setalarmclock) {
        super(context);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(setalarmclock, "reaction");
        this._$_findViewCache = new LinkedHashMap();
        this.reaction = setalarmclock;
        this.location = new Point();
        setScaleType(ImageView.ScaleType.FIT_XY);
        Drawable alarmManagerCompat = AlarmManagerCompat.toString(setalarmclock, context);
        createPopup.toString(this, setalarmclock.HaptikSDK$a(), alarmManagerCompat, alarmManagerCompat, false, "", "");
    }

    public final Point getLocation() {
        if (this.location.x == 0 || this.location.y == 0) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.location.set(iArr[0], iArr[1]);
        }
        return this.location;
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getLocation().set(0, 0);
    }
}
