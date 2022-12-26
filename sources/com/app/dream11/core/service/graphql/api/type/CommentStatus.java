package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum CommentStatus {
    ADDED("ADDED"),
    DELETED("DELETED"),
    EDITED("EDITED"),
    ABUSIVE("ABUSIVE"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    CommentStatus(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final CommentStatus safeValueOf(String str) {
            CommentStatus commentStatus;
            runAnimators.ag$a(str, "rawValue");
            CommentStatus[] values = CommentStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    commentStatus = null;
                    break;
                }
                commentStatus = values[i];
                if (runAnimators.values((Object) commentStatus.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return commentStatus == null ? CommentStatus.UNKNOWN__ : commentStatus;
        }
    }
}
