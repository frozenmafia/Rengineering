package com.app.dream11.chat.reaction;

import android.view.MotionEvent;
import androidx.databinding.BindingAdapter;
import com.app.dream11.chat.models.ReactionViewPositionData;
import java.util.List;
import o.setAlarmClock;
/* loaded from: classes.dex */
public final class ChatReactionOverlayViewKt {
    @BindingAdapter({"availableChatReactions"})
    public static final void setAvailableReaction(ChatReactionOverlayView chatReactionOverlayView, List<setAlarmClock> list) {
        if (chatReactionOverlayView == null) {
            return;
        }
        chatReactionOverlayView.setAvailableReactions(list);
    }

    @BindingAdapter({"shouldAddVerticalOffset"})
    public static final void setAvailableReaction(ChatReactionOverlayView chatReactionOverlayView, Boolean bool) {
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        if (chatReactionOverlayView == null) {
            return;
        }
        chatReactionOverlayView.setAddVerticalOffset(bool.booleanValue());
    }

    @BindingAdapter({"chatReactionOverlayListener"})
    public static final void setChatReactionOverlayListener(ChatReactionOverlayView chatReactionOverlayView, IChatReactionOverlayListener iChatReactionOverlayListener) {
        if (chatReactionOverlayView == null) {
            return;
        }
        chatReactionOverlayView.setOverlayListener(iChatReactionOverlayListener);
    }

    @BindingAdapter(requireAll = true, value = {"reactionViewPositionData", "showReactionView"})
    public static final void showReactionView(ChatReactionOverlayView chatReactionOverlayView, ReactionViewPositionData reactionViewPositionData, Boolean bool) {
        MotionEvent motionEvent;
        if (bool == null) {
            return;
        }
        if (!bool.booleanValue()) {
            if (chatReactionOverlayView == null) {
                return;
            }
            ChatReactionOverlayView.hideReaction$default(chatReactionOverlayView, false, false, 2, null);
        } else if (reactionViewPositionData == null || (motionEvent = reactionViewPositionData.getMotionEvent()) == null || chatReactionOverlayView == null) {
        } else {
            chatReactionOverlayView.showReactions(motionEvent, reactionViewPositionData.getAlignment());
        }
    }
}
