package com.giphy.sdk.ui.views;

import com.giphy.sdk.core.models.Media;
import o.ComponentActivity;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes7.dex */
public abstract class GPHVideoPlayerState {

    /* loaded from: classes7.dex */
    public static final class Idle extends GPHVideoPlayerState {
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }
    }

    private GPHVideoPlayerState() {
    }

    public /* synthetic */ GPHVideoPlayerState(getTargetTypes gettargettypes) {
        this();
    }

    /* loaded from: classes7.dex */
    public static final class Ready extends GPHVideoPlayerState {
        public static final Ready INSTANCE = new Ready();

        private Ready() {
            super(null);
        }
    }

    /* loaded from: classes7.dex */
    public static final class Buffering extends GPHVideoPlayerState {
        public static final Buffering INSTANCE = new Buffering();

        private Buffering() {
            super(null);
        }
    }

    /* loaded from: classes7.dex */
    public static final class Ended extends GPHVideoPlayerState {
        public static final Ended INSTANCE = new Ended();

        private Ended() {
            super(null);
        }
    }

    /* loaded from: classes7.dex */
    public static final class Unknown extends GPHVideoPlayerState {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super(null);
        }
    }

    /* loaded from: classes7.dex */
    public static final class Playing extends GPHVideoPlayerState {
        public static final Playing INSTANCE = new Playing();

        private Playing() {
            super(null);
        }
    }

    /* loaded from: classes7.dex */
    public static final class Repeated extends GPHVideoPlayerState {
        public static final Repeated INSTANCE = new Repeated();

        private Repeated() {
            super(null);
        }
    }

    /* loaded from: classes7.dex */
    public static final class Error extends GPHVideoPlayerState {
        private final String details;

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.details;
            }
            return error.copy(str);
        }

        public final String component1() {
            return this.details;
        }

        public final Error copy(String str) {
            runAnimators.ag$a(str, "details");
            return new Error(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Error) && runAnimators.values((Object) this.details, (Object) ((Error) obj).details);
            }
            return true;
        }

        public int hashCode() {
            String str = this.details;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Error(details=" + this.details + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String str) {
            super(null);
            runAnimators.ag$a(str, "details");
            this.details = str;
        }

        public final String getDetails() {
            return this.details;
        }
    }

    /* loaded from: classes7.dex */
    public static final class TimelineChanged extends GPHVideoPlayerState {
        private final long duration;

        public static /* synthetic */ TimelineChanged copy$default(TimelineChanged timelineChanged, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = timelineChanged.duration;
            }
            return timelineChanged.copy(j);
        }

        public final long component1() {
            return this.duration;
        }

        public final TimelineChanged copy(long j) {
            return new TimelineChanged(j);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof TimelineChanged) && this.duration == ((TimelineChanged) obj).duration;
            }
            return true;
        }

        public int hashCode() {
            return ComponentActivity.AnonymousClass2.C03192.toString(this.duration);
        }

        public String toString() {
            return "TimelineChanged(duration=" + this.duration + ")";
        }

        public TimelineChanged(long j) {
            super(null);
            this.duration = j;
        }

        public final long getDuration() {
            return this.duration;
        }
    }

    /* loaded from: classes7.dex */
    public static final class MuteChanged extends GPHVideoPlayerState {
        private final boolean muted;

        public static /* synthetic */ MuteChanged copy$default(MuteChanged muteChanged, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = muteChanged.muted;
            }
            return muteChanged.copy(z);
        }

        public final boolean component1() {
            return this.muted;
        }

        public final MuteChanged copy(boolean z) {
            return new MuteChanged(z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof MuteChanged) && this.muted == ((MuteChanged) obj).muted;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.muted;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "MuteChanged(muted=" + this.muted + ")";
        }

        public MuteChanged(boolean z) {
            super(null);
            this.muted = z;
        }

        public final boolean getMuted() {
            return this.muted;
        }
    }

    /* loaded from: classes7.dex */
    public static final class MediaChanged extends GPHVideoPlayerState {
        private final Media media;

        public static /* synthetic */ MediaChanged copy$default(MediaChanged mediaChanged, Media media, int i, Object obj) {
            if ((i & 1) != 0) {
                media = mediaChanged.media;
            }
            return mediaChanged.copy(media);
        }

        public final Media component1() {
            return this.media;
        }

        public final MediaChanged copy(Media media) {
            runAnimators.ag$a(media, "media");
            return new MediaChanged(media);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof MediaChanged) && runAnimators.values(this.media, ((MediaChanged) obj).media);
            }
            return true;
        }

        public int hashCode() {
            Media media = this.media;
            if (media != null) {
                return media.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "MediaChanged(media=" + this.media + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaChanged(Media media) {
            super(null);
            runAnimators.ag$a(media, "media");
            this.media = media;
        }

        public final Media getMedia() {
            return this.media;
        }
    }

    /* loaded from: classes7.dex */
    public static final class CaptionsTextChanged extends GPHVideoPlayerState {
        private final String subtitle;

        public static /* synthetic */ CaptionsTextChanged copy$default(CaptionsTextChanged captionsTextChanged, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = captionsTextChanged.subtitle;
            }
            return captionsTextChanged.copy(str);
        }

        public final String component1() {
            return this.subtitle;
        }

        public final CaptionsTextChanged copy(String str) {
            runAnimators.ag$a(str, "subtitle");
            return new CaptionsTextChanged(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof CaptionsTextChanged) && runAnimators.values((Object) this.subtitle, (Object) ((CaptionsTextChanged) obj).subtitle);
            }
            return true;
        }

        public int hashCode() {
            String str = this.subtitle;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CaptionsTextChanged(subtitle=" + this.subtitle + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CaptionsTextChanged(String str) {
            super(null);
            runAnimators.ag$a(str, "subtitle");
            this.subtitle = str;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }
    }

    /* loaded from: classes7.dex */
    public static final class CaptionsVisibilityChanged extends GPHVideoPlayerState {
        private final boolean visible;

        public static /* synthetic */ CaptionsVisibilityChanged copy$default(CaptionsVisibilityChanged captionsVisibilityChanged, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = captionsVisibilityChanged.visible;
            }
            return captionsVisibilityChanged.copy(z);
        }

        public final boolean component1() {
            return this.visible;
        }

        public final CaptionsVisibilityChanged copy(boolean z) {
            return new CaptionsVisibilityChanged(z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof CaptionsVisibilityChanged) && this.visible == ((CaptionsVisibilityChanged) obj).visible;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.visible;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "CaptionsVisibilityChanged(visible=" + this.visible + ")";
        }

        public CaptionsVisibilityChanged(boolean z) {
            super(null);
            this.visible = z;
        }

        public final boolean getVisible() {
            return this.visible;
        }
    }
}
