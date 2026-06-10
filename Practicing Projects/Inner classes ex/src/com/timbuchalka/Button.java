package com.timbuchalka;


public class Button {
    private String title;
    private OnClickListener onClickLister;

    public Button(String title) {
        this.title = title;
    }
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickLister = onClickListener;
    }


    public String getTitle() {
        return title;
    }



    public void onClick() {


        this.onClickLister.onClick(title);
    }


    public interface OnClickListener {
        void onClick(String title);
    }
}
