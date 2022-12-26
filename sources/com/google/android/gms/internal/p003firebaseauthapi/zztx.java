package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztx  reason: invalid package */
/* loaded from: classes5.dex */
public interface zztx extends IInterface {
    void zzd(String str) throws RemoteException;

    void zze(String str) throws RemoteException;

    void zzf(zzvv zzvvVar) throws RemoteException;

    void zzg() throws RemoteException;

    void zzh(zzny zznyVar) throws RemoteException;

    void zzi(zzoa zzoaVar) throws RemoteException;

    void zzj(Status status, PhoneAuthCredential phoneAuthCredential) throws RemoteException;

    void zzk(Status status) throws RemoteException;

    void zzl(zzwq zzwqVar, zzwj zzwjVar) throws RemoteException;

    void zzm(zzxb zzxbVar) throws RemoteException;

    void zzn() throws RemoteException;

    void zzo(String str) throws RemoteException;

    void zzp() throws RemoteException;

    void zzq(zzwq zzwqVar) throws RemoteException;

    void zzr(PhoneAuthCredential phoneAuthCredential) throws RemoteException;
}
