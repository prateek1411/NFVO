/*
 * Copyright (c) 2016 Open Baton (http://www.openbaton.org)
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
 *
 */

package org.openbaton.nfvo.core.interfaces;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.openbaton.catalogue.mano.record.NetworkServiceRecord;
import org.openbaton.catalogue.mano.record.VNFRecordDependency;
import org.openbaton.catalogue.mano.record.VirtualNetworkFunctionRecord;
import org.openbaton.exceptions.BadFormatException;
import org.openbaton.exceptions.NotFoundException;

/** Created by lto on 30/06/15. */
public interface DependencyManagement {
  int provisionDependencies(VirtualNetworkFunctionRecord virtualNetworkFunctionRecord)
      throws NotFoundException, BadFormatException, ExecutionException, InterruptedException;

  void fillDependecyParameters(VirtualNetworkFunctionRecord virtualNetworkFunctionRecord);

  VNFRecordDependency getDependencyForAVNFRecordTarget(
      VirtualNetworkFunctionRecord virtualNetworkFunctionRecord);

  List<VNFRecordDependency> getDependencyForAVNFRecordSource(
      VirtualNetworkFunctionRecord virtualNetworkFunctionRecord);

  void fillVnfcParameters(
      VirtualNetworkFunctionRecord virtualNetworkFunctionRecord,
      VNFRecordDependency vnfRecordDependency,
      Set<String> parameterKeys);

  Set<String> fillDependecyParameters(
      VirtualNetworkFunctionRecord virtualNetworkFunctionRecord,
      VNFRecordDependency vnfRecordDependency);

  Set<String> getNotInitializedVnfrSource(
      Set<String> strings, NetworkServiceRecord networkServiceRecord);
}
