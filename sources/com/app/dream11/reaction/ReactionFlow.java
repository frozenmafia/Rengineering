package com.app.dream11.reaction;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getTargetTypes;
/* loaded from: classes3.dex */
public final class ReactionFlow extends FlowState {
    private final String postId;
    private final String publisheruserid;
    private final String reactionid;
    private final String source;
    private final String userReaction;

    public /* synthetic */ ReactionFlow(String str, String str2, String str3, String str4, String str5, getTargetTypes gettargettypes) {
        this(str, str2, str3, str4, str5);
    }

    private ReactionFlow(String str, String str2, String str3, String str4, String str5) {
        super(FlowStates.REACTION_HOLDER, null, 2, null);
        this.postId = str;
        this.reactionid = str2;
        this.source = str3;
        this.userReaction = str4;
        this.publisheruserid = str5;
    }

    public final String getPostId() {
        return this.postId;
    }

    public final String getPublisheruserid() {
        return this.publisheruserid;
    }

    public final String getReactionid() {
        return this.reactionid;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getUserReaction() {
        return this.userReaction;
    }
}
