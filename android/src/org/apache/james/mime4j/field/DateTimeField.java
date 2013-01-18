/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/

package org.apache.james.mime4j.field;

import java.io.StringReader;
import java.util.Date;

import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
import org.apache.james.mime4j.field.datetime.parser.DateTimeParser;
import org.apache.james.mime4j.field.datetime.parser.ParseException;
import org.apache.james.mime4j.field.datetime.parser.TokenMgrError;

public class DateTimeField extends Field {
    private Date date;
    private ParseException parseException;

    protected DateTimeField(String name, String body, String raw, Date date, ParseException parseException) {
        super(name, body, raw);
        this.date = date;
        this.parseException = parseException;
    }

    public Date getDate() {
        return date;
    }

    public ParseException getParseException() {
        return parseException;
    }

    public static class Parser implements FieldParser {
//        

        public Field parse(final String name, final String body, final String raw) {
            Date date = null;
            ParseException parseException = null;
            try {
                try {
                    date = new DateTimeParser(new StringReader(body)).parseAll().getDate();
                }
                catch (TokenMgrError err) {
                    throw new ParseException(err.getMessage());
                }
            }
            catch (ParseException e) {
                parseException = e;
            }
            return new DateTimeField(name, body, raw, date, parseException);
        }
    }
}
