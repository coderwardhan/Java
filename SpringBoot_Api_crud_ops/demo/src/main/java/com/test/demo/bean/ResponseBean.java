package com.test.demo.bean;

import java.util.Collection;
import java.util.List;


public class ResponseBean {
private Collection<RequestBean> requests;

// Default constructor

public ResponseBean() {
}

public ResponseBean(Collection<RequestBean> requests) {
	this.requests = requests;
	
}

// Getters and Setters

public Collection<RequestBean> getRequests() {
    return requests;
}

public void setRequests(Collection<RequestBean> collection) {
    this.requests = (Collection<RequestBean>) collection;
}

// toString method (optional, for debugging)
@Override
public String toString() {
    return "ResponseBean{" +
            ", requests=" + requests +
            '}';
}
}