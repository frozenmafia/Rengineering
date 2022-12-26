package o;

import com.app.dream11.reaction.views.ReactionView;
import com.google.android.gms.analytics.ecommerce.Promotion;
/* loaded from: classes3.dex */
public final class instantiateProvider$ah$a extends instantiateProvider {
    private final ReactionView ag$a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public instantiateProvider$ah$a(ReactionView reactionView) {
        super(null);
        runAnimators.ag$a(reactionView, Promotion.ACTION_VIEW);
        this.ag$a = reactionView;
    }

    public final ReactionView ah$a() {
        return this.ag$a;
    }
}
