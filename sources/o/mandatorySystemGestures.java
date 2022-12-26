package o;

import com.bumptech.glide.request.RequestCoordinator;
/* loaded from: classes3.dex */
public class mandatorySystemGestures implements RequestCoordinator, ime {
    private volatile ime HaptikSDK$b;
    private final RequestCoordinator ag$a;
    private final Object ah$a;
    private volatile ime valueOf;
    private boolean values;
    private RequestCoordinator.RequestState toString = RequestCoordinator.RequestState.CLEARED;
    private RequestCoordinator.RequestState HaptikSDK$c = RequestCoordinator.RequestState.CLEARED;

    public mandatorySystemGestures(Object obj, RequestCoordinator requestCoordinator) {
        this.ah$a = obj;
        this.ag$a = requestCoordinator;
    }

    public void ag$a(ime imeVar, ime imeVar2) {
        this.valueOf = imeVar;
        this.HaptikSDK$b = imeVar2;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean ag$a(ime imeVar) {
        boolean z;
        synchronized (this.ah$a) {
            z = HaptikSDK$d() && (imeVar.equals(this.valueOf) || this.toString != RequestCoordinator.RequestState.SUCCESS);
        }
        return z;
    }

    private boolean HaptikSDK$d() {
        RequestCoordinator requestCoordinator = this.ag$a;
        return requestCoordinator == null || requestCoordinator.ag$a(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean values(ime imeVar) {
        boolean z;
        synchronized (this.ah$a) {
            z = HaptikWebView() && imeVar.equals(this.valueOf) && !ah$a();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean toString(ime imeVar) {
        boolean z;
        synchronized (this.ah$a) {
            z = invoke() && imeVar.equals(this.valueOf) && this.toString != RequestCoordinator.RequestState.PAUSED;
        }
        return z;
    }

    private boolean invoke() {
        RequestCoordinator requestCoordinator = this.ag$a;
        return requestCoordinator == null || requestCoordinator.toString(this);
    }

    private boolean HaptikWebView() {
        RequestCoordinator requestCoordinator = this.ag$a;
        return requestCoordinator == null || requestCoordinator.values(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, o.ime
    public boolean ah$a() {
        boolean z;
        synchronized (this.ah$a) {
            z = this.HaptikSDK$b.ah$a() || this.valueOf.ah$a();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void invoke(ime imeVar) {
        synchronized (this.ah$a) {
            if (imeVar.equals(this.HaptikSDK$b)) {
                this.HaptikSDK$c = RequestCoordinator.RequestState.SUCCESS;
                return;
            }
            this.toString = RequestCoordinator.RequestState.SUCCESS;
            RequestCoordinator requestCoordinator = this.ag$a;
            if (requestCoordinator != null) {
                requestCoordinator.invoke(this);
            }
            if (!this.HaptikSDK$c.isComplete()) {
                this.HaptikSDK$b.valueOf();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void valueOf(ime imeVar) {
        synchronized (this.ah$a) {
            if (!imeVar.equals(this.valueOf)) {
                this.HaptikSDK$c = RequestCoordinator.RequestState.FAILED;
                return;
            }
            this.toString = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.ag$a;
            if (requestCoordinator != null) {
                requestCoordinator.valueOf(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator ag$a() {
        RequestCoordinator ag$a;
        synchronized (this.ah$a) {
            RequestCoordinator requestCoordinator = this.ag$a;
            ag$a = requestCoordinator != null ? requestCoordinator.ag$a() : this;
        }
        return ag$a;
    }

    @Override // o.ime
    public void values() {
        synchronized (this.ah$a) {
            this.values = true;
            if (this.toString != RequestCoordinator.RequestState.SUCCESS && this.HaptikSDK$c != RequestCoordinator.RequestState.RUNNING) {
                this.HaptikSDK$c = RequestCoordinator.RequestState.RUNNING;
                this.HaptikSDK$b.values();
            }
            if (this.values && this.toString != RequestCoordinator.RequestState.RUNNING) {
                this.toString = RequestCoordinator.RequestState.RUNNING;
                this.valueOf.values();
            }
            this.values = false;
        }
    }

    @Override // o.ime
    public void valueOf() {
        synchronized (this.ah$a) {
            this.values = false;
            this.toString = RequestCoordinator.RequestState.CLEARED;
            this.HaptikSDK$c = RequestCoordinator.RequestState.CLEARED;
            this.HaptikSDK$b.valueOf();
            this.valueOf.valueOf();
        }
    }

    @Override // o.ime
    public void HaptikSDK$b() {
        synchronized (this.ah$a) {
            if (!this.HaptikSDK$c.isComplete()) {
                this.HaptikSDK$c = RequestCoordinator.RequestState.PAUSED;
                this.HaptikSDK$b.HaptikSDK$b();
            }
            if (!this.toString.isComplete()) {
                this.toString = RequestCoordinator.RequestState.PAUSED;
                this.valueOf.HaptikSDK$b();
            }
        }
    }

    @Override // o.ime
    public boolean HaptikSDK$a() {
        boolean z;
        synchronized (this.ah$a) {
            z = this.toString == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @Override // o.ime
    public boolean HaptikSDK$c() {
        boolean z;
        synchronized (this.ah$a) {
            z = this.toString == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // o.ime
    public boolean ah$b() {
        boolean z;
        synchronized (this.ah$a) {
            z = this.toString == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // o.ime
    public boolean ah$a(ime imeVar) {
        if (imeVar instanceof mandatorySystemGestures) {
            mandatorySystemGestures mandatorysystemgestures = (mandatorySystemGestures) imeVar;
            if (this.valueOf != null ? this.valueOf.ah$a(mandatorysystemgestures.valueOf) : mandatorysystemgestures.valueOf == null) {
                if (this.HaptikSDK$b != null ? this.HaptikSDK$b.ah$a(mandatorysystemgestures.HaptikSDK$b) : mandatorysystemgestures.HaptikSDK$b == null) {
                    return true;
                }
            }
        }
        return false;
    }
}
