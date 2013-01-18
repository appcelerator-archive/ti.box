/*******************************************************************************
 * Copyright 2011 Box.net.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.box.androidlib.ResponseParsers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import com.box.androidlib.DAO.Comment;

/**
 * Parser for a comment response from Box API.
 * 
 * @author developers@box.net
 */
public class CommentResponseParser extends DefaultResponseParser {

    /**
     * Comment.
     */
    private Comment mComment;

    @Override
    public void startElement(final String uri, final String localName, final String qName,
        final Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        if (localName.equals("comment")) {
            mComment = new Comment();
        }
    }

    @Override
    public void endElement(final String uri, final String localName, final String qName)
        throws SAXException {
        super.endElement(uri, localName, qName);
        if (mComment != null) {
            mComment.parseAttribute(localName, mTextNode.toString());
        }
    }

    /**
     * Get the Comment returned by Box API.
     * 
     * @return Comment
     */
    public Comment getComment() {
        return mComment;
    }
}
