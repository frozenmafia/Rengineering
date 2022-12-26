package com.app.dream11.chat.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.app.dream11.chat.viewmodels.ChatMessageVM;
import com.app.dream11Pro.R;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GroupChatSwipeController extends RecylerViewItemSwipeController {
    private IMessageSwipeHandler handler;

    /* loaded from: classes.dex */
    public interface IMessageSwipeHandler {
        void onMessageSwiped(ChatMessageVM chatMessageVM);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupChatSwipeController(Context context, IMessageSwipeHandler iMessageSwipeHandler) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.handler = iMessageSwipeHandler;
    }

    @Override // com.app.dream11.chat.ui.RecylerViewItemSwipeController
    protected boolean shouldSwipeCurrentViewHolder(RecyclerView.ViewHolder viewHolder) {
        runAnimators.ag$a(viewHolder, "viewHolder");
        return viewHolder.itemView.getTag(R.id.groupMessageTag) != null;
    }

    @Override // com.app.dream11.chat.ui.RecylerViewItemSwipeController
    protected void onSwipeComplete(RecyclerView.ViewHolder viewHolder, RecyclerView.Adapter<?> adapter) {
        runAnimators.ag$a(viewHolder, "viewholder");
        runAnimators.ag$a(adapter, "adapter");
        try {
            Object tag = viewHolder.itemView.getTag(R.id.groupMessageTag);
            ChatMessageVM chatMessageVM = tag instanceof ChatMessageVM ? (ChatMessageVM) tag : null;
            if (chatMessageVM == null) {
                return;
            }
            viewHolder.itemView.performHapticFeedback(1, 2);
            IMessageSwipeHandler iMessageSwipeHandler = this.handler;
            if (iMessageSwipeHandler == null) {
                return;
            }
            iMessageSwipeHandler.onMessageSwiped(chatMessageVM);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
