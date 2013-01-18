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
package com.box.androidlib.DAO;

import com.box.androidlib.Utils.BoxUtils;

/**
 * Represents a comment made on a file or folder on Box.
 * 
 * @author developers@box.net
 */
public class Comment extends DAO {

    /**
     * Comment id.
     */
    protected long mId;
    /**
     * The message of the comment.
     */
    protected String mMessage;
    /**
     * The user_id of the author of the comment.
     */
    protected long mFromUserId;
    /**
     * The username of the author of the comment.
     */
    protected String mFromUserName;
    /**
     * Creation timestamp.
     */
    protected long mCreated;
    /**
     * Image URL of the author of the comment.
     */
    protected String mAvatarUrl;

    /**
     * Get comment id.
     * 
     * @return comment id
     */
    public long getId() {
        return mId;
    }

    /**
     * Set comment id.
     * 
     * @param commentId
     *            comment id
     */
    public void setId(final long commentId) {
        mId = commentId;
    }

    /**
     * Get the comment's message.
     * 
     * @return comment message
     */
    public String getMessage() {
        return mMessage;
    }

    /**
     * Set the comment message.
     * 
     * @param message
     *            comment message
     */
    public void setMessage(final String message) {
        mMessage = message;
    }

    /**
     * Get the user id of the author of the comment.
     * 
     * @return author user id
     */
    public long getFromUserId() {
        return mFromUserId;
    }

    /**
     * Set the author's user id.
     * 
     * @param fromUserId
     *            author user id
     */
    public void setFromUserId(final long fromUserId) {
        mFromUserId = fromUserId;
    }

    /**
     * Get the username of the author of the comment.
     * 
     * @return author username
     */
    public String getFromUserName() {
        return mFromUserName;
    }

    /**
     * Set author username.
     * 
     * @param userName
     *            author username
     */
    public void setFromUserName(final String userName) {
        mFromUserName = userName;
    }

    /**
     * Get creation timestamp.
     * 
     * @return creation timestamp
     */
    public long getCreated() {
        return mCreated;
    }

    /**
     * Set creation timestamp.
     * 
     * @param created
     *            creation timestamp
     */
    public void setCreated(final long created) {
        mCreated = created;
    }

    /**
     * Get author avatar image URL.
     * 
     * @return image URL
     */
    public String getAvatarURL() {
        return mAvatarUrl;
    }

    /**
     * Set author avatar image URL.
     * 
     * @param avatarURL
     *            image URL
     */
    public void setAvatarURL(final String avatarURL) {
        mAvatarUrl = avatarURL;
    }

    /**
     * Utility method to parse attributes into DAO member data. Used by SAX parsers.
     * 
     * @param key
     *            Corresponds to attribute names and element names returned by Box API
     * @param value
     *            The value to be set
     */
    public void parseAttribute(final String key, final String value) {
        if (key.equals("comment_id") || key.equals("id")) {
            setId(BoxUtils.parseLong(value));
        }
        else if (key.equals("message")) {
            setMessage(value.trim());
        }
        else if (key.equals("user_id")) {
            setFromUserId(BoxUtils.parseLong(value));
        }
        else if (key.equals("user_name")) {
            setFromUserName(value.trim());
        }
        else if (key.equals("created")) {
            setCreated(BoxUtils.parseLong(value));
        }
        else if (key.equals("avatar_url")) {
            setAvatarURL(value);
        }
    }

}
