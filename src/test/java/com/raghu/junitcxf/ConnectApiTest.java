package com.raghu.junitcxf;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.junit.Assert;
import org.junit.Test;


public class ConnectApiTest extends AbstractApiTest{
	

	@Test
	public void testConnect() {
		Response resp = proxy.connect("raghu", "password");
		Assert.assertTrue(resp.getStatus() == 200);
		System.out.println(resp.getEntity().toString());
	}

	@Test
	public void testBadConnectNoUsername() throws InterruptedException {
		Response resp = proxy.connect(null, "password");
		Assert.assertTrue(resp.getStatus() == Status.BAD_REQUEST.getStatusCode());
	}
	
	@Test
	public void testBadConnectEmptyUsername() throws InterruptedException {
		Response resp = proxy.connect("", "password");
		Assert.assertTrue(resp.getStatus() == Status.BAD_REQUEST.getStatusCode());
	}
	
	@Test
	public void testBadConnectNoPassword() throws InterruptedException {
		Response resp = proxy.connect("raghu", null);
		Assert.assertTrue(resp.getStatus() == Status.BAD_REQUEST.getStatusCode());
	}
	
	@Test
	public void testBadConnectEmptyPassword() throws InterruptedException {
		Response resp = proxy.connect("raghu", "");
		Assert.assertTrue(resp.getStatus() == Status.BAD_REQUEST.getStatusCode());
	}

}
