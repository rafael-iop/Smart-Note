package com.bigfootsoftwares.notes;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Rafael on 22/08/2014.
 */
public class AboutUsDialog extends AlertDialog.Builder {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private View mCustomView;

    public AboutUsDialog(Context context, LayoutInflater layoutInflater) {
        super(context);
        this.mContext = context;
        this.mLayoutInflater = layoutInflater;

        buildDialog();
    }

    private void buildDialog() {
        mCustomView = mLayoutInflater.inflate(R.layout.aboutus, null);
        setTextViewTypeFace();

        setPositiveButton(R.string.dialog_ok_button, null);
        setView(mCustomView);
    }

    private void setTextViewTypeFace() {
        TextView localTextView1 = (TextView) mCustomView.findViewById(R.id.title);
        TextView localTextView2 = (TextView) mCustomView.findViewById(R.id.content);

        Typeface localTypeface = Typeface.createFromAsset(mContext.getAssets(), "Roboto-Thin.ttf");

        localTextView1.setTypeface(localTypeface);
        localTextView2.setTypeface(localTypeface);
    }

}
