package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.app.dream11.core.service.graphql.api.fragment.MatchData;
import o.createPopup;
/* loaded from: classes3.dex */
public class setDebugName {
    public static void toString(final ImageView imageView, MatchData.Squad squad, Drawable drawable, Drawable drawable2, final Boolean bool, final String str, final String str2, final String str3) {
        createPopup.ag$a(imageView, (squad == null || !loadFont.ag$a(squad.getFlag())) ? "" : squad.getFlag().get(0).getSrc(), drawable, drawable2, new createPopup.values() { // from class: o.setDebugName.2
            @Override // o.createPopup.values
            public void valueOf() {
            }

            @Override // o.createPopup.values
            public void ah$a() {
                if (imageView.getContentDescription() == null || imageView.getContentDescription().toString().isEmpty() || !bool.booleanValue()) {
                    return;
                }
                new getActionProvider().valueOf(String.valueOf(imageView.getContentDescription()), str, str2, str3);
            }
        });
    }

    public static void valueOf(View view, String str) {
        try {
            ((GradientDrawable) view.getBackground()).setColor(Color.parseColor(str));
        } catch (Exception unused) {
            ((GradientDrawable) view.getBackground()).setColor(view.getContext().getResources().getColor(com.app.dream11Pro.R.color.res_0x7f0601db));
        }
    }
}
