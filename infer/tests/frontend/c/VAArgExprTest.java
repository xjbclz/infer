/*
 * Copyright (c) 2016 - present Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package frontend.c;

import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import utils.ClangFrontendUtils;
import utils.DebuggableTemporaryFolder;
import utils.InferException;

public class VAArgExprTest {
  String FILE = "infer/tests/codetoanalyze/c/frontend/vaarg_expr/vaarg_expr.c";

  @Rule
  public DebuggableTemporaryFolder folder = new DebuggableTemporaryFolder();

  @Test
  public void frontendTest() throws InterruptedException, IOException, InferException {
    ClangFrontendUtils.createAndCompareCDotFiles(folder, FILE);
  }
}
