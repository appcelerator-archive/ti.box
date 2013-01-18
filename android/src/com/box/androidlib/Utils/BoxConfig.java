/*******************************************************************************
 * Copyright 2011 Box.net.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the
 * License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 ******************************************************************************/
package com.box.androidlib.Utils;

/**
 * Class for retrieving configuration parameters.
 * 
 * @author developers@box.net
 * 
 */
public final class BoxConfig {

    /** Default API url scheme. */
    private static final String API_URL_SCHEME = "http";
    /** Default API url authority. */
    private static final String API_URL_AUTHORITY = "www.box.net";
    /** Default API url path. */
    private static final String API_URL_PATH = "/api/1.0/rest";

    /** Default Upload url scheme. */
    private static final String UPLOAD_URL_SCHEME = "http";
    /** Default Upload url authority. */
    private static final String UPLOAD_URL_AUTHORITY = "upload.box.net";
    /** Default Upload url path. */
    private static final String UPLOAD_URL_PATH = "/api/1.0/";

    /** Default Download url scheme. */
    private static final String DOWNLOAD_URL_SCHEME = "http";
    /** Default Download url authority. */
    private static final String DOWNLOAD_URL_AUTHORITY = "www.box.net";
    /** Default Download url path. */
    private static final String DOWNLOAD_URL_PATH = "/api/1.0/download/";

    /** API url scheme. */
    private String mApiUrlScheme = API_URL_SCHEME;
    /** API url authority. */
    private String mApiUrlAuthority = API_URL_AUTHORITY;
    /** API url path. */
    private String mApiUrlPath = API_URL_PATH;

    /** Upload url scheme. */
    private String mUploadUrlScheme = UPLOAD_URL_SCHEME;
    /** Upload url authority. */
    private String mUploadUrlAuthority = UPLOAD_URL_AUTHORITY;
    /** Upload url path. */
    private String mUploadUrlPath = UPLOAD_URL_PATH;

    /** Download url path. */
    private String mDownloadUrlScheme = DOWNLOAD_URL_SCHEME;
    /** Download url authority. */
    private String mDownloadUrlAuthority = DOWNLOAD_URL_AUTHORITY;
    /** Download url path. */
    private String mDownloadUrlPath = DOWNLOAD_URL_PATH;

    /** Time to wait before connection timeout. */
    private static int mConnectionTimout = 0;

    /** Singleton instance. */
    private static BoxConfig mInstance;

    /**
     * Private constructor.
     */
    private BoxConfig() {
    }

    /**
     * Get a singleton instance.
     * 
     * @return instance of BoxConfig.
     */
    public static BoxConfig getInstance() {
        if (mInstance == null) {
            mInstance = new BoxConfig();
        }
        return mInstance;
    }

    /**
     * Set a custom API URL scheme.
     * 
     * @param scheme
     *            Custom scheme
     */
    public void setApiUrlScheme(final String scheme) {
        mApiUrlScheme = scheme;
    }

    /**
     * Get the API URL scheme.
     * 
     * @return API URL scheme
     */
    public String getApiUrlScheme() {
        return mApiUrlScheme;
    }

    /**
     * Set a custom API URL Authority.
     * 
     * @param authority
     *            Custom Authority
     */
    public void setApiUrlAuthority(final String authority) {
        mApiUrlAuthority = authority;
    }

    /**
     * Get the API URL Authority.
     * 
     * @return API URL Authority
     */
    public String getApiUrlAuthority() {
        return mApiUrlAuthority;
    }

    /**
     * Set a custom API URL path.
     * 
     * @param path
     *            Custom path
     */
    public void setApiUrlPath(final String path) {
        mApiUrlPath = path;
    }

    /**
     * Get the API URL path.
     * 
     * @return API URL path
     */
    public String getApiUrlPath() {
        return mApiUrlPath;
    }

    /**
     * Set a custom Upload URL scheme.
     * 
     * @param scheme
     *            Custom scheme
     */
    public void setUploadUrlScheme(final String scheme) {
        mUploadUrlScheme = scheme;
    }

    /**
     * Get the Upload URL scheme.
     * 
     * @return Upload URL scheme
     */
    public String getUploadUrlScheme() {
        return mUploadUrlScheme;
    }

    /**
     * Set a custom Upload URL Authority.
     * 
     * @param authority
     *            Custom Authority
     */
    public void setUploadUrlAuthority(final String authority) {
        mUploadUrlAuthority = authority;
    }

    /**
     * Get the Upload URL Authority.
     * 
     * @return Upload URL Authority
     */
    public String getUploadUrlAuthority() {
        return mUploadUrlAuthority;
    }

    /**
     * Set a custom Upload URL path.
     * 
     * @param path
     *            Custom path
     */
    public void setUploadUrlPath(final String path) {
        mUploadUrlPath = path;
    }

    /**
     * Get the Upload URL path.
     * 
     * @return Upload URL path
     */
    public String getUploadUrlPath() {
        return mUploadUrlPath;
    }

    /**
     * Set a custom Download URL scheme.
     * 
     * @param scheme
     *            Custom scheme
     */
    public void setDownloadUrlScheme(final String scheme) {
        mDownloadUrlScheme = scheme;
    }

    /**
     * Get the Download URL scheme.
     * 
     * @return Download URL scheme
     */
    public String getDownloadUrlScheme() {
        return mDownloadUrlScheme;
    }

    /**
     * Set a custom Download URL Authority.
     * 
     * @param authority
     *            Custom Authority
     */
    public void setDownloadUrlAuthority(final String authority) {
        mDownloadUrlAuthority = authority;
    }

    /**
     * Get the Download URL Authority.
     * 
     * @return Download URL Authority
     */
    public String getDownloadUrlAuthority() {
        return mDownloadUrlAuthority;
    }

    /**
     * Set a custom Download URL path.
     * 
     * @param path
     *            Custom path
     */
    public void setDownloadUrlPath(final String path) {
        mDownloadUrlPath = path;
    }

    /**
     * Get the Download URL path.
     * 
     * @return Download URL path
     */
    public String getDownloadUrlPath() {
        return mDownloadUrlPath;
    }

    /**
     * Set the amount of time in milliseconds that calls to the server should wait before timing out. Default is 0 which stands for infinite timeout.
     * 
     * @param timeout
     *            Desired connection timeout.
     */
    public void setConnectionTimeOut(final int timeout) {
        mConnectionTimout = timeout;
    }

    /**
     * Get the amount of time in milliseconds that calls to the server should wait before timing out.
     * 
     * @return The current connection timeout set.
     */
    public int getConnectionTimeOut() {
        return mConnectionTimout;
    }
}
