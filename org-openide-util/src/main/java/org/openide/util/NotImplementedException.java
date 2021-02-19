/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.openide.util;


/** Should be thrown when a feature is not implemented.
* Usage of this exception should allow us to distingush between
* errors and unimplemented features.
* <P>
* Also this exception can easily be located in source code. That is
* why finding of unimplemented features should be simplified.
*
* @author Jaroslav Tulach
* @version 0.10 September 25, 1997
*/
public class NotImplementedException extends RuntimeException {
    static final long serialVersionUID = 465319326004943323L;

    /** Creates new exception NotImplementedException
    */
    public NotImplementedException() {
        super();
    }

    /** Creates new exception NotImplementedException with text specified
    * string s.
    * @param s the text describing the exception
    */
    public NotImplementedException(String s) {
        super(s);
    }
}
