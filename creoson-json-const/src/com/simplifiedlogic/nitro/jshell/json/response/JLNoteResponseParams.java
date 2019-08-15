/*
 * MIT LICENSE
 * Copyright 2000-2019 Simplified Logic, Inc
 * Permission is hereby granted, free of charge, to any person obtaining a copy 
 * of this software and associated documentation files (the "Software"), to deal 
 * in the Software without restriction, including without limitation the rights 
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
 * copies of the Software, and to permit persons to whom the Software is 
 * furnished to do so, subject to the following conditions: The above copyright 
 * notice and this permission notice shall be included in all copies or 
 * substantial portions of the Software. THE SOFTWARE IS PROVIDED "AS IS", 
 * WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED 
 * TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE 
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.simplifiedlogic.nitro.jshell.json.response;

/**
 * Constants defining the JSON response parameters for the note command
 * 
 * @author Adam Andrews
 */
public interface JLNoteResponseParams {

	// response fields
    public static final String OUTPUT_ITEMLIST  = "itemlist";
    public static final String OUTPUT_NAME		= "name";
    public static final String OUTPUT_VALUE		= "value";
    public static final String OUTPUT_VALUE_EXPANDED	= "value_expanded";
    public static final String OUTPUT_ENCODED	= "encoded";
    public static final String OUTPUT_URL		= "url";
    public static final String OUTPUT_EXISTS	= "exists";
    public static final String OUTPUT_LOCATION	= "location";
    
}
