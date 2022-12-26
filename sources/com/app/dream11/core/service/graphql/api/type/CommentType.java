package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum CommentType {
    FREE_TEXT("FREE_TEXT"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    CommentType(String str) {
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

        public final CommentType safeValueOf(String str) {
            CommentType commentType;
            runAnimators.ag$a(str, "rawValue");
            CommentType[] values = CommentType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    commentType = null;
                    break;
                }
                commentType = values[i];
                if (runAnimators.values((Object) commentType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return commentType == null ? CommentType.UNKNOWN__ : commentType;
        }
    }
}
