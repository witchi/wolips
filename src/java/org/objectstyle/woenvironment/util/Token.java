/* ====================================================================
 * 
 * The ObjectStyle Group Software License, Version 1.0 
 *
 * Copyright (c) 2002 The ObjectStyle Group 
 * and individual authors of the software.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:  
 *       "This product includes software developed by the 
 *        ObjectStyle Group (http://objectstyle.org/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The names "ObjectStyle Group" and "Cayenne" 
 *    must not be used to endorse or promote products derived
 *    from this software without prior written permission. For written 
 *    permission, please contact andrus@objectstyle.org.
 *
 * 5. Products derived from this software may not be called "ObjectStyle"
 *    nor may "ObjectStyle" appear in their names without prior written
 *    permission of the ObjectStyle Group.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE OBJECTSTYLE GROUP OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the ObjectStyle Group.  For more
 * information on the ObjectStyle Group, please see
 * <http://objectstyle.org/>.
 *
 */
/* Generated By:JavaCC: Do not edit this line. Token.java Version 3.0 */
package org.objectstyle.woenvironment.util;

/**
 * Describes the input token stream.
 */
public class Token {
	/**
	 * An integer that describes the kind of this token. This numbering system
	 * is determined by JavaCCParser, and a table of these numbers is stored in
	 * the file ...Constants.java.
	 */
	public int kind;

	/**
	 * beginLine and beginColumn describe the position of the first character of
	 * this token; endLine and endColumn describe the position of the last
	 * character of this token.
	 */
	public int beginLine, beginColumn, endLine, endColumn;

	/**
	 * The string image of the token.
	 */
	public String image;

	/**
	 * A reference to the next regular (non-special) token from the input
	 * stream. If this is the last token from the input stream, or if the token
	 * manager has not read tokens beyond this one, this field is set to null.
	 * This is true only if this token is also a regular token. Otherwise, see
	 * below for a description of the contents of this field.
	 */
	public Token next;

	/**
	 * This field is used to access special tokens that occur prior to this
	 * token, but after the immediately preceding regular (non-special) token.
	 * If there are no such special tokens, this field is set to null. When
	 * there are more than one such special token, this field refers to the last
	 * of these special tokens, which in turn refers to the next previous
	 * special token through its specialToken field, and so on until the first
	 * special token (whose specialToken field is null). The next fields of
	 * special tokens refer to other special tokens that immediately follow it
	 * (without an intervening regular token). If there is no such token, this
	 * field is null.
	 */
	public Token specialToken;

	/**
	 * Returns the image.
	 */
	public String toString() {
		return image;
	}

	/**
	 * Returns a new Token object, by default. However, if you want, you can
	 * create and return subclass objects based on the value of ofKind. Simply
	 * add the cases to the switch for all those special cases. For example, if
	 * you have a subclass of Token called IDToken that you want to create if
	 * ofKind is ID, simlpy add something like :
	 * 
	 * case MyParserConstants.ID : return new IDToken();
	 * 
	 * to the following switch statement. Then you can cast matchedToken
	 * variable to the appropriate type and use it in your lexical actions.
	 */
	public static final Token newToken(int ofKind) {
		switch (ofKind) {
		default:
			return new Token();
		}
	}
}
