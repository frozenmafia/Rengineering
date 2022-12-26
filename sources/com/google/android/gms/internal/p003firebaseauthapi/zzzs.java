package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.internal.p003firebaseauthapi.zzzs;
import com.google.android.gms.internal.p003firebaseauthapi.zzzw;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzs  reason: invalid package */
/* loaded from: classes7.dex */
public class zzzs<MessageType extends zzzw<MessageType, BuilderType>, BuilderType extends zzzs<MessageType, BuilderType>> extends zzyd<MessageType, BuilderType> {
    protected MessageType zza;
    protected boolean zzb = false;
    private final MessageType zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzzs(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (MessageType) messagetype.zzj(4, null, null);
    }

    private static final void zza(MessageType messagetype, MessageType messagetype2) {
        zzabh.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaba
    public final /* bridge */ /* synthetic */ zzaaz zzI() {
        return this.zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyd
    protected final /* synthetic */ zzyd zzg(zzye zzyeVar) {
        zzj((zzzw) zzyeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyd
    /* renamed from: zzi */
    public final BuilderType zzf() {
        BuilderType buildertype = (BuilderType) this.zzc.zzj(5, null, null);
        buildertype.zzj(zzm());
        return buildertype;
    }

    public final BuilderType zzj(MessageType messagetype) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zza(this.zza, messagetype);
        return this;
    }

    public final MessageType zzk() {
        MessageType zzm = zzm();
        if (zzm.zzH()) {
            return zzm;
        }
        throw new zzaby(zzm);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaay
    /* renamed from: zzl */
    public MessageType zzm() {
        if (this.zzb) {
            return this.zza;
        }
        MessageType messagetype = this.zza;
        zzabh.zza().zzb(messagetype.getClass()).zzf(messagetype);
        this.zzb = true;
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzo() {
        MessageType messagetype = (MessageType) this.zza.zzj(4, null, null);
        zza(messagetype, this.zza);
        this.zza = messagetype;
    }
}
