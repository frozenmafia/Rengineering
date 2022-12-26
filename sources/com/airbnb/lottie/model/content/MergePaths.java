package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import o.MediaSessionCompat;
import o.ResultReceiver;
import o.onPlay;
import o.onRemoveQueueItemAt;
/* loaded from: classes.dex */
public class MergePaths implements MediaSessionCompat.MediaSessionImplBase.MessageHandler {
    private final boolean ah$a;
    private final String valueOf;
    private final MergePathsMode values;

    /* loaded from: classes.dex */
    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return EXCLUDE_INTERSECTIONS;
                            }
                            return MERGE;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.valueOf = str;
        this.values = mergePathsMode;
        this.ah$a = z;
    }

    public String valueOf() {
        return this.valueOf;
    }

    public MergePathsMode ah$a() {
        return this.values;
    }

    public boolean ag$a() {
        return this.ah$a;
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.MessageHandler
    public onPlay toString(LottieDrawable lottieDrawable, MediaSessionCompat.QueueItem.Api21Impl api21Impl) {
        if (!lottieDrawable.valueOf()) {
            ResultReceiver.ah$a("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new onRemoveQueueItemAt(this);
    }

    public String toString() {
        return "MergePaths{mode=" + this.values + '}';
    }
}
