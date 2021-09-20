package io.horizontalsystems.bankwallet.modules.settings;


import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import io.horizontalsystems.bankwallet.R;

public class WebviewActivity5 extends Fragment {
    private static final int RESULT_OK = 1;
    public WebView mWebView;
    private ValueCallback<Uri> mUploadMessage;
    private ValueCallback<Uri[]> mUploadMessages;
    private Uri mCapturedImageURI = null;
    private static final int MY_CAMERA_REQUEST_CODE = 100;
    private static final int FILECHOOSER_RESULTCODE = 1;
    private ValueCallback<Uri[]> mFilePathCallback;
    private String mCameraPhotoPath;
    private static final int INPUT_FILE_REQUEST_CODE = 1;
    private int mReturnCode;
    private int mResultCode;
    private Intent mResultIntent;
    private boolean mUploadFileOnLoad = false;
    private static final String TAG = WebviewActivity5.class.getSimpleName();


    public static final String EXTRA_FROM_NOTIFICATION = "EXTRA_FROM_NOTIFICATION";

    public WebviewActivity5() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_webview5, container, false);

        // Get reference of WebView from layout/activity_main.xml
        mWebView = (WebView) rootView.findViewById(R.id.webview5);
        /*if(WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
            WebSettingsCompat.setForceDark(mWebView.getSettings(), WebSettingsCompat.FORCE_DARK_ON);
        }*/

        setUpWebViewDefaults(mWebView);

        // Check whether we're recreating a previously destroyed instance
        if (savedInstanceState != null) {
            // Restore the previous URL and history stack
            mWebView.restoreState(savedInstanceState);
        }

        mWebView.setWebChromeClient(new

                                            WebChromeClient() {
                                                //The undocumented magic method override
                                                //Eclipse will swear at you if you try to put @Override here
                                                // For Android 3.0+


                                                public void openFileChooser(ValueCallback<Uri> uploadMsg) {

                                                    ValueCallback mUploadMessage = uploadMsg;
                                                    Intent i = new Intent(Intent.ACTION_GET_CONTENT);
                                                    i.addCategory(Intent.CATEGORY_OPENABLE);
                                                    i.setType("image/*");
                                                    getActivity().startActivityForResult(Intent.createChooser(i, "File Chooser"), 1000);

                                                }

                                                // For Android 3.0+

                                                public void openFileChooser(ValueCallback uploadMsg, String acceptType) {
                                                    ValueCallback mUploadMessage = uploadMsg;
                                                    Intent i = new Intent(Intent.ACTION_GET_CONTENT);
                                                    i.addCategory(Intent.CATEGORY_OPENABLE);
                                                    i.setType("*/*");
                                                    getActivity().startActivityForResult(
                                                            Intent.createChooser(i, "File Browser"),
                                                            1000);
                                                }

                                                //For Android 4.1
                                                public void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
                                                    ValueCallback mUploadMessage = uploadMsg;
                                                    Intent i = new Intent(Intent.ACTION_GET_CONTENT);
                                                    i.addCategory(Intent.CATEGORY_OPENABLE);
                                                    i.setType("image/*");
                                                    getActivity().startActivityForResult(Intent.createChooser(i, "File Chooser"), 1000);

                                                }


                                                public boolean onShowFileChooser(
                                                        WebView webView, ValueCallback<Uri[]> filePathCallback,
                                                        FileChooserParams fileChooserParams) {
                                                    if (mFilePathCallback != null) {
                                                        mFilePathCallback.onReceiveValue(null);
                                                    }
                                                    mFilePathCallback = filePathCallback;

                                                    Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                                    if (takePictureIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                                                        // Create the File where the photo should go
                                                        File photoFile = null;
                                                        try {
                                                            photoFile = createImageFile();
                                                            takePictureIntent.putExtra("PhotoPath", mCameraPhotoPath);
                                                        } catch (IOException ex) {
                                                            // Error occurred while creating the File
                                                            Log.e(TAG, "Unable to create Image File", ex);
                                                        }

                                                        // Continue only if the File was successfully created
                                                        if (photoFile != null) {
                                                            mCameraPhotoPath = "file:" + photoFile.getAbsolutePath();
                                                            takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT,
                                                                    Uri.fromFile(photoFile));
                                                        } else {
                                                            takePictureIntent = null;
                                                        }
                                                    }

                                                    Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
                                                    contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
                                                    contentSelectionIntent.setType("image/*");

                                                    Intent[] intentArray;
                                                    if (takePictureIntent != null) {
                                                        intentArray = new Intent[]{takePictureIntent};
                                                    } else {
                                                        intentArray = new Intent[0];
                                                    }

                                                    Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
                                                    chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
                                                    chooserIntent.putExtra(Intent.EXTRA_TITLE, "Image Chooser");
                                                    chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);

                                                    startActivityForResult(chooserIntent, INPUT_FILE_REQUEST_CODE);

                                                    return true;
                                                }
                                            });

        // Load the local index.html file
        if (mWebView.getUrl() == null) {
            mWebView.loadUrl("https://kryptonible.medizag.com");



        }


        return rootView;
    }

    /**
     * More info this method can be found at
     * http://developer.android.com/training/camera/photobasics.html
     *
     * @return
     * @throws IOException
     */
    private File createImageFile() throws IOException {
        // Create an image file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";

        File storageDir = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES);
        File imageFile = File.createTempFile(
                imageFileName,
                ".jpg",
                storageDir
        );
        return imageFile;
    }

    /**
     * Convenience method to set some generic defaults for a
     * given WebView
     *
     * @param webView
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void setUpWebViewDefaults(WebView webView) {
        WebSettings settings = webView.getSettings();

        // Enable Javascript
        settings.setJavaScriptEnabled(true);

        // Use WideViewport and Zoom out if there is no viewport defined
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);

        // Enable pinch to zoom without the zoom buttons
        settings.setBuiltInZoomControls(true);

        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.HONEYCOMB) {
            // Hide the zoom controls for HONEYCOMB+
            settings.setDisplayZoomControls(false);
        }

        // Enable remote debugging via chrome://inspect
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WebView.setWebContentsDebuggingEnabled(true);
        }

        // We set the WebViewClient to ensure links are consumed by the WebView rather
        // than passed to a browser if it can
        mWebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != INPUT_FILE_REQUEST_CODE || mFilePathCallback == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }

        Uri[] results = null;

        // Check that the response is a good one
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                // If there is not data, then we may have taken a photo
                if (mCameraPhotoPath != null) {
                    results = new Uri[]{Uri.parse(mCameraPhotoPath)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }

        mFilePathCallback.onReceiveValue(results);
        mFilePathCallback = null;
        return;
    }
}


