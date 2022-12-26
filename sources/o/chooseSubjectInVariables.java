package o;

import android.view.View;
import com.app.dream11.dream11.BaseActivity;
import com.app.dream11.matchcentre.offer.MyPromotionView;
/* loaded from: classes3.dex */
public final class chooseSubjectInVariables {
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"flowStateListener", "scrollDuration"})
    public static final void values(MyPromotionView myPromotionView, isItalic isitalic, long j) {
        runAnimators.ag$a(myPromotionView, "promotionView");
        runAnimators.ag$a(isitalic, "listener");
        if (isitalic instanceof BaseActivity) {
            View rootView = ((BaseActivity) isitalic).getRootView();
            runAnimators.ah$a(rootView, "listener.rootView");
            myPromotionView.valueOf(isitalic, rootView, j);
        }
    }

    @androidx.databinding.BindingAdapter({"fetchPromotion"})
    public static final void ah$a(MyPromotionView myPromotionView, SupportSQLiteQuery<android.util.Pair<Boolean, initFromRow>> supportSQLiteQuery) {
        runAnimators.ag$a(myPromotionView, "promotionView");
        runAnimators.ag$a(supportSQLiteQuery, "listener");
        myPromotionView.toString(supportSQLiteQuery);
    }

    @androidx.databinding.BindingAdapter({"promotionListener"})
    public static final void valueOf(MyPromotionView myPromotionView, MyPromotionView.toString tostring) {
        runAnimators.ag$a(myPromotionView, "promotionView");
        if (tostring == null) {
            return;
        }
        myPromotionView.setPromotionListner(tostring);
    }

    @androidx.databinding.BindingAdapter({"promotionCustomClickListener"})
    public static final void toString(MyPromotionView myPromotionView, SplineSet splineSet) {
        runAnimators.ag$a(myPromotionView, "promotionView");
        if (splineSet == null) {
            return;
        }
        myPromotionView.setPromotionCustomClickListener(splineSet);
    }

    @androidx.databinding.BindingAdapter({"promotionBannerSource"})
    public static final void values(MyPromotionView myPromotionView, String str) {
        runAnimators.ag$a(myPromotionView, "promotionView");
        if (str == null) {
            return;
        }
        myPromotionView.setPromotionBannerSource(str);
    }
}
