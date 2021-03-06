package com.komoriwu.one.all.fragment.viewholder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.komoriwu.one.R;
import com.komoriwu.one.widget.DCTextView;
import com.komoriwu.one.widget.FZTextView;

/**
 * Created by KomoriWu
 * on 2017-12-28.
 */

public class FollowViewHolder extends RecyclerView.ViewHolder {
    public ImageView ivCardCover;
    public ImageView ivCover;
    public ImageView ivSelect;
    public FZTextView tvTitle;
    public FZTextView tvDescription;
    public FZTextView tvAd;
    public DCTextView tvTime;
    public RelativeLayout layoutAuthor;
    public CardView cardView;

    public FollowViewHolder(View itemView) {
        super(itemView);
        ivCardCover = itemView.findViewById(R.id.iv_card_cover);
        tvTime = itemView.findViewById(R.id.tv_time);
        ivCover = itemView.findViewById(R.id.iv_cover);
        tvTitle = itemView.findViewById(R.id.tv_title);
        tvDescription = itemView.findViewById(R.id.tv_description);
        tvAd = itemView.findViewById(R.id.tv_ad);
        ivSelect = itemView.findViewById(R.id.iv_select);
        layoutAuthor = itemView.findViewById(R.id.layout_author);
        cardView = itemView.findViewById(R.id.card_view);
    }
}