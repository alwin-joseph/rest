/*
 * Copyright (c) 2017, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package jakarta.ws.rs.tck.jaxrs21.ee.client.executor.rx;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.Future;
import java.io.InputStream;

import jakarta.ws.rs.tck.lib.util.TestUtil;

import jakarta.ws.rs.tck.common.client.JdkLoggingFilter;
import jakarta.ws.rs.tck.jaxrs21.ee.client.executor.ExecutorServiceChecker;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.StringAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.api.exporter.ZipExporter;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

/*
 * @class.setup_props: webServerHost;
 *                     webServerPort;
 *                     ts_home;
 */
/**
 * @since 2.1
 */
@ExtendWith(ArquillianExtension.class)
public class JAXRSClientIT
    extends jakarta.ws.rs.tck.jaxrs21.ee.client.rxinvoker.JAXRSClientIT
    implements ExecutorServiceChecker {

  private static final long serialVersionUID = 21L;

  public JAXRSClientIT() {
    setup();
    setContextRoot("/jaxrs_jaxrs21_ee_client_executor_rx_web/resource");
  }

  @BeforeEach
  void logStartTest(TestInfo testInfo) {
    TestUtil.logMsg("STARTING TEST : "+testInfo.getDisplayName());
  }

  @AfterEach
  void logFinishTest(TestInfo testInfo) {
    TestUtil.logMsg("FINISHED TEST : "+testInfo.getDisplayName());
  }

  @Deployment(testable = false)
  public static WebArchive createDeployment() throws IOException{

    WebArchive archive = ShrinkWrap.create(WebArchive.class, "jaxrs_jaxrs21_ee_client_executor_rx_web.war");
    archive.addClasses(TSAppConfig.class, jakarta.ws.rs.tck.common.impl.TRACE.class,
      jakarta.ws.rs.tck.jaxrs21.ee.client.rxinvoker.Resource.class);
    return archive;

  }

  /* Run test */
  // --------------------------------------------------------------------
  // ---------------------- DELETE --------------------------------------
  // --------------------------------------------------------------------
  /*
   * @testName: deleteTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP DELETE method for the current request.
   */
  public Future<Response> deleteTest() throws Fault {
    return super.deleteTest();
  }

  /*
   * @testName: deleteWithStringClassTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP DELETE method for the current request
   * 
   */
  public Future<String> deleteWithStringClassTest() throws Fault {
    return super.deleteWithStringClassTest();
  }

  /*
   * @testName: deleteWithResponseClassTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP DELETE method for the current request
   * 
   */
  public Future<Response> deleteWithResponseClassTest() throws Fault {
    return super.deleteWithResponseClassTest();
  }

  /*
   * @testName: deleteWithGenericTypeStringTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP DELETE method for the current request
   */
  public Future<String> deleteWithGenericTypeStringTest() throws Fault {
    return super.deleteWithGenericTypeStringTest();
  }

  /*
   * @testName: deleteWithGenericTypeResponseTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP DELETE method for the current request
   */
  public Future<Response> deleteWithGenericTypeResponseTest() throws Fault {
    return super.deleteWithGenericTypeResponseTest();
  }

  // ------------------------------------------------------------------
  // ---------------------------GET------------------------------------
  // ------------------------------------------------------------------

  /*
   * @testName: getTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP GET method for the current request
   */
  public Future<Response> getTest() throws Fault {
    return super.getTest();
  }

  /*
   * @testName: getWithStringClassTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP GET method for the current request
   */
  public Future<String> getWithStringClassTest() throws Fault {
    return super.getWithStringClassTest();
  }

  /*
   * @testName: getWithResponseClassTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP GET method for the current request
   */
  public Future<Response> getWithResponseClassTest() throws Fault {
    return super.getWithResponseClassTest();
  }

  /*
   * @testName: getWithGenericTypeStringTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP GET method for the current request
   */
  public Future<String> getWithGenericTypeStringTest() throws Fault {
    return super.getWithGenericTypeStringTest();
  }

  /*
   * @testName: getWithGenericTypeResponseTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP GET method for the current request
   */
  public Future<Response> getWithGenericTypeResponseTest() throws Fault {
    return super.getWithGenericTypeResponseTest();
  }

  // ------------------------------------------------------------------
  // ---------------------------HEAD-----------------------------------
  // ------------------------------------------------------------------

  /*
   * @testName: headTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP HEAD method for the current request
   */
  public Future<Response> headTest() throws Fault {
    return super.headTest();
  }

  // ------------------------------------------------------------------
  // ---------------------------OPTIONS--------------------------------
  // ------------------------------------------------------------------

  /*
   * @testName: optionsTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP options method for the current request
   */
  public Future<Response> optionsTest() throws Fault {
    return super.optionsTest();
  }

  /*
   * @testName: optionsWithStringClassTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP options method for the current request
   */
  public Future<String> optionsWithStringClassTest() throws Fault {
    return super.optionsWithStringClassTest();
  }

  /*
   * @testName: optionsWithResponseClassTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP options method for the current request
   */
  public Future<Response> optionsWithResponseClassTest() throws Fault {
    return super.optionsWithResponseClassTest();
  }

  /*
   * @testName: optionsWithGenericTypeStringTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP options method for the current request
   */
  public Future<String> optionsWithGenericTypeStringTest() throws Fault {
    return super.optionsWithGenericTypeStringTest();
  }

  /*
   * @testName: optionsWithGenericTypeResponseTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP options method for the current request
   */
  public Future<Response> optionsWithGenericTypeResponseTest() throws Fault {
    return super.optionsWithGenericTypeResponseTest();
  }

  // ------------------------------------------------------------------
  // ---------------------------POST-----------------------------------
  // ------------------------------------------------------------------

  /*
   * @testName: postTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP post method for the current request
   */
  public Future<Response> postTest() throws Fault {
    return super.postTest();
  }

  /*
   * @testName: postWithStringClassTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP post method for the current request
   */
  public Future<String> postWithStringClassTest() throws Fault {
    return super.postWithStringClassTest();
  }

  /*
   * @testName: postWithResponseClassTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP post method for the current request
   */
  public Future<Response> postWithResponseClassTest() throws Fault {
    return super.postWithResponseClassTest();
  }

  /*
   * @testName: postWithGenericTypeStringTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP post method for the current request
   */
  public Future<String> postWithGenericTypeStringTest() throws Fault {
    return super.postWithGenericTypeStringTest();
  }

  /*
   * @testName: postWithGenericTypeResponseTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP post method for the current request
   */
  public Future<Response> postWithGenericTypeResponseTest() throws Fault {
    return super.postWithGenericTypeResponseTest();
  }

  // ------------------------------------------------------------------
  // ---------------------------PUT -----------------------------------
  // ------------------------------------------------------------------

  /*
   * @testName: putTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP PUT method for the current request
   */
  public Future<Response> putTest() throws Fault {
    return super.putTest();
  }

  /*
   * @testName: putWithStringClassTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP put method for the current request
   */
  public Future<String> putWithStringClassTest() throws Fault {
    return super.putWithStringClassTest();
  }

  /*
   * @testName: putWithResponseClassTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP put method for the current request
   */
  public Future<Response> putWithResponseClassTest() throws Fault {
    return super.putWithResponseClassTest();
  }

  /*
   * @testName: putWithGenericTypeStringTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP put method for the current request
   */
  public Future<String> putWithGenericTypeStringTest() throws Fault {
    return super.putWithGenericTypeStringTest();
  }

  /*
   * @testName: putWithGenericTypeResponseTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP put method for the current request
   */
  public Future<Response> putWithGenericTypeResponseTest() throws Fault {
    return super.putWithGenericTypeResponseTest();
  }

  // ------------------------------------------------------------------
  // ---------------------------TRACE -----------------------------------
  // ------------------------------------------------------------------

  /*
   * @testName: traceTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP trace method for the current request
   */
  public Future<Response> traceTest() throws Fault {
    return super.traceTest();
  }

  /*
   * @testName: traceWithStringClassTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP trace method for the current request
   */
  public Future<String> traceWithStringClassTest() throws Fault {
    return super.traceWithStringClassTest();
  }

  /*
   * @testName: traceWithResponseClassTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP trace method for the current request
   */
  public Future<Response> traceWithResponseClassTest() throws Fault {
    return super.traceWithResponseClassTest();
  }

  /*
   * @testName: traceWithGenericTypeStringTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP trace method for the current request
   */
  public Future<String> traceWithGenericTypeStringTest() throws Fault {
    return super.traceWithGenericTypeStringTest();
  }

  /*
   * @testName: traceWithGenericTypeResponseTest
   * 
   * @assertion_ids: JAXRS:JAVADOC:1131;
   * 
   * @test_Strategy: Invoke HTTP trace method for the current request
   */
  public Future<Response> traceWithGenericTypeResponseTest() throws Fault {
    return super.traceWithGenericTypeResponseTest();
  }

  // ///////////////////////////////////////////////////////////////////////
  // utility methods

  protected Invocation.Builder startBuilderForMethod(String methodName) {
    Client client = createClient();
    client.register(new JdkLoggingFilter(false));
    WebTarget target = client.target(getAbsoluteUrl(methodName));
    Invocation.Builder ib = target.request();
    return ib;
  }
}
