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
package org.apache.struts.action2;

import org.apache.struts.action2.views.jsp.ui.User;
import com.opensymphony.xwork.Action;
import com.opensymphony.xwork.ActionSupport;

import java.util.Collection;
import java.util.List;
import java.util.Map;


/**
 */
public class TestAction extends ActionSupport {

	private static final long serialVersionUID = -8891365561914451494L;
	
	private Collection collection;
    private Collection collection2;
    private Map map;
    private String foo;
    private String result;
    private User user;
    private String[] array;
    private String[][] list;
    private List list2;
    private List list3;

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public String[][] getList() {
        return list;
    }

    public void setList(String[][] list) {
        this.list = list;
    }

    public List getList2() {
        return list2;
    }

    public void setList2(List list2) {
        this.list2 = list2;
    }

    public void setList3(List list) {
    	this.list3 = list;
    }
    
    public List getList3() {
    	return this.list3;
    }
    
    public Collection getCollection2() {
    	return this.collection2;
    }
    
    public void setCollection2(Collection collection) {
    	this.collection2 = collection;
    }
    
    public String execute() throws Exception {
        if (result == null) {
            result = Action.SUCCESS;
        }

        return result;
    }

    public String doInput() throws Exception {
        return INPUT;
    }
    
}
