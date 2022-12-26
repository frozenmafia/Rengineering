package o;

import com.facebook.cache.common.CacheEventListener;
/* loaded from: classes4.dex */
public class requireParentFragment implements CacheEventListener {
    private static requireParentFragment ah$a;

    @Override // com.facebook.cache.common.CacheEventListener
    public void ag$a(performStop performstop) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void ah$a() {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void ah$a(performStop performstop) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void ah$b(performStop performstop) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void invoke(performStop performstop) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void toString(performStop performstop) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void valueOf(performStop performstop) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void values(performStop performstop) {
    }

    private requireParentFragment() {
    }

    public static requireParentFragment values() {
        requireParentFragment requireparentfragment;
        synchronized (requireParentFragment.class) {
            if (ah$a == null) {
                ah$a = new requireParentFragment();
            }
            requireparentfragment = ah$a;
        }
        return requireparentfragment;
    }
}
