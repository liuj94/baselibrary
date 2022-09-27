package com.zcitc.baselibrary;

import android.app.Dialog;
import android.content.Context;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.NonNull;


public class ProgressDialog extends Dialog {
    private TextView loadText;

    public ProgressDialog(@NonNull Context context) {
//        super(context, R.style.public_dialog_progress);
        super(context, R.style.BaseCustomDialog);
//        setContentView(R.layout.public_dialog_porgress);
        setContentView(R.layout.placeholder_web_02);
        loadText = findViewById(R.id.tvcontent);
        setCanceledOnTouchOutside(false);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.alpha=0.8f;
        getWindow().setAttributes(attributes);
        setCancelable(false);
    }

    public void setLoadText(String text) {
        loadText.setText(text);
    }

}
