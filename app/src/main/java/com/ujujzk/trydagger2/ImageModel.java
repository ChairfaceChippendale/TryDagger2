package com.ujujzk.trydagger2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;



class ImageModel {
    private String imageUrl;
    private Bitmap bmp;
    private ImageView imv;

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void downloadTask(ImageView imv) {
        new DownloadImageTask(this).execute(imageUrl);
        this.imv = imv;
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageModel imageModel;

        public DownloadImageTask(ImageModel imageModel) {
            this.imageModel = imageModel;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            imageModel.imv.setImageBitmap(result);
        }
    }


    public String getImageURL() {
        return imageUrl;
    }

    public void setImageURL(String imageURL) {
        this.imageUrl = imageURL;
    }

    public Bitmap getBmp() {
        return bmp;
    }

}
