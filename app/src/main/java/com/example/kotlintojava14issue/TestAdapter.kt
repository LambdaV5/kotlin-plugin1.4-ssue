package com.example.kotlintojava14issue

import android.view.View
import android.widget.ImageView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder

/**
 * @author lambda
 * created on 2020/8/22
 */
class TestAdapter: BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_test) {

    override fun convert(holder: BaseViewHolder, item: String) {
        GlideApp.with(context)
            .load("")
            .placeholder(R.mipmap.ic_launcher)
            .error(R.mipmap.ic_launcher)
            .into((holder.getView<View>(R.id.iv_avatar) as ImageView))

        holder.getView<View>(R.id.ll_test).setOnClickListener{}
    }
}