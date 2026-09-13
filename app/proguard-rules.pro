# BOTRADE ProGuard rules

-keepattributes *Annotation*
-keepattributes Signature
-keepattributes SourceFile,LineNumberTable

# Retrofit 2
-keepattributes Signature, InnerClasses, EnclosingMethod
-keepattributes RuntimeVisibleAnnotations, RuntimeVisibleParameterAnnotations
-keepclassmembers,allowshrinking,allowobfuscation interface * {
    @retrofit2.http.* <methods>;
}
-dontwarn retrofit2.**
-dontwarn okhttp3.**
-dontwarn okio..
# Keep Retrofit/OkHttp internals so call adapters & converter factories survive R8.
-keep class retrofit2.** { *; }
-keep class okhttp3.** { *; }
-keep class okio.** { *; }
-keep class com.altomedia.botrade.model.** { *; }
-keep class com.altomedia.botrade.retrofit.** { *; }

# Gson
-keep class sun.misc.Unsafe { *; }
-keep class com.google.gson.** { *; }

# ButterKnife 10

# QRCodeReaderView
-keep class com.dlazaro66.qrcodereaderview.** { *; }
-dontwarn com.dlazaro66.qrcodereaderview.**
