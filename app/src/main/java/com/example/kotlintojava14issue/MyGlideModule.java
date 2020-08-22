package com.example.kotlintojava14issue;

import android.content.Context;

import androidx.annotation.NonNull;

import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by lambda on 2017/12/8.
 * Powered by lambda
 *
 * @author lambda
 */

@GlideModule
public class MyGlideModule extends AppGlideModule {

    @Override
    public void applyOptions(@NonNull Context context, @NonNull GlideBuilder builder) {
        builder.setDefaultRequestOptions(new RequestOptions().format(DecodeFormat
                .PREFER_ARGB_8888));
        builder.setDiskCache(new InternalCacheDiskCacheFactory(context, "glide_cache",
                100 * 1024 * 1024));
        builder.setMemoryCache(new LruResourceCache(30 * 1024 * 1024));
    }

    @Override
    public boolean isManifestParsingEnabled() {
        return false;
    }
}
