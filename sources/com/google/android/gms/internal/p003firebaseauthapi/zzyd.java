package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.internal.p003firebaseauthapi.zzyd;
import com.google.android.gms.internal.p003firebaseauthapi.zzye;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyd  reason: invalid package */
/* loaded from: classes7.dex */
public abstract class zzyd<MessageType extends zzye<MessageType, BuilderType>, BuilderType extends zzyd<MessageType, BuilderType>> implements zzaay {
    @Override // 
    /* renamed from: zzf */
    public abstract BuilderType clone();

    protected abstract BuilderType zzg(MessageType messagetype);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaay
    public final /* synthetic */ zzaay zzh(zzaaz zzaazVar) {
        if (!zzI().getClass().isInstance(zzaazVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return zzg((zzye) zzaazVar);
    }
}
