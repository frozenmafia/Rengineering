package com.zmxv.RNSound;

import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes5.dex */
public class RNSoundModule extends ReactContextBaseJavaModule implements AudioManager.OnAudioFocusChangeListener {
    static final Object NULL = null;
    String category;
    ReactApplicationContext context;
    Double focusedPlayerKey;
    Boolean mixWithOthers;
    Map<Double, MediaPlayer> playerPool;
    Boolean wasPlayingBeforeFocusChange;

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void enable(Boolean bool) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSound";
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    public RNSoundModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.playerPool = new HashMap();
        this.mixWithOthers = true;
        this.wasPlayingBeforeFocusChange = false;
        this.context = reactApplicationContext;
        this.category = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnPlay(boolean z, Double d) {
        ReactApplicationContext reactApplicationContext = this.context;
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isPlaying", z);
        createMap.putDouble("playerKey", d.doubleValue());
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onPlayChange", createMap);
    }

    @ReactMethod
    public void prepare(String str, Double d, ReadableMap readableMap, final Callback callback) {
        MediaPlayer createMediaPlayer = createMediaPlayer(str);
        if (readableMap.hasKey("speed") && Build.VERSION.SDK_INT >= 23) {
            createMediaPlayer.setPlaybackParams(createMediaPlayer.getPlaybackParams().setSpeed((float) readableMap.getDouble("speed")));
        }
        char c = 65535;
        if (createMediaPlayer == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("code", -1);
            createMap.putString("message", "resource not found");
            callback.invoke(createMap, NULL);
            return;
        }
        this.playerPool.put(d, createMediaPlayer);
        String str2 = this.category;
        if (str2 != null) {
            Integer num = null;
            str2.hashCode();
            switch (str2.hashCode()) {
                case -1803461041:
                    if (str2.equals("System")) {
                        c = 0;
                        break;
                    }
                    break;
                case 2547280:
                    if (str2.equals("Ring")) {
                        c = 1;
                        break;
                    }
                    break;
                case 63343153:
                    if (str2.equals("Alarm")) {
                        c = 2;
                        break;
                    }
                    break;
                case 82833682:
                    if (str2.equals("Voice")) {
                        c = 3;
                        break;
                    }
                    break;
                case 772508280:
                    if (str2.equals("Ambient")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1943812667:
                    if (str2.equals("Playback")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                num = 1;
            } else if (c == 1) {
                num = 2;
            } else if (c == 2) {
                num = 4;
            } else if (c == 3) {
                num = 0;
            } else if (c == 4) {
                num = 5;
            } else if (c != 5) {
                Log.e("RNSoundModule", String.format("Unrecognised category %s", this.category));
            } else {
                num = 3;
            }
            if (num != null) {
                createMediaPlayer.setAudioStreamType(num.intValue());
            }
        }
        createMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.zmxv.RNSound.RNSoundModule.5
            boolean ah$a = false;

            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                synchronized (this) {
                    if (this.ah$a) {
                        return;
                    }
                    this.ah$a = true;
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putDouble("duration", mediaPlayer.getDuration() * 0.001d);
                    try {
                        callback.invoke(RNSoundModule.NULL, createMap2);
                    } catch (RuntimeException e) {
                        Log.e("RNSoundModule", "Exception", e);
                    }
                }
            }
        });
        createMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.zmxv.RNSound.RNSoundModule.2
            boolean ah$a = false;

            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                synchronized (this) {
                    if (this.ah$a) {
                        return true;
                    }
                    this.ah$a = true;
                    try {
                        WritableMap createMap2 = Arguments.createMap();
                        createMap2.putInt("what", i);
                        createMap2.putInt("extra", i2);
                        callback.invoke(createMap2, RNSoundModule.NULL);
                    } catch (RuntimeException e) {
                        Log.e("RNSoundModule", "Exception", e);
                    }
                    return true;
                }
            }
        });
        try {
            if (readableMap.hasKey("loadSync") && readableMap.getBoolean("loadSync")) {
                createMediaPlayer.prepare();
            } else {
                createMediaPlayer.prepareAsync();
            }
        } catch (Exception e) {
            Log.e("RNSoundModule", "Exception", e);
        }
    }

    protected MediaPlayer createMediaPlayer(String str) {
        int identifier = this.context.getResources().getIdentifier(str, "raw", this.context.getPackageName());
        MediaPlayer mediaPlayer = new MediaPlayer();
        if (identifier != 0) {
            try {
                AssetFileDescriptor openRawResourceFd = this.context.getResources().openRawResourceFd(identifier);
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                return mediaPlayer;
            } catch (IOException e) {
                Log.e("RNSoundModule", "Exception", e);
                return null;
            }
        } else if (str.startsWith("http://") || str.startsWith("https://")) {
            mediaPlayer.setAudioStreamType(3);
            Log.i("RNSoundModule", str);
            try {
                mediaPlayer.setDataSource(str);
                return mediaPlayer;
            } catch (IOException e2) {
                Log.e("RNSoundModule", "Exception", e2);
                return null;
            }
        } else if (str.startsWith("asset:/")) {
            try {
                AssetFileDescriptor openFd = this.context.getAssets().openFd(str.replace("asset:/", ""));
                mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                openFd.close();
                return mediaPlayer;
            } catch (IOException e3) {
                Log.e("RNSoundModule", "Exception", e3);
                return null;
            }
        } else if (str.startsWith("file:/")) {
            try {
                mediaPlayer.setDataSource(str);
                return mediaPlayer;
            } catch (IOException e4) {
                Log.e("RNSoundModule", "Exception", e4);
                return null;
            }
        } else {
            if (new File(str).exists()) {
                mediaPlayer.setAudioStreamType(3);
                Log.i("RNSoundModule", str);
                try {
                    mediaPlayer.setDataSource(str);
                    return mediaPlayer;
                } catch (IOException e5) {
                    Log.e("RNSoundModule", "Exception", e5);
                }
            }
            return null;
        }
    }

    @ReactMethod
    public void play(final Double d, final Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer == null) {
            setOnPlay(false, d);
            if (callback != null) {
                callback.invoke(false);
            }
        } else if (mediaPlayer.isPlaying()) {
        } else {
            if (!this.mixWithOthers.booleanValue()) {
                ((AudioManager) this.context.getSystemService("audio")).requestAudioFocus(this, 3, 1);
                this.focusedPlayerKey = d;
            }
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.zmxv.RNSound.RNSoundModule.1
                boolean ag$a = false;

                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer2) {
                    synchronized (this) {
                        if (!mediaPlayer2.isLooping()) {
                            RNSoundModule.this.setOnPlay(false, d);
                            if (this.ag$a) {
                                return;
                            }
                            this.ag$a = true;
                            try {
                                callback.invoke(true);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.zmxv.RNSound.RNSoundModule.3
                boolean valueOf = false;

                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    synchronized (this) {
                        RNSoundModule.this.setOnPlay(false, d);
                        if (this.valueOf) {
                            return true;
                        }
                        this.valueOf = true;
                        try {
                            callback.invoke(true);
                        } catch (Exception unused) {
                        }
                        return true;
                    }
                }
            });
            mediaPlayer.start();
            setOnPlay(true, d);
        }
    }

    @ReactMethod
    public void pause(Double d, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
        if (callback != null) {
            callback.invoke(new Object[0]);
        }
    }

    @ReactMethod
    public void stop(Double d, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            mediaPlayer.seekTo(0);
        }
        if (!this.mixWithOthers.booleanValue() && d == this.focusedPlayerKey) {
            ((AudioManager) this.context.getSystemService("audio")).abandonAudioFocus(this);
        }
        callback.invoke(new Object[0]);
    }

    @ReactMethod
    public void reset(Double d) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
    }

    @ReactMethod
    public void release(Double d) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            mediaPlayer.release();
            this.playerPool.remove(d);
            if (this.mixWithOthers.booleanValue() || d != this.focusedPlayerKey) {
                return;
            }
            ((AudioManager) this.context.getSystemService("audio")).abandonAudioFocus(this);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Iterator<Map.Entry<Double, MediaPlayer>> it = this.playerPool.entrySet().iterator();
        while (it.hasNext()) {
            MediaPlayer value = it.next().getValue();
            if (value != null) {
                value.reset();
                value.release();
            }
            it.remove();
        }
    }

    @ReactMethod
    public void setVolume(Double d, Float f, Float f2) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f.floatValue(), f2.floatValue());
        }
    }

    @ReactMethod
    public void getSystemVolume(Callback callback) {
        try {
            AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
            callback.invoke(Float.valueOf(audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)));
        } catch (Exception e) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("code", -1);
            createMap.putString("message", e.getMessage());
            callback.invoke(createMap);
        }
    }

    @ReactMethod
    public void setSystemVolume(Float f) {
        AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
        audioManager.setStreamVolume(3, Math.round(audioManager.getStreamMaxVolume(3) * f.floatValue()), 0);
    }

    @ReactMethod
    public void setLooping(Double d, Boolean bool) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(bool.booleanValue());
        }
    }

    @ReactMethod
    public void setSpeed(Double d, Float f) {
        if (Build.VERSION.SDK_INT < 23) {
            Log.w("RNSoundModule", "setSpeed ignored due to sdk limit");
            return;
        }
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null) {
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f.floatValue()));
        }
    }

    @ReactMethod
    public void setPitch(Double d, Float f) {
        if (Build.VERSION.SDK_INT < 23) {
            Log.w("RNSoundModule", "setPitch ignored due to sdk limit");
            return;
        }
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null) {
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setPitch(f.floatValue()));
        }
    }

    @ReactMethod
    public void setCurrentTime(Double d, Float f) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(Math.round(f.floatValue() * 1000.0f));
        }
    }

    @ReactMethod
    public void getCurrentTime(Double d, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d);
        if (mediaPlayer == null) {
            callback.invoke(-1, false);
        } else {
            callback.invoke(Double.valueOf(mediaPlayer.getCurrentPosition() * 0.001d), Boolean.valueOf(mediaPlayer.isPlaying()));
        }
    }

    @ReactMethod
    public void setSpeakerphoneOn(Double d, Boolean bool) {
        if (this.playerPool.get(d) != null) {
            AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
            if (bool.booleanValue()) {
                audioManager.setMode(3);
            } else {
                audioManager.setMode(0);
            }
            audioManager.setSpeakerphoneOn(bool.booleanValue());
        }
    }

    @ReactMethod
    public void setCategory(String str, Boolean bool) {
        this.category = str;
        this.mixWithOthers = bool;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        MediaPlayer mediaPlayer;
        if (this.mixWithOthers.booleanValue() || (mediaPlayer = this.playerPool.get(this.focusedPlayerKey)) == null) {
            return;
        }
        if (i <= 0) {
            Boolean valueOf = Boolean.valueOf(mediaPlayer.isPlaying());
            this.wasPlayingBeforeFocusChange = valueOf;
            if (valueOf.booleanValue()) {
                pause(this.focusedPlayerKey, null);
            }
        } else if (this.wasPlayingBeforeFocusChange.booleanValue()) {
            play(this.focusedPlayerKey, null);
            this.wasPlayingBeforeFocusChange = false;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("IsAndroid", true);
        return hashMap;
    }
}
