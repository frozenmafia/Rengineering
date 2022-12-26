package com.app.dream11.chat.reaction;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.app.dream11.reaction.views.ReactionView;
import com.app.dream11Pro.R;
import java.util.LinkedHashMap;
import java.util.Map;
import o.Styleable;
import o.runAnimators;
import o.setAlarmClock;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class ChatReactionView extends ReactionView {
    public Map<Integer, View> _$_findViewCache;
    private final Styleable.ChangeBounds<setAlarmClock, setAnimationMatrix> block;

    @Override // com.app.dream11.reaction.views.ReactionView
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.app.dream11.reaction.views.ReactionView
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

    public final Styleable.ChangeBounds<setAlarmClock, setAnimationMatrix> getBlock() {
        return this.block;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatReactionView(Context context, final setAlarmClock setalarmclock, Styleable.ChangeBounds<? super setAlarmClock, setAnimationMatrix> changeBounds) {
        super(context, setalarmclock);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(setalarmclock, "reaction");
        runAnimators.ag$a(changeBounds, "block");
        this._$_findViewCache = new LinkedHashMap();
        this.block = changeBounds;
        setScaleType(ImageView.ScaleType.FIT_XY);
        setElevation(getResources().getDimensionPixelSize(R.dimen.d11_size_03));
        setImageResource(setalarmclock.ag$a());
        setOnClickListener(new View.OnClickListener() { // from class: com.app.dream11.chat.reaction.ChatReactionView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatReactionView.m757_init_$lambda0(ChatReactionView.this, setalarmclock, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m757_init_$lambda0(ChatReactionView chatReactionView, setAlarmClock setalarmclock, View view) {
        runAnimators.ag$a(chatReactionView, "this$0");
        runAnimators.ag$a(setalarmclock, "$reaction");
        chatReactionView.block.invoke(setalarmclock);
        view.performHapticFeedback(1, 2);
    }
}
