/*
 * $Id$
 *
 * Copyright 2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.struts.action2.views.jsp.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.struts.action2.views.jsp.AbstractUITagTest;
import org.apache.struts.action2.views.jsp.ui.ActionErrorTag;
import com.opensymphony.xwork.Action;
import com.opensymphony.xwork.ActionSupport;

/**
 * ActionErrorTag test case.
 * 
 */
public class ActionErrorTagTest extends AbstractUITagTest {
	
	boolean shouldActionHaveError = false;
	
	public void testNoActionErrors() throws Exception {
		ActionErrorTag tag = new ActionErrorTag();
		((InternalActionSupport)action).setHasActionErrors(false);
		tag.setPageContext(pageContext);
		tag.doStartTag();
		tag.doEndTag();
		
		//assertEquals("", writer.toString());
		verify(ActionErrorTagTest.class.getResource("actionerror-1.txt"));
	}
	
	public void testHaveActionErrors() throws Exception {
		
		ActionErrorTag tag = new ActionErrorTag();
		((InternalActionSupport)action).setHasActionErrors(true);
		tag.setPageContext(pageContext);
		tag.doStartTag();
		tag.doEndTag();

		verify(ActionErrorTagTest.class.getResource("actionerror-2.txt"));
	}
	
	
	public Action getAction() {
		return new InternalActionSupport();
	}
	
	
	public class InternalActionSupport extends ActionSupport {
		
		private static final long serialVersionUID = -4777466640658557661L;
		
		private boolean yesActionErrors;
		
		public void setHasActionErrors(boolean aYesActionErrors) {
			yesActionErrors = aYesActionErrors;
		}
		
		public boolean hasActionErrors() {
			return yesActionErrors;
		}
		
		public Collection getActionErrors() {
			if (yesActionErrors) {
				List errors = new ArrayList();
				errors.add("action error number 1");
				errors.add("action error number 2");
				errors.add("action error number 3");
				return errors;
			}
			else {
				return Collections.EMPTY_LIST;
			}
		}
	}
}
