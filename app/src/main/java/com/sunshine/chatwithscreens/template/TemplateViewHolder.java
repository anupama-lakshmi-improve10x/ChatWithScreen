package com.sunshine.chatwithscreens.template;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunshine.chatwithscreens.R;

public class TemplateViewHolder extends RecyclerView.ViewHolder {
    TextView messageTextTxt;

    public TemplateViewHolder(@NonNull View itemView) {
        super(itemView);
        messageTextTxt = itemView.findViewById(R.id.message_text_txt);
    }
}
