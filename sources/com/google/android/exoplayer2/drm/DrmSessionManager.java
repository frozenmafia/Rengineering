package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
/* loaded from: classes4.dex */
public interface DrmSessionManager {
    public static final DrmSessionManager DRM_UNSUPPORTED;
    @Deprecated
    public static final DrmSessionManager DUMMY;

    /* loaded from: classes4.dex */
    public interface DrmSessionReference {
        public static final DrmSessionReference EMPTY = DrmSessionManager$DrmSessionReference$$ExternalSyntheticLambda0.INSTANCE;

        /* renamed from: com.google.android.exoplayer2.drm.DrmSessionManager$DrmSessionReference$-CC  reason: invalid class name */
        /* loaded from: classes4.dex */
        public final /* synthetic */ class CC {
            static {
                DrmSessionReference drmSessionReference = DrmSessionReference.EMPTY;
            }

            public static /* synthetic */ void lambda$static$0() {
            }
        }

        void release();
    }

    DrmSession acquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format);

    int getCryptoType(Format format);

    DrmSessionReference preacquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format);

    void prepare();

    void release();

    void setPlayer(Looper looper, PlayerId playerId);

    static {
        DrmSessionManager drmSessionManager = new DrmSessionManager() { // from class: com.google.android.exoplayer2.drm.DrmSessionManager.1
            @Override // com.google.android.exoplayer2.drm.DrmSessionManager
            public /* synthetic */ DrmSessionReference preacquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
                return DrmSessionReference.EMPTY;
            }

            @Override // com.google.android.exoplayer2.drm.DrmSessionManager
            public /* synthetic */ void prepare() {
                CC.$default$prepare(this);
            }

            @Override // com.google.android.exoplayer2.drm.DrmSessionManager
            public /* synthetic */ void release() {
                CC.$default$release(this);
            }

            @Override // com.google.android.exoplayer2.drm.DrmSessionManager
            public void setPlayer(Looper looper, PlayerId playerId) {
            }

            @Override // com.google.android.exoplayer2.drm.DrmSessionManager
            public DrmSession acquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
                if (format.drmInitData == null) {
                    return null;
                }
                return new ErrorStateDrmSession(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
            }

            @Override // com.google.android.exoplayer2.drm.DrmSessionManager
            public int getCryptoType(Format format) {
                return format.drmInitData != null ? 1 : 0;
            }
        };
        DRM_UNSUPPORTED = drmSessionManager;
        DUMMY = drmSessionManager;
    }

    /* renamed from: com.google.android.exoplayer2.drm.DrmSessionManager$-CC  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
        public static void $default$prepare(DrmSessionManager drmSessionManager) {
        }

        public static void $default$release(DrmSessionManager drmSessionManager) {
        }

        static {
            DrmSessionManager drmSessionManager = DrmSessionManager.DRM_UNSUPPORTED;
        }

        @Deprecated
        public static DrmSessionManager getDummyDrmSessionManager() {
            return DrmSessionManager.DRM_UNSUPPORTED;
        }
    }
}
